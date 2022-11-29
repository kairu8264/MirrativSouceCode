package pi;

import android.os.Bundle;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes3.dex */
public final class r6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f48192w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48193x;

    public r6(i7 i7Var, Bundle bundle) {
        this.f48193x = i7Var;
        this.f48192w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i7 i7Var = this.f48193x;
        Bundle bundle = this.f48192w;
        i7Var.f();
        i7Var.g();
        rh.p.i(bundle);
        String e10 = rh.p.e(bundle.getString("name"));
        if (!i7Var.f48285a.m()) {
            i7Var.f48285a.r().u().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            i7Var.f48285a.L().q(new c(bundle.getString(MRLog.PAYLOAD_KEY_APP_ID), "", new ea(e10, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), i7Var.f48285a.N().w0(bundle.getString(MRLog.PAYLOAD_KEY_APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
