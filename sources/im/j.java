package im;

/* loaded from: classes4.dex */
public final class j extends t<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static j f36884a;

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            if (f36884a == null) {
                f36884a = new j();
            }
            jVar = f36884a;
        }
        return jVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // im.t
    public String c() {
        return "fpr_enabled";
    }

    public Boolean d() {
        return Boolean.TRUE;
    }
}
