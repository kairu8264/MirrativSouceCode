package w1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f57880b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f57881c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f57882d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f57883a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return e.f57882d;
        }

        public final int b() {
            return e.f57881c;
        }
    }

    public /* synthetic */ e(int i10) {
        this.f57883a = i10;
    }

    public static final /* synthetic */ e c(int i10) {
        return new e(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f57881c) ? "Polite" : f(i10, f57882d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f57883a, obj);
    }

    public int hashCode() {
        return g(this.f57883a);
    }

    public final /* synthetic */ int i() {
        return this.f57883a;
    }

    public String toString() {
        return h(this.f57883a);
    }
}
