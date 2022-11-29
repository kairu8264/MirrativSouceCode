package m2;

import m2.t;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40540b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final t[] f40541c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f40542d;

    /* renamed from: a  reason: collision with root package name */
    public final long f40543a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return r.f40542d;
        }
    }

    static {
        t.a aVar = t.f40544b;
        f40541c = new t[]{t.d(aVar.c()), t.d(aVar.b()), t.d(aVar.a())};
        f40542d = s.f(0L, Float.NaN);
    }

    public /* synthetic */ r(long j10) {
        this.f40543a = j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).k();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f40541c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        long g10 = g(j10);
        t.a aVar = t.f40544b;
        if (t.g(g10, aVar.c())) {
            return "Unspecified";
        }
        if (t.g(g10, aVar.b())) {
            return h(j10) + ".sp";
        } else if (t.g(g10, aVar.a())) {
            return h(j10) + ".em";
        } else {
            return "Invalid";
        }
    }

    public boolean equals(Object obj) {
        return d(this.f40543a, obj);
    }

    public int hashCode() {
        return i(this.f40543a);
    }

    public final /* synthetic */ long k() {
        return this.f40543a;
    }

    public String toString() {
        return j(this.f40543a);
    }
}
