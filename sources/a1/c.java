package a1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f288b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f289c = j(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f290d = j(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f291e = j(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f292f = j(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f293g = j(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f294h = j(6);

    /* renamed from: i  reason: collision with root package name */
    public static final int f295i = j(7);

    /* renamed from: j  reason: collision with root package name */
    public static final int f296j = j(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f297a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return c.f294h;
        }

        public final int b() {
            return c.f295i;
        }

        public final int c() {
            return c.f291e;
        }

        public final int d() {
            return c.f289c;
        }

        public final int e() {
            return c.f296j;
        }

        public final int f() {
            return c.f290d;
        }

        public final int g() {
            return c.f292f;
        }

        public final int h() {
            return c.f293g;
        }
    }

    public /* synthetic */ c(int i10) {
        this.f297a = i10;
    }

    public static final /* synthetic */ c i(int i10) {
        return new c(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof c) && i10 == ((c) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f289c) ? "Next" : l(i10, f290d) ? "Previous" : l(i10, f291e) ? "Left" : l(i10, f292f) ? "Right" : l(i10, f293g) ? "Up" : l(i10, f294h) ? "Down" : l(i10, f295i) ? "In" : l(i10, f296j) ? "Out" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f297a, obj);
    }

    public int hashCode() {
        return m(this.f297a);
    }

    public final /* synthetic */ int o() {
        return this.f297a;
    }

    public String toString() {
        return n(this.f297a);
    }
}
