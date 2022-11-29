package w6;

import android.graphics.Matrix;
import c1.w;
import io.p;
import jo.q;
import l0.i;
import l0.l1;
import l0.s0;
import l0.z1;
import q1.v0;
import wn.v;
import x0.f;
import y.d1;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ l C;
        public final /* synthetic */ x0.a D;
        public final /* synthetic */ q1.f E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s6.d f58157w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f58158x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f58159y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f58160z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s6.d dVar, float f10, x0.f fVar, boolean z10, boolean z11, boolean z12, l lVar, x0.a aVar, q1.f fVar2, int i10, int i11) {
            super(2);
            this.f58157w = dVar;
            this.f58158x = f10;
            this.f58159y = fVar;
            this.f58160z = z10;
            this.A = z11;
            this.B = z12;
            this.C = lVar;
            this.D = aVar;
            this.E = fVar2;
            this.F = i10;
            this.G = i11;
        }

        public final void a(l0.i iVar, int i10) {
            e.a(this.f58157w, this.f58158x, this.f58159y, this.f58160z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1, this.G);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<e1.e, v> {
        public final /* synthetic */ s6.f A;
        public final /* synthetic */ l B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ float F;
        public final /* synthetic */ s0<l> G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s6.d f58161w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q1.f f58162x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.a f58163y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Matrix f58164z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s6.d dVar, q1.f fVar, x0.a aVar, Matrix matrix, s6.f fVar2, l lVar, boolean z10, boolean z11, boolean z12, float f10, s0<l> s0Var) {
            super(1);
            this.f58161w = dVar;
            this.f58162x = fVar;
            this.f58163y = aVar;
            this.f58164z = matrix;
            this.A = fVar2;
            this.B = lVar;
            this.C = z10;
            this.D = z11;
            this.E = z12;
            this.F = f10;
            this.G = s0Var;
        }

        public final void a(e1.e eVar) {
            jo.p.h(eVar, "$this$Canvas");
            s6.d dVar = this.f58161w;
            q1.f fVar = this.f58162x;
            x0.a aVar = this.f58163y;
            Matrix matrix = this.f58164z;
            s6.f fVar2 = this.A;
            l lVar = this.B;
            boolean z10 = this.C;
            boolean z11 = this.D;
            boolean z12 = this.E;
            float f10 = this.F;
            s0<l> s0Var = this.G;
            w e10 = eVar.M0().e();
            long a10 = b1.m.a(dVar.b().width(), dVar.b().height());
            long a11 = m2.p.a(lo.c.c(b1.l.i(eVar.c())), lo.c.c(b1.l.g(eVar.c())));
            long a12 = fVar.a(a10, eVar.c());
            long a13 = aVar.a(e.g(a10, a12), a11, eVar.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(m2.k.j(a13), m2.k.k(a13));
            matrix.preScale(v0.b(a12), v0.c(a12));
            fVar2.S(dVar);
            if (lVar != e.b(s0Var)) {
                l b10 = e.b(s0Var);
                if (b10 != null) {
                    b10.b(fVar2);
                }
                if (lVar != null) {
                    lVar.a(fVar2);
                }
                e.c(s0Var, lVar);
            }
            fVar2.h0(z10);
            fVar2.R(z11);
            fVar2.o(z12);
            fVar2.j0(f10);
            fVar2.k(c1.c.c(e10), matrix);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(e1.e eVar) {
            a(eVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ l C;
        public final /* synthetic */ x0.a D;
        public final /* synthetic */ q1.f E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s6.d f58165w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f58166x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f58167y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f58168z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s6.d dVar, float f10, x0.f fVar, boolean z10, boolean z11, boolean z12, l lVar, x0.a aVar, q1.f fVar2, int i10, int i11) {
            super(2);
            this.f58165w = dVar;
            this.f58166x = f10;
            this.f58167y = fVar;
            this.f58168z = z10;
            this.A = z11;
            this.B = z12;
            this.C = lVar;
            this.D = aVar;
            this.E = fVar2;
            this.F = i10;
            this.G = i11;
        }

        public final void a(l0.i iVar, int i10) {
            e.a(this.f58165w, this.f58166x, this.f58167y, this.f58168z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1, this.G);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(s6.d dVar, float f10, x0.f fVar, boolean z10, boolean z11, boolean z12, l lVar, x0.a aVar, q1.f fVar2, l0.i iVar, int i10, int i11) {
        x0.a aVar2;
        int i12;
        q1.f fVar3;
        l0.i iVar2;
        l0.i h10 = iVar.h(185149666);
        f.a aVar3 = (i11 & 4) != 0 ? x0.f.f59359u : fVar;
        boolean z13 = (i11 & 8) != 0 ? false : z10;
        boolean z14 = (i11 & 16) != 0 ? false : z11;
        boolean z15 = (i11 & 32) != 0 ? false : z12;
        l lVar2 = (i11 & 64) != 0 ? null : lVar;
        if ((i11 & 128) != 0) {
            i12 = i10 & (-29360129);
            aVar2 = x0.a.f59327a.e();
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        if ((i11 & 256) != 0) {
            i12 &= -234881025;
            fVar3 = q1.f.f48569a.d();
        } else {
            fVar3 = fVar2;
        }
        int i13 = i12;
        h10.x(-3687241);
        Object y10 = h10.y();
        i.a aVar4 = l0.i.f39065a;
        if (y10 == aVar4.a()) {
            y10 = new s6.f();
            h10.q(y10);
        }
        h10.O();
        s6.f fVar4 = (s6.f) y10;
        h10.x(-3687241);
        Object y11 = h10.y();
        if (y11 == aVar4.a()) {
            y11 = new Matrix();
            h10.q(y11);
        }
        h10.O();
        Matrix matrix = (Matrix) y11;
        h10.x(-3687241);
        Object y12 = h10.y();
        if (y12 == aVar4.a()) {
            y12 = z1.e(null, null, 2, null);
            h10.q(y12);
        }
        h10.O();
        s0 s0Var = (s0) y12;
        if (dVar != null) {
            if (!(dVar.d() == 0.0f)) {
                h10.x(185150356);
                h10.O();
                v.j.a(d1.v(aVar3, m2.g.l(dVar.b().width() / f7.h.e()), m2.g.l(dVar.b().height() / f7.h.e())), new b(dVar, fVar3, aVar2, matrix, fVar4, lVar2, z13, z14, z15, f10, s0Var), h10, 0);
                l1 l10 = h10.l();
                if (l10 == null) {
                    return;
                }
                l10.a(new c(dVar, f10, aVar3, z13, z14, z15, lVar2, aVar2, fVar3, i10, i11));
                return;
            }
        }
        h10.x(185150336);
        h10.O();
        l1 l11 = h10.l();
        if (l11 == null) {
            iVar2 = h10;
        } else {
            iVar2 = h10;
            l11.a(new a(dVar, f10, aVar3, z13, z14, z15, lVar2, aVar2, fVar3, i10, i11));
        }
        y.j.a(aVar3, iVar2, (i13 >> 6) & 14);
    }

    public static final l b(s0<l> s0Var) {
        return s0Var.getValue();
    }

    public static final void c(s0<l> s0Var, l lVar) {
        s0Var.setValue(lVar);
    }

    public static final long g(long j10, long j11) {
        return m2.p.a((int) (b1.l.i(j10) * v0.b(j11)), (int) (b1.l.g(j10) * v0.c(j11)));
    }
}
