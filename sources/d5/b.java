package d5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import n3.h;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {
    public static final Interpolator C = new LinearInterpolator();
    public static final Interpolator D = new i4.b();
    public static final int[] E = {-16777216};
    public float A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final c f29165w;

    /* renamed from: x  reason: collision with root package name */
    public float f29166x;

    /* renamed from: y  reason: collision with root package name */
    public Resources f29167y;

    /* renamed from: z  reason: collision with root package name */
    public Animator f29168z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f29169a;

        public a(c cVar) {
            this.f29169a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f29169a);
            b.this.b(floatValue, this.f29169a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: d5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0272b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f29171a;

        public C0272b(c cVar) {
            this.f29171a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f29171a, true);
            this.f29171a.A();
            this.f29171a.l();
            b bVar = b.this;
            if (bVar.B) {
                bVar.B = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f29171a.x(false);
                return;
            }
            bVar.A += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.A = 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f29173a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final Paint f29174b;

        /* renamed from: c  reason: collision with root package name */
        public final Paint f29175c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f29176d;

        /* renamed from: e  reason: collision with root package name */
        public float f29177e;

        /* renamed from: f  reason: collision with root package name */
        public float f29178f;

        /* renamed from: g  reason: collision with root package name */
        public float f29179g;

        /* renamed from: h  reason: collision with root package name */
        public float f29180h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f29181i;

        /* renamed from: j  reason: collision with root package name */
        public int f29182j;

        /* renamed from: k  reason: collision with root package name */
        public float f29183k;

        /* renamed from: l  reason: collision with root package name */
        public float f29184l;

        /* renamed from: m  reason: collision with root package name */
        public float f29185m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f29186n;

        /* renamed from: o  reason: collision with root package name */
        public Path f29187o;

        /* renamed from: p  reason: collision with root package name */
        public float f29188p;

        /* renamed from: q  reason: collision with root package name */
        public float f29189q;

        /* renamed from: r  reason: collision with root package name */
        public int f29190r;

        /* renamed from: s  reason: collision with root package name */
        public int f29191s;

        /* renamed from: t  reason: collision with root package name */
        public int f29192t;

        /* renamed from: u  reason: collision with root package name */
        public int f29193u;

        public c() {
            Paint paint = new Paint();
            this.f29174b = paint;
            Paint paint2 = new Paint();
            this.f29175c = paint2;
            Paint paint3 = new Paint();
            this.f29176d = paint3;
            this.f29177e = 0.0f;
            this.f29178f = 0.0f;
            this.f29179g = 0.0f;
            this.f29180h = 5.0f;
            this.f29188p = 1.0f;
            this.f29192t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f29183k = this.f29177e;
            this.f29184l = this.f29178f;
            this.f29185m = this.f29179g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f29173a;
            float f10 = this.f29189q;
            float f11 = (this.f29180h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f29190r * this.f29188p) / 2.0f, this.f29180h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f29177e;
            float f13 = this.f29179g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f29178f + f13) * 360.0f) - f14;
            this.f29174b.setColor(this.f29193u);
            this.f29174b.setAlpha(this.f29192t);
            float f16 = this.f29180h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f29176d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f29174b);
            b(canvas, f14, f15, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f29186n) {
                Path path = this.f29187o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f29187o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f29187o.moveTo(0.0f, 0.0f);
                this.f29187o.lineTo(this.f29190r * this.f29188p, 0.0f);
                Path path3 = this.f29187o;
                float f12 = this.f29188p;
                path3.lineTo((this.f29190r * f12) / 2.0f, this.f29191s * f12);
                this.f29187o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f29190r * this.f29188p) / 2.0f), rectF.centerY() + (this.f29180h / 2.0f));
                this.f29187o.close();
                this.f29175c.setColor(this.f29193u);
                this.f29175c.setAlpha(this.f29192t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f29187o, this.f29175c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f29192t;
        }

        public float d() {
            return this.f29178f;
        }

        public int e() {
            return this.f29181i[f()];
        }

        public int f() {
            return (this.f29182j + 1) % this.f29181i.length;
        }

        public float g() {
            return this.f29177e;
        }

        public int h() {
            return this.f29181i[this.f29182j];
        }

        public float i() {
            return this.f29184l;
        }

        public float j() {
            return this.f29185m;
        }

        public float k() {
            return this.f29183k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f29183k = 0.0f;
            this.f29184l = 0.0f;
            this.f29185m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f29192t = i10;
        }

        public void o(float f10, float f11) {
            this.f29190r = (int) f10;
            this.f29191s = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f29188p) {
                this.f29188p = f10;
            }
        }

        public void q(float f10) {
            this.f29189q = f10;
        }

        public void r(int i10) {
            this.f29193u = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.f29174b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f29182j = i10;
            this.f29193u = this.f29181i[i10];
        }

        public void u(int[] iArr) {
            this.f29181i = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f29178f = f10;
        }

        public void w(float f10) {
            this.f29179g = f10;
        }

        public void x(boolean z10) {
            if (this.f29186n != z10) {
                this.f29186n = z10;
            }
        }

        public void y(float f10) {
            this.f29177e = f10;
        }

        public void z(float f10) {
            this.f29180h = f10;
            this.f29174b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f29167y = ((Context) h.g(context)).getResources();
        c cVar = new c();
        this.f29165w = cVar;
        cVar.u(E);
        k(2.5f);
        m();
    }

    public final void a(float f10, c cVar) {
        n(f10, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor(cVar.j() / 0.8f) + 1.0d)) - cVar.j()) * f10));
    }

    public void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.B) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (D.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - D.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(j10 + (0.20999998f * f10));
            h((f10 + this.A) * 216.0f);
        }
    }

    public final int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    public void d(boolean z10) {
        this.f29165w.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f29166x, bounds.exactCenterX(), bounds.exactCenterY());
        this.f29165w.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f29165w.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f29165w.u(iArr);
        this.f29165w.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f29165w.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29165w.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f10) {
        this.f29166x = f10;
    }

    public final void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f29165w;
        float f14 = this.f29167y.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f29168z.isRunning();
    }

    public void j(float f10, float f11) {
        this.f29165w.y(f10);
        this.f29165w.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f29165w.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.f29165w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(C);
        ofFloat.addListener(new C0272b(cVar));
        this.f29168z = ofFloat;
    }

    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f29165w.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29165w.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f29168z.cancel();
        this.f29165w.A();
        if (this.f29165w.d() != this.f29165w.g()) {
            this.B = true;
            this.f29168z.setDuration(666L);
            this.f29168z.start();
            return;
        }
        this.f29165w.t(0);
        this.f29165w.m();
        this.f29168z.setDuration(1332L);
        this.f29168z.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f29168z.cancel();
        h(0.0f);
        this.f29165w.x(false);
        this.f29165w.t(0);
        this.f29165w.m();
        invalidateSelf();
    }
}
