package hd;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import jo.q;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.f;
import y.d1;
import y.g1;
import y.r;

/* loaded from: classes2.dex */
public final class g {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ io.a<v> A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ id.a f35384w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35385x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35386y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f35387z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(id.a aVar, io.a<v> aVar2, io.a<v> aVar3, io.a<v> aVar4, io.a<v> aVar5, int i10) {
            super(2);
            this.f35384w = aVar;
            this.f35385x = aVar2;
            this.f35386y = aVar3;
            this.f35387z = aVar4;
            this.A = aVar5;
            this.B = i10;
        }

        public final void a(l0.i iVar, int i10) {
            g.a(this.f35384w, this.f35385x, this.f35386y, this.f35387z, this.A, iVar, this.B | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(id.a aVar, io.a<v> aVar2, io.a<v> aVar3, io.a<v> aVar4, io.a<v> aVar5, l0.i iVar, int i10) {
        jo.p.h(aVar2, "onClickBroadcastFeeHelpButton");
        jo.p.h(aVar3, "onClickGiftHelpButton");
        jo.p.h(aVar4, "onClickTaxHelpButton");
        jo.p.h(aVar5, "onClickEditBankButton");
        l0.i h10 = iVar.h(-566768117);
        f.a aVar6 = x0.f.f59359u;
        x0.f n10 = d1.n(aVar6, 0.0f, 1, null);
        h10.x(-483455358);
        c0 a10 = y.p.a(y.f.f60773a.g(), x0.a.f59327a.k(), h10, 0);
        h10.x(-1323940314);
        m2.d dVar = (m2.d) h10.G(o0.e());
        m2.q qVar = (m2.q) h10.G(o0.j());
        g2 g2Var = (g2) h10.G(o0.n());
        a.C0787a c0787a = s1.a.f51802o;
        io.a<s1.a> a11 = c0787a.a();
        io.q<n1<s1.a>, l0.i, Integer, v> a12 = w.a(n10);
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
        id.e d10 = aVar != null ? aVar.d() : null;
        h10.x(701088774);
        if (d10 != null) {
            k.a(d10, aVar2, aVar3, aVar4, h10, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168));
        }
        h10.O();
        id.c b10 = aVar != null ? aVar.b() : null;
        if (b10 != null) {
            h10.x(701089149);
            if (aVar.c() == null) {
                g1.a(d1.o(aVar6, m2.g.l(16)), h10, 6);
            }
            h10.O();
            h.a(b10, aVar5, h10, (i10 >> 9) & 112);
            g1.a(d1.o(aVar6, m2.g.l(16)), h10, 6);
        }
        h10.O();
        h10.O();
        h10.s();
        h10.O();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(aVar, aVar2, aVar3, aVar4, aVar5, i10));
    }
}
