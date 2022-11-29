package com.dena.mirrorman.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import c3.a;
import jo.p;
import nd.h1;
import nd.y0;

/* loaded from: classes2.dex */
public final class PageControl extends RadioGroup {

    /* renamed from: w  reason: collision with root package name */
    public int f25560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        setOrientation(0);
        setGravity(17);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.E2, 0, 0);
        this.f25560w = obtainStyledAttributes.getResourceId(h1.F2, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            return;
        }
        if (getChildCount() == i11 && getChildCount() > i10) {
            View childAt = getChildAt(i10);
            p.f(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            if (((RadioButton) childAt).isChecked()) {
                return;
            }
        }
        if (getChildCount() == i11) {
            int childCount = getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                View childAt2 = getChildAt(i12);
                RadioButton radioButton = childAt2 instanceof RadioButton ? (RadioButton) childAt2 : null;
                if (radioButton != null) {
                    radioButton.setChecked(i12 == i10);
                }
                i12++;
            }
            return;
        }
        removeAllViews();
        int i13 = 0;
        while (i13 < i11) {
            RadioButton radioButton2 = new RadioButton(getContext());
            Context context = getContext();
            int i14 = this.f25560w;
            if (i14 <= 0) {
                i14 = y0.page_control_indicator;
            }
            radioButton2.setButtonDrawable(a.f(context, i14));
            radioButton2.setChecked(i13 == i10);
            addView(radioButton2);
            i13++;
        }
    }
}
