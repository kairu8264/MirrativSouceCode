package d2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f29139b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f29140c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f29141d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f29142a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return u.f29141d;
        }

        public final int b() {
            return u.f29140c;
        }
    }

    public /* synthetic */ u(int i10) {
        this.f29142a = i10;
    }

    public static final /* synthetic */ u c(int i10) {
        return new u(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof u) && i10 == ((u) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f29140c) ? "Normal" : f(i10, f29141d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f29142a, obj);
    }

    public int hashCode() {
        return g(this.f29142a);
    }

    public final /* synthetic */ int i() {
        return this.f29142a;
    }

    public String toString() {
        return h(this.f29142a);
    }
}
