package ai;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c01 extends ty0 {

    /* renamed from: i  reason: collision with root package name */
    public final a20 f2644i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f2645j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f2646k;

    public c01(t01 t01Var, a20 a20Var, Runnable runnable, Executor executor) {
        super(t01Var);
        this.f2644i = a20Var;
        this.f2645j = runnable;
        this.f2646k = executor;
    }

    @Override // ai.u01
    public final void a() {
        final AtomicReference atomicReference = new AtomicReference(this.f2645j);
        final Runnable runnable = new Runnable(atomicReference) { // from class: ai.a01

            /* renamed from: w  reason: collision with root package name */
            public final AtomicReference f1658w;

            {
                this.f1658w = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.f1658w.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.f2646k.execute(new Runnable(this, runnable) { // from class: ai.b01

            /* renamed from: w  reason: collision with root package name */
            public final c01 f2178w;

            /* renamed from: x  reason: collision with root package name */
            public final Runnable f2179x;

            {
                this.f2178w = this;
                this.f2179x = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2178w.n(this.f2179x);
            }
        });
    }

    @Override // ai.ty0
    public final View g() {
        return null;
    }

    @Override // ai.ty0
    public final void h(ViewGroup viewGroup, fs fsVar) {
    }

    @Override // ai.ty0
    public final pv i() {
        return null;
    }

    @Override // ai.ty0
    public final il2 j() {
        return null;
    }

    @Override // ai.ty0
    public final il2 k() {
        return null;
    }

    @Override // ai.ty0
    public final int l() {
        return 0;
    }

    @Override // ai.ty0
    public final void m() {
    }

    public final /* synthetic */ void n(Runnable runnable) {
        try {
            if (this.f2644i.S(yh.b.h1(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
