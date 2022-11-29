package y1;

import c1.u0;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final y f61204a;

    /* renamed from: b  reason: collision with root package name */
    public final d f61205b;

    /* renamed from: c  reason: collision with root package name */
    public final long f61206c;

    /* renamed from: d  reason: collision with root package name */
    public final float f61207d;

    /* renamed from: e  reason: collision with root package name */
    public final float f61208e;

    /* renamed from: f  reason: collision with root package name */
    public final List<b1.h> f61209f;

    public z(y yVar, d dVar, long j10) {
        this.f61204a = yVar;
        this.f61205b = dVar;
        this.f61206c = j10;
        this.f61207d = dVar.f();
        this.f61208e = dVar.j();
        this.f61209f = dVar.x();
    }

    public /* synthetic */ z(y yVar, d dVar, long j10, jo.h hVar) {
        this(yVar, dVar, j10);
    }

    public static /* synthetic */ int o(z zVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return zVar.n(i10, z10);
    }

    public final long A() {
        return this.f61206c;
    }

    public final long B(int i10) {
        return this.f61205b.z(i10);
    }

    public final z a(y yVar, long j10) {
        jo.p.h(yVar, "layoutInput");
        return new z(yVar, this.f61205b, j10, null);
    }

    public final j2.d b(int i10) {
        return this.f61205b.b(i10);
    }

    public final b1.h c(int i10) {
        return this.f61205b.c(i10);
    }

    public final b1.h d(int i10) {
        return this.f61205b.d(i10);
    }

    public final boolean e() {
        return this.f61205b.e() || ((float) m2.o.f(this.f61206c)) < this.f61205b.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (jo.p.c(this.f61204a, zVar.f61204a) && jo.p.c(this.f61205b, zVar.f61205b) && m2.o.e(this.f61206c, zVar.f61206c)) {
                if (this.f61207d == zVar.f61207d) {
                    return ((this.f61208e > zVar.f61208e ? 1 : (this.f61208e == zVar.f61208e ? 0 : -1)) == 0) && jo.p.c(this.f61209f, zVar.f61209f);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean f() {
        return ((float) m2.o.g(this.f61206c)) < this.f61205b.y();
    }

    public final float g() {
        return this.f61207d;
    }

    public final boolean h() {
        return f() || e();
    }

    public int hashCode() {
        return (((((((((this.f61204a.hashCode() * 31) + this.f61205b.hashCode()) * 31) + m2.o.h(this.f61206c)) * 31) + Float.hashCode(this.f61207d)) * 31) + Float.hashCode(this.f61208e)) * 31) + this.f61209f.hashCode();
    }

    public final float i(int i10, boolean z10) {
        return this.f61205b.h(i10, z10);
    }

    public final float j() {
        return this.f61208e;
    }

    public final y k() {
        return this.f61204a;
    }

    public final float l(int i10) {
        return this.f61205b.k(i10);
    }

    public final int m() {
        return this.f61205b.l();
    }

    public final int n(int i10, boolean z10) {
        return this.f61205b.m(i10, z10);
    }

    public final int p(int i10) {
        return this.f61205b.n(i10);
    }

    public final int q(float f10) {
        return this.f61205b.o(f10);
    }

    public final float r(int i10) {
        return this.f61205b.p(i10);
    }

    public final float s(int i10) {
        return this.f61205b.q(i10);
    }

    public final int t(int i10) {
        return this.f61205b.r(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f61204a + ", multiParagraph=" + this.f61205b + ", size=" + ((Object) m2.o.i(this.f61206c)) + ", firstBaseline=" + this.f61207d + ", lastBaseline=" + this.f61208e + ", placeholderRects=" + this.f61209f + ')';
    }

    public final float u(int i10) {
        return this.f61205b.s(i10);
    }

    public final d v() {
        return this.f61205b;
    }

    public final int w(long j10) {
        return this.f61205b.t(j10);
    }

    public final j2.d x(int i10) {
        return this.f61205b.u(i10);
    }

    public final u0 y(int i10, int i11) {
        return this.f61205b.w(i10, i11);
    }

    public final List<b1.h> z() {
        return this.f61209f;
    }
}
