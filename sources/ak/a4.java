package ak;

/* loaded from: classes3.dex */
public abstract class a4 {
    public abstract int a();

    public abstract long b();

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract byte[] f();

    public final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith("/");
    }

    public final boolean h() {
        return a() == 0;
    }
}
