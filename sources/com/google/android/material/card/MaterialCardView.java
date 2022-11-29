package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import tj.h;
import tj.n;
import wi.b;
import wi.k;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, n {
    public static final int[] K = {16842911};
    public static final int[] L = {16842912};
    public static final int[] M = {b.F};
    public static final int N = k.f58921r;
    public final dj.a F;
    public boolean G;
    public boolean H;
    public boolean I;
    public a J;

    /* loaded from: classes3.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f58788y);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.F.k().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.F.l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.F.m();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.F.n();
    }

    public int getCheckedIconMargin() {
        return this.F.o();
    }

    public int getCheckedIconSize() {
        return this.F.p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.F.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.F.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.F.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.F.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.F.A().top;
    }

    public float getProgress() {
        return this.F.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.F.s();
    }

    public ColorStateList getRippleColor() {
        return this.F.v();
    }

    public tj.k getShapeAppearanceModel() {
        return this.F.w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.F.x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.F.y();
    }

    public int getStrokeWidth() {
        return this.F.z();
    }

    public final void h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.F.j();
        }
    }

    public boolean i() {
        dj.a aVar = this.F;
        return aVar != null && aVar.D();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.H;
    }

    public boolean j() {
        return this.I;
    }

    public void k(int i10, int i11, int i12, int i13) {
        super.f(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.F.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, K);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, L);
        }
        if (j()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, M);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.F.F(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.G) {
            if (!this.F.C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.F.G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.F.H(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.F.Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.F.I(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.F.J(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.H != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.F.K(drawable);
    }

    public void setCheckedIconMargin(int i10) {
        this.F.L(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.F.L(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.F.K(f.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.F.M(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.F.M(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.F.N(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        dj.a aVar = this.F;
        if (aVar != null) {
            aVar.X();
        }
    }

    public void setDragged(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            refreshDrawableState();
            h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.F.b0();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.J = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.F.b0();
        this.F.Y();
    }

    public void setProgress(float f10) {
        this.F.P(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.F.O(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.F.Q(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.F.Q(f.a.a(getContext(), i10));
    }

    @Override // tj.n
    public void setShapeAppearanceModel(tj.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.u(getBoundsAsRectF()));
        }
        this.F.R(kVar);
    }

    public void setStrokeColor(int i10) {
        this.F.S(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.F.T(i10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.F.b0();
        this.F.Y();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (i() && isEnabled()) {
            this.H = !this.H;
            refreshDrawableState();
            h();
            a aVar = this.J;
            if (aVar != null) {
                aVar.a(this, this.H);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.N
            android.content.Context r8 = yj.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.H = r8
            r7.I = r8
            r0 = 1
            r7.G = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = wi.l.L3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = nj.j.h(r0, r1, r2, r3, r4, r5)
            dj.a r0 = new dj.a
            r0.<init>(r7, r9, r10, r6)
            r7.F = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.H(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.U(r9, r10, r1, r2)
            r0.E(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.F.H(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.F.S(colorStateList);
    }
}
