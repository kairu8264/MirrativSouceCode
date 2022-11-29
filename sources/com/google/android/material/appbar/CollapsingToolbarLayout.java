package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import o3.c0;
import o3.p0;
import o3.v;
import wi.f;
import wi.k;
import wi.l;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: c0  reason: collision with root package name */
    public static final int f27328c0 = k.f58913j;
    public View A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final Rect F;
    public final nj.a G;
    public final kj.a H;
    public boolean I;
    public boolean J;
    public Drawable K;
    public Drawable L;
    public int M;
    public boolean N;
    public ValueAnimator O;
    public long P;
    public int Q;
    public AppBarLayout.e R;
    public int S;
    public int T;
    public p0 U;
    public int V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f27329a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f27330b0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f27331w;

    /* renamed from: x  reason: collision with root package name */
    public int f27332x;

    /* renamed from: y  reason: collision with root package name */
    public ViewGroup f27333y;

    /* renamed from: z  reason: collision with root package name */
    public View f27334z;

    /* loaded from: classes3.dex */
    public class a implements v {
        public a() {
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            return CollapsingToolbarLayout.this.n(p0Var);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public class d implements AppBarLayout.e {
        public d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i10) {
            int height;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.S = i10;
            p0 p0Var = collapsingToolbarLayout.U;
            int m10 = p0Var != null ? p0Var.m() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                c cVar = (c) childAt.getLayoutParams();
                yi.d j10 = CollapsingToolbarLayout.j(childAt);
                int i12 = cVar.f27337a;
                if (i12 == 1) {
                    j10.f(i3.a.b(-i10, 0, CollapsingToolbarLayout.this.h(childAt)));
                } else if (i12 == 2) {
                    j10.f(Math.round((-i10) * cVar.f27338b));
                }
            }
            CollapsingToolbarLayout.this.u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.L != null && m10 > 0) {
                c0.i0(collapsingToolbarLayout2);
            }
            int height2 = (CollapsingToolbarLayout.this.getHeight() - c0.F(CollapsingToolbarLayout.this)) - m10;
            float f10 = height2;
            CollapsingToolbarLayout.this.G.r0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.G.f0(collapsingToolbarLayout3.S + height2);
            CollapsingToolbarLayout.this.G.p0(Math.abs(i10) / f10);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58772i);
    }

    public static int g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    public static CharSequence i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (Build.VERSION.SDK_INT < 21 || !(view instanceof android.widget.Toolbar)) {
            return null;
        }
        return ((android.widget.Toolbar) view).getTitle();
    }

    public static yi.d j(View view) {
        int i10 = f.U;
        yi.d dVar = (yi.d) view.getTag(i10);
        if (dVar == null) {
            yi.d dVar2 = new yi.d(view);
            view.setTag(i10, dVar2);
            return dVar2;
        }
        return dVar;
    }

    public static boolean l(View view) {
        return (view instanceof Toolbar) || (Build.VERSION.SDK_INT >= 21 && (view instanceof android.widget.Toolbar));
    }

    public final void a(int i10) {
        c();
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.O = valueAnimator2;
            valueAnimator2.setDuration(this.P);
            this.O.setInterpolator(i10 > this.M ? xi.a.f60299c : xi.a.f60300d);
            this.O.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.O.cancel();
        }
        this.O.setIntValues(this.M, i10);
        this.O.start();
    }

    public final void b(AppBarLayout appBarLayout) {
        if (k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    public final void c() {
        if (this.f27331w) {
            ViewGroup viewGroup = null;
            this.f27333y = null;
            this.f27334z = null;
            int i10 = this.f27332x;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f27333y = viewGroup2;
                if (viewGroup2 != null) {
                    this.f27334z = d(viewGroup2);
                }
            }
            if (this.f27333y == null) {
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i11);
                    if (l(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i11++;
                }
                this.f27333y = viewGroup;
            }
            t();
            this.f27331w = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final View d(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        c();
        if (this.f27333y == null && (drawable = this.K) != null && this.M > 0) {
            drawable.mutate().setAlpha(this.M);
            this.K.draw(canvas);
        }
        if (this.I && this.J) {
            if (this.f27333y != null && this.K != null && this.M > 0 && k() && this.G.D() < this.G.E()) {
                int save = canvas.save();
                canvas.clipRect(this.K.getBounds(), Region.Op.DIFFERENCE);
                this.G.m(canvas);
                canvas.restoreToCount(save);
            } else {
                this.G.m(canvas);
            }
        }
        if (this.L == null || this.M <= 0) {
            return;
        }
        p0 p0Var = this.U;
        int m10 = p0Var != null ? p0Var.m() : 0;
        if (m10 > 0) {
            this.L.setBounds(0, -this.S, getWidth(), m10 - this.S);
            this.L.mutate().setAlpha(this.M);
            this.L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.K == null || this.M <= 0 || !m(view)) {
            z10 = false;
        } else {
            s(this.K, view, getWidth(), getHeight());
            this.K.mutate().setAlpha(this.M);
            this.K.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        nj.a aVar = this.G;
        if (aVar != null) {
            z10 |= aVar.z0(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.G.r();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.G.v();
    }

    public Drawable getContentScrim() {
        return this.K;
    }

    public int getExpandedTitleGravity() {
        return this.G.A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.E;
    }

    public int getExpandedTitleMarginEnd() {
        return this.D;
    }

    public int getExpandedTitleMarginStart() {
        return this.B;
    }

    public int getExpandedTitleMarginTop() {
        return this.C;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.G.C();
    }

    public int getHyphenationFrequency() {
        return this.G.F();
    }

    public int getLineCount() {
        return this.G.G();
    }

    public float getLineSpacingAdd() {
        return this.G.H();
    }

    public float getLineSpacingMultiplier() {
        return this.G.I();
    }

    public int getMaxLines() {
        return this.G.J();
    }

    public int getScrimAlpha() {
        return this.M;
    }

    public long getScrimAnimationDuration() {
        return this.P;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.Q;
        if (i10 >= 0) {
            return i10 + this.V + this.f27329a0;
        }
        p0 p0Var = this.U;
        int m10 = p0Var != null ? p0Var.m() : 0;
        int F = c0.F(this);
        if (F > 0) {
            return Math.min((F * 2) + m10, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.L;
    }

    public CharSequence getTitle() {
        if (this.I) {
            return this.G.K();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.T;
    }

    public final int h(View view) {
        return ((getHeight() - j(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    public final boolean k() {
        return this.T == 1;
    }

    public final boolean m(View view) {
        View view2 = this.f27334z;
        if (view2 == null || view2 == this) {
            if (view == this.f27333y) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    public p0 n(p0 p0Var) {
        p0 p0Var2 = c0.B(this) ? p0Var : null;
        if (!n3.c.a(this.U, p0Var2)) {
            this.U = p0Var2;
            requestLayout();
        }
        return p0Var.c();
    }

    public void o(boolean z10, boolean z11) {
        if (this.N != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.N = z10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            c0.A0(this, c0.B(appBarLayout));
            if (this.R == null) {
                this.R = new d();
            }
            appBarLayout.b(this.R);
            c0.o0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.e eVar = this.R;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).p(eVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p0 p0Var = this.U;
        if (p0Var != null) {
            int m10 = p0Var.m();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!c0.B(childAt) && childAt.getTop() < m10) {
                    c0.c0(childAt, m10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            j(getChildAt(i15)).d();
        }
        v(i10, i11, i12, i13, false);
        w();
        u();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            j(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        p0 p0Var = this.U;
        int m10 = p0Var != null ? p0Var.m() : 0;
        if ((mode == 0 || this.W) && m10 > 0) {
            this.V = m10;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m10, 1073741824));
        }
        if (this.f27330b0 && this.G.J() > 1) {
            w();
            v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int G = this.G.G();
            if (G > 1) {
                this.f27329a0 = Math.round(this.G.z()) * (G - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f27329a0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f27333y;
        if (viewGroup != null) {
            View view = this.f27334z;
            if (view != null && view != this) {
                setMinimumHeight(g(view));
            } else {
                setMinimumHeight(g(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.K;
        if (drawable != null) {
            r(drawable, i10, i11);
        }
    }

    public final void p(boolean z10) {
        int i10;
        int i11;
        int i12;
        View view = this.f27334z;
        if (view == null) {
            view = this.f27333y;
        }
        int h10 = h(view);
        nj.b.a(this, this.A, this.F);
        ViewGroup viewGroup = this.f27333y;
        int i13 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i13 = toolbar.getTitleMarginStart();
            i11 = toolbar.getTitleMarginEnd();
            i12 = toolbar.getTitleMarginTop();
            i10 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i13 = toolbar2.getTitleMarginStart();
            i11 = toolbar2.getTitleMarginEnd();
            i12 = toolbar2.getTitleMarginTop();
            i10 = toolbar2.getTitleMarginBottom();
        }
        nj.a aVar = this.G;
        Rect rect = this.F;
        int i14 = rect.left + (z10 ? i11 : i13);
        int i15 = rect.top + h10 + i12;
        int i16 = rect.right;
        if (!z10) {
            i13 = i11;
        }
        aVar.X(i14, i15, i16 - i13, (rect.bottom + h10) - i10);
    }

    public final void q() {
        setContentDescription(getTitle());
    }

    public final void r(Drawable drawable, int i10, int i11) {
        s(drawable, this.f27333y, i10, i11);
    }

    public final void s(Drawable drawable, View view, int i10, int i11) {
        if (k() && view != null && this.I) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    public void setCollapsedTitleGravity(int i10) {
        this.G.c0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.G.Z(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.G.d0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.K = mutate;
            if (mutate != null) {
                r(mutate, getWidth(), getHeight());
                this.K.setCallback(this);
                this.K.setAlpha(this.M);
            }
            c0.i0(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(c3.a.f(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.G.l0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.G.i0(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.G.k0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.G.n0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f27330b0 = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.W = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.G.s0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.G.u0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.G.v0(f10);
    }

    public void setMaxLines(int i10) {
        this.G.w0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.G.y0(z10);
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.M) {
            if (this.K != null && (viewGroup = this.f27333y) != null) {
                c0.i0(viewGroup);
            }
            this.M = i10;
            c0.i0(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.P = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            u();
        }
    }

    public void setScrimsShown(boolean z10) {
        o(z10, c0.V(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.L = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.L.setState(getDrawableState());
                }
                g3.a.m(this.L, c0.E(this));
                this.L.setVisible(getVisibility() == 0, false);
                this.L.setCallback(this);
                this.L.setAlpha(this.M);
            }
            c0.i0(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(c3.a.f(getContext(), i10));
    }

    public void setTitle(CharSequence charSequence) {
        this.G.A0(charSequence);
        q();
    }

    public void setTitleCollapseMode(int i10) {
        this.T = i10;
        boolean k10 = k();
        this.G.q0(k10);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (k10 && this.K == null) {
            setContentScrimColor(this.H.d(getResources().getDimension(wi.d.f58800a)));
        }
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.I) {
            this.I = z10;
            q();
            t();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.L;
        if (drawable != null && drawable.isVisible() != z10) {
            this.L.setVisible(z10, false);
        }
        Drawable drawable2 = this.K;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.K.setVisible(z10, false);
    }

    public final void t() {
        View view;
        if (!this.I && (view = this.A) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A);
            }
        }
        if (!this.I || this.f27333y == null) {
            return;
        }
        if (this.A == null) {
            this.A = new View(getContext());
        }
        if (this.A.getParent() == null) {
            this.f27333y.addView(this.A, -1, -1);
        }
    }

    public final void u() {
        if (this.K == null && this.L == null) {
            return;
        }
        setScrimsShown(getHeight() + this.S < getScrimVisibleHeightTrigger());
    }

    public final void v(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.I || (view = this.A) == null) {
            return;
        }
        boolean z11 = c0.U(view) && this.A.getVisibility() == 0;
        this.J = z11;
        if (z11 || z10) {
            boolean z12 = c0.E(this) == 1;
            p(z12);
            this.G.g0(z12 ? this.D : this.B, this.F.top + this.C, (i12 - i10) - (z12 ? this.B : this.D), (i13 - i11) - this.E);
            this.G.V(z10);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.K || drawable == this.L;
    }

    public final void w() {
        if (this.f27333y != null && this.I && TextUtils.isEmpty(this.G.K())) {
            setTitle(i(this.f27333y));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.G.b0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes3.dex */
    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f27337a;

        /* renamed from: b  reason: collision with root package name */
        public float f27338b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27337a = 0;
            this.f27338b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.J1);
            this.f27337a = obtainStyledAttributes.getInt(l.K1, 0);
            a(obtainStyledAttributes.getFloat(l.L1, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f10) {
            this.f27338b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f27337a = 0;
            this.f27338b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27337a = 0;
            this.f27338b = 0.5f;
        }
    }
}
