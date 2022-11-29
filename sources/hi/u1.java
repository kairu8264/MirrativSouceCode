package hi;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class u1 extends m2 {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ x2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(x2 x2Var, Bundle bundle) {
        super(x2Var, true);
        this.B = x2Var;
        this.A = bundle;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.B.f36066i;
        ((f1) rh.p.i(f1Var)).setConsent(this.A, this.f35851w);
    }
}
