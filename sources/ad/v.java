package ad;

import l0.i;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes2.dex */
public final class v {

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.BroadCastResultCashBonusViewKt$BroadCastResultCashBonusView$1$1", f = "BroadCastResultCashBonusView.kt", l = {126, 127}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1378w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.s0<Float> f1379x;

        /* renamed from: ad.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0033a extends jo.q implements io.p<Float, Float, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<Float> f1380w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0033a(l0.s0<Float> s0Var) {
                super(2);
                this.f1380w = s0Var;
            }

            public final void a(float f10, float f11) {
                v.c(this.f1380w, f10);
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.s0<Float> s0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1379x = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f1379x, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1378w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f1378w = 1;
                if (uo.b1.a(300L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            u.b1 i11 = u.j.i(300, 0, u.b0.c(), 2, null);
            C0033a c0033a = new C0033a(this.f1379x);
            this.f1378w = 2;
            if (u.x0.e(0.0f, 1.0f, 0.0f, i11, c0033a, this, 4, null) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1381w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(0);
            this.f1381w = aVar;
        }

        public final void a() {
            this.f1381w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s f1382w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f1383x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f1384y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f1382w = sVar;
            this.f1383x = aVar;
            this.f1384y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            v.a(this.f1382w, this.f1383x, iVar, this.f1384y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(s sVar, io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(sVar, "bindModel");
        jo.p.h(aVar, "onClickCloseButton");
        l0.i h10 = iVar.h(-64190731);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(sVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            h10.x(-492369756);
            Object y10 = h10.y();
            i.a aVar2 = l0.i.f39065a;
            if (y10 == aVar2.a()) {
                y10 = l0.z1.e(Float.valueOf(0.0f), null, 2, null);
                h10.q(y10);
            }
            h10.O();
            l0.s0 s0Var = (l0.s0) y10;
            wn.v vVar = wn.v.f59242a;
            h10.x(1157296644);
            boolean P = h10.P(s0Var);
            Object y11 = h10.y();
            if (P || y11 == aVar2.a()) {
                y11 = new a(s0Var, null);
                h10.q(y11);
            }
            h10.O();
            l0.c0.c(vVar, (io.p) y11, h10, 64);
            f.a aVar3 = x0.f.f59359u;
            x0.f j10 = y.d1.j(y.d1.n(aVar3, 0.0f, 1, null), 0.0f, 1, null);
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(j10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a10);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a12 = l0.h2.a(h10);
            l0.h2.b(a12, h11, c0787a.d());
            l0.h2.b(a12, dVar, c0787a.b());
            l0.h2.b(a12, qVar, c0787a.c());
            l0.h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar = y.l.f60836a;
            x0.f a13 = z0.a.a(lVar.a(y.d1.C(y.d1.y(aVar3, m2.g.l(280)), null, false, 3, null), c0986a.e()), b(s0Var));
            h10.x(733328855);
            q1.c0 h12 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar2 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var2 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a14 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a15 = q1.w.a(a13);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a14);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a16 = l0.h2.a(h10);
            l0.h2.b(a16, h12, c0787a.d());
            l0.h2.b(a16, dVar2, c0787a.b());
            l0.h2.b(a16, qVar2, c0787a.c());
            l0.h2.b(a16, g2Var2, c0787a.f());
            h10.c();
            a15.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            x0.f C = y.d1.C(y.d1.n(aVar3, 0.0f, 1, null), null, false, 3, null);
            h10.x(-483455358);
            q1.c0 a17 = y.p.a(y.f.f60773a.g(), c0986a.k(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar3 = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar3 = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            androidx.compose.ui.platform.g2 g2Var3 = (androidx.compose.ui.platform.g2) h10.G(androidx.compose.ui.platform.o0.n());
            io.a<s1.a> a18 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a19 = q1.w.a(C);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a18);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a20 = l0.h2.a(h10);
            l0.h2.b(a20, a17, c0787a.d());
            l0.h2.b(a20, dVar3, c0787a.b());
            l0.h2.b(a20, qVar3, c0787a.c());
            l0.h2.b(a20, g2Var3, c0787a.f());
            h10.c();
            a19.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            y.r rVar = y.r.f60913a;
            t.a(sVar, h10, i11 & 14);
            String b10 = v1.f.b(nc.i.text_earned_cash_streaming_annotation, h10, 0);
            o9.b bVar = o9.b.f44283a;
            y1.d0 p10 = bVar.b().p();
            int i12 = nc.b.F;
            h0.w1.c(b10, z0.a.a(y.r0.m(aVar3, 0.0f, m2.g.l(15), 0.0f, 0.0f, 13, null), 0.7f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, p10.C(new y1.d0(v1.b.a(i12, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 48, 0, 32764);
            float f10 = 5;
            h0.w1.c(v1.f.b(nc.i.text_earned_cash_earned_limit_annotation, h10, 0), z0.a.a(y.r0.m(aVar3, 0.0f, m2.g.l(f10), 0.0f, 0.0f, 13, null), 0.7f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p().C(new y1.d0(v1.b.a(i12, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 48, 0, 32764);
            h10.x(-965966671);
            if (sVar.q()) {
                h0.w1.c(v1.f.b(nc.i.text_earned_cash_paid_coin_annotation, h10, 0), z0.a.a(y.r0.m(aVar3, 0.0f, m2.g.l(f10), 0.0f, 0.0f, 13, null), 0.7f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p().C(new y1.d0(v1.b.a(i12, h10, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), h10, 48, 0, 32764);
            }
            h10.O();
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            v.w.a(v1.e.c(nc.d.broad_cast_result_cash_bonus_title_coin, h10, 0), null, lVar.a(y.r0.i(y.d1.o(y.d1.y(aVar3, m2.g.l(170)), m2.g.l(87)), m2.g.l(3)), c0986a.m()), null, null, 0.0f, null, h10, 56, 120);
            f1.d c10 = v1.e.c(nc.d.button_close, h10, 0);
            float f11 = 28;
            x0.f a21 = lVar.a(y.d1.o(y.d1.y(y.r0.m(aVar3, 0.0f, m2.g.l(22), m2.g.l(8), 0.0f, 9, null), m2.g.l(f11)), m2.g.l(f11)), c0986a.n());
            h10.x(1157296644);
            boolean P2 = h10.P(aVar);
            Object y12 = h10.y();
            if (P2 || y12 == aVar2.a()) {
                y12 = new b(aVar);
                h10.q(y12);
            }
            h10.O();
            v.w.a(c10, null, v.l.e(a21, false, null, null, (io.a) y12, 7, null), null, null, 0.0f, null, h10, 56, 120);
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
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(sVar, aVar, i10));
    }

    public static final float b(l0.s0<Float> s0Var) {
        return s0Var.getValue().floatValue();
    }

    public static final void c(l0.s0<Float> s0Var, float f10) {
        s0Var.setValue(Float.valueOf(f10));
    }
}
