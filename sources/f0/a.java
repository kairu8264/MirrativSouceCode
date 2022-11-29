package f0;

import c1.d0;
import l0.l1;
import y.d1;
import y.g1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float f31287a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f31288b;

    /* renamed from: f0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0319a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f31289w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f31290x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f31291y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0319a(io.p<? super l0.i, ? super Integer, wn.v> pVar, x0.f fVar, int i10) {
            super(2);
            this.f31289w = pVar;
            this.f31290x = fVar;
            this.f31291y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else if (this.f31289w == null) {
                iVar.x(1275643833);
                a.b(this.f31290x, iVar, (this.f31291y >> 3) & 14);
                iVar.O();
            } else {
                iVar.x(1275643903);
                this.f31289w.invoke(iVar, Integer.valueOf((this.f31291y >> 6) & 14));
                iVar.O();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f31292w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f31293x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f31294y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f31295z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f31292w = j10;
            this.f31293x = fVar;
            this.f31294y = pVar;
            this.f31295z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            a.a(this.f31292w, this.f31293x, this.f31294y, iVar, this.f31295z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f31296w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f31297x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x0.f fVar, int i10) {
            super(2);
            this.f31296w = fVar;
            this.f31297x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            a.b(this.f31296w, iVar, this.f31297x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f31298w = new d();

        /* renamed from: f0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0320a extends jo.q implements io.l<z0.c, z0.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ long f31299w;

            /* renamed from: f0.a$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0321a extends jo.q implements io.l<e1.c, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ float f31300w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ c1.k0 f31301x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ c1.d0 f31302y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0321a(float f10, c1.k0 k0Var, c1.d0 d0Var) {
                    super(1);
                    this.f31300w = f10;
                    this.f31301x = k0Var;
                    this.f31302y = d0Var;
                }

                public final void a(e1.c cVar) {
                    jo.p.h(cVar, "$this$onDrawWithContent");
                    cVar.c1();
                    float f10 = this.f31300w;
                    c1.k0 k0Var = this.f31301x;
                    c1.d0 d0Var = this.f31302y;
                    e1.d M0 = cVar.M0();
                    long c10 = M0.c();
                    M0.e().p();
                    e1.g d10 = M0.d();
                    e1.g.e(d10, f10, 0.0f, 2, null);
                    d10.h(45.0f, b1.f.f16721b.c());
                    e1.e.i0(cVar, k0Var, 0L, 0.0f, null, d0Var, 0, 46, null);
                    M0.e().k();
                    M0.f(c10);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
                    a(cVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0320a(long j10) {
                super(1);
                this.f31299w = j10;
            }

            @Override // io.l
            /* renamed from: a */
            public final z0.j invoke(z0.c cVar) {
                jo.p.h(cVar, "$this$drawWithCache");
                float i10 = b1.l.i(cVar.c()) / 2.0f;
                return cVar.e(new C0321a(i10, g0.a.e(cVar, i10), d0.a.b(c1.d0.f18653b, this.f31299w, 0, 2, null)));
            }
        }

        public d() {
            super(3);
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-2126899193);
            x0.f L = fVar.L(z0.i.b(x0.f.f59359u, new C0320a(((g0.z) iVar.G(g0.a0.b())).b())));
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    static {
        float l10 = m2.g.l(25);
        f31287a = l10;
        f31288b = m2.g.l(m2.g.l(l10 * 2.0f) / 2.4142137f);
    }

    public static final void a(long j10, x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(fVar, "modifier");
        l0.i h10 = iVar.h(-5185995);
        if ((i10 & 14) == 0) {
            i11 = (h10.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(fVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(pVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            g0.a.b(j10, g0.f.TopMiddle, s0.c.b(h10, -1458480226, true, new C0319a(pVar, fVar, i11)), h10, (i11 & 14) | 432);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(j10, fVar, pVar, i10));
    }

    public static final void b(x0.f fVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(fVar, "modifier");
        l0.i h10 = iVar.h(694251107);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            g1.a(c(d1.v(fVar, f31288b, f31287a)), h10, 0);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(fVar, i10));
    }

    public static final x0.f c(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.d(fVar, null, d.f31298w, 1, null);
    }
}
