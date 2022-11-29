package u6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f54489a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f54490b;

    /* renamed from: c  reason: collision with root package name */
    public final b7.b f54491c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54492d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54493e;

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f54494f;

    /* renamed from: g  reason: collision with root package name */
    public final v6.a<Integer, Integer> f54495g;

    /* renamed from: h  reason: collision with root package name */
    public final v6.a<Integer, Integer> f54496h;

    /* renamed from: i  reason: collision with root package name */
    public v6.a<ColorFilter, ColorFilter> f54497i;

    /* renamed from: j  reason: collision with root package name */
    public final s6.f f54498j;

    /* renamed from: k  reason: collision with root package name */
    public v6.a<Float, Float> f54499k;

    /* renamed from: l  reason: collision with root package name */
    public float f54500l;

    /* renamed from: m  reason: collision with root package name */
    public v6.c f54501m;

    public g(s6.f fVar, b7.b bVar, a7.n nVar) {
        Path path = new Path();
        this.f54489a = path;
        this.f54490b = new t6.a(1);
        this.f54494f = new ArrayList();
        this.f54491c = bVar;
        this.f54492d = nVar.d();
        this.f54493e = nVar.f();
        this.f54498j = fVar;
        if (bVar.u() != null) {
            v6.a<Float, Float> a10 = bVar.u().a().a();
            this.f54499k = a10;
            a10.a(this);
            bVar.h(this.f54499k);
        }
        if (bVar.w() != null) {
            this.f54501m = new v6.c(this, bVar, bVar.w());
        }
        if (nVar.b() != null && nVar.e() != null) {
            path.setFillType(nVar.c());
            v6.a<Integer, Integer> a11 = nVar.b().a();
            this.f54495g = a11;
            a11.a(this);
            bVar.h(a11);
            v6.a<Integer, Integer> a12 = nVar.e().a();
            this.f54496h = a12;
            a12.a(this);
            bVar.h(a12);
            return;
        }
        this.f54495g = null;
        this.f54496h = null;
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        v6.c cVar2;
        v6.c cVar3;
        v6.c cVar4;
        v6.c cVar5;
        v6.c cVar6;
        if (t10 == s6.k.f52138a) {
            this.f54495g.n(cVar);
        } else if (t10 == s6.k.f52141d) {
            this.f54496h.n(cVar);
        } else if (t10 == s6.k.K) {
            v6.a<ColorFilter, ColorFilter> aVar = this.f54497i;
            if (aVar != null) {
                this.f54491c.F(aVar);
            }
            if (cVar == null) {
                this.f54497i = null;
                return;
            }
            v6.q qVar = new v6.q(cVar);
            this.f54497i = qVar;
            qVar.a(this);
            this.f54491c.h(this.f54497i);
        } else if (t10 == s6.k.f52147j) {
            v6.a<Float, Float> aVar2 = this.f54499k;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            v6.q qVar2 = new v6.q(cVar);
            this.f54499k = qVar2;
            qVar2.a(this);
            this.f54491c.h(this.f54499k);
        } else if (t10 == s6.k.f52142e && (cVar6 = this.f54501m) != null) {
            cVar6.c(cVar);
        } else if (t10 == s6.k.G && (cVar5 = this.f54501m) != null) {
            cVar5.f(cVar);
        } else if (t10 == s6.k.H && (cVar4 = this.f54501m) != null) {
            cVar4.d(cVar);
        } else if (t10 == s6.k.I && (cVar3 = this.f54501m) != null) {
            cVar3.e(cVar);
        } else if (t10 != s6.k.J || (cVar2 = this.f54501m) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        this.f54498j.invalidateSelf();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f54494f.add((m) cVar);
            }
        }
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        f7.g.m(eVar, i10, list, eVar2, this);
    }

    @Override // u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f54489a.reset();
        for (int i10 = 0; i10 < this.f54494f.size(); i10++) {
            this.f54489a.addPath(this.f54494f.get(i10).getPath(), matrix);
        }
        this.f54489a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // u6.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f54493e) {
            return;
        }
        s6.c.a("FillContent#draw");
        this.f54490b.setColor((f7.g.d((int) ((((i10 / 255.0f) * this.f54496h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((v6.b) this.f54495g).p() & 16777215));
        v6.a<ColorFilter, ColorFilter> aVar = this.f54497i;
        if (aVar != null) {
            this.f54490b.setColorFilter(aVar.h());
        }
        v6.a<Float, Float> aVar2 = this.f54499k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f54490b.setMaskFilter(null);
            } else if (floatValue != this.f54500l) {
                this.f54490b.setMaskFilter(this.f54491c.v(floatValue));
            }
            this.f54500l = floatValue;
        }
        v6.c cVar = this.f54501m;
        if (cVar != null) {
            cVar.a(this.f54490b);
        }
        this.f54489a.reset();
        for (int i11 = 0; i11 < this.f54494f.size(); i11++) {
            this.f54489a.addPath(this.f54494f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f54489a, this.f54490b);
        s6.c.b("FillContent#draw");
    }

    @Override // u6.c
    public String getName() {
        return this.f54492d;
    }
}
