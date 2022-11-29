package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o3.c0;
import o3.p;
import o3.p0;
import o3.v;
import p3.c;
import p3.f;
import tj.g;
import tj.h;
import wi.k;
import wi.l;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int N = k.f58911h;
    public boolean A;
    public int B;
    public p0 C;
    public List<c> D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public WeakReference<View> J;
    public ValueAnimator K;
    public int[] L;
    public Drawable M;

    /* renamed from: w  reason: collision with root package name */
    public int f27298w;

    /* renamed from: x  reason: collision with root package name */
    public int f27299x;

    /* renamed from: y  reason: collision with root package name */
    public int f27300y;

    /* renamed from: z  reason: collision with root package name */
    public int f27301z;

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // yi.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // yi.c
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends yi.b {
        public ScrollingViewBehavior() {
        }

        public static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        @Override // yi.b
        public float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // yi.b
        public int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        @Override // yi.b
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                c0.c0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f27302k) + M()) - I(view2));
            }
        }

        public final void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.u(appBarLayout.w(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                c0.l0(coordinatorLayout, c.a.f45757q.b());
                c0.l0(coordinatorLayout, c.a.f45758r.b());
            }
        }

        @Override // yi.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // yi.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout H = H(coordinatorLayout.l(view));
            if (H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f62021d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H.r(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.O4);
            O(obtainStyledAttributes.getDimensionPixelSize(l.P4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public class a implements v {
        public a() {
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            return AppBarLayout.this.n(p0Var);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f27324a;

        public b(g gVar) {
            this.f27324a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f27324a.X(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    /* loaded from: classes3.dex */
    public interface e extends c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58764a);
    }

    public void a(c cVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        if (cVar == null || this.D.contains(cVar)) {
            return;
        }
        this.D.add(cVar);
    }

    public void b(e eVar) {
        a(eVar);
    }

    public final void c() {
        WeakReference<View> weakReference = this.J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.J = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final View d(View view) {
        int i10;
        if (this.J == null && (i10 = this.I) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.I);
            }
            if (findViewById != null) {
                this.J = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.J;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (v()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f27298w);
            this.M.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.M;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int F;
        int i11 = this.f27300y;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f27326a;
            if ((i13 & 5) == 5) {
                int i14 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i13 & 8) != 0) {
                    F = c0.F(childAt);
                } else if ((i13 & 2) != 0) {
                    F = measuredHeight - c0.F(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && c0.B(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + F;
                if (childCount == 0) {
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                }
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f27300y = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f27301z;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i13 = dVar.f27326a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= c0.F(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f27301z = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.I;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int F = c0.F(this);
        if (F == 0) {
            int childCount = getChildCount();
            F = childCount >= 1 ? c0.F(getChildAt(childCount - 1)) : 0;
            if (F == 0) {
                return getHeight() / 3;
            }
        }
        return (F * 2) + topInset;
    }

    public int getPendingAction() {
        return this.B;
    }

    public Drawable getStatusBarForeground() {
        return this.M;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        p0 p0Var = this.C;
        if (p0Var != null) {
            return p0Var.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f27299x;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f27326a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i11 == 0 && c0.B(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= c0.F(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f27299x = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return this.A;
    }

    public final boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return getTotalScrollRange() != 0;
    }

    public final void k() {
        this.f27299x = -1;
        this.f27300y = -1;
        this.f27301z = -1;
    }

    public boolean l() {
        return this.H;
    }

    public void m(int i10) {
        this.f27298w = i10;
        if (!willNotDraw()) {
            c0.i0(this);
        }
        List<c> list = this.D;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = this.D.get(i11);
                if (cVar != null) {
                    cVar.a(this, i10);
                }
            }
        }
    }

    public p0 n(p0 p0Var) {
        p0 p0Var2 = c0.B(this) ? p0Var : null;
        if (!n3.c.a(this.C, p0Var2)) {
            this.C = p0Var2;
            z();
            requestLayout();
        }
        return p0Var;
    }

    public void o(c cVar) {
        List<c> list = this.D;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.L == null) {
            this.L = new int[4];
        }
        int[] iArr = this.L;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.F;
        int i11 = wi.b.G;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.G) ? wi.b.H : -wi.b.H;
        int i12 = wi.b.E;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.G) ? wi.b.D : -wi.b.D;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (c0.B(this) && x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                c0.c0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.A = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((d) getChildAt(i14).getLayoutParams()).b() != null) {
                this.A = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.M;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.E) {
            return;
        }
        if (!this.H && !i()) {
            z11 = false;
        }
        t(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && c0.B(this) && x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = i3.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(e eVar) {
        o(eVar);
    }

    public void q() {
        this.B = 0;
    }

    public void r(boolean z10, boolean z11) {
        s(z10, z11, true);
    }

    public final void s(boolean z10, boolean z11, boolean z12) {
        this.B = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        r(z10, c0.V(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.H = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.I = i10;
        c();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.M;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.M = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.M.setState(getDrawableState());
                }
                g3.a.m(this.M, c0.E(this));
                this.M.setVisible(getVisibility() == 0, false);
                this.M.setCallback(this);
            }
            z();
            c0.i0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(f.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            yi.e.b(this, f10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.M;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean t(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    public boolean u(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
            if (this.H && (getBackground() instanceof g)) {
                y((g) getBackground(), z10);
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean v() {
        return this.M != null && getTopInset() > 0;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.M;
    }

    public boolean w(View view) {
        View d10 = d(view);
        if (d10 != null) {
            view = d10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean x() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || c0.B(childAt)) ? false : true;
        }
        return false;
    }

    public final void y(g gVar, boolean z10) {
        float dimension = getResources().getDimension(wi.d.f58800a);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.K = ofFloat;
        ofFloat.setDuration(getResources().getInteger(wi.g.f58861a));
        this.K.setInterpolator(xi.a.f60297a);
        this.K.addUpdateListener(new b(gVar));
        this.K.start();
    }

    public final void z() {
        setWillNotDraw(!v());
    }

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends yi.a<T> {

        /* renamed from: k  reason: collision with root package name */
        public int f27302k;

        /* renamed from: l  reason: collision with root package name */
        public int f27303l;

        /* renamed from: m  reason: collision with root package name */
        public ValueAnimator f27304m;

        /* renamed from: n  reason: collision with root package name */
        public int f27305n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f27306o;

        /* renamed from: p  reason: collision with root package name */
        public float f27307p;

        /* renamed from: q  reason: collision with root package name */
        public WeakReference<View> f27308q;

        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f27309a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f27310b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f27309a = coordinatorLayout;
                this.f27310b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f27309a, this.f27310b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* loaded from: classes3.dex */
        public class b implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f27312a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f27313b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ View f27314c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f27315d;

            public b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f27312a = coordinatorLayout;
                this.f27313b = appBarLayout;
                this.f27314c = view;
                this.f27315d = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p3.f
            public boolean a(View view, f.a aVar) {
                BaseBehavior.this.q(this.f27312a, this.f27313b, this.f27314c, 0, this.f27315d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* loaded from: classes3.dex */
        public class c implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f27317a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ boolean f27318b;

            public c(AppBarLayout appBarLayout, boolean z10) {
                this.f27317a = appBarLayout;
                this.f27318b = z10;
            }

            @Override // p3.f
            public boolean a(View view, f.a aVar) {
                this.f27317a.setExpanded(this.f27318b);
                return true;
            }
        }

        public BaseBehavior() {
            this.f27305n = -1;
        }

        public static boolean Y(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public static View a0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // yi.a
        public int M() {
            return E() + this.f27302k;
        }

        public final void S(CoordinatorLayout coordinatorLayout, T t10, View view) {
            if (M() != (-t10.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t10, c.a.f45757q, false);
            }
            if (M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i10 = -t10.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        c0.n0(coordinatorLayout, c.a.f45758r, null, new b(coordinatorLayout, t10, view, i10));
                        return;
                    }
                    return;
                }
                T(coordinatorLayout, t10, c.a.f45758r, true);
            }
        }

        public final void T(CoordinatorLayout coordinatorLayout, T t10, c.a aVar, boolean z10) {
            c0.n0(coordinatorLayout, aVar, null, new c(t10, z10));
        }

        public final void U(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int height;
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t10.getHeight()) + 1.0f) * 150.0f);
            }
            V(coordinatorLayout, t10, i10, height);
        }

        public final void V(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int M = M();
            if (M == i10) {
                ValueAnimator valueAnimator = this.f27304m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f27304m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f27304m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f27304m = valueAnimator3;
                valueAnimator3.setInterpolator(xi.a.f60301e);
                this.f27304m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f27304m.setDuration(Math.min(i11, 600));
            this.f27304m.setIntValues(M, i10);
            this.f27304m.start();
        }

        @Override // yi.a
        /* renamed from: W */
        public boolean H(T t10) {
            WeakReference<View> weakReference = this.f27308q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        public final boolean X(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.j() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        public final View Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof p) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int b0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (Y(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // yi.a
        /* renamed from: c0 */
        public int K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        @Override // yi.a
        /* renamed from: d0 */
        public int L(T t10) {
            return t10.getTotalScrollRange();
        }

        public final int e0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b10 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (b10 != null) {
                    int a10 = dVar.a();
                    if ((a10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((a10 & 2) != 0) {
                            i11 -= c0.F(childAt);
                        }
                    }
                    if (c0.B(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * b10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        @Override // yi.a
        /* renamed from: f0 */
        public void N(CoordinatorLayout coordinatorLayout, T t10) {
            q0(coordinatorLayout, t10);
            if (t10.l()) {
                t10.u(t10.w(Z(coordinatorLayout)));
            }
        }

        @Override // yi.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: g0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            int round;
            boolean l10 = super.l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            int i11 = this.f27305n;
            if (i11 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t10.getChildAt(i11);
                int i12 = -childAt.getBottom();
                if (this.f27306o) {
                    round = c0.F(childAt) + t10.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f27307p);
                }
                P(coordinatorLayout, t10, i12 + round);
            } else if (pendingAction != 0) {
                boolean z10 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i13 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        U(coordinatorLayout, t10, i13, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, i13);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        U(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.q();
            this.f27305n = -1;
            G(i3.a.b(E(), -t10.getTotalScrollRange(), 0));
            s0(coordinatorLayout, t10, E(), 0, true);
            t10.m(E());
            r0(coordinatorLayout, t10);
            return l10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: h0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.D(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.m(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: i0 */
        public void q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    i14 = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    iArr[1] = O(coordinatorLayout, t10, i11, i15, i16);
                }
            }
            if (t10.l()) {
                t10.u(t10.w(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: j0 */
        public void t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                r0(coordinatorLayout, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public void x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof d) {
                d dVar = (d) parcelable;
                super.x(coordinatorLayout, t10, dVar.getSuperState());
                this.f27305n = dVar.f27320w;
                this.f27307p = dVar.f27321x;
                this.f27306o = dVar.f27322y;
                return;
            }
            super.x(coordinatorLayout, t10, parcelable);
            this.f27305n = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable y10 = super.y(coordinatorLayout, t10);
            int E = E();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    d dVar = new d(y10);
                    dVar.f27320w = i10;
                    dVar.f27322y = bottom == c0.F(childAt) + t10.getTopInset();
                    dVar.f27321x = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return y10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.l() || X(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f27304m) != null) {
                valueAnimator.cancel();
            }
            this.f27308q = null;
            this.f27303l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0 */
        public void C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f27303l == 0 || i10 == 1) {
                q0(coordinatorLayout, t10);
                if (t10.l()) {
                    t10.u(t10.w(view));
                }
            }
            this.f27308q = new WeakReference<>(view);
        }

        @Override // yi.a
        /* renamed from: o0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int M = M();
            int i13 = 0;
            if (i11 != 0 && M >= i11 && M <= i12) {
                int b10 = i3.a.b(i10, i11, i12);
                if (M != b10) {
                    int e02 = t10.h() ? e0(t10, b10) : b10;
                    boolean G = G(e02);
                    i13 = M - b10;
                    this.f27302k = b10 - e02;
                    if (!G && t10.h()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.m(E());
                    s0(coordinatorLayout, t10, b10, b10 < M ? -1 : 1, false);
                }
            } else {
                this.f27302k = 0;
            }
            r0(coordinatorLayout, t10);
            return i13;
        }

        public final boolean p0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> m10 = coordinatorLayout.m(t10);
            int size = m10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) m10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).K() != 0;
                }
            }
            return false;
        }

        public final void q0(CoordinatorLayout coordinatorLayout, T t10) {
            int M = M();
            int b02 = b0(t10, M);
            if (b02 >= 0) {
                View childAt = t10.getChildAt(b02);
                d dVar = (d) childAt.getLayoutParams();
                int a10 = dVar.a();
                if ((a10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (b02 == t10.getChildCount() - 1) {
                        i11 += t10.getTopInset();
                    }
                    if (Y(a10, 2)) {
                        i11 += c0.F(childAt);
                    } else if (Y(a10, 5)) {
                        int F = c0.F(childAt) + i11;
                        if (M < F) {
                            i10 = F;
                        } else {
                            i11 = F;
                        }
                    }
                    if (Y(a10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (M < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    U(coordinatorLayout, t10, i3.a.b(i10, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void r0(CoordinatorLayout coordinatorLayout, T t10) {
            c0.l0(coordinatorLayout, c.a.f45757q.b());
            c0.l0(coordinatorLayout, c.a.f45758r.b());
            View Z = Z(coordinatorLayout);
            if (Z == null || t10.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) Z.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            S(coordinatorLayout, t10, Z);
        }

        public final void s0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View a02 = a0(t10, i10);
            if (a02 != null) {
                int a10 = ((d) a02.getLayoutParams()).a();
                boolean z11 = false;
                if ((a10 & 1) != 0) {
                    int F = c0.F(a02);
                    if (i11 <= 0 || (a10 & 12) == 0 ? !((a10 & 2) == 0 || (-i10) < (a02.getBottom() - F) - t10.getTopInset()) : (-i10) >= (a02.getBottom() - F) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
                if (t10.l()) {
                    z11 = t10.w(Z(coordinatorLayout));
                }
                boolean u10 = t10.u(z11);
                if (z10 || (u10 && p0(coordinatorLayout, t10))) {
                    t10.jumpDrawablesToCurrentState();
                }
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27305n = -1;
        }

        /* loaded from: classes3.dex */
        public static class d extends v3.a {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: w  reason: collision with root package name */
            public int f27320w;

            /* renamed from: x  reason: collision with root package name */
            public float f27321x;

            /* renamed from: y  reason: collision with root package name */
            public boolean f27322y;

            /* loaded from: classes3.dex */
            public static class a implements Parcelable.ClassLoaderCreator<d> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public d createFromParcel(Parcel parcel) {
                    return new d(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new d(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            public d(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f27320w = parcel.readInt();
                this.f27321x = parcel.readFloat();
                this.f27322y = parcel.readByte() != 0;
            }

            @Override // v3.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.f27320w);
                parcel.writeFloat(this.f27321x);
                parcel.writeByte(this.f27322y ? (byte) 1 : (byte) 0);
            }

            public d(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.N
            android.content.Context r11 = yj.a.c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f27299x = r11
            r10.f27300y = r11
            r10.f27301z = r11
            r6 = 0
            r10.B = r6
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L27
            yi.e.a(r10)
            yi.e.c(r10, r12, r13, r4)
        L27:
            int[] r2 = wi.l.f59020k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = nj.j.h(r0, r1, r2, r3, r4, r5)
            int r13 = wi.l.f59029l
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            o3.c0.v0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L5f
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            tj.g r0 = new tj.g
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.Y(r13)
            r0.N(r7)
            o3.c0.v0(r10, r0)
        L5f:
            int r13 = wi.l.f59065p
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L6e
            boolean r13 = r12.getBoolean(r13, r6)
            r10.s(r13, r6, r6)
        L6e:
            if (r8 < r9) goto L80
            int r13 = wi.l.f59056o
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L80
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            yi.e.b(r10, r13)
        L80:
            r13 = 26
            if (r8 < r13) goto La2
            int r13 = wi.l.f59047n
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L93
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        L93:
            int r13 = wi.l.f59038m
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        La2:
            int r13 = wi.l.f59074q
            boolean r13 = r12.getBoolean(r13, r6)
            r10.H = r13
            int r13 = wi.l.f59083r
            int r11 = r12.getResourceId(r13, r11)
            r10.I = r11
            int r11 = wi.l.f59092s
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            o3.c0.F0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes3.dex */
    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f27326a;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f27327b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27326a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f59110u);
            this.f27326a = obtainStyledAttributes.getInt(l.f59119v, 0);
            int i10 = l.f59128w;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f27327b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f27326a;
        }

        public Interpolator b() {
            return this.f27327b;
        }

        public boolean c() {
            int i10 = this.f27326a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f27326a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27326a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f27326a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27326a = 1;
        }
    }
}
