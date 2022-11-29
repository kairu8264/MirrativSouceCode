package g7;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s6.d f32796a;

    /* renamed from: b  reason: collision with root package name */
    public final T f32797b;

    /* renamed from: c  reason: collision with root package name */
    public T f32798c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f32799d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f32800e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f32801f;

    /* renamed from: g  reason: collision with root package name */
    public final float f32802g;

    /* renamed from: h  reason: collision with root package name */
    public Float f32803h;

    /* renamed from: i  reason: collision with root package name */
    public float f32804i;

    /* renamed from: j  reason: collision with root package name */
    public float f32805j;

    /* renamed from: k  reason: collision with root package name */
    public int f32806k;

    /* renamed from: l  reason: collision with root package name */
    public int f32807l;

    /* renamed from: m  reason: collision with root package name */
    public float f32808m;

    /* renamed from: n  reason: collision with root package name */
    public float f32809n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f32810o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f32811p;

    public a(s6.d dVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f32804i = -3987645.8f;
        this.f32805j = -3987645.8f;
        this.f32806k = 784923401;
        this.f32807l = 784923401;
        this.f32808m = Float.MIN_VALUE;
        this.f32809n = Float.MIN_VALUE;
        this.f32810o = null;
        this.f32811p = null;
        this.f32796a = dVar;
        this.f32797b = t10;
        this.f32798c = t11;
        this.f32799d = interpolator;
        this.f32800e = null;
        this.f32801f = null;
        this.f32802g = f10;
        this.f32803h = f11;
    }

    public boolean a(float f10) {
        return f10 >= e() && f10 < b();
    }

    public float b() {
        if (this.f32796a == null) {
            return 1.0f;
        }
        if (this.f32809n == Float.MIN_VALUE) {
            if (this.f32803h == null) {
                this.f32809n = 1.0f;
            } else {
                this.f32809n = e() + ((this.f32803h.floatValue() - this.f32802g) / this.f32796a.e());
            }
        }
        return this.f32809n;
    }

    public float c() {
        if (this.f32805j == -3987645.8f) {
            this.f32805j = ((Float) this.f32798c).floatValue();
        }
        return this.f32805j;
    }

    public int d() {
        if (this.f32807l == 784923401) {
            this.f32807l = ((Integer) this.f32798c).intValue();
        }
        return this.f32807l;
    }

    public float e() {
        s6.d dVar = this.f32796a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f32808m == Float.MIN_VALUE) {
            this.f32808m = (this.f32802g - dVar.p()) / this.f32796a.e();
        }
        return this.f32808m;
    }

    public float f() {
        if (this.f32804i == -3987645.8f) {
            this.f32804i = ((Float) this.f32797b).floatValue();
        }
        return this.f32804i;
    }

    public int g() {
        if (this.f32806k == 784923401) {
            this.f32806k = ((Integer) this.f32797b).intValue();
        }
        return this.f32806k;
    }

    public boolean h() {
        return this.f32799d == null && this.f32800e == null && this.f32801f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f32797b + ", endValue=" + this.f32798c + ", startFrame=" + this.f32802g + ", endFrame=" + this.f32803h + ", interpolator=" + this.f32799d + '}';
    }

    public a(s6.d dVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f32804i = -3987645.8f;
        this.f32805j = -3987645.8f;
        this.f32806k = 784923401;
        this.f32807l = 784923401;
        this.f32808m = Float.MIN_VALUE;
        this.f32809n = Float.MIN_VALUE;
        this.f32810o = null;
        this.f32811p = null;
        this.f32796a = dVar;
        this.f32797b = t10;
        this.f32798c = t11;
        this.f32799d = null;
        this.f32800e = interpolator;
        this.f32801f = interpolator2;
        this.f32802g = f10;
        this.f32803h = f11;
    }

    public a(s6.d dVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f32804i = -3987645.8f;
        this.f32805j = -3987645.8f;
        this.f32806k = 784923401;
        this.f32807l = 784923401;
        this.f32808m = Float.MIN_VALUE;
        this.f32809n = Float.MIN_VALUE;
        this.f32810o = null;
        this.f32811p = null;
        this.f32796a = dVar;
        this.f32797b = t10;
        this.f32798c = t11;
        this.f32799d = interpolator;
        this.f32800e = interpolator2;
        this.f32801f = interpolator3;
        this.f32802g = f10;
        this.f32803h = f11;
    }

    public a(T t10) {
        this.f32804i = -3987645.8f;
        this.f32805j = -3987645.8f;
        this.f32806k = 784923401;
        this.f32807l = 784923401;
        this.f32808m = Float.MIN_VALUE;
        this.f32809n = Float.MIN_VALUE;
        this.f32810o = null;
        this.f32811p = null;
        this.f32796a = null;
        this.f32797b = t10;
        this.f32798c = t10;
        this.f32799d = null;
        this.f32800e = null;
        this.f32801f = null;
        this.f32802g = Float.MIN_VALUE;
        this.f32803h = Float.valueOf(Float.MAX_VALUE);
    }
}
