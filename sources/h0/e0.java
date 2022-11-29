package h0;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0.c1<d0> f33793a = l0.r.d(b.f33796w);

    /* renamed from: b  reason: collision with root package name */
    public static final l0.c1<m2.g> f33794b = l0.r.c(null, a.f33795w, 1, null);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<m2.g> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f33795w = new a();

        public a() {
            super(0);
        }

        public final float a() {
            return m2.g.l(0);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ m2.g invoke() {
            return m2.g.e(a());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f33796w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final d0 invoke() {
            return s.f34170a;
        }
    }

    public static final long b(long j10, float f10, l0.i iVar, int i10) {
        return c1.c0.k(i.b(j10, iVar, i10 & 14), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final l0.c1<m2.g> c() {
        return f33794b;
    }

    public static final l0.c1<d0> d() {
        return f33793a;
    }
}
