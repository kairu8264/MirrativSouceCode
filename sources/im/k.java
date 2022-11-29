package im;

/* loaded from: classes4.dex */
public final class k extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static k f36885a;

    public static synchronized k e() {
        k kVar;
        synchronized (k.class) {
            if (f36885a == null) {
                f36885a = new k();
            }
            kVar = f36885a;
        }
        return kVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // im.t
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // im.t
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}
