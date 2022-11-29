package b1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16742b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f16743c = m.a(0.0f, 0.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final long f16744d = m.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    public final long f16745a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return l.f16744d;
        }

        public final long b() {
            return l.f16743c;
        }
    }

    public /* synthetic */ l(long j10) {
        this.f16745a = j10;
    }

    public static final /* synthetic */ l c(long j10) {
        return new l(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).m();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        if (j10 != f16744d) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float h(long j10) {
        return Math.min(Math.abs(i(j10)), Math.abs(g(j10)));
    }

    public static final float i(long j10) {
        if (j10 != f16744d) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean k(long j10) {
        return i(j10) <= 0.0f || g(j10) <= 0.0f;
    }

    public static String l(long j10) {
        if (j10 != f16742b.a()) {
            return "Size(" + c.a(i(j10), 1) + ", " + c.a(g(j10), 1) + ')';
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return e(this.f16745a, obj);
    }

    public int hashCode() {
        return j(this.f16745a);
    }

    public final /* synthetic */ long m() {
        return this.f16745a;
    }

    public String toString() {
        return l(this.f16745a);
    }
}
