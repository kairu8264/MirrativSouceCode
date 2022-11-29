package x0;

import jo.p;
import m2.l;
import m2.o;
import m2.q;
import x0.a;

/* loaded from: classes.dex */
public final class b implements x0.a {

    /* renamed from: b  reason: collision with root package name */
    public final float f59344b;

    /* renamed from: c  reason: collision with root package name */
    public final float f59345c;

    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final float f59346a;

        public a(float f10) {
            this.f59346a = f10;
        }

        @Override // x0.a.b
        public int a(int i10, int i11, q qVar) {
            p.h(qVar, "layoutDirection");
            return lo.c.c(((i11 - i10) / 2.0f) * (1 + (qVar == q.Ltr ? this.f59346a : (-1) * this.f59346a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(Float.valueOf(this.f59346a), Float.valueOf(((a) obj).f59346a));
        }

        public int hashCode() {
            return Float.hashCode(this.f59346a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f59346a + ')';
        }
    }

    /* renamed from: x0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0987b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public final float f59347a;

        public C0987b(float f10) {
            this.f59347a = f10;
        }

        @Override // x0.a.c
        public int a(int i10, int i11) {
            return lo.c.c(((i11 - i10) / 2.0f) * (1 + this.f59347a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0987b) && p.c(Float.valueOf(this.f59347a), Float.valueOf(((C0987b) obj).f59347a));
        }

        public int hashCode() {
            return Float.hashCode(this.f59347a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f59347a + ')';
        }
    }

    public b(float f10, float f11) {
        this.f59344b = f10;
        this.f59345c = f11;
    }

    @Override // x0.a
    public long a(long j10, long j11, q qVar) {
        float f10;
        p.h(qVar, "layoutDirection");
        float g10 = (o.g(j11) - o.g(j10)) / 2.0f;
        float f11 = (o.f(j11) - o.f(j10)) / 2.0f;
        if (qVar == q.Ltr) {
            f10 = this.f59344b;
        } else {
            f10 = (-1) * this.f59344b;
        }
        float f12 = 1;
        return l.a(lo.c.c(g10 * (f10 + f12)), lo.c.c(f11 * (f12 + this.f59345c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(Float.valueOf(this.f59344b), Float.valueOf(bVar.f59344b)) && p.c(Float.valueOf(this.f59345c), Float.valueOf(bVar.f59345c));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f59344b) * 31) + Float.hashCode(this.f59345c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f59344b + ", verticalBias=" + this.f59345c + ')';
    }
}
