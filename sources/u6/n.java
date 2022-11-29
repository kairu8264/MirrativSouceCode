package u6;

import a7.j;
import a7.r;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    public final String f54540b;

    /* renamed from: c  reason: collision with root package name */
    public final s6.f f54541c;

    /* renamed from: d  reason: collision with root package name */
    public final j.a f54542d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54543e;

    /* renamed from: f  reason: collision with root package name */
    public final v6.a<?, Float> f54544f;

    /* renamed from: g  reason: collision with root package name */
    public final v6.a<?, PointF> f54545g;

    /* renamed from: h  reason: collision with root package name */
    public final v6.a<?, Float> f54546h;

    /* renamed from: i  reason: collision with root package name */
    public final v6.a<?, Float> f54547i;

    /* renamed from: j  reason: collision with root package name */
    public final v6.a<?, Float> f54548j;

    /* renamed from: k  reason: collision with root package name */
    public final v6.a<?, Float> f54549k;

    /* renamed from: l  reason: collision with root package name */
    public final v6.a<?, Float> f54550l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f54552n;

    /* renamed from: a  reason: collision with root package name */
    public final Path f54539a = new Path();

    /* renamed from: m  reason: collision with root package name */
    public final b f54551m = new b();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54553a;

        static {
            int[] iArr = new int[j.a.values().length];
            f54553a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54553a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(s6.f fVar, b7.b bVar, a7.j jVar) {
        this.f54541c = fVar;
        this.f54540b = jVar.d();
        j.a j10 = jVar.j();
        this.f54542d = j10;
        this.f54543e = jVar.k();
        v6.a<Float, Float> a10 = jVar.g().a();
        this.f54544f = a10;
        v6.a<PointF, PointF> a11 = jVar.h().a();
        this.f54545g = a11;
        v6.a<Float, Float> a12 = jVar.i().a();
        this.f54546h = a12;
        v6.a<Float, Float> a13 = jVar.e().a();
        this.f54548j = a13;
        v6.a<Float, Float> a14 = jVar.f().a();
        this.f54550l = a14;
        j.a aVar = j.a.STAR;
        if (j10 == aVar) {
            this.f54547i = jVar.b().a();
            this.f54549k = jVar.c().a();
        } else {
            this.f54547i = null;
            this.f54549k = null;
        }
        bVar.h(a10);
        bVar.h(a11);
        bVar.h(a12);
        bVar.h(a13);
        bVar.h(a14);
        if (j10 == aVar) {
            bVar.h(this.f54547i);
            bVar.h(this.f54549k);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (j10 == aVar) {
            this.f54547i.a(this);
            this.f54549k.a(this);
        }
    }

    @Override // y6.f
    public <T> void a(T t10, g7.c<T> cVar) {
        v6.a<?, Float> aVar;
        v6.a<?, Float> aVar2;
        if (t10 == s6.k.f52160w) {
            this.f54544f.n(cVar);
        } else if (t10 == s6.k.f52161x) {
            this.f54546h.n(cVar);
        } else if (t10 == s6.k.f52151n) {
            this.f54545g.n(cVar);
        } else if (t10 == s6.k.f52162y && (aVar2 = this.f54547i) != null) {
            aVar2.n(cVar);
        } else if (t10 == s6.k.f52163z) {
            this.f54548j.n(cVar);
        } else if (t10 == s6.k.A && (aVar = this.f54549k) != null) {
            aVar.n(cVar);
        } else if (t10 == s6.k.B) {
            this.f54550l.n(cVar);
        }
    }

    @Override // v6.a.b
    public void b() {
        i();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.f54551m.a(sVar);
                    sVar.a(this);
                }
            }
        }
    }

    @Override // y6.f
    public void d(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        f7.g.m(eVar, i10, list, eVar2, this);
    }

    public final void f() {
        v6.a<?, Float> aVar;
        double d10;
        double d11;
        double d12;
        int i10;
        int floor = (int) Math.floor(this.f54544f.h().floatValue());
        double radians = Math.toRadians((this.f54546h == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d13 = floor;
        float floatValue = this.f54550l.h().floatValue() / 100.0f;
        float floatValue2 = this.f54548j.h().floatValue();
        double d14 = floatValue2;
        float cos = (float) (Math.cos(radians) * d14);
        float sin = (float) (Math.sin(radians) * d14);
        this.f54539a.moveTo(cos, sin);
        double d15 = (float) (6.283185307179586d / d13);
        double d16 = radians + d15;
        double ceil = Math.ceil(d13);
        int i11 = 0;
        while (i11 < ceil) {
            float cos2 = (float) (Math.cos(d16) * d14);
            double d17 = ceil;
            float sin2 = (float) (d14 * Math.sin(d16));
            if (floatValue != 0.0f) {
                d11 = d14;
                i10 = i11;
                d10 = d16;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d12 = d15;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f10 = floatValue2 * floatValue * 0.25f;
                this.f54539a.cubicTo(cos - (cos3 * f10), sin - (((float) Math.sin(atan2)) * f10), cos2 + (((float) Math.cos(atan22)) * f10), sin2 + (f10 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d10 = d16;
                d11 = d14;
                d12 = d15;
                i10 = i11;
                this.f54539a.lineTo(cos2, sin2);
            }
            d16 = d10 + d12;
            i11 = i10 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d17;
            d14 = d11;
            d15 = d12;
        }
        PointF h10 = this.f54545g.h();
        this.f54539a.offset(h10.x, h10.y);
        this.f54539a.close();
    }

    @Override // u6.c
    public String getName() {
        return this.f54540b;
    }

    @Override // u6.m
    public Path getPath() {
        if (this.f54552n) {
            return this.f54539a;
        }
        this.f54539a.reset();
        if (this.f54543e) {
            this.f54552n = true;
            return this.f54539a;
        }
        int i10 = a.f54553a[this.f54542d.ordinal()];
        if (i10 == 1) {
            h();
        } else if (i10 == 2) {
            f();
        }
        this.f54539a.close();
        this.f54551m.b(this.f54539a);
        this.f54552n = true;
        return this.f54539a;
    }

    public final void h() {
        v6.a<?, Float> aVar;
        double d10;
        int i10;
        double d11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        double d12;
        float f16;
        float f17;
        float f18;
        float floatValue = this.f54544f.h().floatValue();
        double radians = Math.toRadians((this.f54546h == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d13 = floatValue;
        float f19 = (float) (6.283185307179586d / d13);
        float f20 = f19 / 2.0f;
        float f21 = floatValue - ((int) floatValue);
        int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f21) * f20;
        }
        float floatValue2 = this.f54548j.h().floatValue();
        float floatValue3 = this.f54547i.h().floatValue();
        v6.a<?, Float> aVar2 = this.f54549k;
        float floatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        v6.a<?, Float> aVar3 = this.f54550l;
        float floatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            f12 = ((floatValue2 - floatValue3) * f21) + floatValue3;
            i10 = i11;
            double d14 = f12;
            d10 = d13;
            f10 = (float) (d14 * Math.cos(radians));
            f11 = (float) (d14 * Math.sin(radians));
            this.f54539a.moveTo(f10, f11);
            d11 = radians + ((f19 * f21) / 2.0f);
        } else {
            d10 = d13;
            i10 = i11;
            double d15 = floatValue2;
            float cos = (float) (Math.cos(radians) * d15);
            float sin = (float) (d15 * Math.sin(radians));
            this.f54539a.moveTo(cos, sin);
            d11 = radians + f20;
            f10 = cos;
            f11 = sin;
            f12 = 0.0f;
        }
        double ceil = Math.ceil(d10) * 2.0d;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            double d16 = i12;
            if (d16 < ceil) {
                float f22 = z10 ? floatValue2 : floatValue3;
                int i13 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if (i13 == 0 || d16 != ceil - 2.0d) {
                    f13 = f19;
                    f14 = f20;
                } else {
                    f13 = f19;
                    f14 = (f19 * f21) / 2.0f;
                }
                if (i13 == 0 || d16 != ceil - 1.0d) {
                    f15 = f20;
                    d12 = d16;
                    f16 = f22;
                } else {
                    f15 = f20;
                    d12 = d16;
                    f16 = f12;
                }
                double d17 = f16;
                double d18 = ceil;
                float cos2 = (float) (d17 * Math.cos(d11));
                float sin2 = (float) (d17 * Math.sin(d11));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f54539a.lineTo(cos2, sin2);
                    f17 = floatValue4;
                    f18 = f12;
                } else {
                    f17 = floatValue4;
                    f18 = f12;
                    double atan2 = (float) (Math.atan2(f11, f10) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f23 = z10 ? f17 : floatValue5;
                    float f24 = z10 ? floatValue5 : f17;
                    float f25 = (z10 ? floatValue3 : floatValue2) * f23 * 0.47829f;
                    float f26 = cos3 * f25;
                    float f27 = f25 * sin3;
                    float f28 = (z10 ? floatValue2 : floatValue3) * f24 * 0.47829f;
                    float f29 = cos4 * f28;
                    float f30 = f28 * sin4;
                    if (i10 != 0) {
                        if (i12 == 0) {
                            f26 *= f21;
                            f27 *= f21;
                        } else if (d12 == d18 - 1.0d) {
                            f29 *= f21;
                            f30 *= f21;
                        }
                    }
                    this.f54539a.cubicTo(f10 - f26, f11 - f27, cos2 + f29, sin2 + f30, cos2, sin2);
                }
                d11 += f14;
                z10 = !z10;
                i12++;
                f10 = cos2;
                f11 = sin2;
                floatValue4 = f17;
                f12 = f18;
                f20 = f15;
                f19 = f13;
                ceil = d18;
            } else {
                PointF h10 = this.f54545g.h();
                this.f54539a.offset(h10.x, h10.y);
                this.f54539a.close();
                return;
            }
        }
    }

    public final void i() {
        this.f54552n = false;
        this.f54541c.invalidateSelf();
    }
}
