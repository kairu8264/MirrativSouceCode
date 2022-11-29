package wq;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f59298e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final vq.c f59299f = vq.b.a("_");

    /* renamed from: a  reason: collision with root package name */
    public final nq.a f59300a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<vq.a> f59301b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, xq.a> f59302c;

    /* renamed from: d  reason: collision with root package name */
    public final xq.a f59303d;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final vq.c a() {
            return c.f59299f;
        }
    }

    public c(nq.a aVar) {
        p.h(aVar, "_koin");
        this.f59300a = aVar;
        HashSet<vq.a> hashSet = new HashSet<>();
        this.f59301b = hashSet;
        Map<String, xq.a> e10 = cr.a.f28611a.e();
        this.f59302c = e10;
        xq.a aVar2 = new xq.a(f59299f, "_", true, aVar);
        this.f59303d = aVar2;
        hashSet.add(aVar2.f());
        e10.put(aVar2.d(), aVar2);
    }

    public final xq.a b() {
        return this.f59303d;
    }

    public final void c(tq.a aVar) {
        this.f59301b.addAll(aVar.d());
    }

    public final void d(List<tq.a> list) {
        p.h(list, "modules");
        for (tq.a aVar : list) {
            c(aVar);
        }
    }
}
