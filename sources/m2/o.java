package m2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40537b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f40538c = c(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f40539a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return o.f40538c;
        }
    }

    public /* synthetic */ o(long j10) {
        this.f40539a = j10;
    }

    public static final /* synthetic */ o b(long j10) {
        return new o(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof o) && j10 == ((o) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10) + " x " + f(j10);
    }

    public boolean equals(Object obj) {
        return d(this.f40539a, obj);
    }

    public int hashCode() {
        return h(this.f40539a);
    }

    public final /* synthetic */ long j() {
        return this.f40539a;
    }

    public String toString() {
        return i(this.f40539a);
    }
}
