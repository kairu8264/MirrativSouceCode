package f0;

import androidx.compose.ui.platform.c1;
import kotlin.NoWhenBranchMatchedException;
import x0.f;

/* loaded from: classes.dex */
public final class n0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31557a;

        static {
            int[] iArr = new int[w.q.values().length];
            iArr[w.q.Vertical.ordinal()] = 1;
            iArr[w.q.Horizontal.ordinal()] = 2;
            f31557a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o0 f31558w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.m f31559x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f31560y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0 o0Var, x.m mVar, boolean z10) {
            super(1);
            this.f31558w = o0Var;
            this.f31559x = mVar;
            this.f31560y = z10;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("textFieldScrollable");
            c1Var.a().b("scrollerPosition", this.f31558w);
            c1Var.a().b("interactionSource", this.f31559x);
            c1Var.a().b("enabled", Boolean.valueOf(this.f31560y));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o0 f31561w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f31562x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x.m f31563y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<Float, Float> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ o0 f31564w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o0 o0Var) {
                super(1);
                this.f31564w = o0Var;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return invoke(f10.floatValue());
            }

            public final Float invoke(float f10) {
                float d10 = this.f31564w.d() + f10;
                if (d10 > this.f31564w.c()) {
                    f10 = this.f31564w.c() - this.f31564w.d();
                } else if (d10 < 0.0f) {
                    f10 = -this.f31564w.d();
                }
                o0 o0Var = this.f31564w;
                o0Var.h(o0Var.d() + f10);
                return Float.valueOf(f10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0 o0Var, boolean z10, x.m mVar) {
            super(3);
            this.f31561w = o0Var;
            this.f31562x = z10;
            this.f31563y = mVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            boolean z10;
            jo.p.h(fVar, "$this$composed");
            iVar.x(805428266);
            boolean z11 = this.f31561w.f() == w.q.Vertical || !(iVar.G(androidx.compose.ui.platform.o0.j()) == m2.q.Rtl);
            w.b0 b10 = w.c0.b(new a(this.f31561w), iVar, 0);
            f.a aVar = x0.f.f59359u;
            w.q f10 = this.f31561w.f();
            if (this.f31562x) {
                if (!(this.f31561w.c() == 0.0f)) {
                    z10 = true;
                    x0.f j10 = w.a0.j(aVar, b10, f10, z10, z11, null, this.f31563y, 16, null);
                    iVar.O();
                    return j10;
                }
            }
            z10 = false;
            x0.f j102 = w.a0.j(aVar, b10, f10, z10, z11, null, this.f31563y, 16, null);
            iVar.O();
            return j102;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final b1.h b(m2.d dVar, int i10, e2.g0 g0Var, y1.z zVar, boolean z10, int i11) {
        b1.h a10;
        float i12;
        float i13;
        if (zVar == null || (a10 = zVar.d(g0Var.a().b(i10))) == null) {
            a10 = b1.h.f16726e.a();
        }
        b1.h hVar = a10;
        int X = dVar.X(f0.d());
        if (z10) {
            i12 = (i11 - hVar.i()) - X;
        } else {
            i12 = hVar.i();
        }
        float f10 = i12;
        if (z10) {
            i13 = i11 - hVar.i();
        } else {
            i13 = hVar.i() + X;
        }
        return b1.h.d(hVar, f10, 0.0f, i13, 0.0f, 10, null);
    }

    public static final x0.f c(x0.f fVar, o0 o0Var, e2.a0 a0Var, e2.i0 i0Var, io.a<t0> aVar) {
        x0.f b1Var;
        jo.p.h(fVar, "<this>");
        jo.p.h(o0Var, "scrollerPosition");
        jo.p.h(a0Var, "textFieldValue");
        jo.p.h(i0Var, "visualTransformation");
        jo.p.h(aVar, "textLayoutResultProvider");
        w.q f10 = o0Var.f();
        int e10 = o0Var.e(a0Var.g());
        o0Var.i(a0Var.g());
        e2.g0 a10 = i0Var.a(a0Var.e());
        int i10 = a.f31557a[f10.ordinal()];
        if (i10 == 1) {
            b1Var = new b1(o0Var, e10, a10, aVar);
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            b1Var = new l(o0Var, e10, a10, aVar);
        }
        return z0.d.b(fVar).L(b1Var);
    }

    public static final x0.f d(x0.f fVar, o0 o0Var, x.m mVar, boolean z10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(o0Var, "scrollerPosition");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new b(o0Var, mVar, z10) : androidx.compose.ui.platform.a1.a(), new c(o0Var, z10, mVar));
    }
}
