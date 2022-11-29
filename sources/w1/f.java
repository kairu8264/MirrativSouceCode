package w1;

/* loaded from: classes.dex */
public final class f implements Comparable<f> {
    public static final a A = new a(null);
    public static b B = b.Stripe;

    /* renamed from: w  reason: collision with root package name */
    public final s1.k f57884w;

    /* renamed from: x  reason: collision with root package name */
    public final s1.k f57885x;

    /* renamed from: y  reason: collision with root package name */
    public final b1.h f57886y;

    /* renamed from: z  reason: collision with root package name */
    public final m2.q f57887z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final void a(b bVar) {
            jo.p.h(bVar, "<set-?>");
            f.B = bVar;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        Stripe,
        Location
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b1.h f57888w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b1.h hVar) {
            super(1);
            this.f57888w = hVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            jo.p.h(kVar, "it");
            s1.p e10 = z.e(kVar);
            return Boolean.valueOf(e10.h() && !jo.p.c(this.f57888w, q1.r.b(e10)));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b1.h f57889w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b1.h hVar) {
            super(1);
            this.f57889w = hVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            jo.p.h(kVar, "it");
            s1.p e10 = z.e(kVar);
            return Boolean.valueOf(e10.h() && !jo.p.c(this.f57889w, q1.r.b(e10)));
        }
    }

    public f(s1.k kVar, s1.k kVar2) {
        jo.p.h(kVar, "subtreeRoot");
        jo.p.h(kVar2, "node");
        this.f57884w = kVar;
        this.f57885x = kVar2;
        this.f57887z = kVar.getLayoutDirection();
        s1.p c02 = kVar.c0();
        s1.p e10 = z.e(kVar2);
        b1.h hVar = null;
        if (c02.h() && e10.h()) {
            hVar = q1.q.o(c02, e10, false, 2, null);
        }
        this.f57886y = hVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(f fVar) {
        jo.p.h(fVar, "other");
        b1.h hVar = this.f57886y;
        if (hVar == null) {
            return 1;
        }
        if (fVar.f57886y == null) {
            return -1;
        }
        if (B == b.Stripe) {
            if (hVar.e() - fVar.f57886y.l() <= 0.0f) {
                return -1;
            }
            if (this.f57886y.l() - fVar.f57886y.e() >= 0.0f) {
                return 1;
            }
        }
        if (this.f57887z == m2.q.Ltr) {
            int i10 = ((this.f57886y.i() - fVar.f57886y.i()) > 0.0f ? 1 : ((this.f57886y.i() - fVar.f57886y.i()) == 0.0f ? 0 : -1));
            if (!(i10 == 0)) {
                return i10 < 0 ? -1 : 1;
            }
        } else {
            int i11 = ((this.f57886y.j() - fVar.f57886y.j()) > 0.0f ? 1 : ((this.f57886y.j() - fVar.f57886y.j()) == 0.0f ? 0 : -1));
            if (!(i11 == 0)) {
                return i11 < 0 ? 1 : -1;
            }
        }
        int i12 = ((this.f57886y.l() - fVar.f57886y.l()) > 0.0f ? 1 : ((this.f57886y.l() - fVar.f57886y.l()) == 0.0f ? 0 : -1));
        if (!(i12 == 0)) {
            return i12 < 0 ? -1 : 1;
        }
        int i13 = ((this.f57886y.h() - fVar.f57886y.h()) > 0.0f ? 1 : ((this.f57886y.h() - fVar.f57886y.h()) == 0.0f ? 0 : -1));
        if (!(i13 == 0)) {
            return i13 < 0 ? 1 : -1;
        }
        int i14 = ((this.f57886y.n() - fVar.f57886y.n()) > 0.0f ? 1 : ((this.f57886y.n() - fVar.f57886y.n()) == 0.0f ? 0 : -1));
        if (!(i14 == 0)) {
            return i14 < 0 ? 1 : -1;
        }
        b1.h b10 = q1.r.b(z.e(this.f57885x));
        b1.h b11 = q1.r.b(z.e(fVar.f57885x));
        s1.k a10 = z.a(this.f57885x, new c(b10));
        s1.k a11 = z.a(fVar.f57885x, new d(b11));
        if (a10 == null || a11 == null) {
            return a10 != null ? 1 : -1;
        }
        return new f(this.f57884w, a10).compareTo(new f(fVar.f57884w, a11));
    }

    public final s1.k e() {
        return this.f57885x;
    }
}
