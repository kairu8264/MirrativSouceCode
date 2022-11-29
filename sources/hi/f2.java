package hi;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class f2 extends m2 {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ b1 B;
    public final /* synthetic */ x2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(x2 x2Var, Bundle bundle, b1 b1Var) {
        super(x2Var, true);
        this.C = x2Var;
        this.A = bundle;
        this.B = b1Var;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.C.f36066i;
        ((f1) rh.p.i(f1Var)).performAction(this.A, this.B, this.f35851w);
    }

    @Override // hi.m2
    public final void b() {
        this.B.g0(null);
    }
}
