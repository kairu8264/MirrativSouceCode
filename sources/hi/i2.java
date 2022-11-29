package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class i2 extends m2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ x2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(x2 x2Var, boolean z10) {
        super(x2Var, true);
        this.B = x2Var;
        this.A = z10;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.B.f36066i;
        ((f1) rh.p.i(f1Var)).setDataCollectionEnabled(this.A);
    }
}
