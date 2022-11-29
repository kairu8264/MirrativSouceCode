package c1;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18778b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18779c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18780d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f18781a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return w0.f18780d;
        }

        public final int b() {
            return w0.f18779c;
        }
    }

    public /* synthetic */ w0(int i10) {
        this.f18781a = i10;
    }

    public static final /* synthetic */ w0 c(int i10) {
        return new w0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof w0) && i10 == ((w0) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f18779c) ? "NonZero" : f(i10, f18780d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f18781a, obj);
    }

    public int hashCode() {
        return g(this.f18781a);
    }

    public final /* synthetic */ int i() {
        return this.f18781a;
    }

    public String toString() {
        return h(this.f18781a);
    }
}
