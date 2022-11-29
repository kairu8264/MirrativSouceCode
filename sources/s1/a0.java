package s1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final v0.w f51815a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<k, wn.v> f51816b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<k, wn.v> f51817c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<k, wn.v> f51818d;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Object, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f51819w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            jo.p.h(obj, "it");
            return Boolean.valueOf(!((z) obj).m0());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<k, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f51820w = new b();

        public b() {
            super(1);
        }

        public final void a(k kVar) {
            jo.p.h(kVar, "layoutNode");
            if (kVar.m0()) {
                k.i1(kVar, false, 1, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(k kVar) {
            a(kVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<k, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f51821w = new c();

        public c() {
            super(1);
        }

        public final void a(k kVar) {
            jo.p.h(kVar, "layoutNode");
            if (kVar.m0()) {
                k.i1(kVar, false, 1, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(k kVar) {
            a(kVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<k, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f51822w = new d();

        public d() {
            super(1);
        }

        public final void a(k kVar) {
            jo.p.h(kVar, "layoutNode");
            if (kVar.m0()) {
                k.k1(kVar, false, 1, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(k kVar) {
            a(kVar);
            return wn.v.f59242a;
        }
    }

    public a0(io.l<? super io.a<wn.v>, wn.v> lVar) {
        jo.p.h(lVar, "onChangedExecutor");
        this.f51815a = new v0.w(lVar);
        this.f51816b = d.f51822w;
        this.f51817c = b.f51820w;
        this.f51818d = c.f51821w;
    }

    public final void a() {
        this.f51815a.h(a.f51819w);
    }

    public final void b(k kVar, io.a<wn.v> aVar) {
        jo.p.h(kVar, "node");
        jo.p.h(aVar, "block");
        e(kVar, this.f51818d, aVar);
    }

    public final void c(k kVar, io.a<wn.v> aVar) {
        jo.p.h(kVar, "node");
        jo.p.h(aVar, "block");
        e(kVar, this.f51817c, aVar);
    }

    public final void d(k kVar, io.a<wn.v> aVar) {
        jo.p.h(kVar, "node");
        jo.p.h(aVar, "block");
        e(kVar, this.f51816b, aVar);
    }

    public final <T extends z> void e(T t10, io.l<? super T, wn.v> lVar, io.a<wn.v> aVar) {
        jo.p.h(t10, "target");
        jo.p.h(lVar, "onChanged");
        jo.p.h(aVar, "block");
        this.f51815a.j(t10, lVar, aVar);
    }

    public final void f() {
        this.f51815a.k();
    }

    public final void g() {
        this.f51815a.l();
        this.f51815a.g();
    }
}
