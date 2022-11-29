package t;

/* loaded from: classes.dex */
public final class c0 implements u.e0 {

    /* renamed from: a  reason: collision with root package name */
    public final t f52889a;

    public c0(m2.d dVar) {
        jo.p.h(dVar, "density");
        this.f52889a = new t(d0.a(), dVar);
    }

    @Override // u.e0
    public float a() {
        return 0.0f;
    }

    @Override // u.e0
    public float b(long j10, float f10, float f11) {
        return this.f52889a.d(f11).b(j10 / 1000000);
    }

    @Override // u.e0
    public long c(float f10, float f11) {
        return this.f52889a.c(f11) * 1000000;
    }

    @Override // u.e0
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // u.e0
    public float e(long j10, float f10, float f11) {
        return f10 + this.f52889a.d(f11).a(j10 / 1000000);
    }

    public final float f(float f10) {
        return this.f52889a.b(f10) * Math.signum(f10);
    }
}
