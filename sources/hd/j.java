package hd;

import ad.l2;
import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.c0;
import com.google.android.exoplayer2.C;
import d2.x;
import h0.w1;
import j2.e;
import jo.q;
import l0.h2;
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
import y.r;
import y.r0;
import y.y0;

/* loaded from: classes2.dex */
public final class j {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f35410w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l2 f35411x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f35412y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f35413z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, l2 l2Var, String str, String str2, String str3, String str4, String str5, boolean z11, int i10) {
            super(2);
            this.f35410w = z10;
            this.f35411x = l2Var;
            this.f35412y = str;
            this.f35413z = str2;
            this.A = str3;
            this.B = str4;
            this.C = str5;
            this.D = z11;
            this.E = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f35410w, this.f35411x, this.f35412y, this.f35413z, this.A, this.B, this.C, this.D, iVar, this.E | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(boolean z10, l2 l2Var, String str, String str2, String str3, String str4, String str5, boolean z11, l0.i iVar, int i10) {
        int i11;
        int i12;
        int i13;
        String c10;
        jo.p.h(l2Var, "rankingGrade");
        jo.p.h(str, "startDateText");
        jo.p.h(str2, "endDateText");
        jo.p.h(str3, "cashRate");
        jo.p.h(str4, "coinRate");
        jo.p.h(str5, "freeCoinChangeRate");
        l0.i h10 = iVar.h(1002763234);
        if ((i10 & 14) == 0) {
            i11 = (h10.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(l2Var) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(str) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(str2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(str3) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= h10.P(str4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((3670016 & i10) == 0) {
            i11 |= h10.P(str5) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= h10.a(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 23967451) == 4793490 && h10.j()) {
            h10.I();
        } else {
            f.a aVar = x0.f.f59359u;
            x0.f d10 = v.e.d(d1.n(aVar, 0.0f, 1, null), c0.f18634b.f(), null, 2, null);
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
            if (z10) {
                i12 = nc.i.text_monthly_rank_member_passbook_contract_period_title;
            } else {
                i12 = nc.i.text_coin_pass_book_target_priod_title;
            }
            String b10 = v1.f.b(i12, h10, 0);
            int i14 = nc.b.f41802v;
            w1.c(b10, r0.m(aVar, 0.0f, m2.g.l(20), 0.0f, 0.0f, 13, null), v1.b.a(i14, h10, 0), s.d(10), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 3120, 0, 65520);
            String c11 = v1.f.c(nc.i.text_monthly_rank_member_passbook_contract_period, new Object[]{str, str2}, h10, 64);
            long a14 = v1.b.a(i14, h10, 0);
            long d11 = s.d(14);
            x.a aVar2 = x.f29149x;
            float f10 = 2;
            w1.c(c11, r0.k(aVar, 0.0f, m2.g.l(f10), 1, null), a14, d11, null, aVar2.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199728, 0, 65488);
            a.c i15 = c0986a.i();
            x0.f m10 = r0.m(aVar, 0.0f, m2.g.l(12), 0.0f, 0.0f, 13, null);
            h10.x(693286680);
            q1.c0 a15 = y0.a(fVar.f(), i15, h10, 48);
            h10.x(-1323940314);
            m2.d dVar2 = (m2.d) h10.G(o0.e());
            m2.q qVar2 = (m2.q) h10.G(o0.j());
            g2 g2Var2 = (g2) h10.G(o0.n());
            io.a<s1.a> a16 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, v> a17 = w.a(m10);
            if (!(h10.k() instanceof l0.e)) {
                l0.h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a16);
            } else {
                h10.o();
            }
            h10.E();
            l0.i a18 = h2.a(h10);
            h2.b(a18, a15, c0787a.d());
            h2.b(a18, dVar2, c0787a.b());
            h2.b(a18, qVar2, c0787a.c());
            h2.b(a18, g2Var2, c0787a.f());
            h10.c();
            a17.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-678309503);
            a1 a1Var = a1.f60672a;
            Integer h11 = l2Var.h();
            h10.x(1878186920);
            if (h11 == null) {
                i13 = 0;
            } else {
                i13 = 0;
                v.w.a(v1.e.c(h11.intValue(), h10, 0), null, r0.m(d1.o(d1.y(aVar, m2.g.l(30)), m2.g.l(26)), 0.0f, 0.0f, m2.g.l(4), 0.0f, 11, null), null, null, 0.0f, null, h10, 440, 120);
                v vVar = v.f59242a;
            }
            h10.O();
            int i16 = nc.i.text_contract_your_rank;
            Object[] objArr = new Object[1];
            objArr[i13] = v1.f.b(l2Var.w(), h10, i13);
            w1.c(v1.f.c(i16, objArr, h10, 64), null, v1.b.a(l2Var.c(), h10, i13), s.d(26), null, aVar2.j(), null, 0L, null, null, 0L, 0, false, 0, null, null, h10, 199680, 0, 65490);
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
            if (z10) {
                h10.x(1283613295);
                int i17 = nc.i.text_monthly_rank_member_passbook_receive_cash_message;
                Object[] objArr2 = new Object[1];
                objArr2[i13] = str3;
                c10 = v1.f.c(i17, objArr2, h10, 64);
                h10.O();
            } else {
                h10.x(1283613427);
                if (z11) {
                    h10.x(1283613461);
                    int i18 = nc.i.text_monthly_rank_member_coin_passbook_receive_coin_and_check_cash_bonus_history_message;
                    Object[] objArr3 = new Object[1];
                    objArr3[i13] = str3;
                    c10 = v1.f.c(i18, objArr3, h10, 64);
                    h10.O();
                } else {
                    h10.x(1283613635);
                    int i19 = nc.i.text_monthly_rank_member_coin_passbook_receive_coin_message_not_contract;
                    Object[] objArr4 = new Object[1];
                    objArr4[i13] = str4;
                    c10 = v1.f.c(i19, objArr4, h10, 64);
                    h10.O();
                }
                h10.O();
            }
            String str6 = c10;
            long a19 = v1.b.a(i14, h10, i13);
            long d12 = s.d(11);
            float f11 = 10;
            x0.f j10 = r0.j(aVar, m2.g.l(f11), m2.g.l(f10));
            x h12 = aVar2.h();
            e.a aVar3 = j2.e.f37075b;
            w1.c(str6, j10, a19, d12, null, h12, null, 0L, null, j2.e.g(aVar3.a()), 0L, 0, false, 0, null, null, h10, 199680, 0, 64976);
            if (!z10) {
                int i20 = nc.i.text_monthly_rank_member_coin_passbook_receive_coin_sub_message;
                Object[] objArr5 = new Object[1];
                objArr5[i13] = str5;
                w1.c(v1.f.c(i20, objArr5, h10, 64), r0.j(aVar, m2.g.l(f11), m2.g.l(f10)), v1.b.a(nc.b.f41801u, h10, i13), s.d(10), null, null, null, 0L, null, j2.e.g(aVar3.a()), 0L, 0, false, 0, null, null, h10, 3072, 0, 65008);
            }
            h10.O();
            h10.O();
            h10.s();
            h10.O();
            h10.O();
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(z10, l2Var, str, str2, str3, str4, str5, z11, i10));
    }
}
