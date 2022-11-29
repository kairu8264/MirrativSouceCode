package fn;

/* loaded from: classes4.dex */
public class f implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final f f32090a = new f();

    public static f c() {
        return f32090a;
    }

    @Override // fn.m
    public l a(Class<?> cls) {
        if (com.google.protobuf.r.class.isAssignableFrom(cls)) {
            try {
                return (l) com.google.protobuf.r.D(cls.asSubclass(com.google.protobuf.r.class)).w();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // fn.m
    public boolean b(Class<?> cls) {
        return com.google.protobuf.r.class.isAssignableFrom(cls);
    }
}
