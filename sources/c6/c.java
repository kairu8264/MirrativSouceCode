package c6;

import a6.f;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import k6.g;

/* loaded from: classes.dex */
public final class c extends Drawable implements Drawable.Callback, Animatable {
    public float A = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public final Drawable f18847w;

    /* renamed from: x  reason: collision with root package name */
    public final g f18848x;

    /* renamed from: y  reason: collision with root package name */
    public float f18849y;

    /* renamed from: z  reason: collision with root package name */
    public float f18850z;

    public c(Drawable drawable, g gVar) {
        this.f18847w = drawable;
        this.f18848x = gVar;
        drawable.setCallback(this);
    }

    public final Drawable a() {
        return this.f18847w;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.f18849y, this.f18850z);
            float f10 = this.A;
            canvas.scale(f10, f10);
            a().draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18847w.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f18847w.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18847w.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18847w.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f18847w.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f18847w;
        return (drawable instanceof Animatable) && ((Animatable) drawable).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int intrinsicWidth = this.f18847w.getIntrinsicWidth();
        int intrinsicHeight = this.f18847w.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double c10 = f.c(intrinsicWidth, intrinsicHeight, width, height, this.f18848x);
            double d10 = 2;
            int b10 = lo.c.b((width - (intrinsicWidth * c10)) / d10);
            int b11 = lo.c.b((height - (intrinsicHeight * c10)) / d10);
            this.f18847w.setBounds(b10, b11, intrinsicWidth + b10, intrinsicHeight + b11);
            this.f18849y = rect.left;
            this.f18850z = rect.top;
            this.A = (float) c10;
            return;
        }
        this.f18847w.setBounds(rect);
        this.f18849y = 0.0f;
        this.f18850z = 0.0f;
        this.A = 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f18847w.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.f18847w.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18847w.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18847w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f18847w.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f18847w.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f18847w.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f18847w.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f18847w;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f18847w;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
