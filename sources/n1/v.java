package n1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final long f41530a;

    public /* synthetic */ v(long j10) {
        this.f41530a = j10;
    }

    public static final /* synthetic */ v a(long j10) {
        return new v(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).g();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f41530a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f41530a;
    }

    public int hashCode() {
        return e(this.f41530a);
    }

    public String toString() {
        return f(this.f41530a);
    }
}
