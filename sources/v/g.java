package v;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import c1.g1;
import c1.i1;
import c1.q0;
import c1.u0;
import c1.y0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f56200w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g1 f56201x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c1.u f56202y;

        /* renamed from: v.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0885a extends jo.q implements io.l<z0.c, z0.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ float f56203w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g1 f56204x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s1.c0<v.f> f56205y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ c1.u f56206z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0885a(float f10, g1 g1Var, s1.c0<v.f> c0Var, c1.u uVar) {
                super(1);
                this.f56203w = f10;
                this.f56204x = g1Var;
                this.f56205y = c0Var;
                this.f56206z = uVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final z0.j invoke(z0.c cVar) {
                jo.p.h(cVar, "$this$drawWithCache");
                if (!(cVar.I0(this.f56203w) >= 0.0f && b1.l.h(cVar.c()) > 0.0f)) {
                    return g.k(cVar);
                }
                float f10 = 2;
                float min = Math.min(m2.g.n(this.f56203w, m2.g.f40516x.a()) ? 1.0f : (float) Math.ceil(cVar.I0(this.f56203w)), (float) Math.ceil(b1.l.h(cVar.c()) / f10));
                float f11 = min / f10;
                long a10 = b1.g.a(f11, f11);
                long a11 = b1.m.a(b1.l.i(cVar.c()) - min, b1.l.g(cVar.c()) - min);
                boolean z10 = f10 * min > b1.l.h(cVar.c());
                c1.q0 a12 = this.f56204x.a(cVar.c(), cVar.getLayoutDirection(), cVar);
                if (a12 instanceof q0.a) {
                    return g.l(cVar, this.f56205y, this.f56206z, (q0.a) a12, z10, min);
                }
                if (a12 instanceof q0.c) {
                    return g.n(cVar, this.f56205y, this.f56206z, (q0.c) a12, a10, a11, z10, min);
                }
                if (a12 instanceof q0.b) {
                    return g.m(cVar, this.f56206z, a10, a11, z10, min);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, g1 g1Var, c1.u uVar) {
            super(3);
            this.f56200w = f10;
            this.f56201x = g1Var;
            this.f56202y = uVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-1498088849);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = new s1.c0();
                iVar.q(y10);
            }
            iVar.O();
            x0.f L = fVar.L(z0.i.b(x0.f.f59359u, new C0885a(this.f56200w, this.f56201x, (s1.c0) y10, this.f56202y)));
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f56207w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.u f56208x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g1 f56209y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, c1.u uVar, g1 g1Var) {
            super(1);
            this.f56207w = f10;
            this.f56208x = uVar;
            this.f56209y = g1Var;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("border");
            c1Var.a().b("width", m2.g.e(this.f56207w));
            if (this.f56208x instanceof i1) {
                c1Var.a().b(TtmlNode.ATTR_TTS_COLOR, c1.c0.g(((i1) this.f56208x).b()));
                c1Var.c(c1.c0.g(((i1) this.f56208x).b()));
            } else {
                c1Var.a().b("brush", this.f56208x);
            }
            c1Var.a().b("shape", this.f56209y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<e1.c, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f56210w = new c();

        public c() {
            super(1);
        }

        public final void a(e1.c cVar) {
            jo.p.h(cVar, "$this$onDrawWithContent");
            cVar.c1();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
            a(cVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<e1.c, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q0.a f56211w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.u f56212x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q0.a aVar, c1.u uVar) {
            super(1);
            this.f56211w = aVar;
            this.f56212x = uVar;
        }

        public final void a(e1.c cVar) {
            jo.p.h(cVar, "$this$onDrawWithContent");
            cVar.c1();
            e1.e.K0(cVar, this.f56211w.a(), this.f56212x, 0.0f, null, null, 0, 60, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
            a(cVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<e1.c, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b1.h f56213w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<c1.k0> f56214x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f56215y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c1.d0 f56216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b1.h hVar, jo.e0<c1.k0> e0Var, long j10, c1.d0 d0Var) {
            super(1);
            this.f56213w = hVar;
            this.f56214x = e0Var;
            this.f56215y = j10;
            this.f56216z = d0Var;
        }

        public final void a(e1.c cVar) {
            jo.p.h(cVar, "$this$onDrawWithContent");
            cVar.c1();
            float i10 = this.f56213w.i();
            float l10 = this.f56213w.l();
            jo.e0<c1.k0> e0Var = this.f56214x;
            long j10 = this.f56215y;
            c1.d0 d0Var = this.f56216z;
            cVar.M0().d().b(i10, l10);
            e1.e.A(cVar, e0Var.f38136w, 0L, j10, 0L, 0L, 0.0f, null, d0Var, 0, 0, 890, null);
            cVar.M0().d().b(-i10, -l10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
            a(cVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<e1.c, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c1.u f56217w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f56218x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f56219y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e1.f f56220z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c1.u uVar, long j10, long j11, e1.f fVar) {
            super(1);
            this.f56217w = uVar;
            this.f56218x = j10;
            this.f56219y = j11;
            this.f56220z = fVar;
        }

        public final void a(e1.c cVar) {
            jo.p.h(cVar, "$this$onDrawWithContent");
            cVar.c1();
            e1.e.x(cVar, this.f56217w, this.f56218x, this.f56219y, 0.0f, this.f56220z, null, 0, 104, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
            a(cVar);
            return wn.v.f59242a;
        }
    }

    /* renamed from: v.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0886g extends jo.q implements io.l<e1.c, wn.v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ long B;
        public final /* synthetic */ long C;
        public final /* synthetic */ e1.j D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f56221w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.u f56222x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f56223y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f56224z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0886g(boolean z10, c1.u uVar, long j10, float f10, float f11, long j11, long j12, e1.j jVar) {
            super(1);
            this.f56221w = z10;
            this.f56222x = uVar;
            this.f56223y = j10;
            this.f56224z = f10;
            this.A = f11;
            this.B = j11;
            this.C = j12;
            this.D = jVar;
        }

        public final void a(e1.c cVar) {
            jo.p.h(cVar, "$this$onDrawWithContent");
            cVar.c1();
            if (this.f56221w) {
                e1.e.B(cVar, this.f56222x, 0L, 0L, this.f56223y, 0.0f, null, null, 0, 246, null);
                return;
            }
            float d10 = b1.a.d(this.f56223y);
            float f10 = this.f56224z;
            if (d10 < f10) {
                float f11 = this.A;
                float i10 = b1.l.i(cVar.c()) - this.A;
                float g10 = b1.l.g(cVar.c()) - this.A;
                int a10 = c1.b0.f18630a.a();
                c1.u uVar = this.f56222x;
                long j10 = this.f56223y;
                e1.d M0 = cVar.M0();
                long c10 = M0.c();
                M0.e().p();
                M0.d().a(f11, f11, i10, g10, a10);
                e1.e.B(cVar, uVar, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
                M0.e().k();
                M0.f(c10);
                return;
            }
            e1.e.B(cVar, this.f56222x, this.B, this.C, g.p(this.f56223y, f10), 0.0f, this.D, null, 0, 208, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
            a(cVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<e1.c, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ u0 f56225w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c1.u f56226x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(u0 u0Var, c1.u uVar) {
            super(1);
            this.f56225w = u0Var;
            this.f56226x = uVar;
        }

        public final void a(e1.c cVar) {
            jo.p.h(cVar, "$this$onDrawWithContent");
            cVar.c1();
            e1.e.K0(cVar, this.f56225w, this.f56226x, 0.0f, null, null, 0, 60, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
            a(cVar);
            return wn.v.f59242a;
        }
    }

    public static final x0.f f(x0.f fVar, v.h hVar, g1 g1Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(hVar, "border");
        jo.p.h(g1Var, "shape");
        return h(fVar, hVar.b(), hVar.a(), g1Var);
    }

    public static final x0.f g(x0.f fVar, float f10, long j10, g1 g1Var) {
        jo.p.h(fVar, "$this$border");
        jo.p.h(g1Var, "shape");
        return h(fVar, f10, new i1(j10, null), g1Var);
    }

    public static final x0.f h(x0.f fVar, float f10, c1.u uVar, g1 g1Var) {
        jo.p.h(fVar, "$this$border");
        jo.p.h(uVar, "brush");
        jo.p.h(g1Var, "shape");
        return x0.e.c(fVar, a1.c() ? new b(f10, uVar, g1Var) : a1.a(), new a(f10, g1Var, uVar));
    }

    public static final b1.j i(float f10, b1.j jVar) {
        return new b1.j(f10, f10, jVar.j() - f10, jVar.d() - f10, p(jVar.h(), f10), p(jVar.i(), f10), p(jVar.c(), f10), p(jVar.b(), f10), null);
    }

    public static final u0 j(u0 u0Var, b1.j jVar, float f10, boolean z10) {
        u0Var.reset();
        u0Var.m(jVar);
        if (!z10) {
            u0 a10 = c1.n.a();
            a10.m(i(f10, jVar));
            u0Var.l(u0Var, a10, y0.f18783a.a());
        }
        return u0Var;
    }

    public static final z0.j k(z0.c cVar) {
        return cVar.e(c.f56210w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (c1.l0.h(r13, r4 != null ? c1.l0.f(r4.b()) : null) != false) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, c1.k0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final z0.j l(z0.c r42, s1.c0<v.f> r43, c1.u r44, c1.q0.a r45, boolean r46, float r47) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.l(z0.c, s1.c0, c1.u, c1.q0$a, boolean, float):z0.j");
    }

    public static final z0.j m(z0.c cVar, c1.u uVar, long j10, long j11, boolean z10, float f10) {
        return cVar.e(new f(uVar, z10 ? b1.f.f16721b.c() : j10, z10 ? cVar.c() : j11, z10 ? e1.i.f30046a : new e1.j(f10, 0.0f, 0, 0, null, 30, null)));
    }

    public static final z0.j n(z0.c cVar, s1.c0<v.f> c0Var, c1.u uVar, q0.c cVar2, long j10, long j11, boolean z10, float f10) {
        if (b1.k.d(cVar2.a())) {
            return cVar.e(new C0886g(z10, uVar, cVar2.a().h(), f10 / 2, f10, j10, j11, new e1.j(f10, 0.0f, 0, 0, null, 30, null)));
        }
        return cVar.e(new h(j(o(c0Var).g(), cVar2.a(), f10, z10), uVar));
    }

    public static final v.f o(s1.c0<v.f> c0Var) {
        v.f a10 = c0Var.a();
        if (a10 == null) {
            v.f fVar = new v.f(null, null, null, null, 15, null);
            c0Var.b(fVar);
            return fVar;
        }
        return a10;
    }

    public static final long p(long j10, float f10) {
        return b1.b.a(Math.max(0.0f, b1.a.d(j10) - f10), Math.max(0.0f, b1.a.e(j10) - f10));
    }
}
