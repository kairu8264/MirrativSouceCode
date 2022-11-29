package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f27344a;

    /* renamed from: b  reason: collision with root package name */
    public int f27345b;

    /* renamed from: c  reason: collision with root package name */
    public int f27346c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f27347d;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f27347d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f27344a = 0;
        this.f27345b = 2;
        this.f27346c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f27347d = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public void G(V v10, int i10) {
        this.f27346c = i10;
        if (this.f27345b == 1) {
            v10.setTranslationY(this.f27344a + i10);
        }
    }

    public void H(V v10) {
        if (this.f27345b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f27347d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f27345b = 1;
        F(v10, this.f27344a + this.f27346c, 175L, xi.a.f60299c);
    }

    public void I(V v10) {
        if (this.f27345b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f27347d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f27345b = 2;
        F(v10, 0, 225L, xi.a.f60300d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f27344a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            H(v10);
        } else if (i11 < 0) {
            I(v10);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27344a = 0;
        this.f27345b = 2;
        this.f27346c = 0;
    }
}
