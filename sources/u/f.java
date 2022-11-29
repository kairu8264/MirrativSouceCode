package u;

/* loaded from: classes.dex */
public final class f {
    public static final v<Float, m> a(e0 e0Var, float f10, float f11) {
        jo.p.h(e0Var, "animationSpec");
        return new v<>(y.b(e0Var), e1.e(jo.i.f38148a), Float.valueOf(f10), q.a(f11));
    }

    public static final <T, V extends p> y0<T, V> b(i<T> iVar, c1<T, V> c1Var, T t10, T t11, T t12) {
        jo.p.h(iVar, "animationSpec");
        jo.p.h(c1Var, "typeConverter");
        return new y0<>(iVar, c1Var, t10, t11, c1Var.a().invoke(t12));
    }

    public static final long c(d<?, ?> dVar) {
        jo.p.h(dVar, "<this>");
        return dVar.d() / 1000000;
    }
}
