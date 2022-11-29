package c1;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class h implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public Paint f18672a = i.i();

    /* renamed from: b  reason: collision with root package name */
    public int f18673b = r.f18740b.B();

    /* renamed from: c  reason: collision with root package name */
    public Shader f18674c;

    /* renamed from: d  reason: collision with root package name */
    public d0 f18675d;

    /* renamed from: e  reason: collision with root package name */
    public v0 f18676e;

    @Override // c1.s0
    public long a() {
        return i.c(this.f18672a);
    }

    @Override // c1.s0
    public void b(float f10) {
        i.j(this.f18672a, f10);
    }

    @Override // c1.s0
    public void c(int i10) {
        i.q(this.f18672a, i10);
    }

    @Override // c1.s0
    public void d(int i10) {
        this.f18673b = i10;
        i.k(this.f18672a, i10);
    }

    @Override // c1.s0
    public d0 e() {
        return this.f18675d;
    }

    @Override // c1.s0
    public void f(v0 v0Var) {
        i.o(this.f18672a, v0Var);
        this.f18676e = v0Var;
    }

    @Override // c1.s0
    public void g(int i10) {
        i.n(this.f18672a, i10);
    }

    @Override // c1.s0
    public int h() {
        return i.e(this.f18672a);
    }

    @Override // c1.s0
    public void i(int i10) {
        i.r(this.f18672a, i10);
    }

    @Override // c1.s0
    public void j(d0 d0Var) {
        this.f18675d = d0Var;
        i.m(this.f18672a, d0Var);
    }

    @Override // c1.s0
    public float k() {
        return i.b(this.f18672a);
    }

    @Override // c1.s0
    public void l(long j10) {
        i.l(this.f18672a, j10);
    }

    @Override // c1.s0
    public v0 m() {
        return this.f18676e;
    }

    @Override // c1.s0
    public int n() {
        return this.f18673b;
    }

    @Override // c1.s0
    public int o() {
        return i.f(this.f18672a);
    }

    @Override // c1.s0
    public float p() {
        return i.g(this.f18672a);
    }

    @Override // c1.s0
    public Paint q() {
        return this.f18672a;
    }

    @Override // c1.s0
    public void r(Shader shader) {
        this.f18674c = shader;
        i.p(this.f18672a, shader);
    }

    @Override // c1.s0
    public Shader s() {
        return this.f18674c;
    }

    @Override // c1.s0
    public void t(float f10) {
        i.s(this.f18672a, f10);
    }

    @Override // c1.s0
    public int u() {
        return i.d(this.f18672a);
    }

    @Override // c1.s0
    public void v(int i10) {
        i.u(this.f18672a, i10);
    }

    @Override // c1.s0
    public void w(float f10) {
        i.t(this.f18672a, f10);
    }

    @Override // c1.s0
    public float x() {
        return i.h(this.f18672a);
    }
}
