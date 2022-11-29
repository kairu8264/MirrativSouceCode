package u5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class g implements Executor {

    /* renamed from: x  reason: collision with root package name */
    public final Executor f54403x;

    /* renamed from: z  reason: collision with root package name */
    public volatile Runnable f54405z;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayDeque<a> f54402w = new ArrayDeque<>();

    /* renamed from: y  reason: collision with root package name */
    public final Object f54404y = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final g f54406w;

        /* renamed from: x  reason: collision with root package name */
        public final Runnable f54407x;

        public a(g gVar, Runnable runnable) {
            this.f54406w = gVar;
            this.f54407x = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f54407x.run();
            } finally {
                this.f54406w.b();
            }
        }
    }

    public g(Executor executor) {
        this.f54403x = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f54404y) {
            z10 = !this.f54402w.isEmpty();
        }
        return z10;
    }

    public void b() {
        synchronized (this.f54404y) {
            a poll = this.f54402w.poll();
            this.f54405z = poll;
            if (poll != null) {
                this.f54403x.execute(this.f54405z);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f54404y) {
            this.f54402w.add(new a(this, runnable));
            if (this.f54405z == null) {
                b();
            }
        }
    }
}
