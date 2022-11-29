package pi;

import android.os.Bundle;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class q6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f48171w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48172x;

    public q6(i7 i7Var, Bundle bundle) {
        this.f48172x = i7Var;
        this.f48171w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i7 i7Var = this.f48172x;
        Bundle bundle = this.f48171w;
        i7Var.f();
        i7Var.g();
        rh.p.i(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(TtmlNode.ATTR_TTS_ORIGIN);
        rh.p.e(string);
        rh.p.e(string2);
        rh.p.i(bundle.get("value"));
        if (!i7Var.f48285a.m()) {
            i7Var.f48285a.r().u().a("Conditional property not set since app measurement is disabled");
            return;
        }
        ea eaVar = new ea(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            u w02 = i7Var.f48285a.N().w0(bundle.getString(MRLog.PAYLOAD_KEY_APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            i7Var.f48285a.L().q(new c(bundle.getString(MRLog.PAYLOAD_KEY_APP_ID), string2, eaVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), i7Var.f48285a.N().w0(bundle.getString(MRLog.PAYLOAD_KEY_APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), w02, bundle.getLong("time_to_live"), i7Var.f48285a.N().w0(bundle.getString(MRLog.PAYLOAD_KEY_APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
