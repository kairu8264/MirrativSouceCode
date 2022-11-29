package z5;

import android.os.SystemClock;
import b1.l;
import b1.m;
import c1.d0;
import l0.s0;
import l0.z1;
import po.n;
import q1.w0;

/* loaded from: classes.dex */
public final class f extends f1.d {
    public f1.d C;
    public final f1.d D;
    public final q1.f E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final s0 I;
    public long J;
    public boolean K;
    public final s0 L;
    public final s0 M;

    public f(f1.d dVar, f1.d dVar2, q1.f fVar, int i10, boolean z10, boolean z11) {
        s0 e10;
        s0 e11;
        s0 e12;
        this.C = dVar;
        this.D = dVar2;
        this.E = fVar;
        this.F = i10;
        this.G = z10;
        this.H = z11;
        e10 = z1.e(0, null, 2, null);
        this.I = e10;
        this.J = -1L;
        e11 = z1.e(Float.valueOf(1.0f), null, 2, null);
        this.L = e11;
        e12 = z1.e(null, null, 2, null);
        this.M = e12;
    }

    @Override // f1.d
    public boolean d(float f10) {
        v(f10);
        return true;
    }

    @Override // f1.d
    public boolean e(d0 d0Var) {
        t(d0Var);
        return true;
    }

    @Override // f1.d
    public long k() {
        return o();
    }

    @Override // f1.d
    public void m(e1.e eVar) {
        if (this.K) {
            p(eVar, this.D, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.J == -1) {
            this.J = uptimeMillis;
        }
        float f10 = ((float) (uptimeMillis - this.J)) / this.F;
        float l10 = n.l(f10, 0.0f, 1.0f) * s();
        float s10 = this.G ? s() - l10 : s();
        this.K = f10 >= 1.0f;
        p(eVar, this.C, s10);
        p(eVar, this.D, l10);
        if (this.K) {
            this.C = null;
        } else {
            u(r() + 1);
        }
    }

    public final long n(long j10, long j11) {
        l.a aVar = l.f16742b;
        if (!(j10 == aVar.a()) && !l.k(j10)) {
            if (!(j11 == aVar.a()) && !l.k(j11)) {
                return w0.b(j10, this.E.a(j10, j11));
            }
        }
        return j11;
    }

    public final long o() {
        f1.d dVar = this.C;
        l c10 = dVar == null ? null : l.c(dVar.k());
        long b10 = c10 == null ? l.f16742b.b() : c10.m();
        f1.d dVar2 = this.D;
        l c11 = dVar2 != null ? l.c(dVar2.k()) : null;
        long b11 = c11 == null ? l.f16742b.b() : c11.m();
        l.a aVar = l.f16742b;
        boolean z10 = b10 != aVar.a();
        boolean z11 = b11 != aVar.a();
        if (z10 && z11) {
            return m.a(Math.max(l.i(b10), l.i(b11)), Math.max(l.g(b10), l.g(b11)));
        }
        if (this.H) {
            if (z10) {
                return b10;
            }
            if (z11) {
                return b11;
            }
        }
        return aVar.a();
    }

    public final void p(e1.e eVar, f1.d dVar, float f10) {
        if (dVar == null || f10 <= 0.0f) {
            return;
        }
        long c10 = eVar.c();
        long n10 = n(dVar.k(), c10);
        if (!(c10 == l.f16742b.a()) && !l.k(c10)) {
            float f11 = 2;
            float i10 = (l.i(c10) - l.i(n10)) / f11;
            float g10 = (l.g(c10) - l.g(n10)) / f11;
            eVar.M0().d().i(i10, g10, i10, g10);
            dVar.j(eVar, n10, f10, q());
            float f12 = -i10;
            float f13 = -g10;
            eVar.M0().d().i(f12, f13, f12, f13);
            return;
        }
        dVar.j(eVar, n10, f10, q());
    }

    public final d0 q() {
        return (d0) this.M.getValue();
    }

    public final int r() {
        return ((Number) this.I.getValue()).intValue();
    }

    public final float s() {
        return ((Number) this.L.getValue()).floatValue();
    }

    public final void t(d0 d0Var) {
        this.M.setValue(d0Var);
    }

    public final void u(int i10) {
        this.I.setValue(Integer.valueOf(i10));
    }

    public final void v(float f10) {
        this.L.setValue(Float.valueOf(f10));
    }
}
