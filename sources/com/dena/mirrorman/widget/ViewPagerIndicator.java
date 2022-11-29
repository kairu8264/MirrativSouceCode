package com.dena.mirrorman.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import jo.p;
import nd.y0;

/* loaded from: classes3.dex */
public final class ViewPagerIndicator extends RadioGroup {

    /* renamed from: w  reason: collision with root package name */
    public int f26403w;

    /* renamed from: x  reason: collision with root package name */
    public int f26404x;

    /* renamed from: y  reason: collision with root package name */
    public int f26405y;

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26403w = 15;
        this.f26405y = y0.indicator;
        setOrientation(0);
        setGravity(17);
    }

    public final int getCount() {
        return this.f26404x;
    }

    public final int getCurrentPosition() {
        int i10 = this.f26404x;
        for (int i11 = 0; i11 < i10; i11++) {
            View childAt = getChildAt(i11);
            p.f(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            if (((RadioButton) childAt).isChecked()) {
                return i11;
            }
        }
        return 0;
    }

    public final void setCount(int i10) {
        this.f26404x = i10;
        removeAllViews();
        for (int i11 = 0; i11 < i10; i11++) {
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setFocusable(false);
            radioButton.setClickable(false);
            Drawable drawable = getResources().getDrawable(this.f26405y);
            radioButton.setButtonDrawable(drawable);
            LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.width = drawable.getIntrinsicWidth();
            generateDefaultLayoutParams.height = drawable.getIntrinsicHeight();
            int i12 = this.f26403w;
            generateDefaultLayoutParams.rightMargin = i12;
            generateDefaultLayoutParams.leftMargin = i12;
            radioButton.setLayoutParams(generateDefaultLayoutParams);
            addView(radioButton);
        }
        setCurrentPosition(-1);
    }

    public final void setCurrentPosition(int i10) {
        int i11 = this.f26404x;
        if (i10 >= i11) {
            i10 = i11 - 1;
        }
        boolean z10 = false;
        if (i10 < 0) {
            i10 = i11 > 0 ? 0 : -1;
        }
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            View childAt = getChildAt(i10);
            p.f(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            ((RadioButton) childAt).setChecked(true);
        }
    }

    public final void setIndicatorResource(int i10) {
        this.f26405y = i10;
    }

    public final void setMarginHorizontal(int i10) {
        this.f26403w = i10;
    }
}
