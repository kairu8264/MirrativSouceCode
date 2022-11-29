package pb;

import android.graphics.PointF;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import hb.b2;
import hb.t1;
import io.l;
import jo.p;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.g;
import q1.c0;
import q1.w;
import s1.a;
import ud.v1;
import ud.w1;
import wn.k;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.g1;
import y.r;
import y.r0;
import y.y0;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f46371w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f46371w = aVar;
        }

        public final void a() {
            this.f46371w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: pb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0709b extends q implements l<PointF, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<k<v1, ? extends PointF>, v> f46372w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v1 f46373x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0709b(l<? super k<v1, ? extends PointF>, v> lVar, v1 v1Var) {
            super(1);
            this.f46372w = lVar;
            this.f46373x = v1Var;
        }

        public final void a(PointF pointF) {
            p.h(pointF, "point");
            this.f46372w.invoke(wn.q.a(this.f46373x, pointF));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(PointF pointF) {
            a(pointF);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<PointF, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<k<v1, ? extends PointF>, v> f46374w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v1 f46375x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super k<v1, ? extends PointF>, v> lVar, v1 v1Var) {
            super(1);
            this.f46374w = lVar;
            this.f46375x = v1Var;
        }

        public final void a(PointF pointF) {
            p.h(pointF, "point");
            this.f46374w.invoke(wn.q.a(this.f46375x, pointF));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(PointF pointF) {
            a(pointF);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f46376w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a<v> aVar) {
            super(0);
            this.f46376w = aVar;
        }

        public final void a() {
            this.f46376w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w1 f46377w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f46378x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l<k<v1, ? extends PointF>, v> f46379y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f46380z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(w1 w1Var, io.a<v> aVar, l<? super k<v1, ? extends PointF>, v> lVar, io.a<v> aVar2, int i10) {
            super(2);
            this.f46377w = w1Var;
            this.f46378x = aVar;
            this.f46379y = lVar;
            this.f46380z = aVar2;
            this.A = i10;
        }

        public final void a(i iVar, int i10) {
            b.a(this.f46377w, this.f46378x, this.f46379y, this.f46380z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(w1 w1Var, io.a<v> aVar, l<? super k<v1, ? extends PointF>, v> lVar, io.a<v> aVar2, i iVar, int i10) {
        int i11;
        f.a aVar3;
        int i12;
        f.a aVar4;
        int i13;
        float f10;
        int i14;
        int i15;
        p.h(w1Var, "bindModel");
        p.h(aVar, "onClickStartIcon");
        p.h(lVar, "onClickGift");
        p.h(aVar2, "onClickHelp");
        i h10 = iVar.h(21587837);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(w1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(aVar2) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && h10.j()) {
            h10.I();
        } else {
            h10.x(-483455358);
            f.a aVar5 = f.f59359u;
            y.f fVar = y.f.f60773a;
            f.l g10 = fVar.g();
            a.C0986a c0986a = x0.a.f59327a;
            c0 a10 = y.p.a(g10, c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a11 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a12 = w.a(aVar5);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
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
            h10.x(649228410);
            if (w1Var.f()) {
                String d10 = w1Var.d();
                x0.f v10 = d1.v(aVar5, g.l(56), g.l(70));
                h10.x(1157296644);
                boolean P = h10.P(aVar);
                Object y10 = h10.y();
                if (P || y10 == i.f39065a.a()) {
                    y10 = new a(aVar);
                    h10.q(y10);
                }
                h10.O();
                aVar3 = aVar5;
                i12 = -483455358;
                l9.d.c(d10, v.l.e(v10, false, null, null, (io.a) y10, 7, null), null, 0, null, null, h10, 0, 60);
                g1.a(d1.o(aVar3, g.l(24)), h10, 6);
            } else {
                aVar3 = aVar5;
                i12 = -483455358;
            }
            h10.O();
            h10.x(649228823);
            if (w1Var.e()) {
                a.b g11 = c0986a.g();
                x0.f y11 = d1.y(aVar3, g.l(56));
                float l10 = g.l(1);
                int i16 = t1.f34977r;
                float f11 = 8;
                x0.f c10 = v.e.c(v.g.g(y11, l10, v1.b.a(i16, h10, 0), e0.g.c(g.l(f11))), v1.b.a(t1.black50, h10, 0), e0.g.c(g.l(f11)));
                h10.x(i12);
                c0 a14 = y.p.a(fVar.g(), g11, h10, 48);
                h10.x(-1323940314);
                m2.d dVar2 = (m2.d) h10.G(o0.e());
                m2.q qVar2 = (m2.q) h10.G(o0.j());
                g2 g2Var2 = (g2) h10.G(o0.n());
                io.a<s1.a> a15 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a16 = w.a(c10);
                if (!(h10.k() instanceof l0.e)) {
                    h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a15);
                } else {
                    h10.o();
                }
                h10.E();
                i a17 = h2.a(h10);
                h2.b(a17, a14, c0787a.d());
                h2.b(a17, dVar2, c0787a.b());
                h2.b(a17, qVar2, c0787a.c());
                h2.b(a17, g2Var2, c0787a.f());
                h10.c();
                a16.s0(n1.a(n1.b(h10)), h10, 0);
                h10.x(2058660585);
                h10.x(-1163856341);
                v1 a18 = w1Var.a();
                h10.x(-22196533);
                if (a18 == null) {
                    i13 = 10;
                    f10 = f11;
                    i14 = i16;
                    i15 = 0;
                } else {
                    g1.a(d1.o(aVar3, g.l(10)), h10, 6);
                    pb.a.a(a18, new C0709b(lVar, a18), h10, v1.f55594e);
                    i13 = 10;
                    f10 = f11;
                    i14 = i16;
                    i15 = 0;
                    h0.w.a(r0.m(aVar3, g.l(f11), g.l(6), g.l(f11), 0.0f, 8, null), v1.b.a(t1.f34970k, h10, 0), 0.0f, 0.0f, h10, 0, 12);
                    v vVar = v.f59242a;
                }
                h10.O();
                v1 b10 = w1Var.b();
                h10.x(-22195930);
                if (b10 != null) {
                    g1.a(d1.o(aVar3, g.l(i13)), h10, 6);
                    pb.a.a(b10, new c(lVar, b10), h10, v1.f55594e);
                    h0.w.a(r0.m(aVar3, g.l(f10), g.l(6), g.l(f10), 0.0f, 8, null), v1.b.a(t1.f34970k, h10, i15), 0.0f, 0.0f, h10, 0, 12);
                    v vVar2 = v.f59242a;
                }
                h10.O();
                float f12 = i13;
                x0.f m10 = r0.m(aVar3, 0.0f, g.l(f10), 0.0f, g.l(f12), 5, null);
                h10.x(1157296644);
                boolean P2 = h10.P(aVar2);
                Object y12 = h10.y();
                if (P2 || y12 == i.f39065a.a()) {
                    y12 = new d(aVar2);
                    h10.q(y12);
                }
                h10.O();
                x0.f e10 = v.l.e(m10, false, null, null, (io.a) y12, 7, null);
                h10.x(693286680);
                c0 a19 = y0.a(fVar.f(), c0986a.l(), h10, i15);
                h10.x(-1323940314);
                m2.d dVar3 = (m2.d) h10.G(o0.e());
                m2.q qVar3 = (m2.q) h10.G(o0.j());
                g2 g2Var3 = (g2) h10.G(o0.n());
                io.a<s1.a> a20 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a21 = w.a(e10);
                if (!(h10.k() instanceof l0.e)) {
                    h.c();
                }
                h10.D();
                if (h10.f()) {
                    h10.r(a20);
                } else {
                    h10.o();
                }
                h10.E();
                i a22 = h2.a(h10);
                h2.b(a22, a19, c0787a.d());
                h2.b(a22, dVar3, c0787a.b());
                h2.b(a22, qVar3, c0787a.c());
                h2.b(a22, g2Var3, c0787a.f());
                h10.c();
                a21.s0(n1.a(n1.b(h10)), h10, Integer.valueOf(i15));
                h10.x(2058660585);
                h10.x(-678309503);
                a1 a1Var = a1.f60672a;
                x0.f v11 = d1.v(aVar3, g.l(f12), g.l(f12));
                aVar4 = aVar3;
                v.w.a(v1.e.c(hb.v1.f34989x, h10, i15), null, v11, null, null, 0.0f, null, h10, 440, 120);
                h0.w1.c(v1.f.b(b2.text_emomo_quest_dressup_status_detail, h10, 0), r0.m(aVar4, g.l(2), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(i14, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().u(), h10, 48, 0, 32760);
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
                h10.O();
                h10.O();
                h10.s();
                h10.O();
                h10.O();
            } else {
                aVar4 = aVar3;
            }
            h10.O();
            g1.a(d1.o(aVar4, g.l(12)), h10, 6);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new e(w1Var, aVar, lVar, aVar2, i10));
    }
}
