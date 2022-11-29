package y;

import x0.a;
import y.f;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final q1.c0 f60873a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.s<Integer, int[], m2.q, m2.d, int[], wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f60874w = new a();

        public a() {
            super(5);
        }

        @Override // io.s
        public /* bridge */ /* synthetic */ wn.v P0(Integer num, int[] iArr, m2.q qVar, m2.d dVar, int[] iArr2) {
            a(num.intValue(), iArr, qVar, dVar, iArr2);
            return wn.v.f59242a;
        }

        public final void a(int i10, int[] iArr, m2.q qVar, m2.d dVar, int[] iArr2) {
            jo.p.h(iArr, "size");
            jo.p.h(qVar, "<anonymous parameter 2>");
            jo.p.h(dVar, "density");
            jo.p.h(iArr2, "outPosition");
            f.f60773a.g().c(dVar, i10, iArr, iArr2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.s<Integer, int[], m2.q, m2.d, int[], wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f.l f60875w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.l lVar) {
            super(5);
            this.f60875w = lVar;
        }

        @Override // io.s
        public /* bridge */ /* synthetic */ wn.v P0(Integer num, int[] iArr, m2.q qVar, m2.d dVar, int[] iArr2) {
            a(num.intValue(), iArr, qVar, dVar, iArr2);
            return wn.v.f59242a;
        }

        public final void a(int i10, int[] iArr, m2.q qVar, m2.d dVar, int[] iArr2) {
            jo.p.h(iArr, "size");
            jo.p.h(qVar, "<anonymous parameter 2>");
            jo.p.h(dVar, "density");
            jo.p.h(iArr2, "outPosition");
            this.f60875w.c(dVar, i10, iArr, iArr2);
        }
    }

    static {
        g0 g0Var = g0.Vertical;
        float a10 = f.f60773a.g().a();
        s b10 = s.f60957a.b(x0.a.f59327a.k());
        f60873a = w0.y(g0Var, a.f60874w, a10, e1.Wrap, b10);
    }

    public static final q1.c0 a(f.l lVar, a.b bVar, l0.i iVar, int i10) {
        q1.c0 y10;
        jo.p.h(lVar, "verticalArrangement");
        jo.p.h(bVar, "horizontalAlignment");
        iVar.x(1089876336);
        iVar.x(511388516);
        boolean P = iVar.P(lVar) | iVar.P(bVar);
        Object y11 = iVar.y();
        if (P || y11 == l0.i.f39065a.a()) {
            if (jo.p.c(lVar, f.f60773a.g()) && jo.p.c(bVar, x0.a.f59327a.k())) {
                y10 = f60873a;
            } else {
                g0 g0Var = g0.Vertical;
                float a10 = lVar.a();
                s b10 = s.f60957a.b(bVar);
                y10 = w0.y(g0Var, new b(lVar), a10, e1.Wrap, b10);
            }
            y11 = y10;
            iVar.q(y11);
        }
        iVar.O();
        q1.c0 c0Var = (q1.c0) y11;
        iVar.O();
        return c0Var;
    }
}
