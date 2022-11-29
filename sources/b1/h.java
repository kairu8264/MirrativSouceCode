package b1;

import jo.p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16726e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final h f16727f = new h(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f16728a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16729b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16730c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16731d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a() {
            return h.f16727f;
        }
    }

    public h(float f10, float f11, float f12, float f13) {
        this.f16728a = f10;
        this.f16729b = f11;
        this.f16730c = f12;
        this.f16731d = f13;
    }

    public static /* synthetic */ h d(h hVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = hVar.f16728a;
        }
        if ((i10 & 2) != 0) {
            f11 = hVar.f16729b;
        }
        if ((i10 & 4) != 0) {
            f12 = hVar.f16730c;
        }
        if ((i10 & 8) != 0) {
            f13 = hVar.f16731d;
        }
        return hVar.c(f10, f11, f12, f13);
    }

    public final boolean b(long j10) {
        return f.m(j10) >= this.f16728a && f.m(j10) < this.f16730c && f.n(j10) >= this.f16729b && f.n(j10) < this.f16731d;
    }

    public final h c(float f10, float f11, float f12, float f13) {
        return new h(f10, f11, f12, f13);
    }

    public final float e() {
        return this.f16731d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return p.c(Float.valueOf(this.f16728a), Float.valueOf(hVar.f16728a)) && p.c(Float.valueOf(this.f16729b), Float.valueOf(hVar.f16729b)) && p.c(Float.valueOf(this.f16730c), Float.valueOf(hVar.f16730c)) && p.c(Float.valueOf(this.f16731d), Float.valueOf(hVar.f16731d));
        }
        return false;
    }

    public final long f() {
        return g.a(this.f16730c, this.f16731d);
    }

    public final long g() {
        return g.a(this.f16728a + (n() / 2.0f), this.f16729b + (h() / 2.0f));
    }

    public final float h() {
        return this.f16731d - this.f16729b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f16728a) * 31) + Float.hashCode(this.f16729b)) * 31) + Float.hashCode(this.f16730c)) * 31) + Float.hashCode(this.f16731d);
    }

    public final float i() {
        return this.f16728a;
    }

    public final float j() {
        return this.f16730c;
    }

    public final long k() {
        return m.a(n(), h());
    }

    public final float l() {
        return this.f16729b;
    }

    public final long m() {
        return g.a(this.f16728a, this.f16729b);
    }

    public final float n() {
        return this.f16730c - this.f16728a;
    }

    public final h o(h hVar) {
        p.h(hVar, "other");
        return new h(Math.max(this.f16728a, hVar.f16728a), Math.max(this.f16729b, hVar.f16729b), Math.min(this.f16730c, hVar.f16730c), Math.min(this.f16731d, hVar.f16731d));
    }

    public final boolean p(h hVar) {
        p.h(hVar, "other");
        return this.f16730c > hVar.f16728a && hVar.f16730c > this.f16728a && this.f16731d > hVar.f16729b && hVar.f16731d > this.f16729b;
    }

    public final h q(float f10, float f11) {
        return new h(this.f16728a + f10, this.f16729b + f11, this.f16730c + f10, this.f16731d + f11);
    }

    public final h r(long j10) {
        return new h(this.f16728a + f.m(j10), this.f16729b + f.n(j10), this.f16730c + f.m(j10), this.f16731d + f.n(j10));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f16728a, 1) + ", " + c.a(this.f16729b, 1) + ", " + c.a(this.f16730c, 1) + ", " + c.a(this.f16731d, 1) + ')';
    }
}
