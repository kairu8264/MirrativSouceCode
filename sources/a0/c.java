package a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f28a;

    public /* synthetic */ c(long j10) {
        this.f28a = j10;
    }

    public static final /* synthetic */ c a(long j10) {
        return new c(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof c) && j10 == ((c) obj).g();
    }

    public static final int d(long j10) {
        return (int) j10;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f28a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f28a;
    }

    public int hashCode() {
        return e(this.f28a);
    }

    public String toString() {
        return f(this.f28a);
    }
}
