package e2;

/* loaded from: classes.dex */
public final class b0 {
    public static final y1.a a(a0 a0Var) {
        jo.p.h(a0Var, "<this>");
        return a0Var.e().k(a0Var.g());
    }

    public static final y1.a b(a0 a0Var, int i10) {
        jo.p.h(a0Var, "<this>");
        return a0Var.e().subSequence(y1.b0.k(a0Var.g()), Math.min(y1.b0.k(a0Var.g()) + i10, a0Var.h().length()));
    }

    public static final y1.a c(a0 a0Var, int i10) {
        jo.p.h(a0Var, "<this>");
        return a0Var.e().subSequence(Math.max(0, y1.b0.l(a0Var.g()) - i10), y1.b0.l(a0Var.g()));
    }
}
