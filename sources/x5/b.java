package x5;

import a6.g;
import d6.h;
import d6.l;
import j6.m;
import java.util.ArrayList;
import java.util.List;
import wn.k;
import wn.q;
import xn.a0;
import xn.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<e6.b> f59695a;

    /* renamed from: b  reason: collision with root package name */
    public final List<k<g6.c<? extends Object, ? extends Object>, Class<? extends Object>>> f59696b;

    /* renamed from: c  reason: collision with root package name */
    public final List<k<f6.b<? extends Object>, Class<? extends Object>>> f59697c;

    /* renamed from: d  reason: collision with root package name */
    public final List<k<h.a<? extends Object>, Class<? extends Object>>> f59698d;

    /* renamed from: e  reason: collision with root package name */
    public final List<g.a> f59699e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends e6.b> list, List<? extends k<? extends g6.c<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends k<? extends f6.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends k<? extends h.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends g.a> list5) {
        this.f59695a = list;
        this.f59696b = list2;
        this.f59697c = list3;
        this.f59698d = list4;
        this.f59699e = list5;
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, jo.h hVar) {
        this(list, list2, list3, list4, list5);
    }

    public final List<g.a> a() {
        return this.f59699e;
    }

    public final List<k<h.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f59698d;
    }

    public final List<e6.b> c() {
        return this.f59695a;
    }

    public final List<k<f6.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f59697c;
    }

    public final List<k<g6.c<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f59696b;
    }

    public final String f(Object obj, m mVar) {
        String a10;
        List<k<f6.b<? extends Object>, Class<? extends Object>>> list = this.f59697c;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            k<f6.b<? extends Object>, Class<? extends Object>> kVar = list.get(i10);
            f6.b<? extends Object> a11 = kVar.a();
            if (kVar.b().isAssignableFrom(obj.getClass()) && (a10 = a11.a(obj, mVar)) != null) {
                return a10;
            }
            i10 = i11;
        }
        return null;
    }

    public final Object g(Object obj, m mVar) {
        Object a10;
        List<k<g6.c<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f59696b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            k<g6.c<? extends Object, ? extends Object>, Class<? extends Object>> kVar = list.get(i10);
            g6.c<? extends Object, ? extends Object> a11 = kVar.a();
            if (kVar.b().isAssignableFrom(obj.getClass()) && (a10 = a11.a(obj, mVar)) != null) {
                obj = a10;
            }
            i10 = i11;
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final k<a6.g, Integer> i(l lVar, m mVar, e eVar, int i10) {
        int size = this.f59699e.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            a6.g a10 = this.f59699e.get(i10).a(lVar, mVar, eVar);
            if (a10 != null) {
                return q.a(a10, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        return null;
    }

    public final k<d6.h, Integer> j(Object obj, m mVar, e eVar, int i10) {
        d6.h a10;
        int size = this.f59698d.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            k<h.a<? extends Object>, Class<? extends Object>> kVar = this.f59698d.get(i10);
            h.a<? extends Object> a11 = kVar.a();
            if (kVar.b().isAssignableFrom(obj.getClass()) && (a10 = a11.a(obj, mVar, eVar)) != null) {
                return q.a(a10, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<e6.b> f59700a;

        /* renamed from: b  reason: collision with root package name */
        public final List<k<g6.c<? extends Object, ?>, Class<? extends Object>>> f59701b;

        /* renamed from: c  reason: collision with root package name */
        public final List<k<f6.b<? extends Object>, Class<? extends Object>>> f59702c;

        /* renamed from: d  reason: collision with root package name */
        public final List<k<h.a<? extends Object>, Class<? extends Object>>> f59703d;

        /* renamed from: e  reason: collision with root package name */
        public final List<g.a> f59704e;

        public a() {
            this.f59700a = new ArrayList();
            this.f59701b = new ArrayList();
            this.f59702c = new ArrayList();
            this.f59703d = new ArrayList();
            this.f59704e = new ArrayList();
        }

        public final a a(g.a aVar) {
            f().add(aVar);
            return this;
        }

        public final <T> a b(h.a<T> aVar, Class<T> cls) {
            g().add(q.a(aVar, cls));
            return this;
        }

        public final <T> a c(f6.b<T> bVar, Class<T> cls) {
            h().add(q.a(bVar, cls));
            return this;
        }

        public final <T> a d(g6.c<T, ?> cVar, Class<T> cls) {
            i().add(q.a(cVar, cls));
            return this;
        }

        public final b e() {
            return new b(o6.c.a(this.f59700a), o6.c.a(this.f59701b), o6.c.a(this.f59702c), o6.c.a(this.f59703d), o6.c.a(this.f59704e), null);
        }

        public final List<g.a> f() {
            return this.f59704e;
        }

        public final List<k<h.a<? extends Object>, Class<? extends Object>>> g() {
            return this.f59703d;
        }

        public final List<k<f6.b<? extends Object>, Class<? extends Object>>> h() {
            return this.f59702c;
        }

        public final List<k<g6.c<? extends Object, ?>, Class<? extends Object>>> i() {
            return this.f59701b;
        }

        public a(b bVar) {
            this.f59700a = a0.D0(bVar.c());
            this.f59701b = a0.D0(bVar.e());
            this.f59702c = a0.D0(bVar.d());
            this.f59703d = a0.D0(bVar.b());
            this.f59704e = a0.D0(bVar.a());
        }
    }

    public b() {
        this(s.k(), s.k(), s.k(), s.k(), s.k());
    }
}
