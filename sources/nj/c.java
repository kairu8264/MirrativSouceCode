package nj;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o3.c0;

/* loaded from: classes3.dex */
public class c extends ViewGroup {

    /* renamed from: w  reason: collision with root package name */
    public int f43622w;

    /* renamed from: x  reason: collision with root package name */
    public int f43623x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f43624y;

    /* renamed from: z  reason: collision with root package name */
    public int f43625z;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            return i11 != 1073741824 ? i12 : i10;
        }
        return Math.min(i12, i10);
    }

    public int b(View view) {
        Object tag = view.getTag(wi.f.I);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f43624y;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, wi.l.f59095s2, 0, 0);
        this.f43622w = obtainStyledAttributes.getDimensionPixelSize(wi.l.f59113u2, 0);
        this.f43623x = obtainStyledAttributes.getDimensionPixelSize(wi.l.f59104t2, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f43623x;
    }

    public int getLineSpacing() {
        return this.f43622w;
    }

    public int getRowCount() {
        return this.f43625z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f43625z = 0;
            return;
        }
        this.f43625z = 1;
        boolean z11 = c0.E(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(wi.f.I, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = o3.i.b(marginLayoutParams);
                    i14 = o3.i.a(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = i17 + i15 + childAt.getMeasuredWidth();
                if (!this.f43624y && measuredWidth > i16) {
                    i18 = this.f43622w + paddingTop;
                    this.f43625z++;
                    i17 = paddingRight;
                }
                childAt.setTag(wi.f.I, Integer.valueOf(this.f43625z - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += i15 + i14 + childAt.getMeasuredWidth() + this.f43623x;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i19 = paddingLeft;
                if (paddingLeft + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i14 = i19;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.f43622w + paddingTop;
                }
                int measuredWidth = i14 + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i14 + i12 + i13 + childAt.getMeasuredWidth() + this.f43623x;
                if (i18 == getChildCount() - 1) {
                    i17 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i17 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i10) {
        this.f43623x = i10;
    }

    public void setLineSpacing(int i10) {
        this.f43622w = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f43624y = z10;
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43624y = false;
        d(context, attributeSet);
    }
}
