package c1;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18711b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18712c = g(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18713d = g(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18714e = g(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18715f = g(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18716g = g(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f18717a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return l0.f18713d;
        }

        public final int b() {
            return l0.f18712c;
        }

        public final int c() {
            return l0.f18715f;
        }

        public final int d() {
            return l0.f18716g;
        }

        public final int e() {
            return l0.f18714e;
        }
    }

    public /* synthetic */ l0(int i10) {
        this.f18717a = i10;
    }

    public static final /* synthetic */ l0 f(int i10) {
        return new l0(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof l0) && i10 == ((l0) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f18712c) ? "Argb8888" : i(i10, f18713d) ? "Alpha8" : i(i10, f18714e) ? "Rgb565" : i(i10, f18715f) ? "F16" : i(i10, f18716g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f18717a, obj);
    }

    public int hashCode() {
        return j(this.f18717a);
    }

    public final /* synthetic */ int l() {
        return this.f18717a;
    }

    public String toString() {
        return k(this.f18717a);
    }
}
