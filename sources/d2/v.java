package d2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f29143b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f29144c = f(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f29145d = f(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f29146e = f(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f29147f = f(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f29148a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return v.f29145d;
        }

        public final int b() {
            return v.f29144c;
        }

        public final int c() {
            return v.f29147f;
        }

        public final int d() {
            return v.f29146e;
        }
    }

    public /* synthetic */ v(int i10) {
        this.f29148a = i10;
    }

    public static final /* synthetic */ v e(int i10) {
        return new v(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof v) && i10 == ((v) obj).m();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean j(int i10) {
        return h(i10, f29145d) || h(i10, f29147f);
    }

    public static final boolean k(int i10) {
        return h(i10, f29145d) || h(i10, f29146e);
    }

    public static String l(int i10) {
        return h(i10, f29144c) ? "None" : h(i10, f29145d) ? "All" : h(i10, f29146e) ? "Weight" : h(i10, f29147f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f29148a, obj);
    }

    public int hashCode() {
        return i(this.f29148a);
    }

    public final /* synthetic */ int m() {
        return this.f29148a;
    }

    public String toString() {
        return l(this.f29148a);
    }
}
