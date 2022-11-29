package o4;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {
    public static final ThreadFactory B;
    public static final BlockingQueue<Runnable> C;
    public static final Executor D;
    public static f E;
    public static volatile Executor F;

    /* renamed from: w  reason: collision with root package name */
    public final h<Params, Result> f44068w;

    /* renamed from: x  reason: collision with root package name */
    public final FutureTask<Result> f44069x;

    /* renamed from: y  reason: collision with root package name */
    public volatile g f44070y = g.PENDING;

    /* renamed from: z  reason: collision with root package name */
    public final AtomicBoolean f44071z = new AtomicBoolean();
    public final AtomicBoolean A = new AtomicBoolean();

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f44072a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f44072a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    public class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            c.this.A.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b(this.f44078a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: o4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0655c extends FutureTask<Result> {
        public C0655c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44075a;

        static {
            int[] iArr = new int[g.values().length];
            f44075a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44075a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final c f44076a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f44077b;

        public e(c cVar, Data... dataArr) {
            this.f44076a = cVar;
            this.f44077b = dataArr;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f44076a.d(eVar.f44077b[0]);
            } else if (i10 != 2) {
            } else {
                eVar.f44076a.k(eVar.f44077b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f44078a;
    }

    static {
        a aVar = new a();
        B = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        C = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        D = threadPoolExecutor;
        F = threadPoolExecutor;
    }

    public c() {
        b bVar = new b();
        this.f44068w = bVar;
        this.f44069x = new C0655c(bVar);
    }

    public static Handler e() {
        f fVar;
        synchronized (c.class) {
            if (E == null) {
                E = new f();
            }
            fVar = E;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f44071z.set(true);
        return this.f44069x.cancel(z10);
    }

    public abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f44070y != g.PENDING) {
            int i10 = d.f44075a[this.f44070y.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f44070y = g.RUNNING;
        j();
        this.f44068w.f44078a = paramsArr;
        executor.execute(this.f44069x);
        return this;
    }

    public void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f44070y = g.FINISHED;
    }

    public final boolean f() {
        return this.f44071z.get();
    }

    public void g() {
    }

    public void h(Result result) {
        g();
    }

    public void i(Result result) {
    }

    public void j() {
    }

    public void k(Progress... progressArr) {
    }

    public Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void m(Result result) {
        if (this.A.get()) {
            return;
        }
        l(result);
    }
}
