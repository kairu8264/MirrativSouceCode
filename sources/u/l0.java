package u;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l0<T> implements z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f54058a;

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: b  reason: collision with root package name */
        public int f54062b;

        /* renamed from: a  reason: collision with root package name */
        public int f54061a = 300;

        /* renamed from: c  reason: collision with root package name */
        public final Map<Integer, a<T>> f54063c = new LinkedHashMap();

        public final a<T> a(T t10, int i10) {
            a<T> aVar = new a<>(t10, null, 2, null);
            d().put(Integer.valueOf(i10), aVar);
            return aVar;
        }

        public final int b() {
            return this.f54062b;
        }

        public final int c() {
            return this.f54061a;
        }

        public final Map<Integer, a<T>> d() {
            return this.f54063c;
        }

        public final void e(int i10) {
            this.f54062b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f54062b == bVar.f54062b && this.f54061a == bVar.f54061a && jo.p.c(this.f54063c, bVar.f54063c)) {
                    return true;
                }
            }
            return false;
        }

        public final void f(int i10) {
            this.f54061a = i10;
        }

        public final void g(a<T> aVar, a0 a0Var) {
            jo.p.h(aVar, "<this>");
            jo.p.h(a0Var, "easing");
            aVar.a(a0Var);
        }

        public int hashCode() {
            return (((this.f54061a * 31) + this.f54062b) * 31) + this.f54063c.hashCode();
        }
    }

    public l0(b<T> bVar) {
        jo.p.h(bVar, "config");
        this.f54058a = bVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && jo.p.c(this.f54058a, ((l0) obj).f54058a);
    }

    @Override // u.z, u.i
    /* renamed from: f */
    public <V extends p> n1<V> a(c1<T, V> c1Var) {
        jo.p.h(c1Var, "converter");
        Map<Integer, a<T>> d10 = this.f54058a.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(xn.m0.b(d10.size()));
        Iterator<T> it = d10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).b(c1Var.a()));
        }
        return new n1<>(linkedHashMap, this.f54058a.c(), this.f54058a.b());
    }

    public int hashCode() {
        return this.f54058a.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f54059a;

        /* renamed from: b  reason: collision with root package name */
        public a0 f54060b;

        public a(T t10, a0 a0Var) {
            jo.p.h(a0Var, "easing");
            this.f54059a = t10;
            this.f54060b = a0Var;
        }

        public final void a(a0 a0Var) {
            jo.p.h(a0Var, "<set-?>");
            this.f54060b = a0Var;
        }

        public final <V extends p> wn.k<V, a0> b(io.l<? super T, ? extends V> lVar) {
            jo.p.h(lVar, "convertToVector");
            return wn.q.a(lVar.invoke((T) this.f54059a), this.f54060b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (jo.p.c(aVar.f54059a, this.f54059a) && jo.p.c(aVar.f54060b, this.f54060b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t10 = this.f54059a;
            return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.f54060b.hashCode();
        }

        public /* synthetic */ a(Object obj, a0 a0Var, int i10, jo.h hVar) {
            this(obj, (i10 & 2) != 0 ? b0.c() : a0Var);
        }
    }
}
