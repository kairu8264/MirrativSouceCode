package d1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28954a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final long f28955b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f28956c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f28957d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f28958e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return b.f28957d;
        }

        public final long b() {
            return b.f28955b;
        }

        public final long c() {
            return b.f28956c;
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f28955b = d((0 & 4294967295L) | j11);
        f28956c = d((1 & 4294967295L) | j11);
        f28957d = d(j11 | (2 & 4294967295L));
        f28958e = d((j10 & 4294967295L) | (4 << 32));
    }

    public static long d(long j10) {
        return j10;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f28955b) ? "Rgb" : e(j10, f28956c) ? "Xyz" : e(j10, f28957d) ? "Lab" : e(j10, f28958e) ? "Cmyk" : "Unknown";
    }
}
