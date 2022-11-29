package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import o3.c0;
import wi.k;
import wi.l;
import xi.h;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: c0  reason: collision with root package name */
    public static final int f27602c0 = k.f58926w;

    /* renamed from: d0  reason: collision with root package name */
    public static final Property<View, Float> f27603d0 = new b(Float.class, "width");

    /* renamed from: e0  reason: collision with root package name */
    public static final Property<View, Float> f27604e0 = new c(Float.class, "height");

    /* renamed from: f0  reason: collision with root package name */
    public static final Property<View, Float> f27605f0 = new d(Float.class, "paddingStart");

    /* renamed from: g0  reason: collision with root package name */
    public static final Property<View, Float> f27606g0 = new e(Float.class, "paddingEnd");
    public int M;
    public final com.google.android.material.floatingactionbutton.b N;
    public final com.google.android.material.floatingactionbutton.b O;
    public final com.google.android.material.floatingactionbutton.b P;
    public final com.google.android.material.floatingactionbutton.b Q;
    public final int R;
    public int S;
    public int T;
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27607a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f27608b0;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27614a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.b f27615b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f27616c;

        public a(com.google.android.material.floatingactionbutton.b bVar, f fVar) {
            this.f27615b = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27614a = true;
            this.f27615b.e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27615b.d();
            if (this.f27614a) {
                return;
            }
            this.f27615b.i(this.f27616c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f27615b.onAnimationStart(animator);
            this.f27614a = false;
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            c0.G0(view, f10.intValue(), view.getPaddingTop(), c0.I(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            c0.G0(view, c0.J(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.U;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.R;
        return i10 < 0 ? (Math.min(c0.J(this), c0.I(this)) * 2) + getIconSize() : i10;
    }

    public h getExtendMotionSpec() {
        return this.O.b();
    }

    public h getHideMotionSpec() {
        return this.Q.b();
    }

    public h getShowMotionSpec() {
        return this.P.b();
    }

    public h getShrinkMotionSpec() {
        return this.N.b();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.V && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.V = false;
            this.N.a();
        }
    }

    public final boolean q() {
        return getVisibility() != 0 ? this.M == 2 : this.M != 1;
    }

    public final void r(com.google.android.material.floatingactionbutton.b bVar, f fVar) {
        if (bVar.c()) {
            return;
        }
        if (!t()) {
            bVar.a();
            bVar.i(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet f10 = bVar.f();
        f10.addListener(new a(bVar, fVar));
        for (Animator.AnimatorListener animatorListener : bVar.h()) {
            f10.addListener(animatorListener);
        }
        f10.start();
    }

    public final void s() {
        this.f27608b0 = getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f27607a0 = z10;
    }

    public void setExtendMotionSpec(h hVar) {
        this.O.g(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.V == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.b bVar = z10 ? this.O : this.N;
        if (bVar.c()) {
            return;
        }
        bVar.a();
    }

    public void setHideMotionSpec(h hVar) {
        this.Q.g(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.V || this.W) {
            return;
        }
        this.S = c0.J(this);
        this.T = c0.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.V || this.W) {
            return;
        }
        this.S = i10;
        this.T = i12;
    }

    public void setShowMotionSpec(h hVar) {
        this.P.g(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.N.g(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        s();
    }

    public final boolean t() {
        return (c0.V(this) || (!q() && this.f27607a0)) && !isInEditMode();
    }

    /* loaded from: classes3.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f27609a;

        /* renamed from: b  reason: collision with root package name */
        public f f27610b;

        /* renamed from: c  reason: collision with root package name */
        public f f27611c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27612d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27613e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f27612d = false;
            this.f27613e = true;
        }

        public static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f27613e;
            extendedFloatingActionButton.r(z10 ? extendedFloatingActionButton.O : extendedFloatingActionButton.P, z10 ? this.f27611c : this.f27610b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (G(view)) {
                M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> l10 = coordinatorLayout.l(extendedFloatingActionButton);
            int size = l10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = l10.get(i11);
                if (view instanceof AppBarLayout) {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.C(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f27612d || this.f27613e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f27613e;
            extendedFloatingActionButton.r(z10 ? extendedFloatingActionButton.N : extendedFloatingActionButton.Q, z10 ? this.f27611c : this.f27610b);
        }

        public final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(appBarLayout, extendedFloatingActionButton)) {
                if (this.f27609a == null) {
                    this.f27609a = new Rect();
                }
                Rect rect = this.f27609a;
                nj.b.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        public final boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f14938h == 0) {
                fVar.f14938h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.X1);
            this.f27612d = obtainStyledAttributes.getBoolean(l.Y1, false);
            this.f27613e = obtainStyledAttributes.getBoolean(l.Z1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        s();
    }
}
