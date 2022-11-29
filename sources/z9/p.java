package z9;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: m  reason: collision with root package name */
    public static final a f62874m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f62875a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62876b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62877c;

    /* renamed from: d  reason: collision with root package name */
    public final y1.d0 f62878d;

    /* renamed from: e  reason: collision with root package name */
    public final long f62879e;

    /* renamed from: f  reason: collision with root package name */
    public final y1.d0 f62880f;

    /* renamed from: g  reason: collision with root package name */
    public final long f62881g;

    /* renamed from: h  reason: collision with root package name */
    public final long f62882h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f62883i;

    /* renamed from: j  reason: collision with root package name */
    public final String f62884j;

    /* renamed from: k  reason: collision with root package name */
    public final float f62885k;

    /* renamed from: l  reason: collision with root package name */
    public final b f62886l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: z9.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C1086a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f62887a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.LowerRank.ordinal()] = 1;
                iArr[b.UpperRank.ordinal()] = 2;
                f62887a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p a(int i10, int i11) {
            long r10;
            String c10 = de.g.c(i10, false, 1, null);
            String valueOf = i11 > 0 ? String.valueOf(i11) : "1000+";
            boolean z10 = i11 > 0;
            o9.b bVar = o9.b.f44283a;
            y1.d0 c11 = bVar.b().c();
            long w10 = bVar.a().w();
            y1.d0 c12 = bVar.b().c();
            if (i11 == 1) {
                r10 = bVar.a().r();
            } else if (i11 == 2) {
                r10 = bVar.a().s();
            } else if (i11 != 3) {
                r10 = bVar.a().z();
            } else {
                r10 = bVar.a().t();
            }
            return new p(c10, valueOf, z10, c11, w10, c12, r10, bVar.a().z(), 1 <= i11 && i11 < 4, null, 0.0f, b.Broadcaster, 1536, null);
        }

        public final p b(int i10, int i11, int i12, b bVar) {
            int i13;
            String str;
            int i14;
            jo.p.h(bVar, "rowType");
            String c10 = de.g.c(i10, false, 1, null);
            String valueOf = i11 > 0 ? String.valueOf(i11) : "1000+";
            boolean z10 = i11 > 0;
            o9.b bVar2 = o9.b.f44283a;
            y1.d0 t10 = bVar2.b().t();
            long y10 = bVar2.a().y();
            y1.d0 q10 = bVar2.b().q();
            long y11 = bVar2.a().y();
            int i15 = C1086a.f62887a[bVar.ordinal()];
            if (i15 == 1) {
                if (i12 - i10 > 0) {
                    str = "(▼" + de.g.c(i13, false, 1, null) + ')';
                }
                str = "(--pt)";
            } else if (i15 != 2) {
                str = "";
            } else {
                if (i10 - i12 > 0) {
                    str = "(▲" + de.g.c(i14, false, 1, null) + ')';
                }
                str = "(--pt)";
            }
            return new p(c10, valueOf, z10, t10, y10, q10, y11, 0L, false, str, 0.5f, bVar, 384, null);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        UpperRank,
        Broadcaster,
        LowerRank
    }

    public p(String str, String str2, boolean z10, y1.d0 d0Var, long j10, y1.d0 d0Var2, long j11, long j12, boolean z11, String str3, float f10, b bVar) {
        this.f62875a = str;
        this.f62876b = str2;
        this.f62877c = z10;
        this.f62878d = d0Var;
        this.f62879e = j10;
        this.f62880f = d0Var2;
        this.f62881g = j11;
        this.f62882h = j12;
        this.f62883i = z11;
        this.f62884j = str3;
        this.f62885k = f10;
        this.f62886l = bVar;
    }

    public /* synthetic */ p(String str, String str2, boolean z10, y1.d0 d0Var, long j10, y1.d0 d0Var2, long j11, long j12, boolean z11, String str3, float f10, b bVar, jo.h hVar) {
        this(str, str2, z10, d0Var, j10, d0Var2, j11, j12, z11, str3, f10, bVar);
    }

    public final float a() {
        return this.f62885k;
    }

    public final String b() {
        return this.f62884j;
    }

    public final String c() {
        return this.f62875a;
    }

    public final long d() {
        return this.f62879e;
    }

    public final y1.d0 e() {
        return this.f62878d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return jo.p.c(this.f62875a, pVar.f62875a) && jo.p.c(this.f62876b, pVar.f62876b) && this.f62877c == pVar.f62877c && jo.p.c(this.f62878d, pVar.f62878d) && c1.c0.m(this.f62879e, pVar.f62879e) && jo.p.c(this.f62880f, pVar.f62880f) && c1.c0.m(this.f62881g, pVar.f62881g) && c1.c0.m(this.f62882h, pVar.f62882h) && this.f62883i == pVar.f62883i && jo.p.c(this.f62884j, pVar.f62884j) && jo.p.c(Float.valueOf(this.f62885k), Float.valueOf(pVar.f62885k)) && this.f62886l == pVar.f62886l;
        }
        return false;
    }

    public final String f() {
        return this.f62876b;
    }

    public final long g() {
        return this.f62881g;
    }

    public final y1.d0 h() {
        return this.f62880f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f62875a.hashCode() * 31) + this.f62876b.hashCode()) * 31;
        boolean z10 = this.f62877c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((((((hashCode + i10) * 31) + this.f62878d.hashCode()) * 31) + c1.c0.s(this.f62879e)) * 31) + this.f62880f.hashCode()) * 31) + c1.c0.s(this.f62881g)) * 31) + c1.c0.s(this.f62882h)) * 31;
        boolean z11 = this.f62883i;
        return ((((((hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f62884j.hashCode()) * 31) + Float.hashCode(this.f62885k)) * 31) + this.f62886l.hashCode();
    }

    public final long i() {
        return this.f62882h;
    }

    public final b j() {
        return this.f62886l;
    }

    public final boolean k() {
        return this.f62883i;
    }

    public final boolean l() {
        return this.f62877c;
    }

    public String toString() {
        return "GiftRankingImmediateRankPointBindModel(pointText=" + this.f62875a + ", rankText=" + this.f62876b + ", isVisibleRankUnitText=" + this.f62877c + ", pointTextStyle=" + this.f62878d + ", pointTextColor=" + ((Object) c1.c0.t(this.f62879e)) + ", rankTextStyle=" + this.f62880f + ", rankTextColor=" + ((Object) c1.c0.t(this.f62881g)) + ", rankUnitTextColor=" + ((Object) c1.c0.t(this.f62882h)) + ", isVisibleRankCrown=" + this.f62883i + ", diffText=" + this.f62884j + ", alpha=" + this.f62885k + ", type=" + this.f62886l + ')';
    }

    public /* synthetic */ p(String str, String str2, boolean z10, y1.d0 d0Var, long j10, y1.d0 d0Var2, long j11, long j12, boolean z11, String str3, float f10, b bVar, int i10, jo.h hVar) {
        this(str, str2, z10, d0Var, j10, d0Var2, j11, (i10 & 128) != 0 ? j11 : j12, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? "" : str3, (i10 & 1024) != 0 ? 1.0f : f10, bVar, null);
    }
}
