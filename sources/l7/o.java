package l7;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c  reason: collision with root package name */
    public static final o f39650c = new b().f().c();

    /* renamed from: d  reason: collision with root package name */
    public static final o f39651d = new b().e().c();

    /* renamed from: e  reason: collision with root package name */
    public static final o f39652e = new b().d().c();

    /* renamed from: a  reason: collision with root package name */
    public c f39653a;

    /* renamed from: b  reason: collision with root package name */
    public int f39654b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public c f39655a;

        /* renamed from: b  reason: collision with root package name */
        public int f39656b;

        public o c() {
            return new o(this);
        }

        public b d() {
            this.f39655a = c.CACHE_ALL;
            return this;
        }

        public b e() {
            this.f39655a = c.CACHE_AUTO;
            return this;
        }

        public b f() {
            this.f39655a = c.CACHE_NONE;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        CACHE_NONE,
        CACHE_LIMITED,
        CACHE_AUTO,
        CACHE_ALL
    }

    public boolean a() {
        return this.f39653a == c.CACHE_ALL;
    }

    public int b() {
        return this.f39654b;
    }

    public boolean c() {
        return this.f39653a == c.CACHE_NONE;
    }

    public o(b bVar) {
        this.f39653a = bVar.f39655a;
        this.f39654b = bVar.f39656b;
    }
}
