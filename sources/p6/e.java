package p6;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static l f45917a;

    public static String a() {
        return b().c();
    }

    public static synchronized l b() {
        l lVar;
        synchronized (e.class) {
            if (f45917a == null) {
                f45917a = new l();
            }
            lVar = f45917a;
        }
        return lVar;
    }

    public static void c(g gVar) {
        b().d(gVar);
    }

    public static void d() {
        b().e();
    }

    public static void e() {
        b().f();
    }

    public static void f(h hVar) {
        b().h(hVar);
    }
}
