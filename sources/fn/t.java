package fn;

import com.google.protobuf.j0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final t f32098c = new t();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, v<?>> f32100b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final w f32099a = new j();

    public static t a() {
        return f32098c;
    }

    public <T> void b(T t10, j0 j0Var, com.google.protobuf.l lVar) throws IOException {
        e(t10).h(t10, j0Var, lVar);
    }

    public v<?> c(Class<?> cls, v<?> vVar) {
        com.google.protobuf.t.b(cls, "messageType");
        com.google.protobuf.t.b(vVar, "schema");
        return this.f32100b.putIfAbsent(cls, vVar);
    }

    public <T> v<T> d(Class<T> cls) {
        com.google.protobuf.t.b(cls, "messageType");
        v<T> vVar = (v<T>) this.f32100b.get(cls);
        if (vVar == null) {
            v<T> a10 = this.f32099a.a(cls);
            v<T> vVar2 = (v<T>) c(cls, a10);
            return vVar2 != null ? vVar2 : a10;
        }
        return vVar;
    }

    public <T> v<T> e(T t10) {
        return d(t10.getClass());
    }
}
