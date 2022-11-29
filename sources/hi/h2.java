package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class h2 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ b1 B;
    public final /* synthetic */ x2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(x2 x2Var, String str, b1 b1Var) {
        super(x2Var, true);
        this.C = x2Var;
        this.A = str;
        this.B = b1Var;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.C.f36066i;
        ((f1) rh.p.i(f1Var)).getMaxUserProperties(this.A, this.B);
    }

    @Override // hi.m2
    public final void b() {
        this.B.g0(null);
    }
}
