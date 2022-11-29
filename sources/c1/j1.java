package c1;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18697b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18698c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18699d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18700e = e(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f18701a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return j1.f18698c;
        }

        public final int b() {
            return j1.f18699d;
        }

        public final int c() {
            return j1.f18700e;
        }
    }

    public /* synthetic */ j1(int i10) {
        this.f18701a = i10;
    }

    public static final /* synthetic */ j1 d(int i10) {
        return new j1(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof j1) && i10 == ((j1) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return g(i10, f18698c) ? "Butt" : g(i10, f18699d) ? "Round" : g(i10, f18700e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f18701a, obj);
    }

    public int hashCode() {
        return h(this.f18701a);
    }

    public final /* synthetic */ int j() {
        return this.f18701a;
    }

    public String toString() {
        return i(this.f18701a);
    }
}
