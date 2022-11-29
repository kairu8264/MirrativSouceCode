package u;

import l0.z1;
import u.p;

/* loaded from: classes.dex */
public final class h<T, V extends p> {

    /* renamed from: a  reason: collision with root package name */
    public final c1<T, V> f54013a;

    /* renamed from: b  reason: collision with root package name */
    public final T f54014b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54015c;

    /* renamed from: d  reason: collision with root package name */
    public final io.a<wn.v> f54016d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0 f54017e;

    /* renamed from: f  reason: collision with root package name */
    public V f54018f;

    /* renamed from: g  reason: collision with root package name */
    public long f54019g;

    /* renamed from: h  reason: collision with root package name */
    public long f54020h;

    /* renamed from: i  reason: collision with root package name */
    public final l0.s0 f54021i;

    public h(T t10, c1<T, V> c1Var, V v10, long j10, T t11, long j11, boolean z10, io.a<wn.v> aVar) {
        l0.s0 e10;
        l0.s0 e11;
        jo.p.h(c1Var, "typeConverter");
        jo.p.h(v10, "initialVelocityVector");
        jo.p.h(aVar, "onCancel");
        this.f54013a = c1Var;
        this.f54014b = t11;
        this.f54015c = j11;
        this.f54016d = aVar;
        e10 = z1.e(t10, null, 2, null);
        this.f54017e = e10;
        this.f54018f = (V) q.b(v10);
        this.f54019g = j10;
        this.f54020h = Long.MIN_VALUE;
        e11 = z1.e(Boolean.valueOf(z10), null, 2, null);
        this.f54021i = e11;
    }

    public final void a() {
        k(false);
        this.f54016d.invoke();
    }

    public final long b() {
        return this.f54020h;
    }

    public final long c() {
        return this.f54019g;
    }

    public final long d() {
        return this.f54015c;
    }

    public final T e() {
        return this.f54017e.getValue();
    }

    public final T f() {
        return this.f54013a.b().invoke(this.f54018f);
    }

    public final V g() {
        return this.f54018f;
    }

    public final boolean h() {
        return ((Boolean) this.f54021i.getValue()).booleanValue();
    }

    public final void i(long j10) {
        this.f54020h = j10;
    }

    public final void j(long j10) {
        this.f54019g = j10;
    }

    public final void k(boolean z10) {
        this.f54021i.setValue(Boolean.valueOf(z10));
    }

    public final void l(T t10) {
        this.f54017e.setValue(t10);
    }

    public final void m(V v10) {
        jo.p.h(v10, "<set-?>");
        this.f54018f = v10;
    }
}
