package c1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f18627a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f18628b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f18629c;

    public b() {
        Canvas canvas;
        canvas = c.f18633a;
        this.f18627a = canvas;
        this.f18628b = new Rect();
        this.f18629c = new Rect();
    }

    public final Region.Op A(int i10) {
        return b0.d(i10, b0.f18630a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // c1.w
    public void a(float f10, float f11, float f12, float f13, int i10) {
        this.f18627a.clipRect(f10, f11, f12, f13, A(i10));
    }

    @Override // c1.w
    public void b(float f10, float f11) {
        this.f18627a.translate(f10, f11);
    }

    @Override // c1.w
    public void c(u0 u0Var, int i10) {
        jo.p.h(u0Var, "path");
        Canvas canvas = this.f18627a;
        if (u0Var instanceof j) {
            canvas.clipPath(((j) u0Var).s(), A(i10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // c1.w
    public void e(float f10, float f11) {
        this.f18627a.scale(f10, f11);
    }

    @Override // c1.w
    public void f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, s0 s0Var) {
        jo.p.h(s0Var, "paint");
        this.f18627a.drawArc(f10, f11, f12, f13, f14, f15, z10, s0Var.q());
    }

    @Override // c1.w
    public void g(b1.h hVar, s0 s0Var) {
        jo.p.h(hVar, "bounds");
        jo.p.h(s0Var, "paint");
        this.f18627a.saveLayer(hVar.i(), hVar.l(), hVar.j(), hVar.e(), s0Var.q(), 31);
    }

    @Override // c1.w
    public void i(float f10, float f11, float f12, float f13, s0 s0Var) {
        jo.p.h(s0Var, "paint");
        this.f18627a.drawRect(f10, f11, f12, f13, s0Var.q());
    }

    @Override // c1.w
    public void k() {
        this.f18627a.restore();
    }

    @Override // c1.w
    public void l() {
        z.f18789a.a(this.f18627a, true);
    }

    @Override // c1.w
    public void m(float f10) {
        this.f18627a.rotate(f10);
    }

    @Override // c1.w
    public void n(k0 k0Var, long j10, long j11, long j12, long j13, s0 s0Var) {
        jo.p.h(k0Var, "image");
        jo.p.h(s0Var, "paint");
        Canvas canvas = this.f18627a;
        Bitmap b10 = f.b(k0Var);
        Rect rect = this.f18628b;
        rect.left = m2.k.j(j10);
        rect.top = m2.k.k(j10);
        rect.right = m2.k.j(j10) + m2.o.g(j11);
        rect.bottom = m2.k.k(j10) + m2.o.f(j11);
        wn.v vVar = wn.v.f59242a;
        Rect rect2 = this.f18629c;
        rect2.left = m2.k.j(j12);
        rect2.top = m2.k.k(j12);
        rect2.right = m2.k.j(j12) + m2.o.g(j13);
        rect2.bottom = m2.k.k(j12) + m2.o.f(j13);
        canvas.drawBitmap(b10, rect, rect2, s0Var.q());
    }

    @Override // c1.w
    public void p() {
        this.f18627a.save();
    }

    @Override // c1.w
    public void q() {
        z.f18789a.a(this.f18627a, false);
    }

    @Override // c1.w
    public void r(k0 k0Var, long j10, s0 s0Var) {
        jo.p.h(k0Var, "image");
        jo.p.h(s0Var, "paint");
        this.f18627a.drawBitmap(f.b(k0Var), b1.f.m(j10), b1.f.n(j10), s0Var.q());
    }

    @Override // c1.w
    public void s(float[] fArr) {
        jo.p.h(fArr, "matrix");
        if (p0.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        g.a(matrix, fArr);
        this.f18627a.concat(matrix);
    }

    @Override // c1.w
    public void t(long j10, float f10, s0 s0Var) {
        jo.p.h(s0Var, "paint");
        this.f18627a.drawCircle(b1.f.m(j10), b1.f.n(j10), f10, s0Var.q());
    }

    @Override // c1.w
    public void u(float f10, float f11, float f12, float f13, float f14, float f15, s0 s0Var) {
        jo.p.h(s0Var, "paint");
        this.f18627a.drawRoundRect(f10, f11, f12, f13, f14, f15, s0Var.q());
    }

    @Override // c1.w
    public void v(long j10, long j11, s0 s0Var) {
        jo.p.h(s0Var, "paint");
        this.f18627a.drawLine(b1.f.m(j10), b1.f.n(j10), b1.f.m(j11), b1.f.n(j11), s0Var.q());
    }

    @Override // c1.w
    public void w(u0 u0Var, s0 s0Var) {
        jo.p.h(u0Var, "path");
        jo.p.h(s0Var, "paint");
        Canvas canvas = this.f18627a;
        if (u0Var instanceof j) {
            canvas.drawPath(((j) u0Var).s(), s0Var.q());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final Canvas y() {
        return this.f18627a;
    }

    public final void z(Canvas canvas) {
        jo.p.h(canvas, "<set-?>");
        this.f18627a = canvas;
    }
}
