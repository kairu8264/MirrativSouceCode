package m2;

import m2.g;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40524b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f40525c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f40526d;

    /* renamed from: a  reason: collision with root package name */
    public final long f40527a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return j.f40526d;
        }

        public final long b() {
            return j.f40525c;
        }
    }

    static {
        float f10 = 0;
        f40525c = h.b(g.l(f10), g.l(f10));
        g.a aVar = g.f40516x;
        f40526d = h.b(aVar.b(), aVar.b());
    }

    public /* synthetic */ j(long j10) {
        this.f40527a = j10;
    }

    public static final /* synthetic */ j c(long j10) {
        return new j(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).k();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        if (j10 != f40526d) {
            jo.i iVar = jo.i.f38148a;
            return g.l(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float h(long j10) {
        if (j10 != f40526d) {
            jo.i iVar = jo.i.f38148a;
            return g.l(Float.intBitsToFloat((int) (j10 >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        if (j10 != f40524b.a()) {
            return ((Object) g.p(h(j10))) + " x " + ((Object) g.p(g(j10)));
        }
        return "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return e(this.f40527a, obj);
    }

    public int hashCode() {
        return i(this.f40527a);
    }

    public final /* synthetic */ long k() {
        return this.f40527a;
    }

    public String toString() {
        return j(this.f40527a);
    }
}
