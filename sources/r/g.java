package r;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    public static final double f49686q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    public static a f49687r;

    /* renamed from: a  reason: collision with root package name */
    public final int f49688a;

    /* renamed from: c  reason: collision with root package name */
    public Paint f49690c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f49691d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f49692e;

    /* renamed from: f  reason: collision with root package name */
    public float f49693f;

    /* renamed from: g  reason: collision with root package name */
    public Path f49694g;

    /* renamed from: h  reason: collision with root package name */
    public float f49695h;

    /* renamed from: i  reason: collision with root package name */
    public float f49696i;

    /* renamed from: j  reason: collision with root package name */
    public float f49697j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f49698k;

    /* renamed from: m  reason: collision with root package name */
    public final int f49700m;

    /* renamed from: n  reason: collision with root package name */
    public final int f49701n;

    /* renamed from: l  reason: collision with root package name */
    public boolean f49699l = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f49702o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f49703p = false;

    /* renamed from: b  reason: collision with root package name */
    public Paint f49689b = new Paint(5);

    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f49700m = resources.getColor(q.b.f48491d);
        this.f49701n = resources.getColor(q.b.f48490c);
        this.f49688a = resources.getDimensionPixelSize(q.c.f48492a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f49690c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f49693f = (int) (f10 + 0.5f);
        this.f49692e = new RectF();
        Paint paint2 = new Paint(this.f49690c);
        this.f49691d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    public static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f49686q) * f11)) : f10;
    }

    public static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) ((f10 * 1.5f) + ((1.0d - f49686q) * f11)) : f10 * 1.5f;
    }

    public final void a(Rect rect) {
        float f10 = this.f49695h;
        float f11 = 1.5f * f10;
        this.f49692e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    public final void b() {
        float f10 = this.f49693f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f49696i;
        rectF2.inset(-f11, -f11);
        Path path = this.f49694g;
        if (path == null) {
            this.f49694g = new Path();
        } else {
            path.reset();
        }
        this.f49694g.setFillType(Path.FillType.EVEN_ODD);
        this.f49694g.moveTo(-this.f49693f, 0.0f);
        this.f49694g.rLineTo(-this.f49696i, 0.0f);
        this.f49694g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f49694g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f49694g.close();
        float f12 = this.f49693f;
        float f13 = f12 / (this.f49696i + f12);
        Paint paint = this.f49690c;
        float f14 = this.f49693f + this.f49696i;
        int i10 = this.f49700m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f49701n}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f49691d;
        float f15 = this.f49693f;
        float f16 = this.f49696i;
        int i11 = this.f49700m;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f49701n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f49691d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f49699l) {
            a(getBounds());
            this.f49699l = false;
        }
        canvas.translate(0.0f, this.f49697j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f49697j) / 2.0f);
        f49687r.a(canvas, this.f49692e, this.f49693f, this.f49689b);
    }

    public final void e(Canvas canvas) {
        float f10 = this.f49693f;
        float f11 = (-f10) - this.f49696i;
        float f12 = f10 + this.f49688a + (this.f49697j / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f49692e.width() - f13 > 0.0f;
        boolean z11 = this.f49692e.height() - f13 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f49692e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f49694g, this.f49690c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f49692e.width() - f13, -this.f49693f, this.f49691d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f49692e;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f49694g, this.f49690c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f49692e.width() - f13, (-this.f49693f) + this.f49696i, this.f49691d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f49692e;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f49694g, this.f49690c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f49692e.height() - f13, -this.f49693f, this.f49691d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f49692e;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f49694g, this.f49690c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f49692e.height() - f13, -this.f49693f, this.f49691d);
        }
        canvas.restoreToCount(save4);
    }

    public ColorStateList f() {
        return this.f49698k;
    }

    public float g() {
        return this.f49693f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f49695h, this.f49693f, this.f49702o));
        int ceil2 = (int) Math.ceil(c(this.f49695h, this.f49693f, this.f49702o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f49695h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f49698k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f10 = this.f49695h;
        return (Math.max(f10, this.f49693f + this.f49688a + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (((this.f49695h * 1.5f) + this.f49688a) * 2.0f);
    }

    public float k() {
        float f10 = this.f49695h;
        return (Math.max(f10, this.f49693f + this.f49688a + (f10 / 2.0f)) * 2.0f) + ((this.f49695h + this.f49688a) * 2.0f);
    }

    public float l() {
        return this.f49697j;
    }

    public void m(boolean z10) {
        this.f49702o = z10;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f49698k = colorStateList;
        this.f49689b.setColor(colorStateList.getColorForState(getState(), this.f49698k.getDefaultColor()));
    }

    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f49699l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f49698k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f49689b.getColor() == colorForState) {
            return false;
        }
        this.f49689b.setColor(colorForState);
        this.f49699l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f10) {
        if (f10 >= 0.0f) {
            float f11 = (int) (f10 + 0.5f);
            if (this.f49693f == f11) {
                return;
            }
            this.f49693f = f11;
            this.f49699l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
    }

    public void q(float f10) {
        s(this.f49697j, f10);
    }

    public void r(float f10) {
        s(f10, this.f49695h);
    }

    public final void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        } else if (f11 >= 0.0f) {
            float t10 = t(f10);
            float t11 = t(f11);
            if (t10 > t11) {
                if (!this.f49703p) {
                    this.f49703p = true;
                }
                t10 = t11;
            }
            if (this.f49697j == t10 && this.f49695h == t11) {
                return;
            }
            this.f49697j = t10;
            this.f49695h = t11;
            this.f49696i = (int) ((t10 * 1.5f) + this.f49688a + 0.5f);
            this.f49699l = true;
            invalidateSelf();
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f49689b.setAlpha(i10);
        this.f49690c.setAlpha(i10);
        this.f49691d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49689b.setColorFilter(colorFilter);
    }

    public final int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }
}
