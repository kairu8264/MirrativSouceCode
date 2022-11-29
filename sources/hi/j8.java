package hi;

/* loaded from: classes3.dex */
public final class j8 {

    /* renamed from: a  reason: collision with root package name */
    public static final h8<?> f35822a = new i8();

    /* renamed from: b  reason: collision with root package name */
    public static final h8<?> f35823b;

    static {
        h8<?> h8Var;
        try {
            h8Var = (h8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            h8Var = null;
        }
        f35823b = h8Var;
    }

    public static h8<?> a() {
        h8<?> h8Var = f35823b;
        if (h8Var != null) {
            return h8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static h8<?> b() {
        return f35822a;
    }
}
