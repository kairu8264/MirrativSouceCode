package e2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30112b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30113c = j(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f30114d = j(0);

    /* renamed from: e  reason: collision with root package name */
    public static final int f30115e = j(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f30116f = j(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f30117g = j(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f30118h = j(5);

    /* renamed from: i  reason: collision with root package name */
    public static final int f30119i = j(6);

    /* renamed from: j  reason: collision with root package name */
    public static final int f30120j = j(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f30121a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return l.f30113c;
        }

        public final int b() {
            return l.f30120j;
        }

        public final int c() {
            return l.f30115e;
        }

        public final int d() {
            return l.f30119i;
        }

        public final int e() {
            return l.f30114d;
        }

        public final int f() {
            return l.f30118h;
        }

        public final int g() {
            return l.f30116f;
        }

        public final int h() {
            return l.f30117g;
        }
    }

    public /* synthetic */ l(int i10) {
        this.f30121a = i10;
    }

    public static final /* synthetic */ l i(int i10) {
        return new l(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof l) && i10 == ((l) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f30114d) ? "None" : l(i10, f30113c) ? "Default" : l(i10, f30115e) ? "Go" : l(i10, f30116f) ? "Search" : l(i10, f30117g) ? "Send" : l(i10, f30118h) ? "Previous" : l(i10, f30119i) ? "Next" : l(i10, f30120j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f30121a, obj);
    }

    public int hashCode() {
        return m(this.f30121a);
    }

    public final /* synthetic */ int o() {
        return this.f30121a;
    }

    public String toString() {
        return n(this.f30121a);
    }
}
