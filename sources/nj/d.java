package nj;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes3.dex */
public class d extends LinearLayoutCompat {
    public boolean A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f43626w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f43627x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f43628y;

    /* renamed from: z  reason: collision with root package name */
    public int f43629z;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f43626w;
        if (drawable != null) {
            if (this.B) {
                this.B = false;
                Rect rect = this.f43627x;
                Rect rect2 = this.f43628y;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f43629z, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f43626w;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f43626w;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f43626w.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f43626w;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f43629z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f43626w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.B = z10 | this.B;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.B = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f43626w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f43626w);
            }
            this.f43626w = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f43629z == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f43629z != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f43629z = i10;
            if (i10 == 119 && this.f43626w != null) {
                this.f43626w.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f43626w;
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43627x = new Rect();
        this.f43628y = new Rect();
        this.f43629z = 119;
        this.A = true;
        this.B = false;
        TypedArray h10 = j.h(context, attributeSet, wi.l.f59140x2, i10, 0, new int[0]);
        this.f43629z = h10.getInt(wi.l.f59158z2, this.f43629z);
        Drawable drawable = h10.getDrawable(wi.l.f59149y2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A = h10.getBoolean(wi.l.A2, true);
        h10.recycle();
    }
}
