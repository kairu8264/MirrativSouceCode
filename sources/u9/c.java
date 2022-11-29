package u9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import jo.p;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.l1;
import l0.n1;
import q1.c0;
import q9.d;
import s1.a;
import t.g;
import t.m;
import v.w;
import v1.e;
import wn.v;
import x0.a;
import x0.f;
import y.d1;
import y.j;
import y.k;
import y.l;
import y.r0;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.q<g, i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k f54646w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u9.a f54647x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, u9.a aVar) {
            super(3);
            this.f54646w = kVar;
            this.f54647x = aVar;
        }

        public final void a(g gVar, i iVar, int i10) {
            p.h(gVar, "$this$AnimatedVisibility");
            float f10 = 12;
            w.a(e.c(this.f54647x.a(), iVar, 0), null, d1.l(y.g.b(d1.q(r0.m(this.f54646w.a(f.f59359u, x0.a.f59327a.o()), 0.0f, m2.g.l(f10), m2.g.l(8), m2.g.l(f10), 1, null), 0.0f, m2.g.l(70), 1, null), 5.24f, false, 2, null), 0.0f, 1, null), null, null, 0.0f, null, iVar, 56, 120);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(g gVar, i iVar, Integer num) {
            a(gVar, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ u9.a f54648w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f54649x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u9.a aVar, int i10) {
            super(2);
            this.f54648w = aVar;
            this.f54649x = i10;
        }

        public final void a(i iVar, int i10) {
            c.a(this.f54648w, iVar, this.f54649x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(u9.a aVar, i iVar, int i10) {
        int i11;
        p.h(aVar, "bindModel");
        i h10 = iVar.h(545427290);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            f.a aVar2 = f.f59359u;
            f d10 = v.e.d(d1.l(aVar2, 0.0f, 1, null), v1.b.a(d.f48804b, h10, 0), null, 2, null);
            h10.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            c0 h11 = j.h(c0986a.o(), false, h10, 0);
            h10.x(-1323940314);
            m2.d dVar = (m2.d) h10.G(o0.e());
            m2.q qVar = (m2.q) h10.G(o0.j());
            g2 g2Var = (g2) h10.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a11 = q1.w.a(d10);
            if (!(h10.k() instanceof l0.e)) {
                h.c();
            }
            h10.D();
            if (h10.f()) {
                h10.r(a10);
            } else {
                h10.o();
            }
            h10.E();
            i a12 = h2.a(h10);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            h10.c();
            a11.s0(n1.a(n1.b(h10)), h10, 0);
            h10.x(2058660585);
            h10.x(-2137368960);
            l lVar = l.f60836a;
            w.a(e.c(q9.f.bg_emomo_quest_logo, h10, 0), null, lVar.a(d1.v(aVar2, m2.g.l(200), m2.g.l(80)), c0986a.e()), null, null, 0.0f, null, h10, 56, 120);
            t.f.c(aVar.b(), null, m.r(null, 0.0f, 3, null), null, null, s0.c.b(h10, 854005820, true, new a(lVar, aVar)), h10, 196992, 26);
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
        l10.a(new b(aVar, i10));
    }
}
