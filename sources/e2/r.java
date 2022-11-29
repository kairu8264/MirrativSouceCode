package e2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30131a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f30132b = e(0);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30133c = e(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f30134d = e(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f30135e = e(3);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return r.f30133c;
        }

        public final int b() {
            return r.f30132b;
        }

        public final int c() {
            return r.f30135e;
        }

        public final int d() {
            return r.f30134d;
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
        return f(i10, f30132b) ? "None" : f(i10, f30133c) ? "Characters" : f(i10, f30134d) ? "Words" : f(i10, f30135e) ? "Sentences" : "Invalid";
    }
}
