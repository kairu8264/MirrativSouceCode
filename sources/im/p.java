package im;

/* loaded from: classes4.dex */
public final class p extends t<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static p f36890a;

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            if (f36890a == null) {
                f36890a = new p();
            }
            pVar = f36890a;
        }
        return pVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // im.t
    public String b() {
        return "sessions_sampling_percentage";
    }

    @Override // im.t
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    public Float d() {
        return Float.valueOf(0.01f);
    }
}
