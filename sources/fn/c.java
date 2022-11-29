package fn;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f32084a = c();

    public static com.google.protobuf.l a() {
        com.google.protobuf.l b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : com.google.protobuf.l.f28159d;
    }

    public static final com.google.protobuf.l b(String str) {
        Class<?> cls = f32084a;
        if (cls == null) {
            return null;
        }
        try {
            return (com.google.protobuf.l) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
