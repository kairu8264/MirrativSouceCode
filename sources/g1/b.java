package g1;

import c1.o0;
import c1.u0;
import java.util.ArrayList;
import java.util.List;
import wn.v;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: b  reason: collision with root package name */
    public float[] f32335b;

    /* renamed from: c  reason: collision with root package name */
    public final List<j> f32336c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends f> f32337d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32338e;

    /* renamed from: f  reason: collision with root package name */
    public u0 f32339f;

    /* renamed from: g  reason: collision with root package name */
    public h f32340g;

    /* renamed from: h  reason: collision with root package name */
    public io.a<v> f32341h;

    /* renamed from: i  reason: collision with root package name */
    public String f32342i;

    /* renamed from: j  reason: collision with root package name */
    public float f32343j;

    /* renamed from: k  reason: collision with root package name */
    public float f32344k;

    /* renamed from: l  reason: collision with root package name */
    public float f32345l;

    /* renamed from: m  reason: collision with root package name */
    public float f32346m;

    /* renamed from: n  reason: collision with root package name */
    public float f32347n;

    /* renamed from: o  reason: collision with root package name */
    public float f32348o;

    /* renamed from: p  reason: collision with root package name */
    public float f32349p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f32350q;

    public b() {
        super(null);
        this.f32336c = new ArrayList();
        this.f32337d = p.e();
        this.f32338e = true;
        this.f32342i = "";
        this.f32346m = 1.0f;
        this.f32347n = 1.0f;
        this.f32350q = true;
    }

    @Override // g1.j
    public void a(e1.e eVar) {
        jo.p.h(eVar, "<this>");
        if (this.f32350q) {
            u();
            this.f32350q = false;
        }
        if (this.f32338e) {
            t();
            this.f32338e = false;
        }
        e1.d M0 = eVar.M0();
        long c10 = M0.c();
        M0.e().p();
        e1.g d10 = M0.d();
        float[] fArr = this.f32335b;
        if (fArr != null) {
            d10.d(o0.a(fArr).n());
        }
        u0 u0Var = this.f32339f;
        if (g() && u0Var != null) {
            e1.g.f(d10, u0Var, 0, 2, null);
        }
        List<j> list = this.f32336c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(eVar);
        }
        M0.e().k();
        M0.f(c10);
    }

    @Override // g1.j
    public io.a<v> b() {
        return this.f32341h;
    }

    @Override // g1.j
    public void d(io.a<v> aVar) {
        this.f32341h = aVar;
        List<j> list = this.f32336c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).d(aVar);
        }
    }

    public final String e() {
        return this.f32342i;
    }

    public final int f() {
        return this.f32336c.size();
    }

    public final boolean g() {
        return !this.f32337d.isEmpty();
    }

    public final void h(int i10, j jVar) {
        jo.p.h(jVar, "instance");
        if (i10 < f()) {
            this.f32336c.set(i10, jVar);
        } else {
            this.f32336c.add(jVar);
        }
        jVar.d(b());
        c();
    }

    public final void i(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                this.f32336c.remove(i10);
                this.f32336c.add(i11, this.f32336c.get(i10));
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                this.f32336c.remove(i10);
                this.f32336c.add(i11 - 1, this.f32336c.get(i10));
                i13++;
            }
        }
        c();
    }

    public final void j(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.f32336c.size()) {
                this.f32336c.get(i10).d(null);
                this.f32336c.remove(i10);
            }
        }
        c();
    }

    public final void k(List<? extends f> list) {
        jo.p.h(list, "value");
        this.f32337d = list;
        this.f32338e = true;
        c();
    }

    public final void l(String str) {
        jo.p.h(str, "value");
        this.f32342i = str;
        c();
    }

    public final void m(float f10) {
        this.f32344k = f10;
        this.f32350q = true;
        c();
    }

    public final void n(float f10) {
        this.f32345l = f10;
        this.f32350q = true;
        c();
    }

    public final void o(float f10) {
        this.f32343j = f10;
        this.f32350q = true;
        c();
    }

    public final void p(float f10) {
        this.f32346m = f10;
        this.f32350q = true;
        c();
    }

    public final void q(float f10) {
        this.f32347n = f10;
        this.f32350q = true;
        c();
    }

    public final void r(float f10) {
        this.f32348o = f10;
        this.f32350q = true;
        c();
    }

    public final void s(float f10) {
        this.f32349p = f10;
        this.f32350q = true;
        c();
    }

    public final void t() {
        if (g()) {
            h hVar = this.f32340g;
            if (hVar == null) {
                hVar = new h();
                this.f32340g = hVar;
            } else {
                hVar.e();
            }
            u0 u0Var = this.f32339f;
            if (u0Var == null) {
                u0Var = c1.n.a();
                this.f32339f = u0Var;
            } else {
                u0Var.reset();
            }
            hVar.b(this.f32337d).D(u0Var);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f32342i);
        List<j> list = this.f32336c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("\t");
            sb2.append(list.get(i10).toString());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        jo.p.g(sb3, "sb.toString()");
        return sb3;
    }

    public final void u() {
        float[] fArr = this.f32335b;
        if (fArr == null) {
            fArr = o0.c(null, 1, null);
            this.f32335b = fArr;
        } else {
            o0.h(fArr);
        }
        o0.m(fArr, this.f32344k + this.f32348o, this.f32345l + this.f32349p, 0.0f, 4, null);
        o0.i(fArr, this.f32343j);
        o0.j(fArr, this.f32346m, this.f32347n, 1.0f);
        o0.m(fArr, -this.f32344k, -this.f32345l, 0.0f, 4, null);
    }
}
