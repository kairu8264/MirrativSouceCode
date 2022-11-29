package x4;

/* loaded from: classes.dex */
public class e {
    public static void a(Exception exc) {
        b(exc);
    }

    public static <E extends Throwable> void b(Throwable th2) throws Throwable {
        throw th2;
    }
}
