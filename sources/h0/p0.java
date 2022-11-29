package h0;

import c1.d0;
import x0.f;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x0.f f34085a = y.d1.u(x0.f.f59359u, m2.g.l(24));

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f1.d f34086w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f34087x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f34088y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f34089z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1.d dVar, String str, x0.f fVar, long j10, int i10, int i11) {
            super(2);
            this.f34086w = dVar;
            this.f34087x = str;
            this.f34088y = fVar;
            this.f34089z = j10;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            p0.a(this.f34086w, this.f34087x, this.f34088y, this.f34089z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<w1.y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f34090w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f34090w = str;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.A(yVar, this.f34090w);
            w1.w.I(yVar, w1.h.f57895b.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    public static final void a(f1.d dVar, String str, x0.f fVar, long j10, l0.i iVar, int i10, int i11) {
        x0.f fVar2;
        jo.p.h(dVar, "painter");
        l0.i h10 = iVar.h(-1142959010);
        f.a aVar = (i11 & 4) != 0 ? x0.f.f59359u : fVar;
        long k10 = (i11 & 8) != 0 ? c1.c0.k(((c1.c0) h10.G(p.a())).u(), ((Number) h10.G(o.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        c1.d0 b10 = c1.c0.m(k10, c1.c0.f18634b.e()) ? null : d0.a.b(c1.d0.f18653b, k10, 0, 2, null);
        h10.x(1547385429);
        if (str != null) {
            f.a aVar2 = x0.f.f59359u;
            h10.x(1157296644);
            boolean P = h10.P(str);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new b(str);
                h10.q(y10);
            }
            h10.O();
            fVar2 = w1.p.b(aVar2, false, (io.l) y10, 1, null);
        } else {
            fVar2 = x0.f.f59359u;
        }
        h10.O();
        y.j.a(z0.n.b(c(c1.h0.d(aVar), dVar), dVar, false, null, q1.f.f48569a.d(), 0.0f, b10, 22, null).L(fVar2), h10, 0);
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(dVar, str, aVar, k10, i10, i11));
    }

    public static final void b(g1.c cVar, String str, x0.f fVar, long j10, l0.i iVar, int i10, int i11) {
        jo.p.h(cVar, "imageVector");
        iVar.x(-800853103);
        a(g1.s.b(cVar, iVar, i10 & 14), str, (i11 & 4) != 0 ? x0.f.f59359u : fVar, (i11 & 8) != 0 ? c1.c0.k(((c1.c0) iVar.G(p.a())).u(), ((Number) iVar.G(o.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10, iVar, g1.r.J | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
        iVar.O();
    }

    public static final x0.f c(x0.f fVar, f1.d dVar) {
        x0.f fVar2;
        if (!b1.l.f(dVar.k(), b1.l.f16742b.a()) && !d(dVar.k())) {
            fVar2 = x0.f.f59359u;
        } else {
            fVar2 = f34085a;
        }
        return fVar.L(fVar2);
    }

    public static final boolean d(long j10) {
        return Float.isInfinite(b1.l.i(j10)) && Float.isInfinite(b1.l.g(j10));
    }
}
