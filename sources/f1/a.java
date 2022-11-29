package f1;

import b1.l;
import c1.d0;
import c1.f0;
import c1.k0;
import e1.e;
import jo.h;
import m2.k;
import m2.o;
import m2.p;

/* loaded from: classes.dex */
public final class a extends d {
    public final k0 C;
    public final long D;
    public final long E;
    public int F;
    public final long G;
    public float H;
    public d0 I;

    public /* synthetic */ a(k0 k0Var, long j10, long j11, int i10, h hVar) {
        this(k0Var, (i10 & 2) != 0 ? k.f40528b.a() : j10, (i10 & 4) != 0 ? p.a(k0Var.getWidth(), k0Var.getHeight()) : j11, null);
    }

    public /* synthetic */ a(k0 k0Var, long j10, long j11, h hVar) {
        this(k0Var, j10, j11);
    }

    @Override // f1.d
    public boolean d(float f10) {
        this.H = f10;
        return true;
    }

    @Override // f1.d
    public boolean e(d0 d0Var) {
        this.I = d0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return jo.p.c(this.C, aVar.C) && k.i(this.D, aVar.D) && o.e(this.E, aVar.E) && f0.d(this.F, aVar.F);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.C.hashCode() * 31) + k.l(this.D)) * 31) + o.h(this.E)) * 31) + f0.e(this.F);
    }

    @Override // f1.d
    public long k() {
        return p.b(this.G);
    }

    @Override // f1.d
    public void m(e eVar) {
        jo.p.h(eVar, "<this>");
        e.A(eVar, this.C, this.D, this.E, 0L, p.a(lo.c.c(l.i(eVar.c())), lo.c.c(l.g(eVar.c()))), this.H, null, this.I, 0, this.F, 328, null);
    }

    public final void n(int i10) {
        this.F = i10;
    }

    public final long o(long j10, long j11) {
        if (k.j(j10) >= 0 && k.k(j10) >= 0 && o.g(j11) >= 0 && o.f(j11) >= 0 && o.g(j11) <= this.C.getWidth() && o.f(j11) <= this.C.getHeight()) {
            return j11;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public String toString() {
        return "BitmapPainter(image=" + this.C + ", srcOffset=" + ((Object) k.m(this.D)) + ", srcSize=" + ((Object) o.i(this.E)) + ", filterQuality=" + ((Object) f0.f(this.F)) + ')';
    }

    public a(k0 k0Var, long j10, long j11) {
        this.C = k0Var;
        this.D = j10;
        this.E = j11;
        this.F = f0.f18658a.a();
        this.G = o(j10, j11);
        this.H = 1.0f;
    }
}
