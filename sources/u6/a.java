package u6;

import a7.r;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e  reason: collision with root package name */
    public final s6.f f54454e;

    /* renamed from: f  reason: collision with root package name */
    public final b7.b f54455f;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f54457h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f54458i;

    /* renamed from: j  reason: collision with root package name */
    public final v6.a<?, Float> f54459j;

    /* renamed from: k  reason: collision with root package name */
    public final v6.a<?, Integer> f54460k;

    /* renamed from: l  reason: collision with root package name */
    public final List<v6.a<?, Float>> f54461l;

    /* renamed from: m  reason: collision with root package name */
    public final v6.a<?, Float> f54462m;

    /* renamed from: n  reason: collision with root package name */
    public v6.a<ColorFilter, ColorFilter> f54463n;

    /* renamed from: o  reason: collision with root package name */
    public v6.a<Float, Float> f54464o;

    /* renamed from: p  reason: collision with root package name */
    public float f54465p;

    /* renamed from: q  reason: collision with root package name */
    public v6.c f54466q;

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f54450a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f54451b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f54452c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f54453d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f54456g = new ArrayList();

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<m> f54467a;

        /* renamed from: b  reason: collision with root package name */
        public final s f54468b;

        public b(s sVar) {
            this.f54467a = new ArrayList();
            this.f54468b = sVar;
        }
    }

    public a(s6.f fVar, b7.b bVar, Paint.Cap cap, Paint.Join join, float f10, z6.d dVar, z6.b bVar2, List<z6.b> list, z6.b bVar3) {
        t6.a aVar = new t6.a(1);
        this.f54458i = aVar;
        this.f54465p = 0.0f;
        this.f54454e = fVar;
        this.f54455f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f54460k = dVar.a();
        this.f54459j = bVar2.a();
        if (bVar3 == null) {
            this.f54462m = null;
        } else {
            this.f54462m = bVar3.a();
        }
        this.f54461l = new ArrayList(list.size());
        this.f54457h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f54461l.add(list.get(i10).a());
        }
        bVar.h(this.f54460k);
        bVar.h(this.f54459j);
        for (int i11 = 0; i11 < this.f54461l.size(); i11++) {
            bVar.h(this.f54461l.get(i11));
        }
        v6.a<?, Float> aVar2 = this.f54462m;
        if (aVar2 != null) {
            bVar.h(aVar2);
        }
        this.f54460k.a(this);
        this.f54459j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f54461l.get(i12).a(this);
        }
        v6.a<?, Float> aVar3 = this.f54462m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.u() != null) {
            v6.a<Float, Float> a10 = bVar.u().a().a();
            this.f54464o = a10;
            a10.a(this);
            bVar.h(this.f54464o);
        }
        if (bVar.w() != null) {
            this.f54466q = new v6.c(this, bVar, bVar.w());
        }
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        v6.c cVar2;
        v6.c cVar3;
        v6.c cVar4;
        v6.c cVar5;
        v6.c cVar6;
        if (t10 == s6.k.f52141d) {
            this.f54460k.n(cVar);
        } else if (t10 == s6.k.f52156s) {
            this.f54459j.n(cVar);
        } else if (t10 == s6.k.K) {
            v6.a<ColorFilter, ColorFilter> aVar = this.f54463n;
            if (aVar != null) {
                this.f54455f.F(aVar);
            }
            if (cVar == null) {
                this.f54463n = null;
                return;
            }
            v6.q qVar = new v6.q(cVar);
            this.f54463n = qVar;
            qVar.a(this);
            this.f54455f.h(this.f54463n);
        } else if (t10 == s6.k.f52147j) {
            v6.a<Float, Float> aVar2 = this.f54464o;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            v6.q qVar2 = new v6.q(cVar);
            this.f54464o = qVar2;
            qVar2.a(this);
            this.f54455f.h(this.f54464o);
        } else if (t10 == s6.k.f52142e && (cVar6 = this.f54466q) != null) {
            cVar6.c(cVar);
        } else if (t10 == s6.k.G && (cVar5 = this.f54466q) != null) {
            cVar5.f(cVar);
        } else if (t10 == s6.k.H && (cVar4 = this.f54466q) != null) {
            cVar4.d(cVar);
        } else if (t10 == s6.k.I && (cVar3 = this.f54466q) != null) {
            cVar3.e(cVar);
        } else if (t10 != s6.k.J || (cVar2 = this.f54466q) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        this.f54454e.invalidateSelf();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.i() == r.a.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.a(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.i() == r.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f54456g.add(bVar);
                    }
                    bVar = new b(sVar3);
                    sVar3.a(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(sVar);
                }
                bVar.f54467a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f54456g.add(bVar);
        }
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        f7.g.m(eVar, i10, list, eVar2, this);
    }

    @Override // u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        s6.c.a("StrokeContent#getBounds");
        this.f54451b.reset();
        for (int i10 = 0; i10 < this.f54456g.size(); i10++) {
            b bVar = this.f54456g.get(i10);
            for (int i11 = 0; i11 < bVar.f54467a.size(); i11++) {
                this.f54451b.addPath(((m) bVar.f54467a.get(i11)).getPath(), matrix);
            }
        }
        this.f54451b.computeBounds(this.f54453d, false);
        float p10 = ((v6.d) this.f54459j).p();
        RectF rectF2 = this.f54453d;
        float f10 = p10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f54453d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        s6.c.b("StrokeContent#getBounds");
    }

    public final void f(Matrix matrix) {
        s6.c.a("StrokeContent#applyDashPattern");
        if (this.f54461l.isEmpty()) {
            s6.c.b("StrokeContent#applyDashPattern");
            return;
        }
        float g10 = f7.h.g(matrix);
        for (int i10 = 0; i10 < this.f54461l.size(); i10++) {
            this.f54457h[i10] = this.f54461l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f54457h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f54457h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f54457h;
            fArr3[i10] = fArr3[i10] * g10;
        }
        v6.a<?, Float> aVar = this.f54462m;
        this.f54458i.setPathEffect(new DashPathEffect(this.f54457h, aVar == null ? 0.0f : g10 * aVar.h().floatValue()));
        s6.c.b("StrokeContent#applyDashPattern");
    }

    @Override // u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        s6.c.a("StrokeContent#draw");
        if (f7.h.h(matrix)) {
            s6.c.b("StrokeContent#draw");
            return;
        }
        this.f54458i.setAlpha(f7.g.d((int) ((((i10 / 255.0f) * ((v6.f) this.f54460k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f54458i.setStrokeWidth(((v6.d) this.f54459j).p() * f7.h.g(matrix));
        if (this.f54458i.getStrokeWidth() <= 0.0f) {
            s6.c.b("StrokeContent#draw");
            return;
        }
        f(matrix);
        v6.a<ColorFilter, ColorFilter> aVar = this.f54463n;
        if (aVar != null) {
            this.f54458i.setColorFilter(aVar.h());
        }
        v6.a<Float, Float> aVar2 = this.f54464o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f54458i.setMaskFilter(null);
            } else if (floatValue != this.f54465p) {
                this.f54458i.setMaskFilter(this.f54455f.v(floatValue));
            }
            this.f54465p = floatValue;
        }
        v6.c cVar = this.f54466q;
        if (cVar != null) {
            cVar.a(this.f54458i);
        }
        for (int i11 = 0; i11 < this.f54456g.size(); i11++) {
            b bVar = this.f54456g.get(i11);
            if (bVar.f54468b != null) {
                h(canvas, bVar, matrix);
            } else {
                s6.c.a("StrokeContent#buildPath");
                this.f54451b.reset();
                for (int size = bVar.f54467a.size() - 1; size >= 0; size--) {
                    this.f54451b.addPath(((m) bVar.f54467a.get(size)).getPath(), matrix);
                }
                s6.c.b("StrokeContent#buildPath");
                s6.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f54451b, this.f54458i);
                s6.c.b("StrokeContent#drawPath");
            }
        }
        s6.c.b("StrokeContent#draw");
    }

    public final void h(Canvas canvas, b bVar, Matrix matrix) {
        s6.c.a("StrokeContent#applyTrimPath");
        if (bVar.f54468b == null) {
            s6.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f54451b.reset();
        for (int size = bVar.f54467a.size() - 1; size >= 0; size--) {
            this.f54451b.addPath(((m) bVar.f54467a.get(size)).getPath(), matrix);
        }
        this.f54450a.setPath(this.f54451b, false);
        float length = this.f54450a.getLength();
        while (this.f54450a.nextContour()) {
            length += this.f54450a.getLength();
        }
        float floatValue = (bVar.f54468b.f().h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f54468b.h().h().floatValue() / 100.0f) * length) + floatValue;
        float floatValue3 = ((bVar.f54468b.d().h().floatValue() / 100.0f) * length) + floatValue;
        float f10 = 0.0f;
        for (int size2 = bVar.f54467a.size() - 1; size2 >= 0; size2--) {
            this.f54452c.set(((m) bVar.f54467a.get(size2)).getPath());
            this.f54452c.transform(matrix);
            this.f54450a.setPath(this.f54452c, false);
            float length2 = this.f54450a.getLength();
            if (floatValue3 > length) {
                float f11 = floatValue3 - length;
                if (f11 < f10 + length2 && f10 < f11) {
                    f7.h.a(this.f54452c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f11 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f54452c, this.f54458i);
                    f10 += length2;
                }
            }
            float f12 = f10 + length2;
            if (f12 >= floatValue2 && f10 <= floatValue3) {
                if (f12 <= floatValue3 && floatValue2 < f10) {
                    canvas.drawPath(this.f54452c, this.f54458i);
                } else {
                    f7.h.a(this.f54452c, floatValue2 < f10 ? 0.0f : (floatValue2 - f10) / length2, floatValue3 <= f12 ? (floatValue3 - f10) / length2 : 1.0f, 0.0f);
                    canvas.drawPath(this.f54452c, this.f54458i);
                }
            }
            f10 += length2;
        }
        s6.c.b("StrokeContent#applyTrimPath");
    }
}
