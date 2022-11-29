package ai;

/* loaded from: classes3.dex */
public final class sn3<T> implements rn3, kn3 {

    /* renamed from: b  reason: collision with root package name */
    public static final sn3<Object> f9885b = new sn3<>(null);

    /* renamed from: a  reason: collision with root package name */
    public final T f9886a;

    public sn3(T t10) {
        this.f9886a = t10;
    }

    public static <T> rn3<T> a(T t10) {
        zn3.a(t10, "instance cannot be null");
        return new sn3(t10);
    }

    public static <T> rn3<T> b(T t10) {
        return t10 == null ? f9885b : new sn3(t10);
    }

    @Override // ai.eo3
    public final T zzb() {
        return this.f9886a;
    }
}
