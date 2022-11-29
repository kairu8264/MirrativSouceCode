package u;

/* loaded from: classes.dex */
public final class q {
    public static final m a(float f10) {
        return new m(f10);
    }

    public static final <T extends p> T b(T t10) {
        jo.p.h(t10, "<this>");
        T t11 = (T) d(t10);
        int b10 = t11.b();
        for (int i10 = 0; i10 < b10; i10++) {
            t11.e(i10, t10.a(i10));
        }
        return t11;
    }

    public static final <T extends p> void c(T t10, T t11) {
        jo.p.h(t10, "<this>");
        jo.p.h(t11, "source");
        int b10 = t10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    public static final <T extends p> T d(T t10) {
        jo.p.h(t10, "<this>");
        return (T) t10.c();
    }
}
