package im;

/* loaded from: classes4.dex */
public final class f extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static f f36880a;

    public static synchronized f e() {
        f fVar;
        synchronized (f.class) {
            if (f36880a == null) {
                f36880a = new f();
            }
            fVar = f36880a;
        }
        return fVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // im.t
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    public Long d() {
        return 700L;
    }
}
