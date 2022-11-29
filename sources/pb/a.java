package pb;

import android.graphics.PointF;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import b1.f;
import h0.w1;
import hb.t1;
import io.l;
import io.r;
import jo.p;
import jo.q;
import l0.c2;
import l0.e;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import l0.s0;
import l0.z1;
import q1.c0;
import q1.k0;
import q1.w;
import s1.a;
import t.g;
import t.k;
import t.m;
import u.b0;
import u.i0;
import u.j;
import u.j0;
import u.l0;
import u.q0;
import u.u;
import ud.v1;
import w6.k;
import w6.o;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.r0;
import y.y0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: pb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0705a extends q implements l<t.d<v1>, k> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0705a f46357w = new C0705a();

        /* renamed from: pb.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0706a extends q implements l<l0.b<Float>, v> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0706a f46358w = new C0706a();

            public C0706a() {
                super(1);
            }

            public final void a(l0.b<Float> bVar) {
                p.h(bVar, "$this$keyframes");
                bVar.e(200);
                bVar.f(3200);
                bVar.g(bVar.a(Float.valueOf(0.0f), 0), b0.c());
                Float valueOf = Float.valueOf(0.2f);
                bVar.a(valueOf, 200);
                bVar.g(bVar.a(valueOf, 3000), b0.c());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(l0.b<Float> bVar) {
                a(bVar);
                return v.f59242a;
            }
        }

        public C0705a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final k invoke(t.d<v1> dVar) {
            p.h(dVar, "$this$AnimatedContent");
            return t.b.e(m.r(j.e(C0706a.f46358w), 0.0f, 2, null), m.t(j.i(200, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements r<g, v1, i, Integer, v> {
        public final /* synthetic */ l<PointF, v> A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<f> f46359w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<Float> f46360x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w6.i f46361y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ w6.f f46362z;

        /* renamed from: pb.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0707a extends q implements l<q1.q, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<f> f46363w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0707a(s0<f> s0Var) {
                super(1);
                this.f46363w = s0Var;
            }

            public final void a(q1.q qVar) {
                p.h(qVar, "coordinates");
                this.f46363w.setValue(f.d(q1.r.f(qVar)));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(q1.q qVar) {
                a(qVar);
                return v.f59242a;
            }
        }

        /* renamed from: pb.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0708b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l<PointF, v> f46364w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s0<f> f46365x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0708b(l<? super PointF, v> lVar, s0<f> s0Var) {
                super(0);
                this.f46364w = lVar;
                this.f46365x = s0Var;
            }

            public final void a() {
                this.f46364w.invoke(new PointF(f.m(this.f46365x.getValue().u()), f.n(this.f46365x.getValue().u())));
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(s0<f> s0Var, c2<Float> c2Var, w6.i iVar, w6.f fVar, l<? super PointF, v> lVar, int i10) {
            super(4);
            this.f46359w = s0Var;
            this.f46360x = c2Var;
            this.f46361y = iVar;
            this.f46362z = fVar;
            this.A = lVar;
            this.B = i10;
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ v F(g gVar, v1 v1Var, i iVar, Integer num) {
            a(gVar, v1Var, iVar, num.intValue());
            return v.f59242a;
        }

        public final void a(g gVar, v1 v1Var, i iVar, int i10) {
            s0<f> s0Var;
            l<PointF, v> lVar;
            f.a aVar;
            p.h(gVar, "$this$AnimatedContent");
            p.h(v1Var, "it");
            f.a aVar2 = x0.f.f59359u;
            s0<b1.f> s0Var2 = this.f46359w;
            iVar.x(1157296644);
            boolean P = iVar.P(s0Var2);
            Object y10 = iVar.y();
            if (P || y10 == i.f39065a.a()) {
                y10 = new C0707a(s0Var2);
                iVar.q(y10);
            }
            iVar.O();
            x0.f a10 = k0.a(aVar2, (l) y10);
            a.C0986a c0986a = x0.a.f59327a;
            a.b g10 = c0986a.g();
            c2<Float> c2Var = this.f46360x;
            w6.i iVar2 = this.f46361y;
            w6.f fVar = this.f46362z;
            l<PointF, v> lVar2 = this.A;
            s0<b1.f> s0Var3 = this.f46359w;
            iVar.x(-483455358);
            y.f fVar2 = y.f.f60773a;
            c0 a11 = y.p.a(fVar2.g(), g10, iVar, 48);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a12 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a13 = w.a(a10);
            if (!(iVar.k() instanceof e)) {
                h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            i a14 = h2.a(iVar);
            h2.b(a14, a11, c0787a.d());
            h2.b(a14, dVar, c0787a.b());
            h2.b(a14, qVar, c0787a.c());
            h2.b(a14, g2Var, c0787a.f());
            iVar.c();
            a13.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1163856341);
            y.r rVar = y.r.f60913a;
            if (v1Var.d() && !gVar.a().p()) {
                iVar.x(536475541);
                iVar.x(733328855);
                c0 h10 = y.j.h(c0986a.o(), false, iVar, 0);
                iVar.x(-1323940314);
                m2.d dVar2 = (m2.d) iVar.G(o0.e());
                m2.q qVar2 = (m2.q) iVar.G(o0.j());
                g2 g2Var2 = (g2) iVar.G(o0.n());
                io.a<s1.a> a15 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a16 = w.a(aVar2);
                if (!(iVar.k() instanceof e)) {
                    h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a15);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a17 = h2.a(iVar);
                h2.b(a17, h10, c0787a.d());
                h2.b(a17, dVar2, c0787a.b());
                h2.b(a17, qVar2, c0787a.c());
                h2.b(a17, g2Var2, c0787a.f());
                iVar.c();
                a16.s0(n1.a(n1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-2137368960);
                y.l lVar3 = y.l.f60836a;
                float f10 = 42;
                float f11 = 28;
                s0Var = s0Var3;
                lVar = lVar2;
                aVar = aVar2;
                w6.e.a(a.b(iVar2), a.c(fVar), z0.p.a(d1.v(aVar2, m2.g.l(f10), m2.g.l(f11)), 1.7f), false, false, false, null, null, q1.f.f48569a.d(), iVar, 100663688, 248);
                l9.d.c(v1Var.c(), z0.p.a(d1.v(aVar, m2.g.l(f10), m2.g.l(f11)), c2Var.getValue().floatValue()), null, 0, null, null, iVar, 0, 60);
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
                iVar.O();
            } else {
                s0Var = s0Var3;
                lVar = lVar2;
                aVar = aVar2;
                iVar.x(536476296);
                l9.d.c(v1Var.c(), d1.v(aVar, m2.g.l(42), m2.g.l(28)), null, 0, null, null, iVar, 48, 60);
                iVar.O();
            }
            iVar.x(693286680);
            c0 a18 = y0.a(fVar2.f(), c0986a.l(), iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar3 = (m2.d) iVar.G(o0.e());
            m2.q qVar3 = (m2.q) iVar.G(o0.j());
            g2 g2Var3 = (g2) iVar.G(o0.n());
            io.a<s1.a> a19 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a20 = w.a(aVar);
            if (!(iVar.k() instanceof e)) {
                h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a19);
            } else {
                iVar.o();
            }
            iVar.E();
            i a21 = h2.a(iVar);
            h2.b(a21, a18, c0787a.d());
            h2.b(a21, dVar3, c0787a.b());
            h2.b(a21, qVar3, c0787a.c());
            h2.b(a21, g2Var3, c0787a.f());
            iVar.c();
            a20.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-678309503);
            a1 a1Var = a1.f60672a;
            float f12 = 10;
            x0.f v10 = d1.v(aVar, m2.g.l(f12), m2.g.l(f12));
            boolean z10 = !gVar.a().p();
            iVar.x(511388516);
            s0<b1.f> s0Var4 = s0Var;
            boolean P2 = iVar.P(lVar) | iVar.P(s0Var4);
            Object y11 = iVar.y();
            if (P2 || y11 == i.f39065a.a()) {
                y11 = new C0708b(lVar, s0Var4);
                iVar.q(y11);
            }
            iVar.O();
            v.w.a(v1.e.c(hb.v1.M, iVar, 0), null, v.l.e(v10, z10, null, null, (io.a) y11, 6, null), null, null, 0.0f, null, iVar, 56, 120);
            w1.c(String.valueOf(v1Var.a()), r0.m(aVar, m2.g.l(2), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(t1.f34977r, iVar, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().u(), iVar, 48, 0, 32760);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v1 f46366w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<PointF, v> f46367x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f46368y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(v1 v1Var, l<? super PointF, v> lVar, int i10) {
            super(2);
            this.f46366w = v1Var;
            this.f46367x = lVar;
            this.f46368y = i10;
        }

        public final void a(i iVar, int i10) {
            a.a(this.f46366w, this.f46367x, iVar, this.f46368y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements l<l0.b<Float>, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ u f46369w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u f46370x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u uVar, u uVar2) {
            super(1);
            this.f46369w = uVar;
            this.f46370x = uVar2;
        }

        public final void a(l0.b<Float> bVar) {
            p.h(bVar, "$this$keyframes");
            bVar.f(2000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.g(bVar.a(valueOf, 0), this.f46369w);
            bVar.g(bVar.a(Float.valueOf(1.75f), 200), this.f46370x);
            bVar.g(bVar.a(Float.valueOf(0.75f), 350), this.f46370x);
            bVar.g(bVar.a(Float.valueOf(1.15f), 450), this.f46369w);
            bVar.a(valueOf, 550);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(l0.b<Float> bVar) {
            a(bVar);
            return v.f59242a;
        }
    }

    public static final void a(v1 v1Var, l<? super PointF, v> lVar, i iVar, int i10) {
        int i11;
        i iVar2;
        p.h(v1Var, "bindModel");
        p.h(lVar, "onClickGift");
        i h10 = iVar.h(-828441437);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(v1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 91) == 18 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar = i.f39065a;
            if (y10 == aVar.a()) {
                y10 = z1.e(b1.f.d(b1.f.f16721b.c()), null, 2, null);
                h10.q(y10);
            }
            h10.O();
            s0 s0Var = (s0) y10;
            w6.i r10 = o.r(k.a.a(k.a.b("feature_gift/data.json")), "feature_gift/images", null, null, null, null, h10, 56, 60);
            w6.f c10 = w6.a.c(b(r10), false, false, null, 0.0f, Integer.MAX_VALUE, null, h10, 196616, 94);
            h10.x(-492369756);
            Object y11 = h10.y();
            if (y11 == aVar.a()) {
                y11 = new u(0.61f, 1.0f, 0.88f, 1.0f);
                h10.q(y11);
            }
            h10.O();
            u uVar = (u) y11;
            h10.x(-492369756);
            Object y12 = h10.y();
            if (y12 == aVar.a()) {
                y12 = new u(0.37f, 0.0f, 0.63f, 1.0f);
                h10.q(y12);
            }
            h10.O();
            u uVar2 = (u) y12;
            j0 c11 = u.k0.c(h10, 0);
            h10.x(511388516);
            boolean P = h10.P(uVar) | h10.P(uVar2);
            Object y13 = h10.y();
            if (P || y13 == aVar.a()) {
                y13 = new d(uVar, uVar2);
                h10.q(y13);
            }
            h10.O();
            c2<Float> a10 = u.k0.a(c11, 1.0f, 1.0f, j.d(j.e((l) y13), q0.Restart, 0L, 4, null), h10, j0.f54028e | 432 | (i0.f54024d << 9));
            iVar2 = h10;
            t.b.a(v1Var, null, C0705a.f46357w, null, s0.c.b(h10, -689225405, true, new b(s0Var, a10, r10, c10, lVar, i12)), h10, v1.f55594e | 24960 | (i12 & 14), 10);
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(v1Var, lVar, i10));
    }

    public static final s6.d b(w6.i iVar) {
        return iVar.getValue();
    }

    public static final float c(w6.f fVar) {
        return fVar.getValue().floatValue();
    }
}
