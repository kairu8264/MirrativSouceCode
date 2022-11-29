package u;

import u.p;

/* loaded from: classes.dex */
public final class o1<V extends p> implements j1<V> {

    /* renamed from: a  reason: collision with root package name */
    public final float f54091a;

    /* renamed from: b  reason: collision with root package name */
    public final float f54092b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k1<V> f54093c;

    public o1(float f10, float f11, r rVar) {
        this.f54091a = f10;
        this.f54092b = f11;
        this.f54093c = new k1<>(rVar);
    }

    @Override // u.f1
    public boolean a() {
        return this.f54093c.a();
    }

    @Override // u.f1
    public V d(V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54093c.d(v10, v11, v12);
    }

    @Override // u.f1
    public V e(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54093c.e(j10, v10, v11, v12);
    }

    @Override // u.f1
    public V f(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54093c.f(j10, v10, v11, v12);
    }

    @Override // u.f1
    public long g(V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54093c.g(v10, v11, v12);
    }

    public o1(float f10, float f11, V v10) {
        this(f10, f11, g1.b(v10, f10, f11));
    }
}
