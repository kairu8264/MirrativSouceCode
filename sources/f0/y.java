package f0;

import androidx.compose.ui.platform.c1;
import d2.l;
import l0.c2;
import x0.f;
import y.d1;

/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f31686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31687x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, y1.d0 d0Var) {
            super(1);
            this.f31686w = i10;
            this.f31687x = d0Var;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("maxLinesHeight");
            c1Var.a().b("maxLines", Integer.valueOf(this.f31686w));
            c1Var.a().b("textStyle", this.f31687x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f31688w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31689x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, y1.d0 d0Var) {
            super(3);
            this.f31688w = i10;
            this.f31689x = d0Var;
        }

        public static final Object b(c2<? extends Object> c2Var) {
            return c2Var.getValue();
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-1027014173);
            int i11 = this.f31688w;
            if (i11 > 0) {
                if (i11 == Integer.MAX_VALUE) {
                    f.a aVar = x0.f.f59359u;
                    iVar.O();
                    return aVar;
                }
                m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
                l.b bVar = (l.b) iVar.G(androidx.compose.ui.platform.o0.g());
                m2.q qVar = (m2.q) iVar.G(androidx.compose.ui.platform.o0.j());
                y1.d0 d0Var = this.f31689x;
                iVar.x(511388516);
                boolean P = iVar.P(d0Var) | iVar.P(qVar);
                Object y10 = iVar.y();
                if (P || y10 == l0.i.f39065a.a()) {
                    y10 = y1.e0.c(d0Var, qVar);
                    iVar.q(y10);
                }
                iVar.O();
                y1.d0 d0Var2 = (y1.d0) y10;
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
                    int i12 = k10 != null ? k10.i() : d2.u.f29139b.b();
                    d2.v l10 = d0Var2.l();
                    y11 = bVar.a(h10, m10, i12, l10 != null ? l10.m() : d2.v.f29143b.a());
                    iVar.q(y11);
                }
                iVar.O();
                c2 c2Var = (c2) y11;
                Object[] objArr = {dVar, bVar, this.f31689x, qVar, b(c2Var)};
                iVar.x(-568225417);
                boolean z10 = false;
                for (int i13 = 0; i13 < 5; i13++) {
                    z10 |= iVar.P(objArr[i13]);
                }
                Object y12 = iVar.y();
                if (z10 || y12 == l0.i.f39065a.a()) {
                    y12 = Integer.valueOf(m2.o.f(h0.a(d0Var2, dVar, bVar, h0.c(), 1)));
                    iVar.q(y12);
                }
                iVar.O();
                int intValue = ((Number) y12).intValue();
                Object[] objArr2 = {dVar, bVar, this.f31689x, qVar, b(c2Var)};
                iVar.x(-568225417);
                boolean z11 = false;
                for (int i14 = 0; i14 < 5; i14++) {
                    z11 |= iVar.P(objArr2[i14]);
                }
                Object y13 = iVar.y();
                if (z11 || y13 == l0.i.f39065a.a()) {
                    y13 = Integer.valueOf(m2.o.f(h0.a(d0Var2, dVar, bVar, h0.c() + '\n' + h0.c(), 2)));
                    iVar.q(y13);
                }
                iVar.O();
                x0.f q10 = d1.q(x0.f.f59359u, 0.0f, dVar.s(intValue + ((((Number) y13).intValue() - intValue) * (this.f31688w - 1))), 1, null);
                iVar.O();
                return q10;
            }
            throw new IllegalArgumentException("maxLines must be greater than 0".toString());
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, int i10, y1.d0 d0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(d0Var, "textStyle");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new a(i10, d0Var) : androidx.compose.ui.platform.a1.a(), new b(i10, d0Var));
    }
}
