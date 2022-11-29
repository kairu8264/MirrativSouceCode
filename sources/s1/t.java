package s1;

/* loaded from: classes.dex */
public final class t implements io.a<wn.v>, z, r1.e {
    public static final c A = new c(null);
    public static final io.l<t, wn.v> B = b.f51951w;
    public static final r1.e C = new a();

    /* renamed from: w  reason: collision with root package name */
    public u f51947w;

    /* renamed from: x  reason: collision with root package name */
    public final r1.b f51948x;

    /* renamed from: y  reason: collision with root package name */
    public final m0.e<r1.a<?>> f51949y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f51950z;

    /* loaded from: classes.dex */
    public static final class a implements r1.e {
        @Override // r1.e
        public <T> T a(r1.a<T> aVar) {
            jo.p.h(aVar, "<this>");
            return aVar.a().invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<t, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f51951w = new b();

        public b() {
            super(1);
        }

        public final void a(t tVar) {
            jo.p.h(tVar, "node");
            tVar.i();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(t tVar) {
            a(tVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<wn.v> {
        public d() {
            super(0);
        }

        public final void a() {
            t.this.e().j0(t.this);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public t(u uVar, r1.b bVar) {
        jo.p.h(uVar, "provider");
        jo.p.h(bVar, "modifier");
        this.f51947w = uVar;
        this.f51948x = bVar;
        this.f51949y = new m0.e<>(new r1.a[16], 0);
    }

    @Override // r1.e
    public <T> T a(r1.a<T> aVar) {
        jo.p.h(aVar, "<this>");
        this.f51949y.c(aVar);
        r1.d<?> d10 = this.f51947w.d(aVar);
        if (d10 == null) {
            return aVar.a().invoke();
        }
        return (T) d10.getValue();
    }

    public final void b() {
        this.f51950z = true;
        i();
    }

    public final void c() {
        this.f51950z = true;
        f();
    }

    public final void d() {
        this.f51948x.j0(C);
        this.f51950z = false;
    }

    public final r1.b e() {
        return this.f51948x;
    }

    public final void f() {
        y t02 = this.f51947w.f().t0();
        if (t02 != null) {
            t02.l(this);
        }
    }

    public final void g(r1.a<?> aVar) {
        y t02;
        jo.p.h(aVar, "local");
        if (!this.f51949y.j(aVar) || (t02 = this.f51947w.f().t0()) == null) {
            return;
        }
        t02.l(this);
    }

    public void h() {
        i();
    }

    public final void i() {
        if (this.f51950z) {
            this.f51949y.h();
            o.a(this.f51947w.f()).getSnapshotObserver().e(this, B, new d());
        }
    }

    @Override // io.a
    public /* bridge */ /* synthetic */ wn.v invoke() {
        h();
        return wn.v.f59242a;
    }

    public final void j(u uVar) {
        jo.p.h(uVar, "<set-?>");
        this.f51947w = uVar;
    }

    @Override // s1.z
    public boolean m0() {
        return this.f51950z;
    }
}
