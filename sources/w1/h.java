package w1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f57895b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f57896c = h(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f57897d = h(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f57898e = h(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f57899f = h(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f57900g = h(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f57901h = h(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f57902a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return h.f57896c;
        }

        public final int b() {
            return h.f57897d;
        }

        public final int c() {
            return h.f57901h;
        }

        public final int d() {
            return h.f57899f;
        }

        public final int e() {
            return h.f57898e;
        }

        public final int f() {
            return h.f57900g;
        }
    }

    public /* synthetic */ h(int i10) {
        this.f57902a = i10;
    }

    public static final /* synthetic */ h g(int i10) {
        return new h(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof h) && i10 == ((h) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        return j(i10, f57896c) ? "Button" : j(i10, f57897d) ? "Checkbox" : j(i10, f57898e) ? "Switch" : j(i10, f57899f) ? "RadioButton" : j(i10, f57900g) ? "Tab" : j(i10, f57901h) ? "Image" : "Unknown";
    }

    public boolean equals(Object obj) {
        return i(this.f57902a, obj);
    }

    public int hashCode() {
        return k(this.f57902a);
    }

    public final /* synthetic */ int m() {
        return this.f57902a;
    }

    public String toString() {
        return l(this.f57902a);
    }
}
