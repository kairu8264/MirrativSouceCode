package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f49675a;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f49677c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f49678d;

    /* renamed from: e  reason: collision with root package name */
    public float f49679e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f49682h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f49683i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f49684j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f49680f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f49681g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f49685k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f49676b = new Paint(5);

    public f(ColorStateList colorStateList, float f10) {
        this.f49675a = f10;
        e(colorStateList);
        this.f49677c = new RectF();
        this.f49678d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f49682h;
    }

    public float c() {
        return this.f49679e;
    }

    public float d() {
        return this.f49675a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f49676b;
        if (this.f49683i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f49683i);
            z10 = true;
        }
        RectF rectF = this.f49677c;
        float f10 = this.f49675a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f49682h = colorStateList;
        this.f49676b.setColor(colorStateList.getColorForState(getState(), this.f49682h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f49679e && this.f49680f == z10 && this.f49681g == z11) {
            return;
        }
        this.f49679e = f10;
        this.f49680f = z10;
        this.f49681g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f49678d, this.f49675a);
    }

    public void h(float f10) {
        if (f10 == this.f49675a) {
            return;
        }
        this.f49675a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f49677c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f49678d.set(rect);
        if (this.f49680f) {
            float d10 = g.d(this.f49679e, this.f49675a, this.f49681g);
            this.f49678d.inset((int) Math.ceil(g.c(this.f49679e, this.f49675a, this.f49681g)), (int) Math.ceil(d10));
            this.f49677c.set(this.f49678d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f49684j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f49682h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f49682h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f49676b.getColor();
        if (z10) {
            this.f49676b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f49684j;
        if (colorStateList2 == null || (mode = this.f49685k) == null) {
            return z10;
        }
        this.f49683i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f49676b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49676b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f49684j = colorStateList;
        this.f49683i = a(colorStateList, this.f49685k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f49685k = mode;
        this.f49683i = a(this.f49684j, mode);
        invalidateSelf();
    }
}
