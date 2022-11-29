package e2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30136a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f30137b = j(1);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30138c = j(2);

    /* renamed from: d  reason: collision with root package name */
    public static final int f30139d = j(3);

    /* renamed from: e  reason: collision with root package name */
    public static final int f30140e = j(4);

    /* renamed from: f  reason: collision with root package name */
    public static final int f30141f = j(5);

    /* renamed from: g  reason: collision with root package name */
    public static final int f30142g = j(6);

    /* renamed from: h  reason: collision with root package name */
    public static final int f30143h = j(7);

    /* renamed from: i  reason: collision with root package name */
    public static final int f30144i = j(8);

    /* renamed from: j  reason: collision with root package name */
    public static final int f30145j = j(9);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return s.f30138c;
        }

        public final int b() {
            return s.f30145j;
        }

        public final int c() {
            return s.f30142g;
        }

        public final int d() {
            return s.f30139d;
        }

        public final int e() {
            return s.f30144i;
        }

        public final int f() {
            return s.f30143h;
        }

        public final int g() {
            return s.f30140e;
        }

        public final int h() {
            return s.f30137b;
        }

        public final int i() {
            return s.f30141f;
        }
    }

    public static int j(int i10) {
        return i10;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        return k(i10, f30137b) ? "Text" : k(i10, f30138c) ? "Ascii" : k(i10, f30139d) ? "Number" : k(i10, f30140e) ? "Phone" : k(i10, f30141f) ? "Uri" : k(i10, f30142g) ? "Email" : k(i10, f30143h) ? "Password" : k(i10, f30144i) ? "NumberPassword" : k(i10, f30145j) ? "Decimal" : "Invalid";
    }
}
