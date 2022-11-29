package u6;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f54502a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f54503b;

    /* renamed from: c  reason: collision with root package name */
    public final b7.b f54504c;

    /* renamed from: d  reason: collision with root package name */
    public final s.e<LinearGradient> f54505d = new s.e<>();

    /* renamed from: e  reason: collision with root package name */
    public final s.e<RadialGradient> f54506e = new s.e<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f54507f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f54508g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f54509h;

    /* renamed from: i  reason: collision with root package name */
    public final List<m> f54510i;

    /* renamed from: j  reason: collision with root package name */
    public final a7.g f54511j;

    /* renamed from: k  reason: collision with root package name */
    public final v6.a<a7.d, a7.d> f54512k;

    /* renamed from: l  reason: collision with root package name */
    public final v6.a<Integer, Integer> f54513l;

    /* renamed from: m  reason: collision with root package name */
    public final v6.a<PointF, PointF> f54514m;

    /* renamed from: n  reason: collision with root package name */
    public final v6.a<PointF, PointF> f54515n;

    /* renamed from: o  reason: collision with root package name */
    public v6.a<ColorFilter, ColorFilter> f54516o;

    /* renamed from: p  reason: collision with root package name */
    public v6.q f54517p;

    /* renamed from: q  reason: collision with root package name */
    public final s6.f f54518q;

    /* renamed from: r  reason: collision with root package name */
    public final int f54519r;

    /* renamed from: s  reason: collision with root package name */
    public v6.a<Float, Float> f54520s;

    /* renamed from: t  reason: collision with root package name */
    public float f54521t;

    /* renamed from: u  reason: collision with root package name */
    public v6.c f54522u;

    public h(s6.f fVar, b7.b bVar, a7.e eVar) {
        Path path = new Path();
        this.f54507f = path;
        this.f54508g = new t6.a(1);
        this.f54509h = new RectF();
        this.f54510i = new ArrayList();
        this.f54521t = 0.0f;
        this.f54504c = bVar;
        this.f54502a = eVar.f();
        this.f54503b = eVar.i();
        this.f54518q = fVar;
        this.f54511j = eVar.e();
        path.setFillType(eVar.c());
        this.f54519r = (int) (fVar.r().d() / 32.0f);
        v6.a<a7.d, a7.d> a10 = eVar.d().a();
        this.f54512k = a10;
        a10.a(this);
        bVar.h(a10);
        v6.a<Integer, Integer> a11 = eVar.g().a();
        this.f54513l = a11;
        a11.a(this);
        bVar.h(a11);
        v6.a<PointF, PointF> a12 = eVar.h().a();
        this.f54514m = a12;
        a12.a(this);
        bVar.h(a12);
        v6.a<PointF, PointF> a13 = eVar.b().a();
        this.f54515n = a13;
        a13.a(this);
        bVar.h(a13);
        if (bVar.u() != null) {
            v6.a<Float, Float> a14 = bVar.u().a().a();
            this.f54520s = a14;
            a14.a(this);
            bVar.h(this.f54520s);
        }
        if (bVar.w() != null) {
            this.f54522u = new v6.c(this, bVar, bVar.w());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        v6.c cVar2;
        v6.c cVar3;
        v6.c cVar4;
        v6.c cVar5;
        v6.c cVar6;
        if (t10 == s6.k.f52141d) {
            this.f54513l.n(cVar);
        } else if (t10 == s6.k.K) {
            v6.a<ColorFilter, ColorFilter> aVar = this.f54516o;
            if (aVar != null) {
                this.f54504c.F(aVar);
            }
            if (cVar == null) {
                this.f54516o = null;
                return;
            }
            v6.q qVar = new v6.q(cVar);
            this.f54516o = qVar;
            qVar.a(this);
            this.f54504c.h(this.f54516o);
        } else if (t10 == s6.k.L) {
            v6.q qVar2 = this.f54517p;
            if (qVar2 != null) {
                this.f54504c.F(qVar2);
            }
            if (cVar == null) {
                this.f54517p = null;
                return;
            }
            this.f54505d.c();
            this.f54506e.c();
            v6.q qVar3 = new v6.q(cVar);
            this.f54517p = qVar3;
            qVar3.a(this);
            this.f54504c.h(this.f54517p);
        } else if (t10 == s6.k.f52147j) {
            v6.a<Float, Float> aVar2 = this.f54520s;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            v6.q qVar4 = new v6.q(cVar);
            this.f54520s = qVar4;
            qVar4.a(this);
            this.f54504c.h(this.f54520s);
        } else if (t10 == s6.k.f52142e && (cVar6 = this.f54522u) != null) {
            cVar6.c(cVar);
        } else if (t10 == s6.k.G && (cVar5 = this.f54522u) != null) {
            cVar5.f(cVar);
        } else if (t10 == s6.k.H && (cVar4 = this.f54522u) != null) {
            cVar4.d(cVar);
        } else if (t10 == s6.k.I && (cVar3 = this.f54522u) != null) {
            cVar3.e(cVar);
        } else if (t10 != s6.k.J || (cVar2 = this.f54522u) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        this.f54518q.invalidateSelf();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f54510i.add((m) cVar);
            }
        }
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        f7.g.m(eVar, i10, list, eVar2, this);
    }

    @Override // u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f54507f.reset();
        for (int i10 = 0; i10 < this.f54510i.size(); i10++) {
            this.f54507f.addPath(this.f54510i.get(i10).getPath(), matrix);
        }
        this.f54507f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final int[] f(int[] iArr) {
        v6.q qVar = this.f54517p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        Shader j10;
        if (this.f54503b) {
            return;
        }
        s6.c.a("GradientFillContent#draw");
        this.f54507f.reset();
        for (int i11 = 0; i11 < this.f54510i.size(); i11++) {
            this.f54507f.addPath(this.f54510i.get(i11).getPath(), matrix);
        }
        this.f54507f.computeBounds(this.f54509h, false);
        if (this.f54511j == a7.g.LINEAR) {
            j10 = i();
        } else {
            j10 = j();
        }
        j10.setLocalMatrix(matrix);
        this.f54508g.setShader(j10);
        v6.a<ColorFilter, ColorFilter> aVar = this.f54516o;
        if (aVar != null) {
            this.f54508g.setColorFilter(aVar.h());
        }
        v6.a<Float, Float> aVar2 = this.f54520s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f54508g.setMaskFilter(null);
            } else if (floatValue != this.f54521t) {
                this.f54508g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f54521t = floatValue;
        }
        v6.c cVar = this.f54522u;
        if (cVar != null) {
            cVar.a(this.f54508g);
        }
        this.f54508g.setAlpha(f7.g.d((int) ((((i10 / 255.0f) * this.f54513l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f54507f, this.f54508g);
        s6.c.b("GradientFillContent#draw");
    }

    @Override // u6.c
    public String getName() {
        return this.f54502a;
    }

    public final int h() {
        int round = Math.round(this.f54514m.f() * this.f54519r);
        int round2 = Math.round(this.f54515n.f() * this.f54519r);
        int round3 = Math.round(this.f54512k.f() * this.f54519r);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    public final LinearGradient i() {
        long h10 = h();
        LinearGradient h11 = this.f54505d.h(h10);
        if (h11 != null) {
            return h11;
        }
        PointF h12 = this.f54514m.h();
        PointF h13 = this.f54515n.h();
        a7.d h14 = this.f54512k.h();
        LinearGradient linearGradient = new LinearGradient(h12.x, h12.y, h13.x, h13.y, f(h14.a()), h14.b(), Shader.TileMode.CLAMP);
        this.f54505d.m(h10, linearGradient);
        return linearGradient;
    }

    public final RadialGradient j() {
        long h10 = h();
        RadialGradient h11 = this.f54506e.h(h10);
        if (h11 != null) {
            return h11;
        }
        PointF h12 = this.f54514m.h();
        PointF h13 = this.f54515n.h();
        a7.d h14 = this.f54512k.h();
        int[] f10 = f(h14.a());
        float[] b10 = h14.b();
        float f11 = h12.x;
        float f12 = h12.y;
        float hypot = (float) Math.hypot(h13.x - f11, h13.y - f12);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f11, f12, hypot, f10, b10, Shader.TileMode.CLAMP);
        this.f54506e.m(h10, radialGradient);
        return radialGradient;
    }
}
