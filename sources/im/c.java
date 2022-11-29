package im;

/* loaded from: classes4.dex */
public final class c extends t<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static c f36876a;

    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            if (f36876a == null) {
                f36876a = new c();
            }
            cVar = f36876a;
        }
        return cVar;
    }

    @Override // im.t
    public String a() {
        return "isEnabled";
    }

    @Override // im.t
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}
