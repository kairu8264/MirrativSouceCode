package f0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import l0.c2;
import q1.q0;
import y.d1;

/* loaded from: classes.dex */
public final class q0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31583w;

        /* renamed from: f0.q0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0340a extends jo.q implements io.q<q1.e0, q1.b0, m2.b, q1.d0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p0 f31584w;

            /* renamed from: f0.q0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0341a extends jo.q implements io.l<q0.a, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ q1.q0 f31585w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0341a(q1.q0 q0Var) {
                    super(1);
                    this.f31585w = q0Var;
                }

                public final void a(q0.a aVar) {
                    jo.p.h(aVar, "$this$layout");
                    q0.a.n(aVar, this.f31585w, 0, 0, 0.0f, 4, null);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                    a(aVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0340a(p0 p0Var) {
                super(3);
                this.f31584w = p0Var;
            }

            public final q1.d0 a(q1.e0 e0Var, q1.b0 b0Var, long j10) {
                jo.p.h(e0Var, "$this$layout");
                jo.p.h(b0Var, "measurable");
                d1.h(x0.f.f59359u, 0.0f, 0.0f, 3, null);
                long b10 = this.f31584w.b();
                q1.q0 M = b0Var.M(m2.b.e(j10, po.n.m(m2.o.g(b10), m2.b.p(j10), m2.b.n(j10)), 0, po.n.m(m2.o.f(b10), m2.b.o(j10), m2.b.m(j10)), 0, 10, null));
                return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new C0341a(M), 4, null);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ q1.d0 s0(q1.e0 e0Var, q1.b0 b0Var, m2.b bVar) {
                return a(e0Var, b0Var, bVar.t());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y1.d0 d0Var) {
            super(3);
            this.f31583w = d0Var;
        }

        public static final Object b(c2<? extends Object> c2Var) {
            return c2Var.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [l0.i] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v3 */
        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(1582736677);
            m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
            l.b bVar = (l.b) iVar.G(androidx.compose.ui.platform.o0.g());
            m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
            y1.d0 d0Var = this.f31583w;
            iVar.x(511388516);
            boolean P = iVar.P(d0Var) | iVar.P(qVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = y1.e0.c(d0Var, qVar);
                iVar.q(y10);
            }
            iVar.O();
            y1.d0 d0Var2 = y10;
            iVar.x(511388516);
            boolean P2 = iVar.P(bVar) | iVar.P(d0Var2);
            Object y11 = iVar.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                d2.l h10 = d0Var2.h();
                d2.x m10 = d0Var2.m();
                if (m10 == null) {
                    m10 = d2.x.f29149x.d();
                }
                d2.u k10 = d0Var2.k();
                int i11 = k10 != null ? k10.i() : d2.u.f29139b.b();
                d2.v l10 = d0Var2.l();
                y11 = bVar.a(h10, m10, i11, l10 != null ? l10.m() : d2.v.f29143b.a());
                iVar.q(y11);
            }
            iVar.O();
            c2 c2Var = y11;
            y1.d0 d0Var3 = this.f31583w;
            iVar.x(-492369756);
            Object y12 = iVar.y();
            p0 p0Var = y12;
            if (y12 == l0.i.f39065a.a()) {
                p0 p0Var2 = new p0(qVar, dVar, bVar, d0Var3, b(c2Var));
                iVar.q(p0Var2);
                p0Var = p0Var2;
            }
            iVar.O();
            p0 p0Var3 = (p0) p0Var;
            p0Var3.c(qVar, dVar, bVar, d0Var2, b(c2Var));
            x0.f a10 = q1.z.a(x0.f.f59359u, new C0340a(p0Var3));
            iVar.O();
            return a10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, y1.d0 d0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        return x0.e.d(fVar, null, new a(d0Var), 1, null);
    }
}
