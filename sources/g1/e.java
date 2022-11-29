package g1;

import c1.u0;
import c1.x0;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: b  reason: collision with root package name */
    public String f32383b;

    /* renamed from: c  reason: collision with root package name */
    public c1.u f32384c;

    /* renamed from: d  reason: collision with root package name */
    public float f32385d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends f> f32386e;

    /* renamed from: f  reason: collision with root package name */
    public int f32387f;

    /* renamed from: g  reason: collision with root package name */
    public float f32388g;

    /* renamed from: h  reason: collision with root package name */
    public float f32389h;

    /* renamed from: i  reason: collision with root package name */
    public c1.u f32390i;

    /* renamed from: j  reason: collision with root package name */
    public int f32391j;

    /* renamed from: k  reason: collision with root package name */
    public int f32392k;

    /* renamed from: l  reason: collision with root package name */
    public float f32393l;

    /* renamed from: m  reason: collision with root package name */
    public float f32394m;

    /* renamed from: n  reason: collision with root package name */
    public float f32395n;

    /* renamed from: o  reason: collision with root package name */
    public float f32396o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f32397p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f32398q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f32399r;

    /* renamed from: s  reason: collision with root package name */
    public e1.j f32400s;

    /* renamed from: t  reason: collision with root package name */
    public final u0 f32401t;

    /* renamed from: u  reason: collision with root package name */
    public final u0 f32402u;

    /* renamed from: v  reason: collision with root package name */
    public final wn.f f32403v;

    /* renamed from: w  reason: collision with root package name */
    public final h f32404w;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<x0> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f32405w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final x0 invoke() {
            return c1.m.a();
        }
    }

    public e() {
        super(null);
        this.f32383b = "";
        this.f32385d = 1.0f;
        this.f32386e = p.e();
        this.f32387f = p.b();
        this.f32388g = 1.0f;
        this.f32391j = p.c();
        this.f32392k = p.d();
        this.f32393l = 4.0f;
        this.f32395n = 1.0f;
        this.f32397p = true;
        this.f32398q = true;
        this.f32399r = true;
        this.f32401t = c1.n.a();
        this.f32402u = c1.n.a();
        this.f32403v = wn.g.b(wn.i.NONE, a.f32405w);
        this.f32404w = new h();
    }

    @Override // g1.j
    public void a(e1.e eVar) {
        jo.p.h(eVar, "<this>");
        if (this.f32397p) {
            t();
        } else if (this.f32399r) {
            u();
        }
        this.f32397p = false;
        this.f32399r = false;
        c1.u uVar = this.f32384c;
        if (uVar != null) {
            e1.e.K0(eVar, this.f32402u, uVar, this.f32385d, null, null, 0, 56, null);
        }
        c1.u uVar2 = this.f32390i;
        if (uVar2 != null) {
            e1.j jVar = this.f32400s;
            if (this.f32398q || jVar == null) {
                jVar = new e1.j(this.f32389h, this.f32393l, this.f32391j, this.f32392k, null, 16, null);
                this.f32400s = jVar;
                this.f32398q = false;
            }
            e1.e.K0(eVar, this.f32402u, uVar2, this.f32388g, jVar, null, 0, 48, null);
        }
    }

    public final x0 e() {
        return (x0) this.f32403v.getValue();
    }

    public final void f(c1.u uVar) {
        this.f32384c = uVar;
        c();
    }

    public final void g(float f10) {
        this.f32385d = f10;
        c();
    }

    public final void h(String str) {
        jo.p.h(str, "value");
        this.f32383b = str;
        c();
    }

    public final void i(List<? extends f> list) {
        jo.p.h(list, "value");
        this.f32386e = list;
        this.f32397p = true;
        c();
    }

    public final void j(int i10) {
        this.f32387f = i10;
        this.f32402u.i(i10);
        c();
    }

    public final void k(c1.u uVar) {
        this.f32390i = uVar;
        c();
    }

    public final void l(float f10) {
        this.f32388g = f10;
        c();
    }

    public final void m(int i10) {
        this.f32391j = i10;
        this.f32398q = true;
        c();
    }

    public final void n(int i10) {
        this.f32392k = i10;
        this.f32398q = true;
        c();
    }

    public final void o(float f10) {
        this.f32393l = f10;
        this.f32398q = true;
        c();
    }

    public final void p(float f10) {
        this.f32389h = f10;
        c();
    }

    public final void q(float f10) {
        if (this.f32395n == f10) {
            return;
        }
        this.f32395n = f10;
        this.f32399r = true;
        c();
    }

    public final void r(float f10) {
        if (this.f32396o == f10) {
            return;
        }
        this.f32396o = f10;
        this.f32399r = true;
        c();
    }

    public final void s(float f10) {
        if (this.f32394m == f10) {
            return;
        }
        this.f32394m = f10;
        this.f32399r = true;
        c();
    }

    public final void t() {
        this.f32404w.e();
        this.f32401t.reset();
        this.f32404w.b(this.f32386e).D(this.f32401t);
        u();
    }

    public String toString() {
        return this.f32401t.toString();
    }

    public final void u() {
        this.f32402u.reset();
        if (this.f32394m == 0.0f) {
            if (this.f32395n == 1.0f) {
                u0.a(this.f32402u, this.f32401t, 0L, 2, null);
                return;
            }
        }
        e().a(this.f32401t, false);
        float length = e().getLength();
        float f10 = this.f32394m;
        float f11 = this.f32396o;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f32395n + f11) % 1.0f) * length;
        if (f12 > f13) {
            e().b(f12, length, this.f32402u, true);
            e().b(0.0f, f13, this.f32402u, true);
            return;
        }
        e().b(f12, f13, this.f32402u, true);
    }
}
