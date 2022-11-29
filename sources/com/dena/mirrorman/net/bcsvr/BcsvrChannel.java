package com.dena.mirrorman.net.bcsvr;

import android.os.SystemClock;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import hf.e0;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.nio.channels.Channel;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jo.h;
import jo.p;
import oq.a;
import wn.f;
import wn.g;
import wn.v;

/* loaded from: classes2.dex */
public final class BcsvrChannel implements Channel, a {
    private BcsvrAddress mAddress;
    private volatile long mLastPingSentMillis;
    private volatile long mLastReceivedAckMillis;
    private ScheduledFuture<?> mPingTask;
    private ScheduledFuture<?> mReconnectionTask;
    private Worker mWorker;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private long mPingInterval = 30000;
    private long mReconnectionInterval = PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS;
    private final ScheduledExecutorService mTimerExecutor = Executors.newScheduledThreadPool(2, new NamedThreadFactory("timer"));
    private final ExecutorService mWorkerExecutor = Companion.newCachedThreadPool(2, "worker");
    private final Notifier mNotifier = new Notifier();
    private final AtomicBoolean mIsOpen = new AtomicBoolean(true);
    private final f networkHelper$delegate = g.b(cr.a.f28611a.b(), new BcsvrChannel$special$$inlined$inject$default$1(this, null, null));

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ExecutorService newCachedThreadPool(int i10, String str) {
            p.h(str, "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.setThreadFactory(new NamedThreadFactory(str));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }
    }

    /* loaded from: classes2.dex */
    public static final class NamedThreadFactory implements ThreadFactory {
        private final String mName;

        public NamedThreadFactory(String str) {
            p.h(str, "mName");
            this.mName = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            p.h(runnable, TopicConstant.EXTEND_AAC_RAW);
            return new Thread(runnable, this.mName);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Notifier implements Runnable {
        private Future<?> mFuture;
        private volatile boolean mIsActive;
        private final List<OnMessageReceivedListener> mListeners = new LinkedList();
        private final Object mLock = new Object();
        private LinkedBlockingQueue<String> mQueue;

        public final boolean getMIsActive() {
            return this.mIsActive;
        }

        public final List<OnMessageReceivedListener> getMListeners() {
            return this.mListeners;
        }

        public final void push(String str) {
            p.h(str, "json");
            LinkedBlockingQueue<String> linkedBlockingQueue = this.mQueue;
            if (linkedBlockingQueue != null) {
                linkedBlockingQueue.offer(str);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            String take;
            try {
                LinkedBlockingQueue<String> linkedBlockingQueue = this.mQueue;
                if (linkedBlockingQueue == null) {
                    return;
                }
                while (this.mIsActive && (take = linkedBlockingQueue.take()) != null) {
                    for (OnMessageReceivedListener onMessageReceivedListener : this.mListeners) {
                        onMessageReceivedListener.onMessageReceived(take);
                    }
                }
            } catch (InterruptedException e10) {
                g9.a.h(e10);
            } catch (Exception e11) {
                g9.a.c(e11);
            }
        }

        public final void setMIsActive(boolean z10) {
            this.mIsActive = z10;
        }

        public final void start(ExecutorService executorService) {
            p.h(executorService, "executor");
            if (!this.mIsActive) {
                this.mIsActive = true;
                synchronized (this.mLock) {
                    this.mQueue = new LinkedBlockingQueue<>();
                    this.mFuture = executorService.submit(this);
                    v vVar = v.f59242a;
                }
                return;
            }
            throw new IllegalStateException("Already Started".toString());
        }

        public final void stop() {
            this.mIsActive = false;
            synchronized (this.mLock) {
                this.mQueue = null;
                Future<?> future = this.mFuture;
                if (future == null) {
                    return;
                }
                if (future != null) {
                    future.cancel(true);
                }
                this.mFuture = null;
                v vVar = v.f59242a;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface OnMessageReceivedListener {
        void onMessageReceived(String str);
    }

    /* loaded from: classes2.dex */
    public final class Pinger implements Runnable {
        private final BcsvrSocket mSocket;
        public final /* synthetic */ BcsvrChannel this$0;

        public Pinger(BcsvrChannel bcsvrChannel, BcsvrSocket bcsvrSocket) {
            p.h(bcsvrSocket, "mSocket");
            this.this$0 = bcsvrChannel;
            this.mSocket = bcsvrSocket;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.this$0.keepConnectivity() && this.mSocket.isOpened()) {
                    PrintWriter writer = this.mSocket.writer();
                    p.e(writer);
                    writer.println("PING");
                    this.this$0.onSentPing();
                }
            } catch (Exception e10) {
                g9.a.c(e10);
                this.this$0.stopPing();
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Reconnecter implements Runnable {
        private final BcsvrAddress mAddress;
        public final /* synthetic */ BcsvrChannel this$0;

        public Reconnecter(BcsvrChannel bcsvrChannel, BcsvrAddress bcsvrAddress) {
            p.h(bcsvrAddress, "mAddress");
            this.this$0 = bcsvrChannel;
            this.mAddress = bcsvrAddress;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.this$0.connectNoThrow(this.mAddress)) {
                g9.a.g("Reconnection Success!");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Worker implements Runnable {
        private BcsvrAddress mAddress;
        private Future<?> mFuture;
        private final Notifier mNotifier;
        private final OnSocketStateListener mOnSocketStateListener;
        private BcsvrSocket mSocket;

        /* loaded from: classes2.dex */
        public interface OnSocketStateListener {
            void onAck();

            void onError(Exception exc);

            void onOpen(BcsvrSocket bcsvrSocket);
        }

        public Worker(Notifier notifier, OnSocketStateListener onSocketStateListener) {
            p.h(notifier, "mNotifier");
            p.h(onSocketStateListener, "mOnSocketStateListener");
            this.mNotifier = notifier;
            this.mOnSocketStateListener = onSocketStateListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BcsvrAddress bcsvrAddress = this.mAddress;
                p.e(bcsvrAddress);
                String key = bcsvrAddress.getKey();
                BcsvrSocket open = BcsvrSocket.Companion.open(bcsvrAddress);
                this.mSocket = open;
                OnSocketStateListener onSocketStateListener = this.mOnSocketStateListener;
                p.e(open);
                onSocketStateListener.onOpen(open);
                while (true) {
                    BcsvrSocket bcsvrSocket = this.mSocket;
                    p.e(bcsvrSocket);
                    BcsvrCommand readCommand = bcsvrSocket.readCommand();
                    p.e(readCommand);
                    if (readCommand != null) {
                        String name = readCommand.getName();
                        int hashCode = name.hashCode();
                        if (hashCode != 64617) {
                            if (hashCode == 68933) {
                                if (name.equals(BcsvrCommand.ERROR)) {
                                    g9.a.g(MRLog.PAYLOAD_KEY_ERROR);
                                } else {
                                    g9.a.g("unknown: " + readCommand.getName());
                                }
                            } else {
                                if (hashCode == 76641 && name.equals(BcsvrCommand.MESSAGE)) {
                                    String messageInJson = readCommand.getMessageInJson(key);
                                    if (messageInJson != null) {
                                        g9.a.g("received data : " + messageInJson);
                                        this.mNotifier.push(messageInJson);
                                    }
                                }
                                g9.a.g("unknown: " + readCommand.getName());
                            }
                        } else if (name.equals(BcsvrCommand.ACK)) {
                            this.mOnSocketStateListener.onAck();
                        } else {
                            g9.a.g("unknown: " + readCommand.getName());
                        }
                    } else {
                        g9.a.g("closed");
                        return;
                    }
                }
            } catch (InterruptedIOException unused) {
                stop();
            } catch (Exception e10) {
                boolean mIsActive = this.mNotifier.getMIsActive();
                if (mIsActive) {
                    g9.a.c(e10);
                }
                stop();
                if (mIsActive) {
                    this.mOnSocketStateListener.onError(e10);
                }
            }
        }

        public final synchronized void start(BcsvrAddress bcsvrAddress, ExecutorService executorService) {
            p.h(executorService, "executor");
            this.mAddress = bcsvrAddress;
            this.mNotifier.start(executorService);
            this.mFuture = executorService.submit(this);
        }

        public final synchronized void stop() {
            this.mNotifier.stop();
            BcsvrSocket bcsvrSocket = this.mSocket;
            if (bcsvrSocket != null) {
                p.e(bcsvrSocket);
                bcsvrSocket.close();
                this.mSocket = null;
            }
            Future<?> future = this.mFuture;
            if (future == null) {
                return;
            }
            p.e(future);
            future.cancel(true);
            this.mFuture = null;
        }
    }

    private final void disconnect() {
        synchronized (this.mNotifier) {
            Worker worker = this.mWorker;
            if (worker == null) {
                return;
            }
            p.e(worker);
            worker.stop();
            this.mWorker = null;
            v vVar = v.f59242a;
            stopPing();
            stopReconnecting();
        }
    }

    public static /* synthetic */ void getMPingInterval$annotations() {
    }

    public static /* synthetic */ void getMReconnectionInterval$annotations() {
    }

    private final e0 getNetworkHelper() {
        return (e0) this.networkHelper$delegate.getValue();
    }

    public final void addOnMessageListener(OnMessageReceivedListener onMessageReceivedListener) {
        p.h(onMessageReceivedListener, "listener");
        synchronized (this.mNotifier) {
            this.mNotifier.getMListeners().add(onMessageReceivedListener);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.mIsOpen.compareAndSet(true, false)) {
            disconnect();
            this.mTimerExecutor.shutdownNow();
            this.mWorkerExecutor.shutdownNow();
        }
    }

    public final void closeQuietly() {
        try {
            close();
        } catch (Exception unused) {
        }
    }

    public final void connect(BcsvrAddress bcsvrAddress) {
        if (this.mIsOpen.get()) {
            synchronized (this.mNotifier) {
                this.mAddress = bcsvrAddress;
                if (!getNetworkHelper().c()) {
                    startReconnecting();
                    return;
                }
                Worker worker = new Worker(this.mNotifier, new Worker.OnSocketStateListener() { // from class: com.dena.mirrorman.net.bcsvr.BcsvrChannel$connect$2$1
                    @Override // com.dena.mirrorman.net.bcsvr.BcsvrChannel.Worker.OnSocketStateListener
                    public void onAck() {
                        BcsvrChannel.this.onReceivedAck();
                    }

                    @Override // com.dena.mirrorman.net.bcsvr.BcsvrChannel.Worker.OnSocketStateListener
                    public void onError(Exception exc) {
                        BcsvrChannel.this.stopPing();
                        BcsvrChannel.this.startReconnecting();
                    }

                    @Override // com.dena.mirrorman.net.bcsvr.BcsvrChannel.Worker.OnSocketStateListener
                    public void onOpen(BcsvrSocket bcsvrSocket) {
                        p.h(bcsvrSocket, "socket");
                        BcsvrChannel.this.stopReconnecting();
                        BcsvrChannel.this.startPing(bcsvrSocket);
                    }
                });
                this.mWorker = worker;
                p.e(worker);
                worker.start(bcsvrAddress, this.mWorkerExecutor);
                v vVar = v.f59242a;
                return;
            }
        }
        throw new IllegalStateException("Already Closed".toString());
    }

    public final boolean connectNoThrow(BcsvrAddress bcsvrAddress) {
        try {
            connect(bcsvrAddress);
            return true;
        } catch (Exception e10) {
            g9.a.c(e10);
            return false;
        }
    }

    public final boolean disconnectNoThrow() {
        try {
            disconnect();
            return true;
        } catch (Exception e10) {
            g9.a.c(e10);
            return false;
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final long getMLastPingSentMillis() {
        return this.mLastPingSentMillis;
    }

    public final long getMLastReceivedAckMillis() {
        return this.mLastReceivedAckMillis;
    }

    public final long getMPingInterval() {
        return this.mPingInterval;
    }

    public final long getMReconnectionInterval() {
        return this.mReconnectionInterval;
    }

    public final boolean isConnected() {
        boolean mIsActive;
        synchronized (this.mNotifier) {
            mIsActive = this.mNotifier.getMIsActive();
        }
        return mIsActive;
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.mIsOpen.get();
    }

    public final boolean isWorkerRunning() {
        boolean z10;
        synchronized (this.mNotifier) {
            z10 = this.mWorker != null;
        }
        return z10;
    }

    public final boolean keepConnectivity() {
        if (this.mLastPingSentMillis > this.mLastReceivedAckMillis) {
            disconnectNoThrow();
            startReconnecting();
            return false;
        }
        return true;
    }

    public final void onReceivedAck() {
        this.mLastReceivedAckMillis = SystemClock.elapsedRealtime();
    }

    public final void onSentPing() {
        this.mLastPingSentMillis = SystemClock.elapsedRealtime();
    }

    public final void removeOnMessageListener(OnMessageReceivedListener onMessageReceivedListener) {
        p.h(onMessageReceivedListener, "listener");
        synchronized (this.mNotifier) {
            this.mNotifier.getMListeners().remove(onMessageReceivedListener);
        }
    }

    public final void setMLastPingSentMillis(long j10) {
        this.mLastPingSentMillis = j10;
    }

    public final void setMLastReceivedAckMillis(long j10) {
        this.mLastReceivedAckMillis = j10;
    }

    public final void setMPingInterval(long j10) {
        this.mPingInterval = j10;
    }

    public final void setMReconnectionInterval(long j10) {
        this.mReconnectionInterval = j10;
    }

    public final synchronized void startPing(BcsvrSocket bcsvrSocket) {
        p.h(bcsvrSocket, "socket");
        if (this.mIsOpen.get()) {
            stopPing();
            ScheduledExecutorService scheduledExecutorService = this.mTimerExecutor;
            Pinger pinger = new Pinger(this, bcsvrSocket);
            long j10 = this.mPingInterval;
            this.mPingTask = scheduledExecutorService.scheduleWithFixedDelay(pinger, j10, j10, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void startReconnecting() {
        if (this.mAddress == null) {
            return;
        }
        if (this.mIsOpen.get()) {
            stopReconnecting();
            ScheduledExecutorService scheduledExecutorService = this.mTimerExecutor;
            BcsvrAddress bcsvrAddress = this.mAddress;
            p.e(bcsvrAddress);
            this.mReconnectionTask = scheduledExecutorService.schedule(new Reconnecter(this, bcsvrAddress), this.mReconnectionInterval, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void stopPing() {
        ScheduledFuture<?> scheduledFuture = this.mPingTask;
        if (scheduledFuture == null) {
            return;
        }
        p.e(scheduledFuture);
        scheduledFuture.cancel(true);
        this.mPingTask = null;
        this.mLastReceivedAckMillis = 0L;
        this.mLastPingSentMillis = this.mLastReceivedAckMillis;
    }

    public final synchronized void stopReconnecting() {
        ScheduledFuture<?> scheduledFuture = this.mReconnectionTask;
        if (scheduledFuture == null) {
            return;
        }
        p.e(scheduledFuture);
        scheduledFuture.cancel(true);
        this.mReconnectionTask = null;
    }
}
