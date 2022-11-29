package cf;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: l  reason: collision with root package name */
    public static final a f19546l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f19547m = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f19548a;

    /* renamed from: b  reason: collision with root package name */
    public final double f19549b;

    /* renamed from: c  reason: collision with root package name */
    public k f19550c;

    /* renamed from: d  reason: collision with root package name */
    public int f19551d;

    /* renamed from: e  reason: collision with root package name */
    public int f19552e;

    /* renamed from: f  reason: collision with root package name */
    public int f19553f;

    /* renamed from: g  reason: collision with root package name */
    public int f19554g;

    /* renamed from: h  reason: collision with root package name */
    public int f19555h;

    /* renamed from: i  reason: collision with root package name */
    public final int f19556i;

    /* renamed from: j  reason: collision with root package name */
    public int f19557j;

    /* renamed from: k  reason: collision with root package name */
    public b f19558k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        OPEN,
        RECOVERY
    }

    /* loaded from: classes2.dex */
    public enum c {
        SLOW_START,
        CONGESTION_AVOIDANCE,
        KEEP,
        FULL
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19559a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.SLOW_START.ordinal()] = 1;
            iArr[c.CONGESTION_AVOIDANCE.ordinal()] = 2;
            iArr[c.KEEP.ordinal()] = 3;
            iArr[c.FULL.ordinal()] = 4;
            f19559a = iArr;
        }
    }

    public j(int i10, double d10) {
        this.f19548a = i10;
        this.f19549b = d10;
        b bVar = b.OPEN;
        this.f19558k = bVar;
        j(bVar);
    }

    public final int a() {
        return (int) (this.f19557j * (1.0d - this.f19549b));
    }

    public final c b() {
        int i10 = this.f19554g;
        if (i10 < this.f19553f) {
            return c.SLOW_START;
        }
        if (this.f19551d < this.f19555h) {
            return c.KEEP;
        }
        if (i10 < this.f19557j) {
            return c.CONGESTION_AVOIDANCE;
        }
        return c.FULL;
    }

    public final void c() {
        int i10 = this.f19555h;
        if (i10 >= 180) {
            return;
        }
        this.f19555h = i10 + 10;
    }

    public final void d() {
        int i10 = this.f19552e + 1;
        this.f19552e = i10;
        this.f19551d = 0;
        if (i10 <= this.f19556i) {
            return;
        }
        j(b.RECOVERY);
    }

    public final void e() {
        if (this.f19557j < 1) {
            return;
        }
        j(b.OPEN);
        this.f19551d++;
        int i10 = d.f19559a[b().ordinal()];
        if (i10 == 1) {
            g(Math.min(this.f19554g + (this.f19548a * 2), this.f19557j));
        } else if (i10 == 2) {
            g(Math.min(this.f19554g + this.f19548a, this.f19557j));
        } else if (i10 != 4) {
        } else {
            f();
        }
    }

    public final void f() {
        this.f19555h = 0;
    }

    public final void g(int i10) {
        if (this.f19554g == i10) {
            return;
        }
        this.f19554g = i10;
        k kVar = this.f19550c;
        if (kVar != null) {
            kVar.c(i10);
        }
    }

    public final void h(k kVar) {
        this.f19550c = kVar;
    }

    public final void i(int i10) {
        if (i10 < 1) {
            return;
        }
        if (i10 > 0 && this.f19557j == 0) {
            this.f19553f = i10;
            g(a());
            this.f19557j = i10;
            return;
        }
        if (this.f19558k == b.OPEN && b() == c.FULL) {
            g(i10);
        }
        this.f19557j = i10;
    }

    public final void j(b bVar) {
        if (this.f19558k == bVar) {
            return;
        }
        if (bVar == b.RECOVERY) {
            c();
            this.f19553f = (int) (this.f19554g * 0.8d);
            g(Math.max(a(), 64000));
        }
        this.f19558k = bVar;
    }
}
