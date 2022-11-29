package u;

import u.d0;

/* loaded from: classes.dex */
public final class f0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f53997a;

    /* renamed from: b  reason: collision with root package name */
    public final float f53998b;

    /* renamed from: c  reason: collision with root package name */
    public final float f53999c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f54000d;

    public f0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public f0(float f10, float f11, float f12) {
        this.f53997a = f10;
        this.f53998b = f11;
        this.f53999c = f12;
        s0 s0Var = new s0(1.0f);
        s0Var.d(f());
        s0Var.f(g());
        this.f54000d = s0Var;
    }

    @Override // u.d0
    public float b(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // u.d0
    public float c(long j10, float f10, float f11, float f12) {
        this.f54000d.e(f11);
        return m0.b(this.f54000d.g(f10, f12, j10 / 1000000));
    }

    @Override // u.d0
    public float d(long j10, float f10, float f11, float f12) {
        this.f54000d.e(f11);
        return m0.c(this.f54000d.g(f10, f12, j10 / 1000000));
    }

    @Override // u.d0
    public long e(float f10, float f11, float f12) {
        float b10 = this.f54000d.b();
        float a10 = this.f54000d.a();
        float f13 = f10 - f11;
        float f14 = this.f53999c;
        return r0.b(b10, a10, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    public final float f() {
        return this.f53997a;
    }

    public final float g() {
        return this.f53998b;
    }

    @Override // u.i
    /* renamed from: h */
    public <V extends p> k1<V> a(c1<Float, V> c1Var) {
        return d0.a.b(this, c1Var);
    }

    public /* synthetic */ f0(float f10, float f11, float f12, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
