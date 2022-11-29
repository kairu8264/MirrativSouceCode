package n1;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41449a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f41450b = f(0);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41451c = f(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f41452d = f(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f41453e = f(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f41454f = f(4);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return j0.f41454f;
        }

        public final int b() {
            return j0.f41452d;
        }

        public final int c() {
            return j0.f41453e;
        }

        public final int d() {
            return j0.f41451c;
        }

        public final int e() {
            return j0.f41450b;
        }
    }

    public static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
