package hi;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class t1 extends m2 {
    public final /* synthetic */ Activity A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ x2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(x2 x2Var, Activity activity, String str, String str2) {
        super(x2Var, true);
        this.D = x2Var;
        this.A = activity;
        this.B = str;
        this.C = str2;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.D.f36066i;
        ((f1) rh.p.i(f1Var)).setCurrentScreen(yh.b.h1(this.A), this.B, this.C, this.f35851w);
    }
}
