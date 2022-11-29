package im;

/* loaded from: classes4.dex */
public final class s extends t<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static s f36893a;

    public static synchronized s e() {
        s sVar;
        synchronized (s.class) {
            if (f36893a == null) {
                f36893a = new s();
            }
            sVar = f36893a;
        }
        return sVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // im.t
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    public Float d() {
        return Float.valueOf(1.0f);
    }
}
