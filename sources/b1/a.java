package b1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0093a f16715a = new C0093a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final long f16716b = b.b(0.0f, 0.0f, 2, null);

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0093a {
        public C0093a() {
        }

        public /* synthetic */ C0093a(jo.h hVar) {
            this();
        }

        public final long a() {
            return a.f16716b;
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        if (d(j10) == e(j10)) {
            return "CornerRadius.circular(" + c.a(d(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(d(j10), 1) + ", " + c.a(e(j10), 1) + ')';
    }
}
