package h0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33870b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33871c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f33872d = c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f33873a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return g0.f33872d;
        }
    }

    public /* synthetic */ g0(int i10) {
        this.f33873a = i10;
    }

    public static final /* synthetic */ g0 b(int i10) {
        return new g0(i10);
    }

    public static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof g0) && i10 == ((g0) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f33871c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return d(this.f33873a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f33873a;
    }

    public int hashCode() {
        return f(this.f33873a);
    }

    public String toString() {
        return g(this.f33873a);
    }
}
