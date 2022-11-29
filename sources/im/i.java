package im;

/* loaded from: classes4.dex */
public final class i extends t<String> {

    /* renamed from: a  reason: collision with root package name */
    public static i f36883a;

    public static synchronized i e() {
        i iVar;
        synchronized (i.class) {
            if (f36883a == null) {
                f36883a = new i();
            }
            iVar = f36883a;
        }
        return iVar;
    }

    @Override // im.t
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // im.t
    public String c() {
        return "fpr_disabled_android_versions";
    }

    public String d() {
        return "";
    }
}
