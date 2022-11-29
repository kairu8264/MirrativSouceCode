package z0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import c1.c0;
import c1.g1;
import c1.h0;
import c1.i0;
import c1.j0;
import wn.v;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<i0, v> {
        public final /* synthetic */ long A;

        /* renamed from: w */
        public final /* synthetic */ float f62420w;

        /* renamed from: x */
        public final /* synthetic */ g1 f62421x;

        /* renamed from: y */
        public final /* synthetic */ boolean f62422y;

        /* renamed from: z */
        public final /* synthetic */ long f62423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, g1 g1Var, boolean z10, long j10, long j11) {
            super(1);
            this.f62420w = f10;
            this.f62421x = g1Var;
            this.f62422y = z10;
            this.f62423z = j10;
            this.A = j11;
        }

        public final void a(i0 i0Var) {
            jo.p.h(i0Var, "$this$graphicsLayer");
            i0Var.n0(i0Var.I0(this.f62420w));
            i0Var.A0(this.f62421x);
            i0Var.U(this.f62422y);
            i0Var.Q(this.f62423z);
            i0Var.Z(this.A);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(i0 i0Var) {
            a(i0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, v> {
        public final /* synthetic */ long A;

        /* renamed from: w */
        public final /* synthetic */ float f62424w;

        /* renamed from: x */
        public final /* synthetic */ g1 f62425x;

        /* renamed from: y */
        public final /* synthetic */ boolean f62426y;

        /* renamed from: z */
        public final /* synthetic */ long f62427z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, g1 g1Var, boolean z10, long j10, long j11) {
            super(1);
            this.f62424w = f10;
            this.f62425x = g1Var;
            this.f62426y = z10;
            this.f62427z = j10;
            this.A = j11;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("shadow");
            c1Var.a().b("elevation", m2.g.e(this.f62424w));
            c1Var.a().b("shape", this.f62425x);
            c1Var.a().b("clip", Boolean.valueOf(this.f62426y));
            c1Var.a().b("ambientColor", c0.g(this.f62427z));
            c1Var.a().b("spotColor", c0.g(this.A));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, float f10, g1 g1Var, boolean z10, long j10, long j11) {
        jo.p.h(fVar, "$this$shadow");
        jo.p.h(g1Var, "shape");
        if (m2.g.i(f10, m2.g.l(0)) > 0 || z10) {
            return a1.b(fVar, a1.c() ? new b(f10, g1Var, z10, j10, j11) : a1.a(), h0.a(x0.f.f59359u, new a(f10, g1Var, z10, j10, j11)));
        }
        return fVar;
    }

    public static /* synthetic */ x0.f b(x0.f fVar, float f10, g1 g1Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        g1 a10 = (i10 & 2) != 0 ? c1.a1.a() : g1Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (m2.g.i(f10, m2.g.l(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(fVar, f10, a10, z11, (i10 & 8) != 0 ? j0.a() : j10, (i10 & 16) != 0 ? j0.a() : j11);
    }
}
