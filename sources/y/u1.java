package y;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60981a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f60982b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f60983c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f60984d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f60985e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f60986f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f60987g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f60988h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f60989i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f60990j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f60991k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f60992l;

    /* renamed from: m  reason: collision with root package name */
    public static final int f60993m;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return u1.f60982b;
        }

        public final int b() {
            return u1.f60984d;
        }

        public final int c() {
            return u1.f60983c;
        }

        public final int d() {
            return u1.f60985e;
        }

        public final int e() {
            return u1.f60989i;
        }

        public final int f() {
            return u1.f60987g;
        }

        public final int g() {
            return u1.f60990j;
        }

        public final int h() {
            return u1.f60991k;
        }

        public final int i() {
            return u1.f60986f;
        }

        public final int j() {
            return u1.f60988h;
        }
    }

    static {
        int k10 = k(8);
        f60982b = k10;
        int k11 = k(4);
        f60983c = k11;
        int k12 = k(2);
        f60984d = k12;
        int k13 = k(1);
        f60985e = k13;
        f60986f = o(k10, k13);
        f60987g = o(k11, k12);
        int k14 = k(16);
        f60988h = k14;
        int k15 = k(32);
        f60989i = k15;
        int o10 = o(k10, k12);
        f60990j = o10;
        int o11 = o(k11, k13);
        f60991k = o11;
        f60992l = o(o10, o11);
        f60993m = o(k14, k15);
    }

    public static int k(int i10) {
        return i10;
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean m(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int o(int i10, int i11) {
        return k(i10 | i11);
    }

    public static String p(int i10) {
        return "WindowInsetsSides(" + q(i10) + ')';
    }

    public static final String q(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f60986f;
        if ((i10 & i11) == i11) {
            r(sb2, "Start");
        }
        int i12 = f60990j;
        if ((i10 & i12) == i12) {
            r(sb2, "Left");
        }
        int i13 = f60988h;
        if ((i10 & i13) == i13) {
            r(sb2, "Top");
        }
        int i14 = f60987g;
        if ((i10 & i14) == i14) {
            r(sb2, "End");
        }
        int i15 = f60991k;
        if ((i10 & i15) == i15) {
            r(sb2, "Right");
        }
        int i16 = f60989i;
        if ((i10 & i16) == i16) {
            r(sb2, "Bottom");
        }
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final void r(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }
}
