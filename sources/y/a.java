package y;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import m2.g;
import q1.q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: y.a$a */
    /* loaded from: classes.dex */
    public static final class C1025a extends jo.q implements io.l<q0.a, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ q1.q0 B;
        public final /* synthetic */ int C;

        /* renamed from: w */
        public final /* synthetic */ q1.a f60658w;

        /* renamed from: x */
        public final /* synthetic */ float f60659x;

        /* renamed from: y */
        public final /* synthetic */ int f60660y;

        /* renamed from: z */
        public final /* synthetic */ int f60661z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1025a(q1.a aVar, float f10, int i10, int i11, int i12, q1.q0 q0Var, int i13) {
            super(1);
            this.f60658w = aVar;
            this.f60659x = f10;
            this.f60660y = i10;
            this.f60661z = i11;
            this.A = i12;
            this.B = q0Var;
            this.C = i13;
        }

        public final void a(q0.a aVar) {
            int r02;
            jo.p.h(aVar, "$this$layout");
            int i10 = 0;
            if (a.d(this.f60658w)) {
                r02 = 0;
            } else {
                r02 = !m2.g.n(this.f60659x, m2.g.f40516x.b()) ? this.f60660y : (this.f60661z - this.A) - this.B.r0();
            }
            if (a.d(this.f60658w)) {
                i10 = !m2.g.n(this.f60659x, m2.g.f40516x.b()) ? this.f60660y : (this.C - this.A) - this.B.f0();
            }
            q0.a.n(aVar, this.B, r02, i10, 0.0f, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ q1.a f60662w;

        /* renamed from: x */
        public final /* synthetic */ float f60663x;

        /* renamed from: y */
        public final /* synthetic */ float f60664y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1.a aVar, float f10, float f11) {
            super(1);
            this.f60662w = aVar;
            this.f60663x = f10;
            this.f60664y = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("paddingFrom");
            c1Var.a().b("alignmentLine", this.f60662w);
            c1Var.a().b(TtmlNode.ANNOTATION_POSITION_BEFORE, m2.g.e(this.f60663x));
            c1Var.a().b(TtmlNode.ANNOTATION_POSITION_AFTER, m2.g.e(this.f60664y));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final q1.d0 c(q1.e0 e0Var, q1.a aVar, float f10, float f11, q1.b0 b0Var, long j10) {
        int max;
        int f02;
        q1.q0 M = b0Var.M(d(aVar) ? m2.b.e(j10, 0, 0, 0, 0, 11, null) : m2.b.e(j10, 0, 0, 0, 0, 14, null));
        int L = M.L(aVar);
        if (L == Integer.MIN_VALUE) {
            L = 0;
        }
        int f03 = d(aVar) ? M.f0() : M.r0();
        int m10 = d(aVar) ? m2.b.m(j10) : m2.b.n(j10);
        g.a aVar2 = m2.g.f40516x;
        int i10 = m10 - f03;
        int m11 = po.n.m((!m2.g.n(f10, aVar2.b()) ? e0Var.X(f10) : 0) - L, 0, i10);
        int m12 = po.n.m(((!m2.g.n(f11, aVar2.b()) ? e0Var.X(f11) : 0) - f03) + L, 0, i10 - m11);
        if (d(aVar)) {
            max = M.r0();
        } else {
            max = Math.max(M.r0() + m11 + m12, m2.b.p(j10));
        }
        int i11 = max;
        if (d(aVar)) {
            f02 = Math.max(M.f0() + m11 + m12, m2.b.o(j10));
        } else {
            f02 = M.f0();
        }
        int i12 = f02;
        return q1.e0.O0(e0Var, i11, i12, null, new C1025a(aVar, f10, m11, i11, m12, M, i12), 4, null);
    }

    public static final boolean d(q1.a aVar) {
        return aVar instanceof q1.k;
    }

    public static final x0.f e(x0.f fVar, q1.a aVar, float f10, float f11) {
        jo.p.h(fVar, "$this$paddingFrom");
        jo.p.h(aVar, "alignmentLine");
        return fVar.L(new y.b(aVar, f10, f11, androidx.compose.ui.platform.a1.c() ? new b(aVar, f10, f11) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f f(x0.f fVar, q1.a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = m2.g.f40516x.b();
        }
        if ((i10 & 4) != 0) {
            f11 = m2.g.f40516x.b();
        }
        return e(fVar, aVar, f10, f11);
    }

    public static final x0.f g(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$paddingFromBaseline");
        g.a aVar = m2.g.f40516x;
        return fVar.L(!m2.g.n(f11, aVar.b()) ? f(fVar, q1.b.b(), 0.0f, f11, 2, null) : x0.f.f59359u).L(!m2.g.n(f10, aVar.b()) ? f(fVar, q1.b.a(), f10, 0.0f, 4, null) : x0.f.f59359u);
    }
}
