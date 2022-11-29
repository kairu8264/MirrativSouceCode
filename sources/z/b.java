package z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f62158a;

    public /* synthetic */ b(int i10) {
        this.f62158a = i10;
    }

    public static final /* synthetic */ b a(int i10) {
        return new b(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).g();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return "DataIndex(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f62158a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f62158a;
    }

    public int hashCode() {
        return e(this.f62158a);
    }

    public String toString() {
        return f(this.f62158a);
    }
}
