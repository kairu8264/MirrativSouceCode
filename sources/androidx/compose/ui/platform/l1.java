package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import b1.l;
import c1.q0;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public m2.d f14497a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14498b;

    /* renamed from: c  reason: collision with root package name */
    public final Outline f14499c;

    /* renamed from: d  reason: collision with root package name */
    public long f14500d;

    /* renamed from: e  reason: collision with root package name */
    public c1.g1 f14501e;

    /* renamed from: f  reason: collision with root package name */
    public c1.u0 f14502f;

    /* renamed from: g  reason: collision with root package name */
    public c1.u0 f14503g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14504h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14505i;

    /* renamed from: j  reason: collision with root package name */
    public c1.u0 f14506j;

    /* renamed from: k  reason: collision with root package name */
    public b1.j f14507k;

    /* renamed from: l  reason: collision with root package name */
    public float f14508l;

    /* renamed from: m  reason: collision with root package name */
    public long f14509m;

    /* renamed from: n  reason: collision with root package name */
    public long f14510n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14511o;

    /* renamed from: p  reason: collision with root package name */
    public m2.q f14512p;

    /* renamed from: q  reason: collision with root package name */
    public c1.u0 f14513q;

    /* renamed from: r  reason: collision with root package name */
    public c1.u0 f14514r;

    /* renamed from: s  reason: collision with root package name */
    public c1.q0 f14515s;

    public l1(m2.d dVar) {
        jo.p.h(dVar, "density");
        this.f14497a = dVar;
        this.f14498b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f14499c = outline;
        l.a aVar = b1.l.f16742b;
        this.f14500d = aVar.b();
        this.f14501e = c1.a1.a();
        this.f14509m = b1.f.f16721b.c();
        this.f14510n = aVar.b();
        this.f14512p = m2.q.Ltr;
    }

    public final void a(c1.w wVar) {
        jo.p.h(wVar, "canvas");
        c1.u0 b10 = b();
        if (b10 != null) {
            c1.w.j(wVar, b10, 0, 2, null);
            return;
        }
        float f10 = this.f14508l;
        if (f10 > 0.0f) {
            c1.u0 u0Var = this.f14506j;
            b1.j jVar = this.f14507k;
            if (u0Var == null || !f(jVar, this.f14509m, this.f14510n, f10)) {
                b1.j c10 = b1.k.c(b1.f.m(this.f14509m), b1.f.n(this.f14509m), b1.f.m(this.f14509m) + b1.l.i(this.f14510n), b1.f.n(this.f14509m) + b1.l.g(this.f14510n), b1.b.b(this.f14508l, 0.0f, 2, null));
                if (u0Var == null) {
                    u0Var = c1.n.a();
                } else {
                    u0Var.reset();
                }
                u0Var.m(c10);
                this.f14507k = c10;
                this.f14506j = u0Var;
            }
            c1.w.j(wVar, u0Var, 0, 2, null);
            return;
        }
        c1.w.h(wVar, b1.f.m(this.f14509m), b1.f.n(this.f14509m), b1.f.m(this.f14509m) + b1.l.i(this.f14510n), b1.f.n(this.f14509m) + b1.l.g(this.f14510n), 0, 16, null);
    }

    public final c1.u0 b() {
        i();
        return this.f14503g;
    }

    public final Outline c() {
        i();
        if (this.f14511o && this.f14498b) {
            return this.f14499c;
        }
        return null;
    }

    public final boolean d() {
        return !this.f14505i;
    }

    public final boolean e(long j10) {
        c1.q0 q0Var;
        if (this.f14511o && (q0Var = this.f14515s) != null) {
            return v1.b(q0Var, b1.f.m(j10), b1.f.n(j10), this.f14513q, this.f14514r);
        }
        return true;
    }

    public final boolean f(b1.j jVar, long j10, long j11, float f10) {
        if (jVar == null || !b1.k.d(jVar)) {
            return false;
        }
        if (jVar.e() == b1.f.m(j10)) {
            if (jVar.g() == b1.f.n(j10)) {
                if (jVar.f() == b1.f.m(j10) + b1.l.i(j11)) {
                    if (jVar.a() == b1.f.n(j10) + b1.l.g(j11)) {
                        return (b1.a.d(jVar.h()) > f10 ? 1 : (b1.a.d(jVar.h()) == f10 ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean g(c1.g1 g1Var, float f10, boolean z10, float f11, m2.q qVar, m2.d dVar) {
        jo.p.h(g1Var, "shape");
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(dVar, "density");
        this.f14499c.setAlpha(f10);
        boolean z11 = !jo.p.c(this.f14501e, g1Var);
        if (z11) {
            this.f14501e = g1Var;
            this.f14504h = true;
        }
        boolean z12 = z10 || f11 > 0.0f;
        if (this.f14511o != z12) {
            this.f14511o = z12;
            this.f14504h = true;
        }
        if (this.f14512p != qVar) {
            this.f14512p = qVar;
            this.f14504h = true;
        }
        if (!jo.p.c(this.f14497a, dVar)) {
            this.f14497a = dVar;
            this.f14504h = true;
        }
        return z11;
    }

    public final void h(long j10) {
        if (b1.l.f(this.f14500d, j10)) {
            return;
        }
        this.f14500d = j10;
        this.f14504h = true;
    }

    public final void i() {
        if (this.f14504h) {
            this.f14509m = b1.f.f16721b.c();
            long j10 = this.f14500d;
            this.f14510n = j10;
            this.f14508l = 0.0f;
            this.f14503g = null;
            this.f14504h = false;
            this.f14505i = false;
            if (this.f14511o && b1.l.i(j10) > 0.0f && b1.l.g(this.f14500d) > 0.0f) {
                this.f14498b = true;
                c1.q0 a10 = this.f14501e.a(this.f14500d, this.f14512p, this.f14497a);
                this.f14515s = a10;
                if (a10 instanceof q0.b) {
                    k(((q0.b) a10).a());
                    return;
                } else if (a10 instanceof q0.c) {
                    l(((q0.c) a10).a());
                    return;
                } else if (a10 instanceof q0.a) {
                    j(((q0.a) a10).a());
                    return;
                } else {
                    return;
                }
            }
            this.f14499c.setEmpty();
        }
    }

    public final void j(c1.u0 u0Var) {
        if (Build.VERSION.SDK_INT <= 28 && !u0Var.b()) {
            this.f14498b = false;
            this.f14499c.setEmpty();
            this.f14505i = true;
        } else {
            Outline outline = this.f14499c;
            if (u0Var instanceof c1.j) {
                outline.setConvexPath(((c1.j) u0Var).s());
                this.f14505i = !this.f14499c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.f14503g = u0Var;
    }

    public final void k(b1.h hVar) {
        this.f14509m = b1.g.a(hVar.i(), hVar.l());
        this.f14510n = b1.m.a(hVar.n(), hVar.h());
        this.f14499c.setRect(lo.c.c(hVar.i()), lo.c.c(hVar.l()), lo.c.c(hVar.j()), lo.c.c(hVar.e()));
    }

    public final void l(b1.j jVar) {
        float d10 = b1.a.d(jVar.h());
        this.f14509m = b1.g.a(jVar.e(), jVar.g());
        this.f14510n = b1.m.a(jVar.j(), jVar.d());
        if (b1.k.d(jVar)) {
            this.f14499c.setRoundRect(lo.c.c(jVar.e()), lo.c.c(jVar.g()), lo.c.c(jVar.f()), lo.c.c(jVar.a()), d10);
            this.f14508l = d10;
            return;
        }
        c1.u0 u0Var = this.f14502f;
        if (u0Var == null) {
            u0Var = c1.n.a();
            this.f14502f = u0Var;
        }
        u0Var.reset();
        u0Var.m(jVar);
        j(u0Var);
    }
}
