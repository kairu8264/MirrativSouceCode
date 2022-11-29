package oa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.a1;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import s1.a;
import v.q0;
import x0.a;
import x0.f;
import y.d1;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f44412w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f44413x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44414y;

        /* renamed from: oa.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0663a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f44415w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0663a(io.a<wn.v> aVar) {
                super(0);
                this.f44415w = aVar;
            }

            public final void a() {
                this.f44415w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, io.a<wn.v> aVar) {
            super(2);
            this.f44412w = str;
            this.f44413x = i10;
            this.f44414y = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, l0.i] */
        /* JADX WARN: Type inference failed for: r5v9 */
        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            String str = this.f44412w;
            f.a aVar = x0.f.f59359u;
            l9.d.c(str, q0.d(d1.C(d1.n(d1.A(aVar, 0.0f, m2.g.l(320), 1, null), 0.0f, 1, null), null, false, 3, null), q0.a(0, iVar, 0, 1), false, null, false, 14, null), null, 0, q1.f.f48569a.c(), null, iVar, (this.f44413x & 14) | 24576, 44);
            x0.f n10 = d1.n(aVar, 0.0f, 1, null);
            io.a<wn.v> aVar2 = this.f44414y;
            iVar.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            c0 h10 = y.j.h(c0986a.o(), false, iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(n10);
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
            iVar.x(1157296644);
            boolean P = iVar.P(aVar2);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new C0663a(aVar2);
                iVar.q(y10);
            }
            iVar.O();
            h0.o0.a(y10, lVar.a(aVar, c0986a.n()), false, null, oa.b.f44315a.a(), iVar, 24576, 12);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f44416w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44417x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44418y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f44416w = str;
            this.f44417x = aVar;
            this.f44418y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f44416w, this.f44417x, iVar, this.f44418y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(String str, io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(str, "rulePopupImageUrl");
        jo.p.h(aVar, "onClose");
        l0.i h10 = iVar.h(-1750982352);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            float f10 = 12;
            h0.g.a(z0.d.a(v.g.g(d1.o(d1.y(x0.f.f59359u, m2.g.l(320)), m2.g.l(500)), m2.g.l(1), c1.c0.f18634b.f(), e0.g.c(m2.g.l(f10))), a1.a()), e0.g.c(m2.g.l(f10)), 0L, 0L, null, m2.g.l(f10), s0.c.b(h10, 591742253, true, new a(str, i11, aVar)), h10, 1769472, 28);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(str, aVar, i10));
    }
}
