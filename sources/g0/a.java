package g0;

import c1.d0;
import c1.e0;
import c1.k0;
import c1.l0;
import c1.m0;
import com.google.android.exoplayer2.C;
import e1.a;
import l0.l1;
import y.d1;
import y.g1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0360a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f32171w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f32172x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j2.d f32173y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f32174z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0360a(x0.f fVar, boolean z10, j2.d dVar, boolean z11, int i10) {
            super(2);
            this.f32171w = fVar;
            this.f32172x = z10;
            this.f32173y = dVar;
            this.f32174z = z11;
            this.A = i10;
        }

        public final void a(l0.i iVar, int i10) {
            a.a(this.f32171w, this.f32172x, this.f32173y, this.f32174z, iVar, this.A | 1);
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
        public final /* synthetic */ long f32175w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f f32176x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f32177y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f32178z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f32175w = j10;
            this.f32176x = fVar;
            this.f32177y = pVar;
            this.f32178z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            a.b(this.f32175w, this.f32176x, this.f32177y, iVar, this.f32178z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ j2.d B;
        public final /* synthetic */ boolean C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f32179w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f32180x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f32181y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f32182z;

        /* renamed from: g0.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0361a extends jo.q implements io.l<w1.y, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f32183w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f32184x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0361a(boolean z10, long j10) {
                super(1);
                this.f32183w = z10;
                this.f32184x = j10;
            }

            public final void a(w1.y yVar) {
                f0.j jVar;
                jo.p.h(yVar, "$this$semantics");
                w1.x<m> d10 = n.d();
                if (this.f32183w) {
                    jVar = f0.j.SelectionStart;
                } else {
                    jVar = f0.j.SelectionEnd;
                }
                yVar.d(d10, new m(jVar, this.f32184x, null));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
                a(yVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.p<? super l0.i, ? super Integer, wn.v> pVar, x0.f fVar, boolean z10, long j10, int i10, j2.d dVar, boolean z11) {
            super(2);
            this.f32179w = pVar;
            this.f32180x = fVar;
            this.f32181y = z10;
            this.f32182z = j10;
            this.A = i10;
            this.B = dVar;
            this.C = z11;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else if (this.f32179w == null) {
                iVar.x(386443790);
                x0.f fVar = this.f32180x;
                Boolean valueOf = Boolean.valueOf(this.f32181y);
                b1.f d10 = b1.f.d(this.f32182z);
                boolean z10 = this.f32181y;
                long j10 = this.f32182z;
                iVar.x(511388516);
                boolean P = iVar.P(valueOf) | iVar.P(d10);
                Object y10 = iVar.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new C0361a(z10, j10);
                    iVar.q(y10);
                }
                iVar.O();
                x0.f b10 = w1.p.b(fVar, false, (io.l) y10, 1, null);
                boolean z11 = this.f32181y;
                j2.d dVar = this.B;
                boolean z12 = this.C;
                int i11 = this.A;
                a.a(b10, z11, dVar, z12, iVar, (i11 & 112) | (i11 & 896) | (i11 & 7168));
                iVar.O();
            } else {
                iVar.x(386444465);
                this.f32179w.invoke(iVar, Integer.valueOf((this.A >> 15) & 14));
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
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ x0.f A;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f32185w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f32186x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j2.d f32187y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f32188z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j10, boolean z10, j2.d dVar, boolean z11, x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f32185w = j10;
            this.f32186x = z10;
            this.f32187y = dVar;
            this.f32188z = z11;
            this.A = fVar;
            this.B = pVar;
            this.C = i10;
        }

        public final void a(l0.i iVar, int i10) {
            a.c(this.f32185w, this.f32186x, this.f32187y, this.f32188z, this.A, this.B, iVar, this.C | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f32189w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j2.d f32190x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f32191y;

        /* renamed from: g0.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0362a extends jo.q implements io.l<z0.c, z0.j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ long f32192w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ boolean f32193x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ j2.d f32194y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ boolean f32195z;

            /* renamed from: g0.a$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0363a extends jo.q implements io.l<e1.c, wn.v> {
                public final /* synthetic */ d0 A;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ boolean f32196w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ j2.d f32197x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ boolean f32198y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ k0 f32199z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0363a(boolean z10, j2.d dVar, boolean z11, k0 k0Var, d0 d0Var) {
                    super(1);
                    this.f32196w = z10;
                    this.f32197x = dVar;
                    this.f32198y = z11;
                    this.f32199z = k0Var;
                    this.A = d0Var;
                }

                public final void a(e1.c cVar) {
                    jo.p.h(cVar, "$this$onDrawWithContent");
                    cVar.c1();
                    if (a.h(this.f32196w, this.f32197x, this.f32198y)) {
                        k0 k0Var = this.f32199z;
                        d0 d0Var = this.A;
                        long U0 = cVar.U0();
                        e1.d M0 = cVar.M0();
                        long c10 = M0.c();
                        M0.e().p();
                        M0.d().g(-1.0f, 1.0f, U0);
                        e1.e.i0(cVar, k0Var, 0L, 0.0f, null, d0Var, 0, 46, null);
                        M0.e().k();
                        M0.f(c10);
                        return;
                    }
                    e1.e.i0(cVar, this.f32199z, 0L, 0.0f, null, this.A, 0, 46, null);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(e1.c cVar) {
                    a(cVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0362a(long j10, boolean z10, j2.d dVar, boolean z11) {
                super(1);
                this.f32192w = j10;
                this.f32193x = z10;
                this.f32194y = dVar;
                this.f32195z = z11;
            }

            @Override // io.l
            /* renamed from: a */
            public final z0.j invoke(z0.c cVar) {
                jo.p.h(cVar, "$this$drawWithCache");
                return cVar.e(new C0363a(this.f32193x, this.f32194y, this.f32195z, a.e(cVar, b1.l.i(cVar.c()) / 2.0f), d0.a.b(d0.f18653b, this.f32192w, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, j2.d dVar, boolean z11) {
            super(3);
            this.f32189w = z10;
            this.f32190x = dVar;
            this.f32191y = z11;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-1538687176);
            x0.f L = fVar.L(z0.i.b(x0.f.f59359u, new C0362a(((z) iVar.G(a0.b())).b(), this.f32189w, this.f32190x, this.f32191y)));
            iVar.O();
            return L;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final void a(x0.f fVar, boolean z10, j2.d dVar, boolean z11, l0.i iVar, int i10) {
        int i11;
        jo.p.h(fVar, "modifier");
        jo.p.h(dVar, "direction");
        l0.i h10 = iVar.h(47957398);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.a(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(dVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.a(z11) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && h10.j()) {
            h10.I();
        } else {
            g1.a(f(d1.v(fVar, n.c(), n.b()), z10, dVar, z11), h10, 0);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C0360a(fVar, z10, dVar, z11, i10));
    }

    public static final void b(long j10, f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(fVar, "handleReferencePoint");
        jo.p.h(pVar, "content");
        l0.i h10 = iVar.h(-1409050158);
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
            long a10 = m2.l.a(lo.c.c(b1.f.m(j10)), lo.c.c(b1.f.n(j10)));
            m2.k b10 = m2.k.b(a10);
            h10.x(511388516);
            boolean P = h10.P(b10) | h10.P(fVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new g0.e(fVar, a10, null);
                h10.q(y10);
            }
            h10.O();
            p2.a.a((g0.e) y10, null, new p2.i(false, false, false, null, true, false, 15, null), pVar, h10, (i11 << 3) & 7168, 2);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(j10, fVar, pVar, i10));
    }

    public static final void c(long j10, boolean z10, j2.d dVar, boolean z11, x0.f fVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        int i11;
        f fVar2;
        jo.p.h(dVar, "direction");
        jo.p.h(fVar, "modifier");
        l0.i h10 = iVar.h(-616295642);
        if ((i10 & 14) == 0) {
            i11 = (h10.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.a(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(dVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.a(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(fVar) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= h10.P(pVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i12 = i11;
        if ((i12 & 374491) == 74898 && h10.j()) {
            h10.I();
        } else {
            if (h(z10, dVar, z11)) {
                fVar2 = f.TopRight;
            } else {
                fVar2 = f.TopLeft;
            }
            b(j10, fVar2, s0.c.b(h10, 732099485, true, new c(pVar, fVar, z10, j10, i12, dVar, z11)), h10, (i12 & 14) | 384);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(j10, z10, dVar, z11, fVar, pVar, i10));
    }

    public static final k0 e(z0.c cVar, float f10) {
        jo.p.h(cVar, "<this>");
        int ceil = ((int) Math.ceil(f10)) * 2;
        g0.d dVar = g0.d.f32227a;
        k0 c10 = dVar.c();
        c1.w a10 = dVar.a();
        e1.a b10 = dVar.b();
        if (c10 == null || a10 == null || ceil > c10.getWidth() || ceil > c10.getHeight()) {
            c10 = m0.b(ceil, ceil, l0.f18711b.a(), false, null, 24, null);
            dVar.f(c10);
            a10 = c1.y.a(c10);
            dVar.d(a10);
        }
        k0 k0Var = c10;
        c1.w wVar = a10;
        if (b10 == null) {
            b10 = new e1.a();
            dVar.e(b10);
        }
        e1.a aVar = b10;
        m2.q layoutDirection = cVar.getLayoutDirection();
        long a11 = b1.m.a(k0Var.getWidth(), k0Var.getHeight());
        a.C0296a z10 = aVar.z();
        m2.d a12 = z10.a();
        m2.q b11 = z10.b();
        c1.w c11 = z10.c();
        long d10 = z10.d();
        a.C0296a z11 = aVar.z();
        z11.j(cVar);
        z11.k(layoutDirection);
        z11.i(wVar);
        z11.l(a11);
        wVar.p();
        e1.e.L0(aVar, c1.c0.f18634b.a(), 0L, aVar.c(), 0.0f, null, null, c1.r.f18740b.a(), 58, null);
        e1.e.L0(aVar, e0.c(4278190080L), b1.f.f16721b.c(), b1.m.a(f10, f10), 0.0f, null, null, 0, 120, null);
        e1.e.D(aVar, e0.c(4278190080L), f10, b1.g.a(f10, f10), 0.0f, null, null, 0, 120, null);
        wVar.k();
        a.C0296a z12 = aVar.z();
        z12.j(a12);
        z12.k(b11);
        z12.i(c11);
        z12.l(d10);
        return k0Var;
    }

    public static final x0.f f(x0.f fVar, boolean z10, j2.d dVar, boolean z11) {
        jo.p.h(fVar, "<this>");
        jo.p.h(dVar, "direction");
        return x0.e.d(fVar, null, new e(z10, dVar, z11), 1, null);
    }

    public static final boolean g(j2.d dVar, boolean z10) {
        jo.p.h(dVar, "direction");
        return (dVar == j2.d.Ltr && !z10) || (dVar == j2.d.Rtl && z10);
    }

    public static final boolean h(boolean z10, j2.d dVar, boolean z11) {
        if (z10) {
            return g(dVar, z11);
        }
        return !g(dVar, z11);
    }
}
