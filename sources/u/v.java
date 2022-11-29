package u;

import u.d;
import u.p;

/* loaded from: classes.dex */
public final class v<T, V extends p> implements d<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final h1<V> f54140a;

    /* renamed from: b  reason: collision with root package name */
    public final c1<T, V> f54141b;

    /* renamed from: c  reason: collision with root package name */
    public final T f54142c;

    /* renamed from: d  reason: collision with root package name */
    public final V f54143d;

    /* renamed from: e  reason: collision with root package name */
    public final V f54144e;

    /* renamed from: f  reason: collision with root package name */
    public final V f54145f;

    /* renamed from: g  reason: collision with root package name */
    public final T f54146g;

    /* renamed from: h  reason: collision with root package name */
    public final long f54147h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f54148i;

    public v(h1<V> h1Var, c1<T, V> c1Var, T t10, V v10) {
        jo.p.h(h1Var, "animationSpec");
        jo.p.h(c1Var, "typeConverter");
        jo.p.h(v10, "initialVelocityVector");
        this.f54140a = h1Var;
        this.f54141b = c1Var;
        this.f54142c = t10;
        V invoke = e().a().invoke(t10);
        this.f54143d = invoke;
        this.f54144e = (V) q.b(v10);
        this.f54146g = e().b().invoke(h1Var.b(invoke, v10));
        this.f54147h = h1Var.c(invoke, v10);
        V v11 = (V) q.b(h1Var.d(d(), invoke, v10));
        this.f54145f = v11;
        int b10 = v11.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v12 = this.f54145f;
            v12.e(i10, po.n.l(v12.a(i10), -this.f54140a.a(), this.f54140a.a()));
        }
    }

    @Override // u.d
    public boolean a() {
        return this.f54148i;
    }

    @Override // u.d
    public V b(long j10) {
        if (!c(j10)) {
            return this.f54140a.d(j10, this.f54143d, this.f54144e);
        }
        return this.f54145f;
    }

    @Override // u.d
    public boolean c(long j10) {
        return d.a.a(this, j10);
    }

    @Override // u.d
    public long d() {
        return this.f54147h;
    }

    @Override // u.d
    public c1<T, V> e() {
        return this.f54141b;
    }

    @Override // u.d
    public T f(long j10) {
        if (!c(j10)) {
            return e().b().invoke(this.f54140a.e(j10, this.f54143d, this.f54144e));
        }
        return g();
    }

    @Override // u.d
    public T g() {
        return this.f54146g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(w<T> wVar, c1<T, V> c1Var, T t10, V v10) {
        this(wVar.a(c1Var), c1Var, t10, v10);
        jo.p.h(wVar, "animationSpec");
        jo.p.h(c1Var, "typeConverter");
        jo.p.h(v10, "initialVelocityVector");
    }
}
