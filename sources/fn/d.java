package fn;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.protobuf.m<?> f32085a = new com.google.protobuf.n();

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.protobuf.m<?> f32086b = c();

    public static com.google.protobuf.m<?> a() {
        com.google.protobuf.m<?> mVar = f32086b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static com.google.protobuf.m<?> b() {
        return f32085a;
    }

    public static com.google.protobuf.m<?> c() {
        try {
            return (com.google.protobuf.m) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
