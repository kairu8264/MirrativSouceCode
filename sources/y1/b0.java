package y1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61064b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f61065c = c0.a(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f61066a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return b0.f61065c;
        }
    }

    public /* synthetic */ b0(long j10) {
        this.f61066a = j10;
    }

    public static final /* synthetic */ b0 b(long j10) {
        return new b0(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final boolean d(long j10, long j11) {
        return l(j10) <= l(j11) && k(j11) <= k(j10);
    }

    public static final boolean e(long j10, int i10) {
        return i10 < k(j10) && l(j10) <= i10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).r();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean h(long j10) {
        return n(j10) == i(j10);
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        return n(j10) > i(j10) ? n(j10) : i(j10);
    }

    public static final int l(long j10) {
        return n(j10) > i(j10) ? i(j10) : n(j10);
    }

    public static final boolean m(long j10) {
        return n(j10) > i(j10);
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10, long j11) {
        return l(j10) < k(j11) && l(j11) < k(j10);
    }

    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f61066a, obj);
    }

    public int hashCode() {
        return o(this.f61066a);
    }

    public final /* synthetic */ long r() {
        return this.f61066a;
    }

    public String toString() {
        return q(this.f61066a);
    }
}
