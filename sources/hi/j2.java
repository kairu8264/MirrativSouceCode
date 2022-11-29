package hi;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class j2 extends m2 {
    public final /* synthetic */ n2 A;
    public final /* synthetic */ x2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(x2 x2Var, n2 n2Var) {
        super(x2Var, true);
        this.B = x2Var;
        this.A = n2Var;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.B.f36066i;
        ((f1) rh.p.i(f1Var)).registerOnMeasurementEventListener(this.A);
    }
}
