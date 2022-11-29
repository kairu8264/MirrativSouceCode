package hi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class ea {

    /* renamed from: c  reason: collision with root package name */
    public static final ea f35739c = new ea();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, ha<?>> f35741b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final ia f35740a = new n9();

    public static ea a() {
        return f35739c;
    }

    public final <T> ha<T> b(Class<T> cls) {
        b9.f(cls, "messageType");
        ha<T> haVar = (ha<T>) this.f35741b.get(cls);
        if (haVar == null) {
            haVar = this.f35740a.a(cls);
            b9.f(cls, "messageType");
            b9.f(haVar, "schema");
            ha putIfAbsent = this.f35741b.putIfAbsent(cls, haVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return haVar;
    }
}
