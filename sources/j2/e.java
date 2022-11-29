package j2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37075b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37076c = h(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37077d = h(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f37078e = h(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f37079f = h(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f37080g = h(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f37081h = h(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f37082a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return e.f37078e;
        }

        public final int b() {
            return e.f37081h;
        }

        public final int c() {
            return e.f37079f;
        }

        public final int d() {
            return e.f37076c;
        }

        public final int e() {
            return e.f37077d;
        }

        public final int f() {
            return e.f37080g;
        }
    }

    public /* synthetic */ e(int i10) {
        this.f37082a = i10;
    }

    public static final /* synthetic */ e g(int i10) {
        return new e(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        return j(i10, f37076c) ? "Left" : j(i10, f37077d) ? "Right" : j(i10, f37078e) ? "Center" : j(i10, f37079f) ? "Justify" : j(i10, f37080g) ? "Start" : j(i10, f37081h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f37082a, obj);
    }

    public int hashCode() {
        return k(this.f37082a);
    }

    public final /* synthetic */ int m() {
        return this.f37082a;
    }

    public String toString() {
        return l(this.f37082a);
    }
}
