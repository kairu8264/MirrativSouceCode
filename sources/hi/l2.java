package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class l2 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ x2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(x2 x2Var, String str, String str2, Object obj, boolean z10) {
        super(x2Var, true);
        this.E = x2Var;
        this.A = str;
        this.B = str2;
        this.C = obj;
        this.D = z10;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.E.f36066i;
        ((f1) rh.p.i(f1Var)).setUserProperty(this.A, this.B, yh.b.h1(this.C), this.D, this.f35851w);
    }
}
