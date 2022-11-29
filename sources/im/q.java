package im;

/* loaded from: classes4.dex */
public final class q extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static q f36891a;

    public static synchronized q e() {
        q qVar;
        synchronized (q.class) {
            if (f36891a == null) {
                f36891a = new q();
            }
            qVar = f36891a;
        }
        return qVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // im.t
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    public Long d() {
        return 30L;
    }
}
