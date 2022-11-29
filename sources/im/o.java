package im;

/* loaded from: classes4.dex */
public final class o extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static o f36889a;

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            if (f36889a == null) {
                f36889a = new o();
            }
            oVar = f36889a;
        }
        return oVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // im.t
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // im.t
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }
}
