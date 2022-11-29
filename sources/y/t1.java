package y;

/* loaded from: classes.dex */
public final class t1 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public a() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("imePadding");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public b() {
            super(3);
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(359872873);
            p1 c10 = p1.f60881v.c(iVar, 8);
            iVar.x(1157296644);
            boolean P = iVar.P(c10);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a0(c10.d(), null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            a0 a0Var = (a0) y10;
            iVar.O();
            return a0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public c() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("safeDrawingPadding");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public d() {
            super(3);
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(359872873);
            p1 c10 = p1.f60881v.c(iVar, 8);
            iVar.x(1157296644);
            boolean P = iVar.P(c10);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a0(c10.e(), null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            a0 a0Var = (a0) y10;
            iVar.O();
            return a0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new a() : androidx.compose.ui.platform.a1.a(), new b());
    }

    public static final x0.f b(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new c() : androidx.compose.ui.platform.a1.a(), new d());
    }
}
