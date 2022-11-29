package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class w1 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ x2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x2 x2Var, String str) {
        super(x2Var, true);
        this.B = x2Var;
        this.A = str;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.B.f36066i;
        ((f1) rh.p.i(f1Var)).beginAdUnitExposure(this.A, this.f35852x);
    }
}
