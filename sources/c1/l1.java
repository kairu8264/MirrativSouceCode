package c1;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18718a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f18719b = e(0);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18720c = e(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18721d = e(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18722e = e(3);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return l1.f18719b;
        }

        public final int b() {
            return l1.f18722e;
        }

        public final int c() {
            return l1.f18721d;
        }

        public final int d() {
            return l1.f18720c;
        }
    }

    public static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f18719b) ? "Clamp" : f(i10, f18720c) ? "Repeated" : f(i10, f18721d) ? "Mirror" : f(i10, f18722e) ? "Decal" : "Unknown";
    }
}
