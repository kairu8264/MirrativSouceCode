package g1;

import c1.d0;
import l0.s0;
import l0.z1;
import wn.v;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: b  reason: collision with root package name */
    public final g1.b f32477b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32478c;

    /* renamed from: d  reason: collision with root package name */
    public final g1.a f32479d;

    /* renamed from: e  reason: collision with root package name */
    public io.a<v> f32480e;

    /* renamed from: f  reason: collision with root package name */
    public final s0 f32481f;

    /* renamed from: g  reason: collision with root package name */
    public float f32482g;

    /* renamed from: h  reason: collision with root package name */
    public float f32483h;

    /* renamed from: i  reason: collision with root package name */
    public long f32484i;

    /* renamed from: j  reason: collision with root package name */
    public final io.l<e1.e, v> f32485j;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<e1.e, v> {
        public a() {
            super(1);
        }

        public final void a(e1.e eVar) {
            jo.p.h(eVar, "$this$null");
            l.this.j().a(eVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(e1.e eVar) {
            a(eVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f32487w = new b();

        public b() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<v> {
        public c() {
            super(0);
        }

        public final void a() {
            l.this.f();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public l() {
        super(null);
        s0 e10;
        g1.b bVar = new g1.b();
        bVar.m(0.0f);
        bVar.n(0.0f);
        bVar.d(new c());
        this.f32477b = bVar;
        this.f32478c = true;
        this.f32479d = new g1.a();
        this.f32480e = b.f32487w;
        e10 = z1.e(null, null, 2, null);
        this.f32481f = e10;
        this.f32484i = b1.l.f16742b.a();
        this.f32485j = new a();
    }

    @Override // g1.j
    public void a(e1.e eVar) {
        jo.p.h(eVar, "<this>");
        g(eVar, 1.0f, null);
    }

    public final void f() {
        this.f32478c = true;
        this.f32480e.invoke();
    }

    public final void g(e1.e eVar, float f10, d0 d0Var) {
        jo.p.h(eVar, "<this>");
        if (d0Var == null) {
            d0Var = h();
        }
        if (this.f32478c || !b1.l.f(this.f32484i, eVar.c())) {
            this.f32477b.p(b1.l.i(eVar.c()) / this.f32482g);
            this.f32477b.q(b1.l.g(eVar.c()) / this.f32483h);
            this.f32479d.b(m2.p.a((int) Math.ceil(b1.l.i(eVar.c())), (int) Math.ceil(b1.l.g(eVar.c()))), eVar, eVar.getLayoutDirection(), this.f32485j);
            this.f32478c = false;
            this.f32484i = eVar.c();
        }
        this.f32479d.c(eVar, f10, d0Var);
    }

    public final d0 h() {
        return (d0) this.f32481f.getValue();
    }

    public final String i() {
        return this.f32477b.e();
    }

    public final g1.b j() {
        return this.f32477b;
    }

    public final float k() {
        return this.f32483h;
    }

    public final float l() {
        return this.f32482g;
    }

    public final void m(d0 d0Var) {
        this.f32481f.setValue(d0Var);
    }

    public final void n(io.a<v> aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f32480e = aVar;
    }

    public final void o(String str) {
        jo.p.h(str, "value");
        this.f32477b.l(str);
    }

    public final void p(float f10) {
        if (this.f32483h == f10) {
            return;
        }
        this.f32483h = f10;
        f();
    }

    public final void q(float f10) {
        if (this.f32482g == f10) {
            return;
        }
        this.f32482g = f10;
        f();
    }

    public String toString() {
        String str = "Params: \tname: " + i() + "\n\tviewportWidth: " + this.f32482g + "\n\tviewportHeight: " + this.f32483h + "\n";
        jo.p.g(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
