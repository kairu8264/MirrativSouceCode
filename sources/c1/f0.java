package c1;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18658a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f18659b = c(0);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18660c = c(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18661d = c(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18662e = c(3);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return f0.f18660c;
        }

        public final int b() {
            return f0.f18659b;
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return d(i10, f18659b) ? "None" : d(i10, f18660c) ? "Low" : d(i10, f18661d) ? "Medium" : d(i10, f18662e) ? "High" : "Unknown";
    }
}
