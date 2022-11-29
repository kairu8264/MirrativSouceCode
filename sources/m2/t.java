package m2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40544b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f40545c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f40546d = e(4294967296L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f40547e = e(8589934592L);

    /* renamed from: a  reason: collision with root package name */
    public final long f40548a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return t.f40547e;
        }

        public final long b() {
            return t.f40546d;
        }

        public final long c() {
            return t.f40545c;
        }
    }

    public /* synthetic */ t(long j10) {
        this.f40548a = j10;
    }

    public static final /* synthetic */ t d(long j10) {
        return new t(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof t) && j10 == ((t) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10, f40545c) ? "Unspecified" : g(j10, f40546d) ? "Sp" : g(j10, f40547e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f40548a, obj);
    }

    public int hashCode() {
        return h(this.f40548a);
    }

    public final /* synthetic */ long j() {
        return this.f40548a;
    }

    public String toString() {
        return i(this.f40548a);
    }
}
