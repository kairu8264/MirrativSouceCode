package mj;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import tj.k;
import tj.l;

/* loaded from: classes3.dex */
public class a extends Drawable {

    /* renamed from: b  reason: collision with root package name */
    public final Paint f41186b;

    /* renamed from: h  reason: collision with root package name */
    public float f41192h;

    /* renamed from: i  reason: collision with root package name */
    public int f41193i;

    /* renamed from: j  reason: collision with root package name */
    public int f41194j;

    /* renamed from: k  reason: collision with root package name */
    public int f41195k;

    /* renamed from: l  reason: collision with root package name */
    public int f41196l;

    /* renamed from: m  reason: collision with root package name */
    public int f41197m;

    /* renamed from: o  reason: collision with root package name */
    public k f41199o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f41200p;

    /* renamed from: a  reason: collision with root package name */
    public final l f41185a = l.k();

    /* renamed from: c  reason: collision with root package name */
    public final Path f41187c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f41188d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f41189e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f41190f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final b f41191g = new b();

    /* renamed from: n  reason: collision with root package name */
    public boolean f41198n = true;

    /* loaded from: classes3.dex */
    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a(k kVar) {
        this.f41199o = kVar;
        Paint paint = new Paint(1);
        this.f41186b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader a() {
        Rect rect = this.f41188d;
        copyBounds(rect);
        float height = this.f41192h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{f3.a.g(this.f41193i, this.f41197m), f3.a.g(this.f41194j, this.f41197m), f3.a.g(f3.a.k(this.f41194j, 0), this.f41197m), f3.a.g(f3.a.k(this.f41196l, 0), this.f41197m), f3.a.g(this.f41196l, this.f41197m), f3.a.g(this.f41195k, this.f41197m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public RectF b() {
        this.f41190f.set(getBounds());
        return this.f41190f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f41197m = colorStateList.getColorForState(getState(), this.f41197m);
        }
        this.f41200p = colorStateList;
        this.f41198n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f41192h != f10) {
            this.f41192h = f10;
            this.f41186b.setStrokeWidth(f10 * 1.3333f);
            this.f41198n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f41198n) {
            this.f41186b.setShader(a());
            this.f41198n = false;
        }
        float strokeWidth = this.f41186b.getStrokeWidth() / 2.0f;
        copyBounds(this.f41188d);
        this.f41189e.set(this.f41188d);
        float min = Math.min(this.f41199o.r().a(b()), this.f41189e.width() / 2.0f);
        if (this.f41199o.u(b())) {
            this.f41189e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f41189e, min, min, this.f41186b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f41193i = i10;
        this.f41194j = i11;
        this.f41195k = i12;
        this.f41196l = i13;
    }

    public void f(k kVar) {
        this.f41199o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41191g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f41192h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f41199o.u(b())) {
            outline.setRoundRect(getBounds(), this.f41199o.r().a(b()));
            return;
        }
        copyBounds(this.f41188d);
        this.f41189e.set(this.f41188d);
        this.f41185a.d(this.f41199o, 1.0f, this.f41189e, this.f41187c);
        if (this.f41187c.isConvex()) {
            outline.setConvexPath(this.f41187c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f41199o.u(b())) {
            int round = Math.round(this.f41192h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f41200p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f41198n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f41200p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f41197m)) != this.f41197m) {
            this.f41198n = true;
            this.f41197m = colorForState;
        }
        if (this.f41198n) {
            invalidateSelf();
        }
        return this.f41198n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f41186b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f41186b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
