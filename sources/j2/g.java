package j2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37088b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37089c = g(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37090d = g(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f37091e = g(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f37092f = g(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f37093g = g(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f37094a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return g.f37091e;
        }

        public final int b() {
            return g.f37092f;
        }

        public final int c() {
            return g.f37093g;
        }

        public final int d() {
            return g.f37089c;
        }

        public final int e() {
            return g.f37090d;
        }
    }

    public /* synthetic */ g(int i10) {
        this.f37094a = i10;
    }

    public static final /* synthetic */ g f(int i10) {
        return new g(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f37089c) ? "Ltr" : i(i10, f37090d) ? "Rtl" : i(i10, f37091e) ? "Content" : i(i10, f37092f) ? "ContentOrLtr" : i(i10, f37093g) ? "ContentOrRtl" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f37094a, obj);
    }

    public int hashCode() {
        return j(this.f37094a);
    }

    public final /* synthetic */ int l() {
        return this.f37094a;
    }

    public String toString() {
        return k(this.f37094a);
    }
}
