package com.dena.mirrorman.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import g9.a;
import jo.p;

/* loaded from: classes3.dex */
public final class SafeViewPager extends ViewPager {
    public boolean H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.e(context);
        this.H0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        p.h(motionEvent, "ev");
        if (this.H0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e10) {
                a.c(e10);
                return false;
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p.h(motionEvent, "ev");
        if (this.H0) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e10) {
                a.c(e10);
                return false;
            }
        }
        return false;
    }
}
