package ai;

/* loaded from: classes3.dex */
public final class mi3 implements vj3 {

    /* renamed from: a  reason: collision with root package name */
    public static final mi3 f6953a = new mi3();

    public static mi3 c() {
        return f6953a;
    }

    @Override // ai.vj3
    public final boolean a(Class<?> cls) {
        return ri3.class.isAssignableFrom(cls);
    }

    @Override // ai.vj3
    public final uj3 b(Class<?> cls) {
        if (!ri3.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (uj3) ri3.x(cls.asSubclass(ri3.class)).A(3, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}
