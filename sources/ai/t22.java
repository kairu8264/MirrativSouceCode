package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public class t22 extends v32 {
    public final wc1 G;

    public t22(t41 t41Var, lc1 lc1Var, n51 n51Var, d61 d61Var, i61 i61Var, i51 i51Var, v91 v91Var, fd1 fd1Var, c71 c71Var, wc1 wc1Var, r91 r91Var) {
        super(t41Var, lc1Var, n51Var, d61Var, i61Var, v91Var, c71Var, fd1Var, r91Var, i51Var);
        this.G = wc1Var;
    }

    @Override // ai.v32, ai.f90
    public final void G4(lf0 lf0Var) {
        this.G.p0(lf0Var);
    }

    @Override // ai.v32, ai.f90
    public final void O0(pf0 pf0Var) throws RemoteException {
        this.G.p0(new lf0(pf0Var.c(), pf0Var.a()));
    }

    @Override // ai.v32, ai.f90
    public final void m() throws RemoteException {
        this.G.b();
    }

    @Override // ai.v32, ai.f90
    public final void n() {
        this.G.b();
    }

    @Override // ai.v32, ai.f90
    public final void o() {
        this.G.zza();
    }
}
