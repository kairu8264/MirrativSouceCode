package j2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37107a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f37108b = c(1);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37109c = c(2);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37110d = c(3);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return k.f37108b;
        }

        public final int b() {
            return k.f37109c;
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
        return d(i10, f37108b) ? "Clip" : d(i10, f37109c) ? "Ellipsis" : d(i10, f37110d) ? "Visible" : "Invalid";
    }
}
