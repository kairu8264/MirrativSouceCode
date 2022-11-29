package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj.l;
import o3.c0;
import wi.k;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int O = k.f58919p;
    public int A;
    public int B;
    public boolean C;
    public int D;
    public ArrayList<g> E;
    public int F;
    public boolean G;
    public boolean H;
    public Behavior I;
    public int J;
    public int K;
    public int L;
    public AnimatorListenerAdapter M;
    public xi.k<FloatingActionButton> N;

    /* renamed from: w  reason: collision with root package name */
    public final int f27366w;

    /* renamed from: x  reason: collision with root package name */
    public final tj.g f27367x;

    /* renamed from: y  reason: collision with root package name */
    public Animator f27368y;

    /* renamed from: z  reason: collision with root package name */
    public Animator f27369z;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.w();
            BottomAppBar.this.f27368y = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.x();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27376a;

        /* loaded from: classes3.dex */
        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.w();
            }
        }

        public b(int i10) {
            this.f27376a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.B(this.f27376a));
            floatingActionButton.u(new a());
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.w();
            BottomAppBar.this.G = false;
            BottomAppBar.this.f27369z = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.x();
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27380a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f27381b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f27382c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f27383d;

        public d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f27381b = actionMenuView;
            this.f27382c = i10;
            this.f27383d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27380a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f27380a) {
                return;
            }
            boolean z10 = BottomAppBar.this.F != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.F(bottomAppBar.F);
            BottomAppBar.this.L(this.f27381b, this.f27382c, this.f27383d, z10);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f27385w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f27386x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f27387y;

        public e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f27385w = actionMenuView;
            this.f27386x = i10;
            this.f27387y = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f27385w;
            actionMenuView.setTranslationX(BottomAppBar.this.A(actionMenuView, this.f27386x, this.f27387y));
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.M.onAnimationStart(animator);
            FloatingActionButton y10 = BottomAppBar.this.y();
            if (y10 != null) {
                y10.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* loaded from: classes3.dex */
    public static class h extends v3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f27390w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f27391x;

        /* loaded from: classes3.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27390w);
            parcel.writeInt(this.f27391x ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27390w = parcel.readInt();
            this.f27391x = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return B(this.A);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.K;
    }

    private aj.a getTopEdgeTreatment() {
        return (aj.a) this.f27367x.D().p();
    }

    public int A(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 == 1 && z10) {
            boolean d10 = l.d(this);
            int measuredWidth = d10 ? getMeasuredWidth() : 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                    if (d10) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((d10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d10 ? this.K : -this.L));
        }
        return 0;
    }

    public final float B(int i10) {
        boolean d10 = l.d(this);
        if (i10 == 1) {
            return ((getMeasuredWidth() / 2) - (this.f27366w + (d10 ? this.L : this.K))) * (d10 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean C() {
        FloatingActionButton y10 = y();
        return y10 != null && y10.p();
    }

    public final void D(int i10, boolean z10) {
        if (!c0.V(this)) {
            this.G = false;
            F(this.F);
            return;
        }
        Animator animator = this.f27369z;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!C()) {
            i10 = 0;
            z10 = false;
        }
        v(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f27369z = animatorSet;
        animatorSet.addListener(new c());
        this.f27369z.start();
    }

    public final void E(int i10) {
        if (this.A == i10 || !c0.V(this)) {
            return;
        }
        Animator animator = this.f27368y;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.B == 1) {
            u(i10, arrayList);
        } else {
            t(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f27368y = animatorSet;
        animatorSet.addListener(new a());
        this.f27368y.start();
    }

    public void F(int i10) {
        if (i10 != 0) {
            this.F = 0;
            getMenu().clear();
            inflateMenu(i10);
        }
    }

    public final void G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f27369z != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!C()) {
            K(actionMenuView, 0, false);
        } else {
            K(actionMenuView, this.A, this.H);
        }
    }

    public final void H() {
        getTopEdgeTreatment().q(getFabTranslationX());
        View z10 = z();
        this.f27367x.Z((this.H && C()) ? 1.0f : 0.0f);
        if (z10 != null) {
            z10.setTranslationY(getFabTranslationY());
            z10.setTranslationX(getFabTranslationX());
        }
    }

    public void I(int i10, int i11) {
        this.F = i11;
        this.G = true;
        D(i10, this.H);
        E(i10);
        this.A = i10;
    }

    public boolean J(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().i()) {
            getTopEdgeTreatment().o(f10);
            this.f27367x.invalidateSelf();
            return true;
        }
        return false;
    }

    public final void K(ActionMenuView actionMenuView, int i10, boolean z10) {
        L(actionMenuView, i10, z10, false);
    }

    public final void L(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f27367x.F();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.A;
    }

    public int getFabAnimationMode() {
        return this.B;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().h();
    }

    public boolean getHideOnScroll() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tj.h.f(this, this.f27367x);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            s();
            H();
        }
        G();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.A = hVar.f27390w;
        this.H = hVar.f27391x;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f27390w = this.A;
        hVar.f27391x = this.H;
        return hVar;
    }

    public final void r(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.M);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.N);
    }

    public final void s() {
        Animator animator = this.f27369z;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f27368y;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        g3.a.o(this.f27367x, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f10);
            this.f27367x.invalidateSelf();
            H();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f27367x.X(f10);
        getBehavior().G(this, this.f27367x.C() - this.f27367x.B());
    }

    public void setFabAlignmentMode(int i10) {
        I(i10, 0);
    }

    public void setFabAnimationMode(int i10) {
        this.B = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().l(f10);
            this.f27367x.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f10);
            this.f27367x.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f10);
            this.f27367x.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.C = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void t(int i10, List<Animator> list) {
        FloatingActionButton y10 = y();
        if (y10 == null || y10.o()) {
            return;
        }
        x();
        y10.m(new b(i10));
    }

    public final void u(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y(), "translationX", B(i10));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    public final void v(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i10, z10)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    public final void w() {
        ArrayList<g> arrayList;
        int i10 = this.D - 1;
        this.D = i10;
        if (i10 != 0 || (arrayList = this.E) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void x() {
        ArrayList<g> arrayList;
        int i10 = this.D;
        this.D = i10 + 1;
        if (i10 != 0 || (arrayList = this.E) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final FloatingActionButton y() {
        View z10 = z();
        if (z10 instanceof FloatingActionButton) {
            return (FloatingActionButton) z10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View z() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.z():android.view.View");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.I == null) {
            this.I = new Behavior();
        }
        return this.I;
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f27370e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f27371f;

        /* renamed from: g  reason: collision with root package name */
        public int f27372g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f27373h;

        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f27371f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f27370e);
                    int height = Behavior.this.f27370e.height();
                    bottomAppBar.J(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f27370e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f27372g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(wi.d.F) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (l.d(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f27366w;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f27366w;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f27373h = new a();
            this.f27370e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f27371f = new WeakReference<>(bottomAppBar);
            View z10 = bottomAppBar.z();
            if (z10 != null && !c0.V(z10)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
                fVar.f14934d = 49;
                this.f27372g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (z10 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) z10;
                    floatingActionButton.addOnLayoutChangeListener(this.f27373h);
                    bottomAppBar.r(floatingActionButton);
                }
                bottomAppBar.H();
            }
            coordinatorLayout.C(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27373h = new a();
            this.f27370e = new Rect();
        }
    }
}
