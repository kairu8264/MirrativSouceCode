package cg;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class m implements Executor {

    /* renamed from: w  reason: collision with root package name */
    public final Executor f19619w;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final Runnable f19620w;

        public a(Runnable runnable) {
            this.f19620w = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19620w.run();
            } catch (Exception e10) {
                hg.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public m(Executor executor) {
        this.f19619w = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f19619w.execute(new a(runnable));
    }
}
