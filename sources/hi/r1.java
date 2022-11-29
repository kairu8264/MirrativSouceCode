package hi;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class r1 extends m2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Bundle C;
    public final /* synthetic */ x2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(x2 x2Var, String str, String str2, Bundle bundle) {
        super(x2Var, true);
        this.D = x2Var;
        this.A = str;
        this.B = str2;
        this.C = bundle;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.D.f36066i;
        ((f1) rh.p.i(f1Var)).clearConditionalUserProperty(this.A, this.B, this.C);
    }
}
