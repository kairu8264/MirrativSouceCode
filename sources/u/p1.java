package u;

import u.i1;
import u.p;

/* loaded from: classes.dex */
public final class p1<V extends p> implements i1<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f54102a;

    /* renamed from: b  reason: collision with root package name */
    public final int f54103b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f54104c;

    /* renamed from: d  reason: collision with root package name */
    public final k1<V> f54105d;

    public p1(int i10, int i11, a0 a0Var) {
        jo.p.h(a0Var, "easing");
        this.f54102a = i10;
        this.f54103b = i11;
        this.f54104c = a0Var;
        this.f54105d = new k1<>(new g0(c(), b(), a0Var));
    }

    @Override // u.f1
    public boolean a() {
        return i1.a.c(this);
    }

    @Override // u.i1
    public int b() {
        return this.f54103b;
    }

    @Override // u.i1
    public int c() {
        return this.f54102a;
    }

    @Override // u.f1
    public V d(V v10, V v11, V v12) {
        return (V) i1.a.b(this, v10, v11, v12);
    }

    @Override // u.f1
    public V e(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54105d.e(j10, v10, v11, v12);
    }

    @Override // u.f1
    public V f(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54105d.f(j10, v10, v11, v12);
    }

    @Override // u.f1
    public long g(V v10, V v11, V v12) {
        return i1.a.a(this, v10, v11, v12);
    }
}
