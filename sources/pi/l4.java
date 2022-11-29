package pi;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class l4 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f48019a;

    public l4(k4 k4Var) {
        rh.p.i(k4Var);
        this.f48019a = k4Var;
    }

    public final void a(Context context, Intent intent) {
        b5 H = b5.H(context, null, null);
        q3 r10 = H.r();
        if (intent == null) {
            r10.v().a("Receiver called with null intent");
            return;
        }
        H.b();
        String action = intent.getAction();
        r10.u().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            r10.u().a("Starting wakeful intent.");
            this.f48019a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            r10.v().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
