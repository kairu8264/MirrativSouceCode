package g3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode C = PorterDuff.Mode.SRC_IN;
    public boolean A;
    public Drawable B;

    /* renamed from: w  reason: collision with root package name */
    public int f32612w;

    /* renamed from: x  reason: collision with root package name */
    public PorterDuff.Mode f32613x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f32614y;

    /* renamed from: z  reason: collision with root package name */
    public f f32615z;

    public d(f fVar, Resources resources) {
        this.f32615z = fVar;
        e(resources);
    }

    @Override // g3.c
    public final Drawable a() {
        return this.B;
    }

    @Override // g3.c
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f32615z;
            if (fVar != null) {
                fVar.f32617b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean c() {
        return true;
    }

    public final f d() {
        return new f(this.f32615z);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.B.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f32615z;
        if (fVar == null || (constantState = fVar.f32617b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (c()) {
            f fVar = this.f32615z;
            ColorStateList colorStateList = fVar.f32618c;
            PorterDuff.Mode mode = fVar.f32619d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f32614y || colorForState != this.f32612w || mode != this.f32613x) {
                    setColorFilter(colorForState, mode);
                    this.f32612w = colorForState;
                    this.f32613x = mode;
                    this.f32614y = true;
                    return true;
                }
            } else {
                this.f32614y = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f32615z;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.B.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f32615z;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f32615z.f32616a = getChangingConfigurations();
        return this.f32615z;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.B.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.B.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.B.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.B);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.B.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.B.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.B.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.B.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.B.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.B.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.B);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f32615z) == null) ? null : fVar.f32618c;
        return (colorStateList != null && colorStateList.isStateful()) || this.B.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.B.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A && super.mutate() == this) {
            this.f32615z = d();
            Drawable drawable = this.B;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f32615z;
            if (fVar != null) {
                Drawable drawable2 = this.B;
                fVar.f32617b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.B, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.B.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.B.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        a.j(this.B, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.B.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.B.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.B.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.B.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f32615z.f32618c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f32615z.f32619d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.B.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(Drawable drawable) {
        this.f32615z = d();
        b(drawable);
    }
}
