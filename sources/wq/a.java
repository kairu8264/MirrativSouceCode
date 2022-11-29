package wq;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.p;
import rq.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final nq.a f59293a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, rq.c<?>> f59294b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<d<?>> f59295c;

    public a(nq.a aVar) {
        p.h(aVar, "_koin");
        this.f59293a = aVar;
        this.f59294b = cr.a.f28611a.e();
        this.f59295c = new HashSet<>();
    }

    public static /* synthetic */ void h(a aVar, boolean z10, String str, rq.c cVar, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        aVar.g(z10, str, cVar, z11);
    }

    public final void a() {
        b(this.f59295c);
        this.f59295c.clear();
    }

    public final void b(HashSet<d<?>> hashSet) {
        if (!hashSet.isEmpty()) {
            if (this.f59293a.d().f(sq.b.DEBUG)) {
                this.f59293a.d().b("Creating eager instances ...");
            }
            nq.a aVar = this.f59293a;
            rq.b bVar = new rq.b(aVar, aVar.e().b(), null, 4, null);
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(bVar);
            }
        }
    }

    public final void c(tq.a aVar, boolean z10) {
        for (Map.Entry<String, rq.c<?>> entry : aVar.c().entrySet()) {
            h(this, z10, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public final void d(List<tq.a> list, boolean z10) {
        p.h(list, "modules");
        for (tq.a aVar : list) {
            c(aVar, z10);
            this.f59295c.addAll(aVar.b());
        }
    }

    public final rq.c<?> e(qo.b<?> bVar, vq.a aVar, vq.a aVar2) {
        p.h(bVar, "clazz");
        p.h(aVar2, "scopeQualifier");
        return this.f59294b.get(qq.b.a(bVar, aVar, aVar2));
    }

    public final <T> T f(vq.a aVar, qo.b<?> bVar, vq.a aVar2, rq.b bVar2) {
        p.h(bVar, "clazz");
        p.h(aVar2, "scopeQualifier");
        p.h(bVar2, "instanceContext");
        rq.c<?> e10 = e(bVar, aVar, aVar2);
        if (e10 == null) {
            return null;
        }
        return (T) e10.b(bVar2);
    }

    public final void g(boolean z10, String str, rq.c<?> cVar, boolean z11) {
        p.h(str, "mapping");
        p.h(cVar, "factory");
        if (this.f59294b.containsKey(str)) {
            if (!z10) {
                tq.b.a(cVar, str);
            } else if (z11) {
                sq.c d10 = this.f59293a.d();
                d10.e("Override Mapping '" + str + "' with " + cVar.c());
            }
        }
        if (this.f59293a.d().f(sq.b.DEBUG) && z11) {
            sq.c d11 = this.f59293a.d();
            d11.b("add mapping '" + str + "' for " + cVar.c());
        }
        this.f59294b.put(str, cVar);
    }

    public final int i() {
        return this.f59294b.size();
    }
}
