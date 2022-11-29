package v6;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import v6.a;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f56811a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f56812b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f56813c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f56814d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f56815e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f56816f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f56817g;

    /* renamed from: h  reason: collision with root package name */
    public a<g7.d, g7.d> f56818h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f56819i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f56820j;

    /* renamed from: k  reason: collision with root package name */
    public d f56821k;

    /* renamed from: l  reason: collision with root package name */
    public d f56822l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f56823m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f56824n;

    public p(z6.l lVar) {
        this.f56816f = lVar.c() == null ? null : lVar.c().a();
        this.f56817g = lVar.f() == null ? null : lVar.f().a();
        this.f56818h = lVar.h() == null ? null : lVar.h().a();
        this.f56819i = lVar.g() == null ? null : lVar.g().a();
        d dVar = lVar.i() == null ? null : (d) lVar.i().a();
        this.f56821k = dVar;
        if (dVar != null) {
            this.f56812b = new Matrix();
            this.f56813c = new Matrix();
            this.f56814d = new Matrix();
            this.f56815e = new float[9];
        } else {
            this.f56812b = null;
            this.f56813c = null;
            this.f56814d = null;
            this.f56815e = null;
        }
        this.f56822l = lVar.j() == null ? null : (d) lVar.j().a();
        if (lVar.e() != null) {
            this.f56820j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f56823m = lVar.k().a();
        } else {
            this.f56823m = null;
        }
        if (lVar.d() != null) {
            this.f56824n = lVar.d().a();
        } else {
            this.f56824n = null;
        }
    }

    public void a(b7.b bVar) {
        bVar.h(this.f56820j);
        bVar.h(this.f56823m);
        bVar.h(this.f56824n);
        bVar.h(this.f56816f);
        bVar.h(this.f56817g);
        bVar.h(this.f56818h);
        bVar.h(this.f56819i);
        bVar.h(this.f56821k);
        bVar.h(this.f56822l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f56820j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f56823m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f56824n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f56816f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f56817g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<g7.d, g7.d> aVar6 = this.f56818h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f56819i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f56821k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f56822l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, g7.c<T> cVar) {
        if (t10 == s6.k.f52143f) {
            a<PointF, PointF> aVar = this.f56816f;
            if (aVar == null) {
                this.f56816f = new q(cVar, new PointF());
                return true;
            }
            aVar.n(cVar);
            return true;
        } else if (t10 == s6.k.f52144g) {
            a<?, PointF> aVar2 = this.f56817g;
            if (aVar2 == null) {
                this.f56817g = new q(cVar, new PointF());
                return true;
            }
            aVar2.n(cVar);
            return true;
        } else {
            if (t10 == s6.k.f52145h) {
                a<?, PointF> aVar3 = this.f56817g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).r(cVar);
                    return true;
                }
            }
            if (t10 == s6.k.f52146i) {
                a<?, PointF> aVar4 = this.f56817g;
                if (aVar4 instanceof n) {
                    ((n) aVar4).s(cVar);
                    return true;
                }
            }
            if (t10 == s6.k.f52152o) {
                a<g7.d, g7.d> aVar5 = this.f56818h;
                if (aVar5 == null) {
                    this.f56818h = new q(cVar, new g7.d());
                    return true;
                }
                aVar5.n(cVar);
                return true;
            } else if (t10 == s6.k.f52153p) {
                a<Float, Float> aVar6 = this.f56819i;
                if (aVar6 == null) {
                    this.f56819i = new q(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.n(cVar);
                return true;
            } else if (t10 == s6.k.f52140c) {
                a<Integer, Integer> aVar7 = this.f56820j;
                if (aVar7 == null) {
                    this.f56820j = new q(cVar, 100);
                    return true;
                }
                aVar7.n(cVar);
                return true;
            } else if (t10 == s6.k.C) {
                a<?, Float> aVar8 = this.f56823m;
                if (aVar8 == null) {
                    this.f56823m = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.n(cVar);
                return true;
            } else if (t10 == s6.k.D) {
                a<?, Float> aVar9 = this.f56824n;
                if (aVar9 == null) {
                    this.f56824n = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.n(cVar);
                return true;
            } else if (t10 == s6.k.f52154q) {
                if (this.f56821k == null) {
                    this.f56821k = new d(Collections.singletonList(new g7.a(Float.valueOf(0.0f))));
                }
                this.f56821k.n(cVar);
                return true;
            } else if (t10 == s6.k.f52155r) {
                if (this.f56822l == null) {
                    this.f56822l = new d(Collections.singletonList(new g7.a(Float.valueOf(0.0f))));
                }
                this.f56822l.n(cVar);
                return true;
            } else {
                return false;
            }
        }
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f56815e[i10] = 0.0f;
        }
    }

    public a<?, Float> e() {
        return this.f56824n;
    }

    public Matrix f() {
        float p10;
        PointF h10;
        this.f56811a.reset();
        a<?, PointF> aVar = this.f56817g;
        if (aVar != null && (h10 = aVar.h()) != null) {
            float f10 = h10.x;
            if (f10 != 0.0f || h10.y != 0.0f) {
                this.f56811a.preTranslate(f10, h10.y);
            }
        }
        a<Float, Float> aVar2 = this.f56819i;
        if (aVar2 != null) {
            if (aVar2 instanceof q) {
                p10 = aVar2.h().floatValue();
            } else {
                p10 = ((d) aVar2).p();
            }
            if (p10 != 0.0f) {
                this.f56811a.preRotate(p10);
            }
        }
        d dVar = this.f56821k;
        if (dVar != null) {
            d dVar2 = this.f56822l;
            float cos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.p()) + 90.0f));
            d dVar3 = this.f56822l;
            float sin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(dVar.p()));
            d();
            float[] fArr = this.f56815e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f56812b.setValues(fArr);
            d();
            float[] fArr2 = this.f56815e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f56813c.setValues(fArr2);
            d();
            float[] fArr3 = this.f56815e;
            fArr3[0] = cos;
            fArr3[1] = f11;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f56814d.setValues(fArr3);
            this.f56813c.preConcat(this.f56812b);
            this.f56814d.preConcat(this.f56813c);
            this.f56811a.preConcat(this.f56814d);
        }
        a<g7.d, g7.d> aVar3 = this.f56818h;
        if (aVar3 != null) {
            g7.d h11 = aVar3.h();
            if (h11.b() != 1.0f || h11.c() != 1.0f) {
                this.f56811a.preScale(h11.b(), h11.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f56816f;
        if (aVar4 != null) {
            PointF h12 = aVar4.h();
            float f12 = h12.x;
            if (f12 != 0.0f || h12.y != 0.0f) {
                this.f56811a.preTranslate(-f12, -h12.y);
            }
        }
        return this.f56811a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f56817g;
        PointF h10 = aVar == null ? null : aVar.h();
        a<g7.d, g7.d> aVar2 = this.f56818h;
        g7.d h11 = aVar2 == null ? null : aVar2.h();
        this.f56811a.reset();
        if (h10 != null) {
            this.f56811a.preTranslate(h10.x * f10, h10.y * f10);
        }
        if (h11 != null) {
            double d10 = f10;
            this.f56811a.preScale((float) Math.pow(h11.b(), d10), (float) Math.pow(h11.c(), d10));
        }
        a<Float, Float> aVar3 = this.f56819i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f56816f;
            PointF h12 = aVar4 != null ? aVar4.h() : null;
            this.f56811a.preRotate(floatValue * f10, h12 == null ? 0.0f : h12.x, h12 != null ? h12.y : 0.0f);
        }
        return this.f56811a;
    }

    public a<?, Integer> h() {
        return this.f56820j;
    }

    public a<?, Float> i() {
        return this.f56823m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f56820j;
        if (aVar != null) {
            aVar.m(f10);
        }
        a<?, Float> aVar2 = this.f56823m;
        if (aVar2 != null) {
            aVar2.m(f10);
        }
        a<?, Float> aVar3 = this.f56824n;
        if (aVar3 != null) {
            aVar3.m(f10);
        }
        a<PointF, PointF> aVar4 = this.f56816f;
        if (aVar4 != null) {
            aVar4.m(f10);
        }
        a<?, PointF> aVar5 = this.f56817g;
        if (aVar5 != null) {
            aVar5.m(f10);
        }
        a<g7.d, g7.d> aVar6 = this.f56818h;
        if (aVar6 != null) {
            aVar6.m(f10);
        }
        a<Float, Float> aVar7 = this.f56819i;
        if (aVar7 != null) {
            aVar7.m(f10);
        }
        d dVar = this.f56821k;
        if (dVar != null) {
            dVar.m(f10);
        }
        d dVar2 = this.f56822l;
        if (dVar2 != null) {
            dVar2.m(f10);
        }
    }
}
