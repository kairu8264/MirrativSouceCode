package im;

/* loaded from: classes4.dex */
public final class b extends t<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static b f36875a;

    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            if (f36875a == null) {
                f36875a = new b();
            }
            bVar = f36875a;
        }
        return bVar;
    }

    @Override // im.t
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}
