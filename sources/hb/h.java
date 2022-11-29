package hb;

import androidx.compose.ui.platform.g2;
import l0.h2;
import s1.a;
import x0.a;
import x0.f;

/* loaded from: classes2.dex */
public final class h {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34801w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<wn.v> aVar) {
            super(0);
            this.f34801w = aVar;
        }

        public final void a() {
            this.f34801w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f34802w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f34803x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar, int i10) {
            super(2);
            this.f34802w = aVar;
            this.f34803x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            h.a(this.f34802w, iVar, this.f34803x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(aVar, "onClickClose");
        l0.i h10 = iVar.h(1323587268);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            h10.x(733328855);
            f.a aVar2 = x0.f.f59359u;
            a.C0986a c0986a = x0.a.f59327a;
            q1.c0 h11 = y.j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(androidx.compose.ui.platform.o0.e());
            m2.q qVar = (m2.q) h10.G(androidx.compose.ui.platform.o0.j());
            g2 g2Var = (g2) h10.G(androidx.compose.ui.platform.o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<l0.n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(aVar2);
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
            l0.i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(l0.n1.a(l0.n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            y.l lVar = y.l.f60836a;
            v.w.a(v1.e.c(v1.img_nuu_welcome, h10, 0), null, null, null, null, 0.0f, null, h10, 56, 124);
            x0.f a13 = lVar.a(y.d1.u(aVar2, m2.g.l(32)), c0986a.n());
            h10.x(1157296644);
            boolean P = h10.P(aVar);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(aVar);
                h10.q(y10);
            }
            h10.O();
            y.j.a(v.l.e(a13, false, null, null, (io.a) y10, 7, null), h10, 0);
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
        l10.a(new b(aVar, i10));
    }
}
