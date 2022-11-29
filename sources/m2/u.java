package m2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40549b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f40550c = v.a(0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final long f40551a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return u.f40550c;
        }
    }

    public /* synthetic */ u(long j10) {
        this.f40551a = j10;
    }

    public static final /* synthetic */ u b(long j10) {
        return new u(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final long d(long j10, float f10, float f11) {
        return v.a(f10, f11);
    }

    public static /* synthetic */ long e(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = i(j10);
        }
        return d(j10, f10, f11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof u) && j10 == ((u) obj).n();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        return v.a(h(j10) - h(j11), i(j10) - i(j11));
    }

    public static final long l(long j10, long j11) {
        return v.a(h(j10) + h(j11), i(j10) + i(j11));
    }

    public static String m(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f40551a, obj);
    }

    public int hashCode() {
        return j(this.f40551a);
    }

    public final /* synthetic */ long n() {
        return this.f40551a;
    }

    public String toString() {
        return m(this.f40551a);
    }
}
