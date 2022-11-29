package pi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class b8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ na f47651w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f47652x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w8 f47653y;

    public b8(w8 w8Var, na naVar, hi.i1 i1Var) {
        this.f47653y = w8Var;
        this.f47651w = naVar;
        this.f47652x = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b5 b5Var;
        g3 g3Var;
        String str = null;
        try {
            try {
                if (this.f47653y.f48285a.E().o().k()) {
                    g3Var = this.f47653y.f48322d;
                    if (g3Var == null) {
                        this.f47653y.f48285a.r().p().a("Failed to get app instance id");
                        b5Var = this.f47653y.f48285a;
                    } else {
                        rh.p.i(this.f47651w);
                        str = g3Var.m2(this.f47651w);
                        if (str != null) {
                            this.f47653y.f48285a.I().B(str);
                            this.f47653y.f48285a.E().f47827g.b(str);
                        }
                        this.f47653y.D();
                        b5Var = this.f47653y.f48285a;
                    }
                } else {
                    this.f47653y.f48285a.r().w().a("Analytics storage consent denied; will not get app instance id");
                    this.f47653y.f48285a.I().B(null);
                    this.f47653y.f48285a.E().f47827g.b(null);
                    b5Var = this.f47653y.f48285a;
                }
            } catch (RemoteException e10) {
                this.f47653y.f48285a.r().p().b("Failed to get app instance id", e10);
                b5Var = this.f47653y.f48285a;
            }
            b5Var.N().I(this.f47652x, str);
        } catch (Throwable th2) {
            this.f47653y.f48285a.N().I(this.f47652x, null);
            throw th2;
        }
    }
}
