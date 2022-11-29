package jo;

/* loaded from: classes4.dex */
public class g0 {
    public qo.d a(l lVar) {
        return lVar;
    }

    public qo.b b(Class cls) {
        return new f(cls);
    }

    public qo.c c(Class cls, String str) {
        return new u(cls, str);
    }

    public qo.e d(r rVar) {
        return rVar;
    }

    public qo.f e(v vVar) {
        return vVar;
    }

    public qo.g f(x xVar) {
        return xVar;
    }

    public String g(k kVar) {
        String obj = kVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(q qVar) {
        return g(qVar);
    }
}
