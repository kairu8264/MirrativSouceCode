package u;

import u.d0;

/* loaded from: classes.dex */
public final class g0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f54003a;

    /* renamed from: b  reason: collision with root package name */
    public final int f54004b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f54005c;

    public g0(int i10, int i11, a0 a0Var) {
        jo.p.h(a0Var, "easing");
        this.f54003a = i10;
        this.f54004b = i11;
        this.f54005c = a0Var;
    }

    @Override // u.d0
    public float b(float f10, float f11, float f12) {
        return d0.a.a(this, f10, f11, f12);
    }

    @Override // u.d0
    public float c(long j10, float f10, float f11, float f12) {
        long f13 = f(j10 / 1000000);
        int i10 = this.f54003a;
        return e1.k(f10, f11, this.f54005c.a(po.n.l(i10 == 0 ? 1.0f : ((float) f13) / i10, 0.0f, 1.0f)));
    }

    @Override // u.d0
    public float d(long j10, float f10, float f11, float f12) {
        long f13 = f(j10 / 1000000);
        int i10 = (f13 > 0L ? 1 : (f13 == 0L ? 0 : -1));
        if (i10 < 0) {
            return 0.0f;
        }
        if (i10 == 0) {
            return f12;
        }
        return (c(f13 * 1000000, f10, f11, f12) - c((f13 - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // u.d0
    public long e(float f10, float f11, float f12) {
        return (this.f54004b + this.f54003a) * 1000000;
    }

    public final long f(long j10) {
        return po.n.o(j10 - this.f54004b, 0L, this.f54003a);
    }

    @Override // u.i
    /* renamed from: g */
    public <V extends p> k1<V> a(c1<Float, V> c1Var) {
        return d0.a.b(this, c1Var);
    }
}
