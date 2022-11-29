package im;

/* loaded from: classes4.dex */
public final class m extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static m f36887a;

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            if (f36887a == null) {
                f36887a = new m();
            }
            mVar = f36887a;
        }
        return mVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // im.t
    public String b() {
        return "sessions_max_length_minutes";
    }

    @Override // im.t
    public String c() {
        return "fpr_session_max_duration_min";
    }

    public Long d() {
        return 240L;
    }
}
