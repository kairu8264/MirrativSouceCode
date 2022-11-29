package uj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import o3.c0;
import wi.l;

/* loaded from: classes3.dex */
public class d extends FrameLayout {
    public static final View.OnTouchListener D = new a();
    public final float A;
    public ColorStateList B;
    public PorterDuff.Mode C;

    /* renamed from: w  reason: collision with root package name */
    public c f55948w;

    /* renamed from: x  reason: collision with root package name */
    public b f55949x;

    /* renamed from: y  reason: collision with root package name */
    public int f55950y;

    /* renamed from: z  reason: collision with root package name */
    public final float f55951z;

    /* loaded from: classes3.dex */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(yj.a.c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.f58981f5);
        int i10 = l.f59044m5;
        if (obtainStyledAttributes.hasValue(i10)) {
            c0.z0(this, obtainStyledAttributes.getDimensionPixelSize(i10, 0));
        }
        this.f55950y = obtainStyledAttributes.getInt(l.f59008i5, 0);
        this.f55951z = obtainStyledAttributes.getFloat(l.f59017j5, 1.0f);
        setBackgroundTintList(qj.c.a(context2, obtainStyledAttributes, l.f59026k5));
        setBackgroundTintMode(nj.l.e(obtainStyledAttributes.getInt(l.f59035l5, -1), PorterDuff.Mode.SRC_IN));
        this.A = obtainStyledAttributes.getFloat(l.f58999h5, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(D);
        setFocusable(true);
        if (getBackground() == null) {
            c0.v0(this, a());
        }
    }

    public final Drawable a() {
        float dimension = getResources().getDimension(wi.d.X);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(hj.a.h(this, wi.b.f58778o, wi.b.f58775l, getBackgroundOverlayColorAlpha()));
        if (this.B != null) {
            Drawable r10 = g3.a.r(gradientDrawable);
            g3.a.o(r10, this.B);
            return r10;
        }
        return g3.a.r(gradientDrawable);
    }

    public float getActionTextColorAlpha() {
        return this.A;
    }

    public int getAnimationMode() {
        return this.f55950y;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f55951z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f55949x;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        c0.o0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f55949x;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c cVar = this.f55948w;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    public void setAnimationMode(int i10) {
        this.f55950y = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.B != null) {
            drawable = g3.a.r(drawable.mutate());
            g3.a.o(drawable, this.B);
            g3.a.p(drawable, this.C);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        if (getBackground() != null) {
            Drawable r10 = g3.a.r(getBackground().mutate());
            g3.a.o(r10, colorStateList);
            g3.a.p(r10, this.C);
            if (r10 != getBackground()) {
                super.setBackgroundDrawable(r10);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.C = mode;
        if (getBackground() != null) {
            Drawable r10 = g3.a.r(getBackground().mutate());
            g3.a.p(r10, mode);
            if (r10 != getBackground()) {
                super.setBackgroundDrawable(r10);
            }
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.f55949x = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : D);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f55948w = cVar;
    }
}
