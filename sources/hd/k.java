package hd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.c0;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import d2.x;
import h0.w1;
import j2.e;
import jo.q;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import m2.s;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.g1;
import y.r;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes2.dex */
public final class k {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35414w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f35414w = aVar;
        }

        public final void a() {
            this.f35414w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ id.e f35415w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35416x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35417y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35418z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(id.e eVar, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3, int i10) {
            super(2);
            this.f35415w = eVar;
            this.f35416x = aVar;
            this.f35417y = aVar2;
            this.f35418z = aVar3;
            this.A = i10;
        }

        public final void a(l0.i iVar, int i10) {
            k.a(this.f35415w, this.f35416x, this.f35417y, this.f35418z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(id.e eVar, io.a<v> aVar, io.a<v> aVar2, io.a<v> aVar3, l0.i iVar, int i10) {
        ContractSummaryPaymentType contractSummaryPaymentType;
        jo.p.h(eVar, "rewardBindModel");
        jo.p.h(aVar, "onClickBroadcastFeeHelpButton");
        jo.p.h(aVar2, "onClickGiftHelpButton");
        jo.p.h(aVar3, "onClickTaxHelpButton");
        l0.i h10 = iVar.h(460495029);
        f.a aVar4 = x0.f.f59359u;
        x0.f d10 = v.e.d(d1.n(aVar4, 0.0f, 1, null), c0.f18634b.f(), null, 2, null);
        a.C0986a c0986a = x0.a.f59327a;
        a.b g10 = c0986a.g();
        h10.x(-483455358);
        y.f fVar = y.f.f60773a;
        q1.c0 a10 = y.p.a(fVar.g(), g10, h10, 48);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(d10);
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
        l0.i a13 = h2.a(h10);
        h2.b(a13, a10, c0787a.d());
        h2.b(a13, dVar, c0787a.b());
        h2.b(a13, qVar, c0787a.c());
        h2.b(a13, g2Var, c0787a.f());
        h10.c();
        a12.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        r rVar = r.f60913a;
        x0.f m10 = r0.m(aVar4, 0.0f, m2.g.l(32), 0.0f, 0.0f, 13, null);
        String g11 = eVar.g();
        int i11 = nc.b.f41802v;
        long a14 = v1.b.a(i11, h10, 0);
        long d11 = s.d(16);
        x.a aVar5 = x.f29149x;
        w1.c(g11, m10, a14, d11, null, aVar5.j(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199728, 0, 65488);
        String c10 = v1.f.c(nc.i.text_monthly_rank_member_passbook_payment_start, new Object[]{eVar.l()}, h10, 64);
        long a15 = v1.b.a(i11, h10, 0);
        long d12 = s.d(12);
        float f10 = 8;
        float f11 = 16;
        x0.f m11 = r0.m(d1.n(aVar4, 0.0f, 1, null), 0.0f, m2.g.l(f10), 0.0f, m2.g.l(f11), 5, null);
        e.a aVar6 = j2.e.f37075b;
        w1.c(c10, m11, a15, d12, null, null, null, 0L, null, j2.e.g(aVar6.a()), 0L, 0, false, 0, null, null, h10, 3120, 0, 65008);
        x0.f m12 = r0.m(aVar4, m2.g.l(f11), 0.0f, 0.0f, 0.0f, 14, null);
        int i12 = nc.b.f41797o;
        h0.w.a(m12, v1.b.a(i12, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        hd.b.a(v1.f.b(nc.i.text_earned_cash_streaming_bonus, h10, 0), eVar.a(), eVar.n(), v1.f.b(nc.i.text_cash_bonus_history_bonus_per_quarter_hour, h10, 0), eVar.b(), v1.f.b(nc.i.text_cash_bonus_history_month_limit, h10, 0), eVar.c(), aVar, h10, (i10 << 18) & 29360128);
        h0.w.a(r0.m(aVar4, m2.g.l(f11), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(i12, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        h10.x(530971564);
        if (eVar.p() && eVar.m() != null) {
            String b10 = v1.f.b(nc.i.text_earned_cash_paid_coin_gift_bonus, h10, 0);
            String i13 = eVar.i();
            if (i13 == null) {
                i13 = "";
            }
            int intValue = eVar.m().intValue();
            String b11 = v1.f.b(nc.i.text_cash_bonus_history_cash_percentage, h10, 0);
            String e10 = eVar.e();
            if (e10 == null) {
                e10 = "";
            }
            int i14 = nc.i.text_cash_bonus_history_contract_priod;
            Object[] objArr = new Object[1];
            String f12 = eVar.f();
            objArr[0] = f12 != null ? f12 : "";
            hd.b.a(b10, i13, intValue, b11, e10, v1.f.c(i14, objArr, h10, 64), "", aVar2, h10, ((i10 << 15) & 29360128) | 1572864);
            h0.w.a(r0.m(aVar4, m2.g.l(f11), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(i12, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        }
        h10.O();
        x0.f m13 = r0.m(aVar4, m2.g.l(f11), m2.g.l(7), m2.g.l(f11), 0.0f, 8, null);
        a.c i15 = c0986a.i();
        h10.x(693286680);
        q1.c0 a16 = y0.a(fVar.f(), i15, h10, 48);
        h10.x(-1323940314);
        m2.d dVar2 = (m2.d) h10.G(o0.e());
        m2.q qVar2 = (m2.q) h10.G(o0.j());
        g2 g2Var2 = (g2) h10.G(o0.n());
        io.a<s1.a> a17 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a18 = w.a(m13);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a17);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a19 = h2.a(h10);
        h2.b(a19, a16, c0787a.d());
        h2.b(a19, dVar2, c0787a.b());
        h2.b(a19, qVar2, c0787a.c());
        h2.b(a19, g2Var2, c0787a.f());
        h10.c();
        a18.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-678309503);
        a1 a1Var = a1.f60672a;
        x0.f d13 = a1Var.d(d1.G(d1.C(aVar4, null, false, 3, null), null, false, 3, null), c0986a.i());
        h10.x(-492369756);
        Object y10 = h10.y();
        i.a aVar7 = l0.i.f39065a;
        if (y10 == aVar7.a()) {
            y10 = x.l.a();
            h10.q(y10);
        }
        h10.O();
        x.m mVar = (x.m) y10;
        h10.x(1157296644);
        boolean P = h10.P(aVar3);
        Object y11 = h10.y();
        if (P || y11 == aVar7.a()) {
            y11 = new a(aVar3);
            h10.q(y11);
        }
        h10.O();
        x0.f c11 = v.l.c(d13, mVar, null, false, null, null, (io.a) y11, 28, null);
        h10.x(693286680);
        q1.c0 a20 = y0.a(fVar.f(), c0986a.l(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar3 = (m2.d) h10.G(o0.e());
        m2.q qVar3 = (m2.q) h10.G(o0.j());
        g2 g2Var3 = (g2) h10.G(o0.n());
        io.a<s1.a> a21 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a22 = w.a(c11);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a21);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a23 = h2.a(h10);
        h2.b(a23, a20, c0787a.d());
        h2.b(a23, dVar3, c0787a.b());
        h2.b(a23, qVar3, c0787a.c());
        h2.b(a23, g2Var3, c0787a.f());
        h10.c();
        a22.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-678309503);
        String b12 = v1.f.b(nc.i.text_monthly_rank_member_passbook_tax, h10, 0);
        int i16 = nc.b.f41800t;
        w1.c(b12, null, v1.b.a(i16, h10, 0), s.d(12), null, aVar5.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
        g1.a(d1.y(aVar4, m2.g.l(4)), h10, 6);
        v.w.a(v1.e.c(nc.d.f41812o, h10, 0), null, a1Var.d(d1.u(aVar4, m2.g.l(14)), c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        g1.a(z0.c(a1Var, aVar4, 1.0f, false, 2, null), h10, 0);
        w1.c(eVar.o(), null, v1.b.a(i16, h10, 0), s.d(14), null, aVar5.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        h0.w.a(r0.m(aVar4, m2.g.l(f11), m2.g.l(10), 0.0f, 0.0f, 12, null), v1.b.a(i12, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        float f13 = 17;
        g1.a(d1.o(aVar4, m2.g.l(f13)), h10, 6);
        x0.f k10 = r0.k(aVar4, m2.g.l(f11), 0.0f, 2, null);
        a.c i17 = c0986a.i();
        h10.x(693286680);
        q1.c0 a24 = y0.a(fVar.f(), i17, h10, 48);
        h10.x(-1323940314);
        m2.d dVar4 = (m2.d) h10.G(o0.e());
        m2.q qVar4 = (m2.q) h10.G(o0.j());
        g2 g2Var4 = (g2) h10.G(o0.n());
        io.a<s1.a> a25 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a26 = w.a(k10);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a25);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a27 = h2.a(h10);
        h2.b(a27, a24, c0787a.d());
        h2.b(a27, dVar4, c0787a.b());
        h2.b(a27, qVar4, c0787a.c());
        h2.b(a27, g2Var4, c0787a.f());
        h10.c();
        a26.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-678309503);
        String k11 = eVar.k();
        long a28 = v1.b.a(i11, h10, 0);
        o9.b bVar = o9.b.f44283a;
        w1.c(k11, null, a28, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().e(), h10, 0, 0, 32762);
        a.b g12 = c0986a.g();
        h10.x(-483455358);
        q1.c0 a29 = y.p.a(fVar.g(), g12, h10, 48);
        h10.x(-1323940314);
        m2.d dVar5 = (m2.d) h10.G(o0.e());
        m2.q qVar5 = (m2.q) h10.G(o0.j());
        g2 g2Var5 = (g2) h10.G(o0.n());
        io.a<s1.a> a30 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a31 = w.a(aVar4);
        if (!(h10.k() instanceof l0.e)) {
            l0.h.c();
        }
        h10.D();
        if (h10.f()) {
            h10.r(a30);
        } else {
            h10.o();
        }
        h10.E();
        l0.i a32 = h2.a(h10);
        h2.b(a32, a29, c0787a.d());
        h2.b(a32, dVar5, c0787a.b());
        h2.b(a32, qVar5, c0787a.c());
        h2.b(a32, g2Var5, c0787a.f());
        h10.c();
        a31.s0(n1.a(n1.b(h10)), h10, 0);
        h10.x(2058660585);
        h10.x(-1163856341);
        ContractSummaryPaymentType h11 = eVar.h();
        ContractSummaryPaymentType contractSummaryPaymentType2 = ContractSummaryPaymentType.CASH;
        if (h11 == contractSummaryPaymentType2) {
            h10.x(-835006387);
            contractSummaryPaymentType = contractSummaryPaymentType2;
            w1.c(eVar.j(), d1.n(aVar4, 0.0f, 1, null), v1.b.a(nc.b.f41798r, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar6.b()), 0L, 0, false, 0, null, bVar.b().x(), h10, 48, 0, 32248);
            h10.O();
        } else {
            contractSummaryPaymentType = contractSummaryPaymentType2;
            h10.x(-835006007);
            String j10 = eVar.j();
            int i18 = nc.b.f41798r;
            w1.c(j10, d1.n(aVar4, 0.0f, 1, null), v1.b.a(i18, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar6.b()), 0L, 0, false, 0, null, bVar.b().h(), h10, 48, 0, 32248);
            x0.f b13 = rVar.b(aVar4, c0986a.j());
            h10.x(693286680);
            q1.c0 a33 = y0.a(fVar.f(), c0986a.l(), h10, 0);
            h10.x(-1323940314);
            m2.d dVar6 = (m2.d) h10.G(o0.e());
            m2.q qVar6 = (m2.q) h10.G(o0.j());
            g2 g2Var6 = (g2) h10.G(o0.n());
            io.a<s1.a> a34 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a35 = w.a(b13);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a34);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a36 = h2.a(h10);
            h2.b(a36, a33, c0787a.d());
            h2.b(a36, dVar6, c0787a.b());
            h2.b(a36, qVar6, c0787a.c());
            h2.b(a36, g2Var6, c0787a.f());
            h10.c();
            a35.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            v.w.a(v1.e.c(nc.d.B, h10, 0), null, a1Var.d(d1.u(aVar4, m2.g.l(15)), c0986a.i()), null, null, 0.0f, null, h10, 56, 120);
            g1.a(d1.y(aVar4, m2.g.l(2)), h10, 6);
            w1.c(eVar.d(), null, v1.b.a(i18, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().x(), h10, 0, 0, 32762);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            h10.O();
        }
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
        h10.x(530976463);
        if (eVar.q()) {
            g1.a(d1.o(aVar4, m2.g.l(f10)), h10, 6);
            w1.c(v1.f.b(nc.i.text_cash_bonus_history_pay_with_coins, h10, 0), d1.n(r0.k(aVar4, m2.g.l(f11), 0.0f, 2, null), 0.0f, 1, null), v1.b.a(nc.b.f41798r, h10, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
        }
        h10.O();
        g1.a(d1.o(aVar4, m2.g.l(f13)), h10, 6);
        h0.w.a(r0.m(aVar4, m2.g.l(f11), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(i12, h10, 0), 0.0f, 0.0f, h10, 6, 12);
        g1.a(d1.o(aVar4, m2.g.l(f11)), h10, 6);
        if (eVar.h() == contractSummaryPaymentType) {
            h10.x(530977280);
            w1.c(v1.f.b(nc.i.text_cash_bonus_history_annotation_cash_1, h10, 0), r0.k(d1.n(aVar4, 0.0f, 1, null), m2.g.l(f11), 0.0f, 2, null), bVar.a().u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
            float f14 = 35;
            w1.c(v1.f.b(nc.i.text_cash_bonus_history_annotation_cash_2, h10, 0), r0.k(d1.n(aVar4, 0.0f, 1, null), m2.g.l(f14), 0.0f, 2, null), bVar.a().u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
            w1.c(v1.f.b(nc.i.text_cash_bonus_history_annotation_cash_3, h10, 0), r0.k(d1.n(aVar4, 0.0f, 1, null), m2.g.l(f14), 0.0f, 2, null), bVar.a().u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
            h10.O();
        } else {
            h10.x(530978353);
            w1.c(v1.f.b(nc.i.text_cash_bonus_history_annotation_coin, h10, 0), r0.k(d1.n(aVar4, 0.0f, 1, null), m2.g.l(f11), 0.0f, 2, null), bVar.a().u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, bVar.b().p(), h10, 48, 0, 32760);
            h10.O();
        }
        g1.a(d1.o(aVar4, m2.g.l(f11)), h10, 6);
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(eVar, aVar, aVar2, aVar3, i10));
    }
}
