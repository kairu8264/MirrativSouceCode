package hi;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class u2 extends m2 {
    public final /* synthetic */ Activity A;
    public final /* synthetic */ b1 B;
    public final /* synthetic */ w2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, Activity activity, b1 b1Var) {
        super(w2Var.f36032w, true);
        this.C = w2Var;
        this.A = activity;
        this.B = b1Var;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        f1 f1Var;
        f1Var = this.C.f36032w.f36066i;
        ((f1) rh.p.i(f1Var)).onActivitySaveInstanceState(yh.b.h1(this.A), this.B, this.f35852x);
    }
}
