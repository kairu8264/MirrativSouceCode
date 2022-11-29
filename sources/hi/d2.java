package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class d2 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ b1 D;
    public final /* synthetic */ x2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(x2 x2Var, String str, String str2, boolean z10, b1 b1Var) {
        super(x2Var, true);
        this.E = x2Var;
        this.A = str;
        this.B = str2;
        this.C = z10;
        this.D = b1Var;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.E.f36066i;
        ((f1) rh.p.i(f1Var)).getUserProperties(this.A, this.B, this.C, this.D);
    }

    @Override // hi.m2
    public final void b() {
        this.D.g0(null);
    }
}
