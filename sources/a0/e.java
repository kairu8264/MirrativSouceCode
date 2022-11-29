package a0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f48a;

    public /* synthetic */ e(int i10) {
        this.f48a = i10;
    }

    public static final /* synthetic */ e a(int i10) {
        return new e(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).g();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return "ItemIndex(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f48a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f48a;
    }

    public int hashCode() {
        return e(this.f48a);
    }

    public String toString() {
        return f(this.f48a);
    }
}
