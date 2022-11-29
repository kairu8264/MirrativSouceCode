package w;

import kotlin.NoWhenBranchMatchedException;
import q1.l0;
import q1.m0;
import uo.q0;

/* loaded from: classes.dex */
public final class c implements c0.i, m0, l0 {
    public q1.q A;
    public q1.q B;
    public m2.o C;
    public final x0.f D;

    /* renamed from: w  reason: collision with root package name */
    public final q0 f57580w;

    /* renamed from: x  reason: collision with root package name */
    public final q f57581x;

    /* renamed from: y  reason: collision with root package name */
    public final b0 f57582y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f57583z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f57584a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.Vertical.ordinal()] = 1;
            iArr[q.Horizontal.ordinal()] = 2;
            f57584a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<q1.q, wn.v> {
        public b() {
            super(1);
        }

        public final void a(q1.q qVar) {
            c.this.A = qVar;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q1.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "Scrollable.kt", l = {578}, m = "invokeSuspend")
    /* renamed from: w.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0936c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57586w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.h f57588y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ b1.h f57589z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0936c(b1.h hVar, b1.h hVar2, ao.d<? super C0936c> dVar) {
            super(2, dVar);
            this.f57588y = hVar;
            this.f57589z = hVar2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0936c(this.f57588y, this.f57589z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0936c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57586w;
            if (i10 == 0) {
                wn.m.b(obj);
                c cVar = c.this;
                b1.h hVar = this.f57588y;
                b1.h hVar2 = this.f57589z;
                this.f57586w = 1;
                if (cVar.l(hVar, hVar2, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public c(q0 q0Var, q qVar, b0 b0Var, boolean z10) {
        jo.p.h(q0Var, "scope");
        jo.p.h(qVar, "orientation");
        jo.p.h(b0Var, "scrollableState");
        this.f57580w = q0Var;
        this.f57581x = qVar;
        this.f57582y = b0Var;
        this.f57583z = z10;
        this.D = c0.j.c(v.s.b(this, new b()), this);
    }

    @Override // q1.l0
    public void T(q1.q qVar) {
        jo.p.h(qVar, "coordinates");
        this.B = qVar;
    }

    @Override // c0.i
    public Object a(b1.h hVar, ao.d<? super wn.v> dVar) {
        Object l10 = l(hVar, b(hVar), dVar);
        return l10 == bo.c.c() ? l10 : wn.v.f59242a;
    }

    @Override // c0.i
    public b1.h b(b1.h hVar) {
        jo.p.h(hVar, "localRect");
        m2.o oVar = this.C;
        if (oVar != null) {
            return g(hVar, oVar.j());
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public final b1.h g(b1.h hVar, long j10) {
        long b10 = m2.p.b(j10);
        int i10 = a.f57584a[this.f57581x.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return hVar.q(m(hVar.i(), hVar.j(), b1.l.i(b10)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return hVar.q(0.0f, m(hVar.l(), hVar.e(), b1.l.g(b10)));
    }

    public final x0.f i() {
        return this.D;
    }

    public final void j(q1.q qVar, long j10) {
        q1.q qVar2;
        b1.h k10;
        if (!(this.f57581x != q.Horizontal ? m2.o.f(qVar.a()) < m2.o.f(j10) : m2.o.g(qVar.a()) < m2.o.g(j10)) || (qVar2 = this.A) == null || (k10 = qVar.k(qVar2, false)) == null) {
            return;
        }
        b1.h b10 = b1.i.b(b1.f.f16721b.c(), m2.p.b(j10));
        b1.h g10 = g(k10, qVar.a());
        boolean p10 = b10.p(k10);
        boolean z10 = !jo.p.c(g10, k10);
        if (p10 && z10) {
            uo.l.d(this.f57580w, null, null, new C0936c(k10, g10, null), 3, null);
        }
    }

    public final Object l(b1.h hVar, b1.h hVar2, ao.d<? super wn.v> dVar) {
        float l10;
        float l11;
        int i10 = a.f57584a[this.f57581x.ordinal()];
        if (i10 == 1) {
            l10 = hVar.l();
            l11 = hVar2.l();
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            l10 = hVar.i();
            l11 = hVar2.i();
        }
        float f10 = l10 - l11;
        if (this.f57583z) {
            f10 = -f10;
        }
        Object b10 = x.b(this.f57582y, f10, null, dVar, 2, null);
        return b10 == bo.c.c() ? b10 : wn.v.f59242a;
    }

    public final float m(float f10, float f11, float f12) {
        if ((f10 < 0.0f || f11 > f12) && (f10 >= 0.0f || f11 <= f12)) {
            float f13 = f11 - f12;
            return Math.abs(f10) < Math.abs(f13) ? f10 : f13;
        }
        return 0.0f;
    }

    @Override // q1.m0
    public void z(long j10) {
        q1.q qVar = this.B;
        m2.o oVar = this.C;
        if (oVar != null && !m2.o.e(oVar.j(), j10)) {
            boolean z10 = true;
            if (qVar == null || !qVar.h()) {
                z10 = false;
            }
            if (z10) {
                j(qVar, oVar.j());
            }
        }
        this.C = m2.o.b(j10);
    }
}
