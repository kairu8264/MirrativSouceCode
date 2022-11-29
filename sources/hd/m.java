package hd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import h0.w1;
import io.r;
import java.util.List;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import m2.s;
import q1.w;
import s1.a;
import wn.v;
import y.d1;
import y.r0;
import z.c0;
import z.g0;
import z.h0;

/* loaded from: classes2.dex */
public final class m {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.l<c0, v> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ id.a C;
        public final /* synthetic */ io.a<v> D;
        public final /* synthetic */ io.a<v> E;
        public final /* synthetic */ io.a<v> F;
        public final /* synthetic */ io.a<v> G;
        public final /* synthetic */ ha.a H;
        public final /* synthetic */ io.a<v> I;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f35427w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<gd.j> f35428x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f35429y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35430z;

        /* renamed from: hd.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0450a extends q implements io.q<z.h, l0.i, Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f35431w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f35432x;

            /* renamed from: hd.m$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0451a extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f35433w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0451a(io.a<v> aVar) {
                    super(0);
                    this.f35433w = aVar;
                }

                public final void a() {
                    this.f35433w.invoke();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0450a(io.a<v> aVar, int i10) {
                super(3);
                this.f35431w = aVar;
                this.f35432x = i10;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$stickyHeader");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                String b10 = v1.f.b(nc.i.text_menu_cash_bonus_history_title, iVar, 0);
                io.a<v> aVar = this.f35431w;
                iVar.x(1157296644);
                boolean P = iVar.P(aVar);
                Object y10 = iVar.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = new C0451a(aVar);
                    iVar.q(y10);
                }
                iVar.O();
                l9.f.a(b10, false, (io.a) y10, null, iVar, 0, 10);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.q<z.h, l0.i, Integer, v> {
            public final /* synthetic */ io.a<v> A;
            public final /* synthetic */ int B;
            public final /* synthetic */ List<gd.j> C;
            public final /* synthetic */ ha.a D;
            public final /* synthetic */ io.a<v> E;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ id.a f35434w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f35435x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f35436y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f35437z;

            /* renamed from: hd.m$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0452a extends q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f35438w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0452a(io.a<v> aVar) {
                    super(0);
                    this.f35438w = aVar;
                }

                public final void a() {
                    this.f35438w.invoke();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(id.a aVar, io.a<v> aVar2, io.a<v> aVar3, io.a<v> aVar4, io.a<v> aVar5, int i10, List<gd.j> list, ha.a aVar6, io.a<v> aVar7) {
                super(3);
                this.f35434w = aVar;
                this.f35435x = aVar2;
                this.f35436y = aVar3;
                this.f35437z = aVar4;
                this.A = aVar5;
                this.B = i10;
                this.C = list;
                this.D = aVar6;
                this.E = aVar7;
            }

            public final void a(z.h hVar, l0.i iVar, int i10) {
                jo.p.h(hVar, "$this$item");
                if ((i10 & 81) == 16 && iVar.j()) {
                    iVar.I();
                    return;
                }
                id.a aVar = this.f35434w;
                io.a<v> aVar2 = this.f35435x;
                io.a<v> aVar3 = this.f35436y;
                io.a<v> aVar4 = this.f35437z;
                io.a<v> aVar5 = this.A;
                int i11 = this.B;
                g.a(aVar, aVar2, aVar3, aVar4, aVar5, iVar, ((i11 >> 6) & 112) | 8 | ((i11 >> 6) & 896) | ((i11 >> 6) & 7168) | ((i11 >> 12) & 57344));
                iVar.x(-1744874568);
                if (this.f35434w != null) {
                    float f10 = 16;
                    x0.f l10 = r0.l(v.e.d(d1.n(x0.f.f59359u, 0.0f, 1, null), v1.b.a(nc.b.I, iVar, 0), null, 2, null), m2.g.l(f10), m2.g.l(24), m2.g.l(f10), m2.g.l(8));
                    iVar.x(733328855);
                    q1.c0 h10 = y.j.h(x0.a.f59327a.o(), false, iVar, 0);
                    iVar.x(-1323940314);
                    m2.d dVar = (m2.d) iVar.G(o0.e());
                    m2.q qVar = (m2.q) iVar.G(o0.j());
                    g2 g2Var = (g2) iVar.G(o0.n());
                    a.C0787a c0787a = s1.a.f51802o;
                    io.a<s1.a> a10 = c0787a.a();
                    io.q<n1<s1.a>, l0.i, Integer, v> a11 = w.a(l10);
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
                    l0.i a12 = h2.a(iVar);
                    h2.b(a12, h10, c0787a.d());
                    h2.b(a12, dVar, c0787a.b());
                    h2.b(a12, qVar, c0787a.c());
                    h2.b(a12, g2Var, c0787a.f());
                    iVar.c();
                    a11.s0(n1.a(n1.b(iVar)), iVar, 0);
                    iVar.x(2058660585);
                    iVar.x(-2137368960);
                    y.l lVar = y.l.f60836a;
                    w1.c(v1.f.b(nc.i.text_contract_reward_history_header_title, iVar, 0), null, v1.b.a(nc.b.C, iVar, 0), s.d(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 3072, 0, 65522);
                    iVar.O();
                    iVar.O();
                    iVar.s();
                    iVar.O();
                    iVar.O();
                }
                iVar.O();
                if (this.C.isEmpty()) {
                    ha.a aVar6 = this.D;
                    String b10 = v1.f.b(nc.i.text_no_contract_passbook_history, iVar, 0);
                    io.a<v> aVar7 = this.E;
                    iVar.x(1157296644);
                    boolean P = iVar.P(aVar7);
                    Object y10 = iVar.y();
                    if (P || y10 == l0.i.f39065a.a()) {
                        y10 = new C0452a(aVar7);
                        iVar.q(y10);
                    }
                    iVar.O();
                    l9.e.b(aVar6, b10, (io.a) y10, iVar, ha.a.f34693a | (this.B & 14));
                }
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ v s0(z.h hVar, l0.i iVar, Integer num) {
                a(hVar, iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f35439w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(io.a<v> aVar) {
                super(0);
                this.f35439w = aVar;
            }

            public final void a() {
                this.f35439w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends q implements io.l<Integer, Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f35440w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List list) {
                super(1);
                this.f35440w = list;
            }

            public final Object a(int i10) {
                this.f35440w.get(i10);
                return null;
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends q implements r<z.h, Integer, l0.i, Integer, v> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f35441w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ List f35442x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ ha.a f35443y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.a f35444z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List list, List list2, ha.a aVar, io.a aVar2, int i10) {
                super(4);
                this.f35441w = list;
                this.f35442x = list2;
                this.f35443y = aVar;
                this.f35444z = aVar2;
                this.A = i10;
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ v F(z.h hVar, Integer num, l0.i iVar, Integer num2) {
                a(hVar, num.intValue(), iVar, num2.intValue());
                return v.f59242a;
            }

            public final void a(z.h hVar, int i10, l0.i iVar, int i11) {
                int i12;
                int i13;
                jo.p.h(hVar, "$this$items");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (iVar.P(hVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    i12 |= iVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && iVar.j()) {
                    iVar.I();
                    return;
                }
                int i14 = (i12 & 112) | (i12 & 14);
                gd.j jVar = (gd.j) this.f35441w.get(i10);
                if ((i14 & 112) == 0) {
                    i13 = i14 | (iVar.d(i10) ? 32 : 16);
                } else {
                    i13 = i14;
                }
                if ((i14 & 896) == 0) {
                    i13 |= iVar.P(jVar) ? 256 : 128;
                }
                if ((i13 & 5841) == 1168 && iVar.j()) {
                    iVar.I();
                    return;
                }
                gd.b.a(true, jVar, null, iVar, ((i13 >> 3) & 112) | 6, 4);
                if (i10 == this.f35442x.size() - 1) {
                    iVar.x(-1744873271);
                    ha.a aVar = this.f35443y;
                    String b10 = v1.f.b(nc.i.text_no_contract_passbook_history, iVar, 0);
                    iVar.x(1157296644);
                    boolean P = iVar.P(this.f35444z);
                    Object y10 = iVar.y();
                    if (P || y10 == l0.i.f39065a.a()) {
                        y10 = new c(this.f35444z);
                        iVar.q(y10);
                    }
                    iVar.O();
                    l9.e.b(aVar, b10, (io.a) y10, iVar, ha.a.f34693a | (this.A & 14));
                    iVar.O();
                    return;
                }
                iVar.x(-1744872998);
                h0.w.a(r0.m(x0.f.f59359u, m2.g.l(16), 0.0f, 0.0f, 0.0f, 14, null), v1.b.a(nc.b.f41797o, iVar, 0), 0.0f, 0.0f, iVar, 6, 12);
                iVar.O();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var, List<gd.j> list, int i10, io.a<v> aVar, io.a<v> aVar2, int i11, id.a aVar3, io.a<v> aVar4, io.a<v> aVar5, io.a<v> aVar6, io.a<v> aVar7, ha.a aVar8, io.a<v> aVar9) {
            super(1);
            this.f35427w = g0Var;
            this.f35428x = list;
            this.f35429y = i10;
            this.f35430z = aVar;
            this.A = aVar2;
            this.B = i11;
            this.C = aVar3;
            this.D = aVar4;
            this.E = aVar5;
            this.F = aVar6;
            this.G = aVar7;
            this.H = aVar8;
            this.I = aVar9;
        }

        public final void a(c0 c0Var) {
            jo.p.h(c0Var, "$this$LazyColumn");
            if (this.f35427w.m() + this.f35427w.p().b().size() > this.f35428x.size() - this.f35429y) {
                this.f35430z.invoke();
            }
            c0.a(c0Var, null, null, s0.c.c(-861389913, true, new C0450a(this.A, this.B)), 3, null);
            c0.d(c0Var, null, null, s0.c.c(-1383504886, true, new b(this.C, this.D, this.E, this.F, this.G, this.B, this.f35428x, this.H, this.I)), 3, null);
            List<gd.j> list = this.f35428x;
            c0Var.c(list.size(), null, new d(list), s0.c.c(-1091073711, true, new e(list, list, this.H, this.I, this.B)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c0 c0Var) {
            a(c0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ io.a<v> B;
        public final /* synthetic */ io.a<v> C;
        public final /* synthetic */ io.a<v> D;
        public final /* synthetic */ io.a<v> E;
        public final /* synthetic */ io.a<v> F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ha.a f35445w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ id.a f35446x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<gd.j> f35447y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35448z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ha.a aVar, id.a aVar2, List<gd.j> list, io.a<v> aVar3, io.a<v> aVar4, io.a<v> aVar5, io.a<v> aVar6, io.a<v> aVar7, io.a<v> aVar8, io.a<v> aVar9, int i10) {
            super(2);
            this.f35445w = aVar;
            this.f35446x = aVar2;
            this.f35447y = list;
            this.f35448z = aVar3;
            this.A = aVar4;
            this.B = aVar5;
            this.C = aVar6;
            this.D = aVar7;
            this.E = aVar8;
            this.F = aVar9;
            this.G = i10;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f35445w, this.f35446x, this.f35447y, this.f35448z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(ha.a aVar, id.a aVar2, List<gd.j> list, io.a<v> aVar3, io.a<v> aVar4, io.a<v> aVar5, io.a<v> aVar6, io.a<v> aVar7, io.a<v> aVar8, io.a<v> aVar9, l0.i iVar, int i10) {
        jo.p.h(aVar, "statusState");
        jo.p.h(list, "currencyHistoryBindModels");
        jo.p.h(aVar3, "onClickBroadcastFeeHelpButton");
        jo.p.h(aVar4, "onClickGiftHelpButton");
        jo.p.h(aVar5, "onClickTaxHelpButton");
        jo.p.h(aVar6, "onBackPressed");
        jo.p.h(aVar7, "onClickRetry");
        jo.p.h(aVar8, "onClickEditBankButton");
        jo.p.h(aVar9, "onNext");
        l0.i h10 = iVar.h(50208798);
        g0 a10 = h0.a(0, 0, h10, 0, 3);
        z.g.a(v.e.d(x0.f.f59359u, c1.c0.f18634b.f(), null, 2, null), a10, null, false, null, null, null, false, new a(a10, list, 1, aVar9, aVar6, i10, aVar2, aVar3, aVar4, aVar5, aVar8, aVar, aVar7), h10, 0, 252);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(aVar, aVar2, list, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, i10));
    }
}
