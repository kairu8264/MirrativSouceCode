package jo;

/* loaded from: classes4.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f38144a;

    /* renamed from: b  reason: collision with root package name */
    public static final qo.b[] f38145b;

    static {
        g0 g0Var = null;
        try {
            g0Var = (g0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g0Var == null) {
            g0Var = new g0();
        }
        f38144a = g0Var;
        f38145b = new qo.b[0];
    }

    public static qo.d a(l lVar) {
        return f38144a.a(lVar);
    }

    public static qo.b b(Class cls) {
        return f38144a.b(cls);
    }

    public static qo.c c(Class cls) {
        return f38144a.c(cls, "");
    }

    public static qo.e d(r rVar) {
        return f38144a.d(rVar);
    }

    public static qo.f e(v vVar) {
        return f38144a.e(vVar);
    }

    public static qo.g f(x xVar) {
        return f38144a.f(xVar);
    }

    public static String g(k kVar) {
        return f38144a.g(kVar);
    }

    public static String h(q qVar) {
        return f38144a.h(qVar);
    }
}
