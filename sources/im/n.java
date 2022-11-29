package im;

/* loaded from: classes4.dex */
public final class n extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static n f36888a;

    public static synchronized n e() {
        n nVar;
        synchronized (n.class) {
            if (f36888a == null) {
                f36888a = new n();
            }
            nVar = f36888a;
        }
        return nVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // im.t
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // im.t
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}
