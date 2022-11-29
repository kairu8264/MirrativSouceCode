package f1;

import b1.l;
import c1.c0;
import c1.d0;
import e1.e;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class c extends d {
    public final long C;
    public float D;
    public d0 E;
    public final long F;

    public c(long j10) {
        this.C = j10;
        this.D = 1.0f;
        this.F = l.f16742b.a();
    }

    public /* synthetic */ c(long j10, h hVar) {
        this(j10);
    }

    @Override // f1.d
    public boolean d(float f10) {
        this.D = f10;
        return true;
    }

    @Override // f1.d
    public boolean e(d0 d0Var) {
        this.E = d0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && c0.m(this.C, ((c) obj).C);
    }

    public int hashCode() {
        return c0.s(this.C);
    }

    @Override // f1.d
    public long k() {
        return this.F;
    }

    @Override // f1.d
    public void m(e eVar) {
        p.h(eVar, "<this>");
        e.L0(eVar, this.C, 0L, 0L, this.D, null, this.E, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) c0.t(this.C)) + ')';
    }
}
