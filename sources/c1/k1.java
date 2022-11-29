package c1;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18705b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18706c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18707d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18708e = e(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f18709a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return k1.f18708e;
        }

        public final int b() {
            return k1.f18706c;
        }

        public final int c() {
            return k1.f18707d;
        }
    }

    public /* synthetic */ k1(int i10) {
        this.f18709a = i10;
    }

    public static final /* synthetic */ k1 d(int i10) {
        return new k1(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof k1) && i10 == ((k1) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return g(i10, f18706c) ? "Miter" : g(i10, f18707d) ? "Round" : g(i10, f18708e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f18709a, obj);
    }

    public int hashCode() {
        return h(this.f18709a);
    }

    public final /* synthetic */ int j() {
        return this.f18709a;
    }

    public String toString() {
        return i(this.f18709a);
    }
}
