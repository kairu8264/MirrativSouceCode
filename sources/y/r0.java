package y;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class r0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ t0 f60917w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var) {
            super(1);
            this.f60917w = t0Var;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("padding");
            c1Var.a().b("paddingValues", this.f60917w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ float f60918w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10) {
            super(1);
            this.f60918w = f10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("padding");
            c1Var.c(m2.g.e(this.f60918w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ float f60919w;

        /* renamed from: x */
        public final /* synthetic */ float f60920x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10, float f11) {
            super(1);
            this.f60919w = f10;
            this.f60920x = f11;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("padding");
            c1Var.a().b("horizontal", m2.g.e(this.f60919w));
            c1Var.a().b("vertical", m2.g.e(this.f60920x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ float f60921w;

        /* renamed from: x */
        public final /* synthetic */ float f60922x;

        /* renamed from: y */
        public final /* synthetic */ float f60923y;

        /* renamed from: z */
        public final /* synthetic */ float f60924z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10, float f11, float f12, float f13) {
            super(1);
            this.f60921w = f10;
            this.f60922x = f11;
            this.f60923y = f12;
            this.f60924z = f13;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("padding");
            c1Var.a().b(TtmlNode.START, m2.g.e(this.f60921w));
            c1Var.a().b("top", m2.g.e(this.f60922x));
            c1Var.a().b(TtmlNode.END, m2.g.e(this.f60923y));
            c1Var.a().b("bottom", m2.g.e(this.f60924z));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final t0 a(float f10) {
        return new u0(f10, f10, f10, f10, null);
    }

    public static final t0 b(float f10, float f11) {
        return new u0(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ t0 c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.l(0);
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.l(0);
        }
        return b(f10, f11);
    }

    public static final t0 d(float f10, float f11, float f12, float f13) {
        return new u0(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ t0 e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.l(0);
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.l(0);
        }
        if ((i10 & 4) != 0) {
            f12 = m2.g.l(0);
        }
        if ((i10 & 8) != 0) {
            f13 = m2.g.l(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(t0 t0Var, m2.q qVar) {
        jo.p.h(t0Var, "<this>");
        jo.p.h(qVar, "layoutDirection");
        if (qVar == m2.q.Ltr) {
            return t0Var.c(qVar);
        }
        return t0Var.b(qVar);
    }

    public static final float g(t0 t0Var, m2.q qVar) {
        jo.p.h(t0Var, "<this>");
        jo.p.h(qVar, "layoutDirection");
        if (qVar == m2.q.Ltr) {
            return t0Var.b(qVar);
        }
        return t0Var.c(qVar);
    }

    public static final x0.f h(x0.f fVar, t0 t0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(t0Var, "paddingValues");
        return fVar.L(new v0(t0Var, androidx.compose.ui.platform.a1.c() ? new a(t0Var) : androidx.compose.ui.platform.a1.a()));
    }

    public static final x0.f i(x0.f fVar, float f10) {
        jo.p.h(fVar, "$this$padding");
        return fVar.L(new s0(f10, f10, f10, f10, true, androidx.compose.ui.platform.a1.c() ? new b(f10) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static final x0.f j(x0.f fVar, float f10, float f11) {
        jo.p.h(fVar, "$this$padding");
        return fVar.L(new s0(f10, f11, f10, f11, true, androidx.compose.ui.platform.a1.c() ? new c(f10, f11) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f k(x0.f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.l(0);
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.l(0);
        }
        return j(fVar, f10, f11);
    }

    public static final x0.f l(x0.f fVar, float f10, float f11, float f12, float f13) {
        jo.p.h(fVar, "$this$padding");
        return fVar.L(new s0(f10, f11, f12, f13, true, androidx.compose.ui.platform.a1.c() ? new d(f10, f11, f12, f13) : androidx.compose.ui.platform.a1.a(), null));
    }

    public static /* synthetic */ x0.f m(x0.f fVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m2.g.l(0);
        }
        if ((i10 & 2) != 0) {
            f11 = m2.g.l(0);
        }
        if ((i10 & 4) != 0) {
            f12 = m2.g.l(0);
        }
        if ((i10 & 8) != 0) {
            f13 = m2.g.l(0);
        }
        return l(fVar, f10, f11, f12, f13);
    }
}
