package p0;

import java.util.Map;
import java.util.Set;
import p0.t;

/* loaded from: classes.dex */
public final class d<K, V> extends xn.d<K, V> implements n0.f<K, V> {

    /* renamed from: x  reason: collision with root package name */
    public final t<K, V> f45652x;

    /* renamed from: y  reason: collision with root package name */
    public final int f45653y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f45651z = new a(null);
    public static final d A = new d(t.f45669e.a(), 0);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final <K, V> d<K, V> a() {
            return d.A;
        }
    }

    public d(t<K, V> tVar, int i10) {
        jo.p.h(tVar, "node");
        this.f45652x = tVar;
        this.f45653y = i10;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f45652x.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // xn.d
    public final Set<Map.Entry<K, V>> f() {
        return p();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f45652x.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // xn.d
    public int h() {
        return this.f45653y;
    }

    @Override // n0.f
    /* renamed from: o */
    public f<K, V> n() {
        return new f<>(this);
    }

    public final n0.d<Map.Entry<K, V>> p() {
        return new n(this);
    }

    @Override // xn.d
    /* renamed from: q */
    public n0.d<K> g() {
        return new p(this);
    }

    public final t<K, V> r() {
        return this.f45652x;
    }

    @Override // xn.d
    /* renamed from: s */
    public n0.b<V> i() {
        return new r(this);
    }

    public d<K, V> t(K k10, V v10) {
        t.b<K, V> P = this.f45652x.P(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return P == null ? this : new d<>(P.a(), size() + P.b());
    }

    public d<K, V> u(K k10) {
        t<K, V> Q = this.f45652x.Q(k10 != null ? k10.hashCode() : 0, k10, 0);
        if (this.f45652x == Q) {
            return this;
        }
        if (Q == null) {
            return f45651z.a();
        }
        return new d<>(Q, size() - 1);
    }
}
