package ai;

/* loaded from: classes3.dex */
public final class gi3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ei3<?> f4469a = new fi3();

    /* renamed from: b  reason: collision with root package name */
    public static final ei3<?> f4470b;

    static {
        ei3<?> ei3Var;
        try {
            ei3Var = (ei3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            ei3Var = null;
        }
        f4470b = ei3Var;
    }

    public static ei3<?> a() {
        return f4469a;
    }

    public static ei3<?> b() {
        ei3<?> ei3Var = f4470b;
        if (ei3Var != null) {
            return ei3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
