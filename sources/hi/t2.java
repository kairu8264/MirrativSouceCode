package hi;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class t2 extends m2 {
    public final /* synthetic */ Activity A;
    public final /* synthetic */ w2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var, Activity activity) {
        super(w2Var.f36032w, true);
        this.B = w2Var;
        this.A = activity;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.B.f36032w.f36066i;
        ((f1) rh.p.i(f1Var)).onActivityStopped(yh.b.h1(this.A), this.f35852x);
    }
}
