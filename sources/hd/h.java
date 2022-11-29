package hd;

import ad.v0;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.f1;
import com.google.android.exoplayer2.C;
import d2.u;
import d2.x;
import h0.w1;
import j2.e;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
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
import y.r;
import y.r0;
import y1.a;
import y1.d0;

/* loaded from: classes2.dex */
public final class h {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35388w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(0);
            this.f35388w = aVar;
        }

        public final void a() {
            this.f35388w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ id.c f35389w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35390x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f35391y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(id.c cVar, io.a<v> aVar, int i10) {
            super(2);
            this.f35389w = cVar;
            this.f35390x = aVar;
            this.f35391y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.a(this.f35389w, this.f35390x, iVar, this.f35391y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(id.c cVar, io.a<v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(cVar, "bindModel");
        jo.p.h(aVar, "onClickEditBankButton");
        l0.i h10 = iVar.h(1950373649);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            h10.x(-483455358);
            f.a aVar2 = x0.f.f59359u;
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
            io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(aVar2);
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
            float f10 = 16;
            float f11 = 4;
            x0.f n10 = d1.n(v.e.c(r0.k(aVar2, m2.g.l(f10), 0.0f, 2, null), v1.b.a(cVar.b(), h10, 0), e0.g.c(m2.g.l(f11))), 0.0f, 1, null);
            a.b g11 = c0986a.g();
            h10.x(-483455358);
            c0 a14 = y.p.a(fVar.g(), g11, h10, 48);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a15 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a16 = w.a(n10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a15);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a17 = h2.a(h10);
            h2.b(a17, a14, c0787a.d());
            h2.b(a17, dVar2, c0787a.b());
            h2.b(a17, qVar2, c0787a.c());
            h2.b(a17, g2Var2, c0787a.f());
            h10.c();
            a16.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-1163856341);
            String b10 = v1.f.b(nc.i.text_monthly_rank_member_passbook_not_payment_reward_title, h10, 0);
            long d10 = s.d(14);
            x.a aVar3 = x.f29149x;
            x h11 = aVar3.h();
            int i12 = nc.b.f41790a;
            w1.c(b10, r0.m(aVar2, 0.0f, m2.g.l(f10), 0.0f, 0.0f, 13, null), v1.b.a(i12, h10, 0), d10, null, h11, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199728, 0, 65488);
            w1.c(v1.f.c(nc.i.text_monthly_rank_member_passbook_amount_of_unreceived_reward, new Object[]{cVar.d()}, h10, 64), r0.m(aVar2, 0.0f, m2.g.l(f11), 0.0f, 0.0f, 13, null), v1.b.a(i12, h10, 0), s.d(20), null, aVar3.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199728, 0, 65488);
            w1.c(v1.f.c(nc.i.text_monthly_rank_member_passbook_reward_payment_date, new Object[]{cVar.c()}, h10, 64), r0.m(aVar2, 0.0f, m2.g.l(f11), 0.0f, 0.0f, 13, null), v1.b.a(i12, h10, 0), s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3120, 0, 65520);
            h10.x(-773007682);
            a.C1037a c1037a = new a.C1037a(0, 1, null);
            if (cVar.e()) {
                h10.x(850800685);
                String b11 = v1.f.b(nc.i.text_monthly_rank_member_passbook_transfer_failure_reward_message_highlight1, h10, 0);
                String b12 = v1.f.b(nc.i.text_monthly_rank_member_passbook_transfer_failure_reward_message_highlight2, h10, 0);
                String b13 = v1.f.b(nc.i.text_monthly_rank_member_passbook_transfer_failure_reward_message, h10, 0);
                y1.v vVar = new y1.v(0L, 0L, o9.b.f44283a.b().e().m(), (u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16379, (jo.h) null);
                c1037a.c(b13);
                c1037a.b(vVar, so.o.U(b13, b11, 0, false, 6, null), so.o.U(b13, b11, 0, false, 6, null) + b11.length());
                c1037a.b(vVar, so.o.U(b13, b12, 0, false, 6, null), so.o.U(b13, b12, 0, false, 6, null) + b12.length());
                h10.O();
            } else {
                h10.x(850801599);
                c1037a.c(v1.f.b(cVar.a() == v0.COMPLETE_EDIT ? nc.i.text_monthly_rank_member_passbook_please_wait_reward_message : nc.i.text_monthly_rank_member_passbook_not_receive_reward_message, h10, 0));
                h10.O();
            }
            y1.a h12 = c1037a.h();
            h10.O();
            o9.b bVar = o9.b.f44283a;
            d0 d11 = bVar.b().d();
            long a18 = v1.b.a(i12, h10, 0);
            x0.f l10 = r0.l(aVar2, m2.g.l(f10), m2.g.l(12), m2.g.l(f10), m2.g.l(f10));
            e.a aVar4 = j2.e.f37075b;
            w1.b(h12, l10, a18, 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, null, d11, h10, 0, 0, 65016);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            if (cVar.e()) {
                h10.x(-1850238297);
                a.C1037a c1037a2 = new a.C1037a(0, 1, null);
                String b14 = v1.f.b(nc.i.text_monthly_rank_member_passbook_transfer_failure_reward_message_highlight1, h10, 0);
                String b15 = v1.f.b(nc.i.text_monthly_rank_member_passbook_transfer_failure_reward_message_highlight2, h10, 0);
                String b16 = v1.f.b(nc.i.text_monthly_rank_member_passbook_transfer_failure_annotation, h10, 0);
                y1.v vVar2 = new y1.v(0L, 0L, bVar.b().e().m(), (u) null, (d2.v) null, (d2.l) null, (String) null, 0L, (j2.a) null, (j2.i) null, (f2.f) null, 0L, (j2.f) null, (f1) null, 16379, (jo.h) null);
                c1037a2.c(b16);
                c1037a2.b(vVar2, so.o.U(b16, b14, 0, false, 6, null), so.o.U(b16, b14, 0, false, 6, null) + b14.length());
                c1037a2.b(vVar2, so.o.U(b16, b15, 0, false, 6, null), so.o.U(b16, b15, 0, false, 6, null) + b15.length());
                y1.a h13 = c1037a2.h();
                h10.O();
                float f12 = 8;
                w1.b(h13, d1.n(r0.m(aVar2, m2.g.l(f10), m2.g.l(f12), m2.g.l(f10), 0.0f, 8, null), 0.0f, 1, null), v1.b.a(nc.b.f41798r, h10, 0), 0L, null, null, null, 0L, null, j2.e.g(aVar4.a()), 0L, 0, false, 0, null, null, bVar.b().m(), h10, 0, 0, 65016);
                e0.f c10 = e0.g.c(m2.g.l(32));
                v.h a19 = v.i.a(m2.g.l(1), v1.b.a(nc.b.f41804x, h10, 0));
                x0.f b17 = rVar.b(d1.o(d1.y(r0.m(aVar2, 0.0f, m2.g.l(f10), 0.0f, 0.0f, 13, null), m2.g.l(280)), m2.g.l(48)), c0986a.g());
                h10.x(1157296644);
                boolean P = h10.P(aVar);
                Object y10 = h10.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new a(aVar);
                    h10.q(y10);
                }
                h10.O();
                h0.f.c((io.a) y10, b17, false, null, null, c10, a19, null, null, c.f35356a.a(), h10, C.ENCODING_PCM_32BIT, 412);
                g1.a(d1.o(aVar2, m2.g.l(f12)), h10, 6);
            }
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
        l11.a(new b(cVar, aVar, i10));
    }
}
