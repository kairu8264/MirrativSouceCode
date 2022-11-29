package m2;

import m2.g;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40520b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f40521c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f40522d;

    /* renamed from: a  reason: collision with root package name */
    public final long f40523a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return i.f40522d;
        }
    }

    static {
        float f10 = 0;
        f40521c = h.a(g.l(f10), g.l(f10));
        g.a aVar = g.f40516x;
        f40522d = h.a(aVar.b(), aVar.b());
    }

    public /* synthetic */ i(long j10) {
        this.f40523a = j10;
    }

    public static final /* synthetic */ i b(long j10) {
        return new i(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof i) && j10 == ((i) obj).i();
    }

    public static final float e(long j10) {
        if (j10 != f40522d) {
            jo.i iVar = jo.i.f38148a;
            return g.l(Float.intBitsToFloat((int) (j10 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float f(long j10) {
        if (j10 != f40522d) {
            jo.i iVar = jo.i.f38148a;
            return g.l(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        if (j10 != f40520b.a()) {
            return '(' + ((Object) g.p(e(j10))) + ", " + ((Object) g.p(f(j10))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return d(this.f40523a, obj);
    }

    public int hashCode() {
        return g(this.f40523a);
    }

    public final /* synthetic */ long i() {
        return this.f40523a;
    }

    public String toString() {
        return h(this.f40523a);
    }
}
