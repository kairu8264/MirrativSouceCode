package im;

/* loaded from: classes4.dex */
public final class r extends t<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static r f36892a;

    public static synchronized r e() {
        r rVar;
        synchronized (r.class) {
            if (f36892a == null) {
                f36892a = new r();
            }
            rVar = f36892a;
        }
        return rVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // im.t
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    public Long d() {
        return 300L;
    }
}
