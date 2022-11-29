package m2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40528b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f40529c = l.a(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f40530a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return k.f40529c;
        }
    }

    public /* synthetic */ k(long j10) {
        this.f40530a = j10;
    }

    public static final /* synthetic */ k b(long j10) {
        return new k(j10);
    }

    public static final int c(long j10) {
        return j(j10);
    }

    public static final int d(long j10) {
        return k(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, int i10, int i11) {
        return l.a(i10, i11);
    }

    public static /* synthetic */ long g(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = j(j10);
        }
        if ((i12 & 2) != 0) {
            i11 = k(j10);
        }
        return f(j10, i10, i11);
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof k) && j10 == ((k) obj).n();
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int k(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static String m(long j10) {
        return '(' + j(j10) + ", " + k(j10) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f40530a, obj);
    }

    public int hashCode() {
        return l(this.f40530a);
    }

    public final /* synthetic */ long n() {
        return this.f40530a;
    }

    public String toString() {
        return m(this.f40530a);
    }
}
