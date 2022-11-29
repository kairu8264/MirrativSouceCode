package c1;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18634b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f18635c = e0.c(4278190080L);

    /* renamed from: d  reason: collision with root package name */
    public static final long f18636d = e0.c(4282664004L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f18637e = e0.c(4287137928L);

    /* renamed from: f  reason: collision with root package name */
    public static final long f18638f = e0.c(4291611852L);

    /* renamed from: g  reason: collision with root package name */
    public static final long f18639g = e0.c(4294967295L);

    /* renamed from: h  reason: collision with root package name */
    public static final long f18640h = e0.c(4294901760L);

    /* renamed from: i  reason: collision with root package name */
    public static final long f18641i = e0.c(4278255360L);

    /* renamed from: j  reason: collision with root package name */
    public static final long f18642j = e0.c(4278190335L);

    /* renamed from: k  reason: collision with root package name */
    public static final long f18643k = e0.c(4294967040L);

    /* renamed from: l  reason: collision with root package name */
    public static final long f18644l = e0.c(4278255615L);

    /* renamed from: m  reason: collision with root package name */
    public static final long f18645m = e0.c(4294902015L);

    /* renamed from: n  reason: collision with root package name */
    public static final long f18646n = e0.b(0);

    /* renamed from: o  reason: collision with root package name */
    public static final long f18647o = e0.a(0.0f, 0.0f, 0.0f, 0.0f, d1.e.f28963a.t());

    /* renamed from: a  reason: collision with root package name */
    public final long f18648a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return c0.f18635c;
        }

        public final long b() {
            return c0.f18642j;
        }

        public final long c() {
            return c0.f18640h;
        }

        public final long d() {
            return c0.f18646n;
        }

        public final long e() {
            return c0.f18647o;
        }

        public final long f() {
            return c0.f18639g;
        }
    }

    public /* synthetic */ c0(long j10) {
        this.f18648a = j10;
    }

    public static final /* synthetic */ c0 g(long j10) {
        return new c0(j10);
    }

    public static long h(long j10) {
        return j10;
    }

    public static final long i(long j10, d1.c cVar) {
        jo.p.h(cVar, "colorSpace");
        if (jo.p.c(cVar, p(j10))) {
            return j10;
        }
        d1.f i10 = d1.d.i(p(j10), cVar, 0, 2, null);
        float[] d10 = e0.d(j10);
        i10.a(d10);
        return e0.a(d10[0], d10[1], d10[2], d10[3], cVar);
    }

    public static final long j(long j10, float f10, float f11, float f12, float f13) {
        return e0.a(f11, f12, f13, f10, p(j10));
    }

    public static /* synthetic */ long k(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = n(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = r(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = q(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = o(j10);
        }
        return j(j10, f14, f15, f16, f13);
    }

    public static boolean l(long j10, Object obj) {
        return (obj instanceof c0) && j10 == ((c0) obj).u();
    }

    public static final boolean m(long j10, long j11) {
        return j10 == j11;
    }

    public static final float n(long j10) {
        float b10;
        float f10;
        if (wn.t.c(63 & j10) == 0) {
            b10 = (float) wn.x.b(wn.t.c(wn.t.c(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            b10 = (float) wn.x.b(wn.t.c(wn.t.c(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return b10 / f10;
    }

    public static final float o(long j10) {
        if (wn.t.c(63 & j10) == 0) {
            return ((float) wn.x.b(wn.t.c(wn.t.c(j10 >>> 32) & 255))) / 255.0f;
        }
        return g0.e(g0.c((short) wn.t.c(wn.t.c(j10 >>> 16) & 65535)));
    }

    public static final d1.c p(long j10) {
        return d1.e.f28963a.h()[(int) wn.t.c(j10 & 63)];
    }

    public static final float q(long j10) {
        if (wn.t.c(63 & j10) == 0) {
            return ((float) wn.x.b(wn.t.c(wn.t.c(j10 >>> 40) & 255))) / 255.0f;
        }
        return g0.e(g0.c((short) wn.t.c(wn.t.c(j10 >>> 32) & 65535)));
    }

    public static final float r(long j10) {
        if (wn.t.c(63 & j10) == 0) {
            return ((float) wn.x.b(wn.t.c(wn.t.c(j10 >>> 48) & 255))) / 255.0f;
        }
        return g0.e(g0.c((short) wn.t.c(wn.t.c(j10 >>> 48) & 65535)));
    }

    public static int s(long j10) {
        return wn.t.h(j10);
    }

    public static String t(long j10) {
        return "Color(" + r(j10) + ", " + q(j10) + ", " + o(j10) + ", " + n(j10) + ", " + p(j10).g() + ')';
    }

    public boolean equals(Object obj) {
        return l(this.f18648a, obj);
    }

    public int hashCode() {
        return s(this.f18648a);
    }

    public String toString() {
        return t(this.f18648a);
    }

    public final /* synthetic */ long u() {
        return this.f18648a;
    }
}
