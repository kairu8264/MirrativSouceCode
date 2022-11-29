package ai;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class fk3 {

    /* renamed from: c  reason: collision with root package name */
    public static final fk3 f4072c = new fk3();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, ok3<?>> f4074b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final qk3 f4073a = new pj3();

    public static fk3 a() {
        return f4072c;
    }

    public final <T> ok3<T> b(Class<T> cls) {
        bj3.b(cls, "messageType");
        ok3<T> ok3Var = (ok3<T>) this.f4074b.get(cls);
        if (ok3Var == null) {
            ok3Var = this.f4073a.a(cls);
            bj3.b(cls, "messageType");
            bj3.b(ok3Var, "schema");
            ok3 putIfAbsent = this.f4074b.putIfAbsent(cls, ok3Var);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return ok3Var;
    }
}
