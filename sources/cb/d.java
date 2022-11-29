package cb;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.g2;
import c1.d0;
import h0.o0;
import h0.w1;
import io.l;
import io.p;
import jo.e0;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import l0.s0;
import l0.z1;
import m2.s;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.f;
import y.g1;
import y.j;
import y.r;
import y.r0;
import y.z0;

/* loaded from: classes2.dex */
public final class d {

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f19006w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f19007x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar, int i10) {
            super(2);
            this.f19006w = aVar;
            this.f19007x = i10;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                o0.a(this.f19006w, null, false, null, cb.b.f18997a.b(), iVar, ((this.f19007x >> 9) & 14) | 24576, 14);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.q<z0, i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0<cb.f> f19008w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Bitmap, v> f19009x;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e0<cb.f> f19010w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ l<Bitmap, v> f19011x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e0<cb.f> e0Var, l<? super Bitmap, v> lVar) {
                super(0);
                this.f19010w = e0Var;
                this.f19011x = lVar;
            }

            public final void a() {
                Bitmap a10;
                cb.f fVar = this.f19010w.f38136w;
                if (fVar == null || (a10 = fVar.a()) == null) {
                    return;
                }
                this.f19011x.invoke(a10);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e0<cb.f> e0Var, l<? super Bitmap, v> lVar) {
            super(3);
            this.f19008w = e0Var;
            this.f19009x = lVar;
        }

        public final void a(z0 z0Var, i iVar, int i10) {
            jo.p.h(z0Var, "$this$TopAppBar");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            f.a aVar = x0.f.f59359u;
            x0.f e10 = v.l.e(d1.j(aVar, 0.0f, 1, null), false, null, null, new a(this.f19008w, this.f19009x), 7, null);
            x0.a e11 = x0.a.f59327a.e();
            iVar.x(733328855);
            c0 h10 = j.h(e11, false, iVar, 6);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a11 = w.a(e10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a10);
            } else {
                iVar.o();
            }
            iVar.E();
            i a12 = h2.a(iVar);
            h2.b(a12, h10, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            iVar.c();
            a11.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            y.l lVar = y.l.f60836a;
            w1.c(v1.f.b(da.i.f29339i, iVar, 0), r0.m(aVar, m2.g.l(16), 0.0f, m2.g.l(8), 0.0f, 10, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 48, 0, 65532);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<cb.f, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e0<cb.f> f19012w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0<cb.f> e0Var) {
            super(1);
            this.f19012w = e0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(cb.f fVar) {
            jo.p.h(fVar, "it");
            this.f19012w.f38136w = fVar;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(cb.f fVar) {
            a(fVar);
            return v.f59242a;
        }
    }

    /* renamed from: cb.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0143d extends q implements l<z.c0, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<cb.a> f19013w;

        /* renamed from: cb.d$d$a */
        /* loaded from: classes2.dex */
        public static final class a extends q implements io.q<z.h, i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<cb.a> f19014w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ cb.a f19015x;

            /* renamed from: cb.d$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0144a extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ cb.a f19016w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ s0<cb.a> f19017x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0144a(cb.a aVar, s0<cb.a> s0Var) {
                    super(0);
                    this.f19016w = aVar;
                    this.f19017x = s0Var;
                }

                public final void a() {
                    d.c(this.f19017x, this.f19016w);
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s0<cb.a> s0Var, cb.a aVar) {
                super(3);
                this.f19014w = s0Var;
                this.f19015x = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, l0.i] */
            /* JADX WARN: Type inference failed for: r8v3 */
            public final void a(z.h hVar, i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                f.a aVar = x0.f.f59359u;
                x0.f u10 = d1.u(aVar, m2.g.l(46));
                s0<cb.a> s0Var = this.f19014w;
                cb.a aVar2 = this.f19015x;
                iVar.x(511388516);
                boolean P = iVar.P(s0Var) | iVar.P(aVar2);
                Object y10 = iVar.y();
                if (P || y10 == i.f39065a.a()) {
                    y10 = new C0144a(aVar2, s0Var);
                    iVar.q(y10);
                }
                iVar.O();
                x0.f e10 = v.l.e(u10, false, null, null, y10, 7, null);
                a.b g10 = x0.a.f59327a.g();
                cb.a aVar3 = this.f19015x;
                s0<cb.a> s0Var2 = this.f19014w;
                iVar.x(-483455358);
                c0 a10 = y.p.a(y.f.f60773a.g(), g10, iVar, 48);
                iVar.x(-1323940314);
                m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                g2 g2Var = (g2) iVar.G(androidx.compose.ui.platform.o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a11 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a12 = w.a(e10);
                if (!(iVar.k() instanceof l0.e)) {
                    l0.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a11);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a13 = h2.a(iVar);
                h2.b(a13, a10, c0787a.d());
                h2.b(a13, dVar, c0787a.b());
                h2.b(a13, qVar, c0787a.c());
                h2.b(a13, g2Var, c0787a.f());
                iVar.c();
                a12.s0(n1.a(n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-1163856341);
                r rVar = r.f60913a;
                v.w.a(v1.e.c(aVar3.e(), iVar, 0), null, null, null, null, 0.0f, d0.f18653b.a(v1.b.a(aVar3 == d.b(s0Var2) ? da.d.f29335d : da.d.f29334c, iVar, 0), c1.r.f18740b.z()), iVar, 56, 60);
                g1.a(d1.o(aVar, m2.g.l(3)), iVar, 6);
                w1.c(v1.f.b(aVar3.h(), iVar, 0), null, v1.b.a(da.d.f29334c, iVar, 0), s.d(9), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 3072, 0, 65522);
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(z.h hVar, i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0143d(s0<cb.a> s0Var) {
            super(1);
            this.f19013w = s0Var;
        }

        public final void a(z.c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyRow");
            cb.a[] values = cb.a.values();
            s0<cb.a> s0Var = this.f19013w;
            for (cb.a aVar : values) {
                z.c0.d(c0Var, null, null, s0.c.c(-1015634574, true, new a(s0Var, aVar)), 3, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(z.c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements p<i, Integer, v> {
        public final /* synthetic */ l<Bitmap, v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Bitmap f19018w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ cb.a f19019x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f19020y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f19021z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Bitmap bitmap, cb.a aVar, boolean z10, io.a<v> aVar2, l<? super Bitmap, v> lVar, int i10, int i11) {
            super(2);
            this.f19018w = bitmap;
            this.f19019x = aVar;
            this.f19020y = z10;
            this.f19021z = aVar2;
            this.A = lVar;
            this.B = i10;
            this.C = i11;
        }

        public final void a(i iVar, int i10) {
            d.a(this.f19018w, this.f19019x, this.f19020y, this.f19021z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements l<Context, cb.e> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f19022w = new f();

        public f() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final cb.e invoke(Context context) {
            jo.p.h(context, "it");
            return new cb.e(context);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements l<cb.e, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ cb.a f19023w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Bitmap f19024x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<cb.f, v> f19025y;

        /* loaded from: classes2.dex */
        public static final class a implements cb.f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ cb.e f19026a;

            public a(cb.e eVar) {
                this.f19026a = eVar;
            }

            @Override // cb.f
            public Bitmap a() {
                try {
                    return this.f19026a.getCroppedBitmap();
                } catch (Throwable th2) {
                    g9.a.c(th2);
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(cb.a aVar, Bitmap bitmap, l<? super cb.f, v> lVar) {
            super(1);
            this.f19023w = aVar;
            this.f19024x = bitmap;
            this.f19025y = lVar;
        }

        public final void a(cb.e eVar) {
            jo.p.h(eVar, "view");
            eVar.f(this.f19023w.i(), this.f19023w.c());
            eVar.setImageBitmap(this.f19024x);
            this.f19025y.invoke(new a(eVar));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(cb.e eVar) {
            a(eVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements p<i, Integer, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f19027w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Bitmap f19028x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ cb.a f19029y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ l<cb.f, v> f19030z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(x0.f fVar, Bitmap bitmap, cb.a aVar, l<? super cb.f, v> lVar, int i10, int i11) {
            super(2);
            this.f19027w = fVar;
            this.f19028x = bitmap;
            this.f19029y = aVar;
            this.f19030z = lVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(i iVar, int i10) {
            d.d(this.f19027w, this.f19028x, this.f19029y, this.f19030z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(Bitmap bitmap, cb.a aVar, boolean z10, io.a<v> aVar2, l<? super Bitmap, v> lVar, i iVar, int i10, int i11) {
        jo.p.h(bitmap, "bitmap");
        jo.p.h(aVar, "aspectRatio");
        jo.p.h(aVar2, "onBackPressed");
        jo.p.h(lVar, "onSavePressed");
        i h10 = iVar.h(814366597);
        boolean z11 = (i11 & 4) != 0 ? false : z10;
        h10.x(-492369756);
        Object y10 = h10.y();
        i.a aVar3 = i.f39065a;
        if (y10 == aVar3.a()) {
            y10 = z1.e(aVar, null, 2, null);
            h10.q(y10);
        }
        h10.O();
        s0 s0Var = (s0) y10;
        e0 e0Var = new e0();
        f.a aVar4 = x0.f.f59359u;
        int i12 = da.d.f29332a;
        x0.f l10 = d1.l(v.e.d(aVar4, v1.b.a(i12, h10, 0), null, 2, null), 0.0f, 1, null);
        h10.x(-483455358);
        y.f fVar = y.f.f60773a;
        f.l g10 = fVar.g();
        a.C0986a c0986a = x0.a.f59327a;
        c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
        m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
        g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, i, Integer, v> a12 = w.a(l10);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a11);
        } else {
            h10.o();
        }
        h10.E();
        i a13 = h2.a(h10);
        h2.b(a13, a10, c0787a.d());
        h2.b(a13, dVar, c0787a.b());
        h2.b(a13, qVar, c0787a.c());
        h2.b(a13, g2Var, c0787a.f());
        h10.c();
        a12.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        r rVar = r.f60913a;
        h0.b.b(cb.b.f18997a.a(), null, s0.c.b(h10, 1104351765, true, new a(aVar2, i10)), s0.c.b(h10, -450838466, true, new b(e0Var, lVar)), v1.b.a(i12, h10, 0), v1.b.a(da.d.f29336f, h10, 0), 0.0f, h10, 3462, 66);
        d(y.q.c(rVar, d1.n(aVar4, 0.0f, 1, null), 1.0f, false, 2, null), bitmap, b(s0Var), new c(e0Var), h10, 64, 0);
        if (z11) {
            x0.f o10 = d1.o(d1.n(aVar4, 0.0f, 1, null), m2.g.l(165));
            a.c i13 = c0986a.i();
            f.d o11 = fVar.o(m2.g.l(6), c0986a.g());
            h10.x(1157296644);
            boolean P = h10.P(s0Var);
            Object y11 = h10.y();
            if (P || y11 == aVar3.a()) {
                y11 = new C0143d(s0Var);
                h10.q(y11);
            }
            h10.O();
            z.g.b(o10, null, null, false, o11, i13, null, false, (l) y11, h10, 221190, 206);
        }
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new e(bitmap, aVar, z11, aVar2, lVar, i10, i11));
    }

    public static final cb.a b(s0<cb.a> s0Var) {
        return s0Var.getValue();
    }

    public static final void c(s0<cb.a> s0Var, cb.a aVar) {
        s0Var.setValue(aVar);
    }

    public static final void d(x0.f fVar, Bitmap bitmap, cb.a aVar, l<? super cb.f, v> lVar, i iVar, int i10, int i11) {
        jo.p.h(bitmap, "bitmap");
        jo.p.h(aVar, "aspectRatio");
        jo.p.h(lVar, "imageCropperViewRefFactory");
        i h10 = iVar.h(1048703497);
        if ((i11 & 1) != 0) {
            fVar = x0.f.f59359u;
        }
        o2.e.a(f.f19022w, fVar, new g(aVar, bitmap, lVar), h10, ((i10 << 3) & 112) | 6, 0);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new h(fVar, bitmap, aVar, lVar, i10, i11));
    }
}
