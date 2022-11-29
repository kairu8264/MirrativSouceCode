package d2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29135a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f29136b = d(0);

    /* renamed from: c  reason: collision with root package name */
    public static final int f29137c = d(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f29138d = d(2);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return s.f29138d;
        }

        public final int b() {
            return s.f29136b;
        }

        public final int c() {
            return s.f29137c;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        if (e(i10, f29136b)) {
            return "Blocking";
        }
        if (e(i10, f29137c)) {
            return "Optional";
        }
        if (e(i10, f29138d)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }
}
