package pi;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f47591w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ na f47592x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w8 f47593y;

    public a8(w8 w8Var, AtomicReference atomicReference, na naVar) {
        this.f47593y = w8Var;
        this.f47591w = atomicReference;
        this.f47592x = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        g3 g3Var;
        synchronized (this.f47591w) {
            try {
            } catch (RemoteException e10) {
                this.f47593y.f48285a.r().p().b("Failed to get app instance id", e10);
                atomicReference = this.f47591w;
            }
            if (!this.f47593y.f48285a.E().o().k()) {
                this.f47593y.f48285a.r().w().a("Analytics storage consent denied; will not get app instance id");
                this.f47593y.f48285a.I().B(null);
                this.f47593y.f48285a.E().f47827g.b(null);
                this.f47591w.set(null);
                this.f47591w.notify();
                return;
            }
            g3Var = this.f47593y.f48322d;
            if (g3Var == null) {
                this.f47593y.f48285a.r().p().a("Failed to get app instance id");
                this.f47591w.notify();
                return;
            }
            rh.p.i(this.f47592x);
            this.f47591w.set(g3Var.m2(this.f47592x));
            String str = (String) this.f47591w.get();
            if (str != null) {
                this.f47593y.f48285a.I().B(str);
                this.f47593y.f48285a.E().f47827g.b(str);
            }
            this.f47593y.D();
            atomicReference = this.f47591w;
            atomicReference.notify();
        }
    }
}
