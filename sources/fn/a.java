package fn;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f32052a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f32053b;

    static {
        f32053b = a("org.robolectric.Robolectric") != null;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f32052a;
    }

    public static boolean c() {
        return (f32052a == null || f32053b) ? false : true;
    }
}
