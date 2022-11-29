package f1;

import b1.f;
import b1.h;
import b1.i;
import b1.m;
import c1.d0;
import c1.s0;
import c1.w;
import e1.e;
import io.l;
import jo.p;
import m2.q;
import wn.v;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: w  reason: collision with root package name */
    public s0 f31699w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f31700x;

    /* renamed from: y  reason: collision with root package name */
    public d0 f31701y;

    /* renamed from: z  reason: collision with root package name */
    public float f31702z = 1.0f;
    public q A = q.Ltr;
    public final l<e, v> B = new a();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements l<e, v> {
        public a() {
            super(1);
        }

        public final void a(e eVar) {
            p.h(eVar, "$this$null");
            d.this.m(eVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(e eVar) {
            a(eVar);
            return v.f59242a;
        }
    }

    public boolean d(float f10) {
        return false;
    }

    public boolean e(d0 d0Var) {
        return false;
    }

    public boolean f(q qVar) {
        p.h(qVar, "layoutDirection");
        return false;
    }

    public final void g(float f10) {
        if (this.f31702z == f10) {
            return;
        }
        if (!d(f10)) {
            if (f10 == 1.0f) {
                s0 s0Var = this.f31699w;
                if (s0Var != null) {
                    s0Var.b(f10);
                }
                this.f31700x = false;
            } else {
                l().b(f10);
                this.f31700x = true;
            }
        }
        this.f31702z = f10;
    }

    public final void h(d0 d0Var) {
        if (p.c(this.f31701y, d0Var)) {
            return;
        }
        if (!e(d0Var)) {
            if (d0Var == null) {
                s0 s0Var = this.f31699w;
                if (s0Var != null) {
                    s0Var.j(null);
                }
                this.f31700x = false;
            } else {
                l().j(d0Var);
                this.f31700x = true;
            }
        }
        this.f31701y = d0Var;
    }

    public final void i(q qVar) {
        if (this.A != qVar) {
            f(qVar);
            this.A = qVar;
        }
    }

    public final void j(e eVar, long j10, float f10, d0 d0Var) {
        p.h(eVar, "$this$draw");
        g(f10);
        h(d0Var);
        i(eVar.getLayoutDirection());
        float i10 = b1.l.i(eVar.c()) - b1.l.i(j10);
        float g10 = b1.l.g(eVar.c()) - b1.l.g(j10);
        eVar.M0().d().i(0.0f, 0.0f, i10, g10);
        if (f10 > 0.0f && b1.l.i(j10) > 0.0f && b1.l.g(j10) > 0.0f) {
            if (this.f31700x) {
                h b10 = i.b(f.f16721b.c(), m.a(b1.l.i(j10), b1.l.g(j10)));
                w e10 = eVar.M0().e();
                try {
                    e10.g(b10, l());
                    m(eVar);
                } finally {
                    e10.k();
                }
            } else {
                m(eVar);
            }
        }
        eVar.M0().d().i(-0.0f, -0.0f, -i10, -g10);
    }

    public abstract long k();

    public final s0 l() {
        s0 s0Var = this.f31699w;
        if (s0Var == null) {
            s0 a10 = c1.i.a();
            this.f31699w = a10;
            return a10;
        }
        return s0Var;
    }

    public abstract void m(e eVar);
}
