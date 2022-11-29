package im;

/* loaded from: classes4.dex */
public final class e extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static e f36879a;

    public static synchronized e e() {
        e eVar;
        synchronized (e.class) {
            if (f36879a == null) {
                f36879a = new e();
            }
            eVar = f36879a;
        }
        return eVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // im.t
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    public Long d() {
        return 70L;
    }
}
