package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;
    public static final LoadErrorAction RETRY = createRetryAction(false, C.TIME_UNSET);
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT = createRetryAction(true, C.TIME_UNSET);
    public static final LoadErrorAction DONT_RETRY = new LoadErrorAction(2, C.TIME_UNSET);
    public static final LoadErrorAction DONT_RETRY_FATAL = new LoadErrorAction(3, C.TIME_UNSET);

    /* loaded from: classes3.dex */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t10, long j10, long j11, boolean z10);

        void onLoadCompleted(T t10, long j10, long j11);

        LoadErrorAction onLoadError(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* loaded from: classes3.dex */
    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        public boolean isRetry() {
            int i10 = this.type;
            return i10 == 0 || i10 == 1;
        }

        private LoadErrorAction(int i10, long j10) {
            this.type = i10;
            this.retryDelayMillis = j10;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes3.dex */
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_FATAL_ERROR = 3;
        private static final int MSG_FINISH = 1;
        private static final int MSG_IO_EXCEPTION = 2;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(Looper looper, T t10, Callback<T> callback, int i10, long j10) {
            super(looper);
            this.loadable = t10;
            this.callback = callback;
            this.defaultMinRetryCount = i10;
            this.startTimeMs = j10;
        }

        private void execute() {
            this.currentError = null;
            Loader.this.downloadExecutorService.execute((Runnable) Assertions.checkNotNull(Loader.this.currentTask));
        }

        private void finish() {
            Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, 5000);
        }

        public void cancel(boolean z10) {
            this.released = z10;
            this.currentError = null;
            if (hasMessages(0)) {
                this.canceled = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.canceled = true;
                    this.loadable.cancelLoad();
                    Thread thread = this.executorThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((Callback) Assertions.checkNotNull(this.callback)).onLoadCanceled(this.loadable, elapsedRealtime, elapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long retryDelayMillis;
            if (this.released) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                execute();
            } else if (i10 != 3) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.startTimeMs;
                Callback callback = (Callback) Assertions.checkNotNull(this.callback);
                if (this.canceled) {
                    callback.onLoadCanceled(this.loadable, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        callback.onLoadCompleted(this.loadable, elapsedRealtime, j10);
                    } catch (RuntimeException e10) {
                        Log.e(TAG, "Unexpected exception handling load completed", e10);
                        Loader.this.fatalError = new UnexpectedLoaderException(e10);
                    }
                } else if (i11 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.currentError = iOException;
                    int i12 = this.errorCount + 1;
                    this.errorCount = i12;
                    LoadErrorAction onLoadError = callback.onLoadError(this.loadable, elapsedRealtime, j10, iOException, i12);
                    if (onLoadError.type != 3) {
                        if (onLoadError.type != 2) {
                            if (onLoadError.type == 1) {
                                this.errorCount = 1;
                            }
                            if (onLoadError.retryDelayMillis != C.TIME_UNSET) {
                                retryDelayMillis = onLoadError.retryDelayMillis;
                            } else {
                                retryDelayMillis = getRetryDelayMillis();
                            }
                            start(retryDelayMillis);
                            return;
                        }
                        return;
                    }
                    Loader.this.fatalError = this.currentError;
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        public void maybeThrowError(int i10) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i10) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.canceled;
                    this.executorThread = Thread.currentThread();
                }
                if (z10) {
                    TraceUtil.beginSection("load:" + this.loadable.getClass().getSimpleName());
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th2) {
                        TraceUtil.endSection();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.released) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Exception e11) {
                Log.e(TAG, "Unexpected exception loading stream", e11);
                if (this.released) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                Log.e(TAG, "OutOfMemory error loading stream", e12);
                if (this.released) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (Error e13) {
                Log.e(TAG, "Unexpected error loading stream", e13);
                if (!this.released) {
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }

        public void start(long j10) {
            Assertions.checkState(Loader.this.currentTask == null);
            Loader.this.currentTask = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                execute();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface Loadable {
        void cancelLoad();

        void load() throws IOException;
    }

    /* loaded from: classes3.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* loaded from: classes3.dex */
    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public Loader(String str) {
        this.downloadExecutorService = Util.newSingleThreadExecutor(str);
    }

    public static LoadErrorAction createRetryAction(boolean z10, long j10) {
        return new LoadErrorAction(z10 ? 1 : 0, j10);
    }

    public void cancelLoading() {
        ((LoadTask) Assertions.checkStateNotNull(this.currentTask)).cancel(false);
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends Loadable> long startLoading(T t10, Callback<T> callback, int i10) {
        this.fatalError = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask((Looper) Assertions.checkStateNotNull(Looper.myLooper()), t10, callback, i10, elapsedRealtime).start(0L);
        return elapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            LoadTask<? extends Loadable> loadTask = this.currentTask;
            if (loadTask != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = loadTask.defaultMinRetryCount;
                }
                loadTask.maybeThrowError(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }
}
