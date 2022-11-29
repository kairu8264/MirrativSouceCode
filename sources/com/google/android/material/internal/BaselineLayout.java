package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: w  reason: collision with root package name */
    public int f27674w;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f27674w = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f27674w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i12 - i10) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f27674w == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f27674w + paddingTop) - childAt.getBaseline();
                childAt.layout(i15, baseline, measuredWidth + i15, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i12 = Math.max(i12, baseline);
                    i13 = Math.max(i13, childAt.getMeasuredHeight() - baseline);
                }
                i15 = Math.max(i15, childAt.getMeasuredWidth());
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                i16 = View.combineMeasuredStates(i16, childAt.getMeasuredState());
            }
        }
        if (i12 != -1) {
            i14 = Math.max(i14, Math.max(i13, getPaddingBottom()) + i12);
            this.f27674w = i12;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i15, getSuggestedMinimumWidth()), i10, i16), View.resolveSizeAndState(Math.max(i14, getSuggestedMinimumHeight()), i11, i16 << 16));
    }
}
