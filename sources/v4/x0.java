package v4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class x0 implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final Executor f56737w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayDeque<Runnable> f56738x = new ArrayDeque<>();

    /* renamed from: y  reason: collision with root package name */
    public Runnable f56739y;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Runnable f56740w;

        public a(Runnable runnable) {
            this.f56740w = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f56740w.run();
            } finally {
                x0.this.a();
            }
        }
    }

    public x0(Executor executor) {
        this.f56737w = executor;
    }

    public synchronized void a() {
        Runnable poll = this.f56738x.poll();
        this.f56739y = poll;
        if (poll != null) {
            this.f56737w.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f56738x.offer(new a(runnable));
        if (this.f56739y == null) {
            a();
        }
    }
}
