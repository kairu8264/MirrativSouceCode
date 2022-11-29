package hi;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class o2 extends m2 {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ Activity B;
    public final /* synthetic */ w2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(w2 w2Var, Bundle bundle, Activity activity) {
        super(w2Var.f36032w, true);
        this.C = w2Var;
        this.A = bundle;
        this.B = activity;
    }

    @Override // hi.m2
    public final void a() throws RemoteException {
        Bundle bundle;
        f1 f1Var;
        if (this.A != null) {
            bundle = new Bundle();
            if (this.A.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.A.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        f1Var = this.C.f36032w.f36066i;
        ((f1) rh.p.i(f1Var)).onActivityCreated(yh.b.h1(this.B), bundle, this.f35852x);
    }
}
