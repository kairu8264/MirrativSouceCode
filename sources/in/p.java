package in;

import ep.z;
import er.t;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Class, Object> f36929a;

    /* renamed from: b  reason: collision with root package name */
    public final er.t f36930b;

    public p(x xVar) {
        this(ln.b.c(xVar, v.g().d()), new kn.j());
    }

    public final ConcurrentHashMap a() {
        return new ConcurrentHashMap();
    }

    public final xm.e b() {
        return new xm.f().d(new nn.g()).d(new nn.h()).c(nn.c.class, new nn.d()).b();
    }

    public final er.t c(z zVar, kn.j jVar) {
        return new t.b().g(zVar).d(jVar.c()).b(fr.a.g(b())).e();
    }

    public on.a d() {
        return (on.a) e(on.a.class);
    }

    public <T> T e(Class<T> cls) {
        if (!this.f36929a.contains(cls)) {
            this.f36929a.putIfAbsent(cls, this.f36930b.b(cls));
        }
        return (T) this.f36929a.get(cls);
    }

    public p(z zVar, kn.j jVar) {
        this.f36929a = a();
        this.f36930b = c(zVar, jVar);
    }
}
