package y;

import x0.a;
import y.f;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final q1.c0 f61027a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.s<Integer, int[], m2.q, m2.d, int[], wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f61028w = new a();

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
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(dVar, "density");
            jo.p.h(iArr2, "outPosition");
            f.f60773a.f().b(dVar, i10, iArr, qVar, iArr2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.s<Integer, int[], m2.q, m2.d, int[], wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f.d f61029w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.d dVar) {
            super(5);
            this.f61029w = dVar;
        }

        @Override // io.s
        public /* bridge */ /* synthetic */ wn.v P0(Integer num, int[] iArr, m2.q qVar, m2.d dVar, int[] iArr2) {
            a(num.intValue(), iArr, qVar, dVar, iArr2);
            return wn.v.f59242a;
        }

        public final void a(int i10, int[] iArr, m2.q qVar, m2.d dVar, int[] iArr2) {
            jo.p.h(iArr, "size");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(dVar, "density");
            jo.p.h(iArr2, "outPosition");
            this.f61029w.b(dVar, i10, iArr, qVar, iArr2);
        }
    }

    static {
        g0 g0Var = g0.Horizontal;
        float a10 = f.f60773a.f().a();
        s c10 = s.f60957a.c(x0.a.f59327a.l());
        f61027a = w0.y(g0Var, a.f61028w, a10, e1.Wrap, c10);
    }

    public static final q1.c0 a(f.d dVar, a.c cVar, l0.i iVar, int i10) {
        q1.c0 y10;
        jo.p.h(dVar, "horizontalArrangement");
        jo.p.h(cVar, "verticalAlignment");
        iVar.x(-837807694);
        iVar.x(511388516);
        boolean P = iVar.P(dVar) | iVar.P(cVar);
        Object y11 = iVar.y();
        if (P || y11 == l0.i.f39065a.a()) {
            if (jo.p.c(dVar, f.f60773a.f()) && jo.p.c(cVar, x0.a.f59327a.l())) {
                y10 = f61027a;
            } else {
                g0 g0Var = g0.Horizontal;
                float a10 = dVar.a();
                s c10 = s.f60957a.c(cVar);
                y10 = w0.y(g0Var, new b(dVar), a10, e1.Wrap, c10);
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
