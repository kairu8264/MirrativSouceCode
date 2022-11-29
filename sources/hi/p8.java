package hi;

/* loaded from: classes3.dex */
public final class p8 implements u9 {

    /* renamed from: a  reason: collision with root package name */
    public static final p8 f35905a = new p8();

    public static p8 c() {
        return f35905a;
    }

    @Override // hi.u9
    public final s9 a(Class<?> cls) {
        if (!t8.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (s9) t8.m(cls.asSubclass(t8.class)).q(3, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }

    @Override // hi.u9
    public final boolean b(Class<?> cls) {
        return t8.class.isAssignableFrom(cls);
    }
}
