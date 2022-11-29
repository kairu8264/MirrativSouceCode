package b1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16721b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f16722c = g.a(0.0f, 0.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final long f16723d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e  reason: collision with root package name */
    public static final long f16724e = g.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    public final long f16725a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return f.f16723d;
        }

        public final long b() {
            return f.f16724e;
        }

        public final long c() {
            return f.f16722c;
        }
    }

    public /* synthetic */ f(long j10) {
        this.f16725a = j10;
    }

    public static final /* synthetic */ f d(long j10) {
        return new f(j10);
    }

    public static final float e(long j10) {
        return m(j10);
    }

    public static final float f(long j10) {
        return n(j10);
    }

    public static long g(long j10) {
        return j10;
    }

    public static final long h(long j10, float f10) {
        return g.a(m(j10) / f10, n(j10) / f10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).u();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final float k(long j10) {
        return (float) Math.sqrt((m(j10) * m(j10)) + (n(j10) * n(j10)));
    }

    public static final float l(long j10) {
        return (m(j10) * m(j10)) + (n(j10) * n(j10));
    }

    public static final float m(long j10) {
        if (j10 != f16724e) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float n(long j10) {
        if (j10 != f16724e) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        if ((Float.isNaN(m(j10)) || Float.isNaN(n(j10))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public static final long q(long j10, long j11) {
        return g.a(m(j10) - m(j11), n(j10) - n(j11));
    }

    public static final long r(long j10, long j11) {
        return g.a(m(j10) + m(j11), n(j10) + n(j11));
    }

    public static final long s(long j10, float f10) {
        return g.a(m(j10) * f10, n(j10) * f10);
    }

    public static String t(long j10) {
        if (g.c(j10)) {
            return "Offset(" + c.a(m(j10), 1) + ", " + c.a(n(j10), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    public boolean equals(Object obj) {
        return i(this.f16725a, obj);
    }

    public int hashCode() {
        return o(this.f16725a);
    }

    public String toString() {
        return t(this.f16725a);
    }

    public final /* synthetic */ long u() {
        return this.f16725a;
    }
}
