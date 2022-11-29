package im;

/* loaded from: classes4.dex */
public final class h extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static h f36882a;

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            if (f36882a == null) {
                f36882a = new h();
            }
            hVar = f36882a;
        }
        return hVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // im.t
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    public Long d() {
        return 600L;
    }
}
