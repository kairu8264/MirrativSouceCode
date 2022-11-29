package im;

/* loaded from: classes4.dex */
public final class g extends t<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static g f36881a;

    public static synchronized g e() {
        g gVar;
        synchronized (g.class) {
            if (f36881a == null) {
                f36881a = new g();
            }
            gVar = f36881a;
        }
        return gVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // im.t
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    public Float d() {
        return Float.valueOf(1.0f);
    }
}
