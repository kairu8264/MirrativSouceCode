package c1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c1.y0;

/* loaded from: classes.dex */
public final class j implements u0 {

    /* renamed from: b  reason: collision with root package name */
    public final Path f18692b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f18693c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f18694d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f18695e;

    public j() {
        this(null, 1, null);
    }

    public j(Path path) {
        jo.p.h(path, "internalPath");
        this.f18692b = path;
        this.f18693c = new RectF();
        this.f18694d = new float[8];
        this.f18695e = new Matrix();
    }

    @Override // c1.u0
    public boolean b() {
        return this.f18692b.isConvex();
    }

    @Override // c1.u0
    public b1.h c() {
        this.f18692b.computeBounds(this.f18693c, true);
        RectF rectF = this.f18693c;
        return new b1.h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // c1.u0
    public void close() {
        this.f18692b.close();
    }

    @Override // c1.u0
    public void d(float f10, float f11) {
        this.f18692b.rMoveTo(f10, f11);
    }

    @Override // c1.u0
    public void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18692b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // c1.u0
    public void f(float f10, float f11, float f12, float f13) {
        this.f18692b.quadTo(f10, f11, f12, f13);
    }

    @Override // c1.u0
    public void g(float f10, float f11, float f12, float f13) {
        this.f18692b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // c1.u0
    public void h(b1.h hVar) {
        jo.p.h(hVar, "rect");
        if (r(hVar)) {
            this.f18693c.set(z0.b(hVar));
            this.f18692b.addRect(this.f18693c, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // c1.u0
    public void i(int i10) {
        Path.FillType fillType;
        Path path = this.f18692b;
        if (w0.f(i10, w0.f18778b.a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // c1.u0
    public boolean isEmpty() {
        return this.f18692b.isEmpty();
    }

    @Override // c1.u0
    public void j(u0 u0Var, long j10) {
        jo.p.h(u0Var, "path");
        Path path = this.f18692b;
        if (u0Var instanceof j) {
            path.addPath(((j) u0Var).s(), b1.f.m(j10), b1.f.n(j10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // c1.u0
    public void k(long j10) {
        this.f18695e.reset();
        this.f18695e.setTranslate(b1.f.m(j10), b1.f.n(j10));
        this.f18692b.transform(this.f18695e);
    }

    @Override // c1.u0
    public boolean l(u0 u0Var, u0 u0Var2, int i10) {
        Path.Op op2;
        jo.p.h(u0Var, "path1");
        jo.p.h(u0Var2, "path2");
        y0.a aVar = y0.f18783a;
        if (y0.f(i10, aVar.a())) {
            op2 = Path.Op.DIFFERENCE;
        } else if (y0.f(i10, aVar.b())) {
            op2 = Path.Op.INTERSECT;
        } else if (y0.f(i10, aVar.c())) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op2 = y0.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f18692b;
        if (u0Var instanceof j) {
            Path s10 = ((j) u0Var).s();
            if (u0Var2 instanceof j) {
                return path.op(s10, ((j) u0Var2).s(), op2);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // c1.u0
    public void m(b1.j jVar) {
        jo.p.h(jVar, "roundRect");
        this.f18693c.set(jVar.e(), jVar.g(), jVar.f(), jVar.a());
        this.f18694d[0] = b1.a.d(jVar.h());
        this.f18694d[1] = b1.a.e(jVar.h());
        this.f18694d[2] = b1.a.d(jVar.i());
        this.f18694d[3] = b1.a.e(jVar.i());
        this.f18694d[4] = b1.a.d(jVar.c());
        this.f18694d[5] = b1.a.e(jVar.c());
        this.f18694d[6] = b1.a.d(jVar.b());
        this.f18694d[7] = b1.a.e(jVar.b());
        this.f18692b.addRoundRect(this.f18693c, this.f18694d, Path.Direction.CCW);
    }

    @Override // c1.u0
    public void n(float f10, float f11) {
        this.f18692b.moveTo(f10, f11);
    }

    @Override // c1.u0
    public void o(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18692b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // c1.u0
    public void p(float f10, float f11) {
        this.f18692b.rLineTo(f10, f11);
    }

    @Override // c1.u0
    public void q(float f10, float f11) {
        this.f18692b.lineTo(f10, f11);
    }

    public final boolean r(b1.h hVar) {
        if (!Float.isNaN(hVar.i())) {
            if (!Float.isNaN(hVar.l())) {
                if (!Float.isNaN(hVar.j())) {
                    if (!Float.isNaN(hVar.e())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    @Override // c1.u0
    public void reset() {
        this.f18692b.reset();
    }

    public final Path s() {
        return this.f18692b;
    }

    public /* synthetic */ j(Path path, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
