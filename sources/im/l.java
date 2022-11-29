package im;

/* loaded from: classes4.dex */
public final class l extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static l f36886a;

    public static synchronized l e() {
        l lVar;
        synchronized (l.class) {
            if (f36886a == null) {
                f36886a = new l();
            }
            lVar = f36886a;
        }
        return lVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // im.t
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // im.t
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }
}
