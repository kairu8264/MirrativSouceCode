package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class a2 extends m2 {
    public final /* synthetic */ b1 A;
    public final /* synthetic */ x2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(x2 x2Var, b1 b1Var) {
        super(x2Var, true);
        this.B = x2Var;
        this.A = b1Var;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.B.f36066i;
        ((f1) rh.p.i(f1Var)).generateEventId(this.A);
    }

    @Override // hi.m2
    public final void b() {
        this.A.g0(null);
    }
}
