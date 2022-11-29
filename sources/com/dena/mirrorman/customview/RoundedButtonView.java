package com.dena.mirrorman.customview;

import ae.im;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrorman.customview.RoundedButtonView;
import jo.h;
import jo.p;
import nd.b1;
import nd.h1;
import nd.w0;
import nd.z0;
import wn.v;

/* loaded from: classes2.dex */
public final class RoundedButtonView extends FrameLayout {
    public static final a T = new a(null);
    public static final int U = 8;
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;

    /* renamed from: w  reason: collision with root package name */
    public final im f25589w;

    /* renamed from: x  reason: collision with root package name */
    public View.OnLayoutChangeListener f25590x;

    /* renamed from: y  reason: collision with root package name */
    public int f25591y;

    /* renamed from: z  reason: collision with root package name */
    public String f25592z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ShapeDrawable.ShaderFactory {
        public b() {
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        /* renamed from: a */
        public LinearGradient resize(int i10, int i11) {
            return new LinearGradient(0.0f, 0.0f, i10, i11, c3.a.d(RoundedButtonView.this.getContext(), RoundedButtonView.this.getBackgroundGradientStartColor()), c3.a.d(RoundedButtonView.this.getContext(), RoundedButtonView.this.getBackgroundGradientEndColor()), Shader.TileMode.REPEAT);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ShapeDrawable.ShaderFactory {
        public c() {
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        /* renamed from: a */
        public LinearGradient resize(int i10, int i11) {
            return new LinearGradient(0.0f, 0.0f, i10, i11, c3.a.d(RoundedButtonView.this.getContext(), RoundedButtonView.this.getDisabledBackgroundGradientStartColor()), c3.a.d(RoundedButtonView.this.getContext(), RoundedButtonView.this.getDisabledBackgroundGradientEndColor()), Shader.TileMode.REPEAT);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ RoundedButtonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void b(RoundedButtonView roundedButtonView, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        p.h(roundedButtonView, "this$0");
        if (roundedButtonView.f25591y != roundedButtonView.getHeight()) {
            roundedButtonView.f25591y = roundedButtonView.getHeight();
            roundedButtonView.c();
        }
    }

    private final void setDisabledBorderColor(int i10) {
        this.J = i10;
        c();
    }

    private final void setDisabledTitleColor(int i10) {
        this.B = i10;
        c();
    }

    private final void setRoundedButtonViewIconAlignRight(boolean z10) {
        this.H = z10;
        c();
    }

    private final void setRoundedButtonViewIconSize(int i10) {
        this.G = i10;
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        AppCompatImageView appCompatImageView;
        int i10;
        int i11;
        this.f25589w.E.setText(this.f25592z);
        if (isEnabled()) {
            this.f25589w.E.setTextColor(c3.a.d(getContext(), this.A));
        } else {
            this.f25589w.E.setTextColor(c3.a.d(getContext(), this.B));
        }
        float f10 = this.D;
        if (f10 == 0.0f) {
            this.f25589w.E.setTextSize(2, 14.0f);
        } else {
            this.f25589w.E.setTextSize(0, f10);
        }
        if (this.C == 1) {
            this.f25589w.E.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.f25589w.E.setTypeface(Typeface.DEFAULT);
        }
        if (this.H) {
            this.f25589w.D.setVisibility(0);
            this.f25589w.C.setVisibility(8);
            appCompatImageView = this.f25589w.D;
            p.g(appCompatImageView, "binding.rightIconImageView");
        } else {
            this.f25589w.D.setVisibility(8);
            this.f25589w.C.setVisibility(0);
            appCompatImageView = this.f25589w.C;
            p.g(appCompatImageView, "binding.iconImageView");
        }
        if (this.E > 0) {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(this.E);
        } else {
            appCompatImageView.setVisibility(8);
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.f25589w.B);
        cVar.A(this.H ? z0.right_icon_image_view : z0.Ue, 6, this.F);
        cVar.m(this.H ? z0.right_icon_image_view : z0.G6, this.G);
        cVar.l(this.H ? z0.right_icon_image_view : z0.G6, this.G);
        cVar.c(this.f25589w.B);
        if (isEnabled()) {
            i10 = this.O;
        } else {
            i10 = this.N;
        }
        if (isEnabled()) {
            i11 = this.I;
        } else {
            i11 = this.J;
        }
        PaintDrawable paintDrawable = new PaintDrawable(c3.a.d(getContext(), i10));
        paintDrawable.setShape(new RectShape());
        float f11 = this.L;
        if (f11 <= 0.0f) {
            f11 = getHeight() / 2.0f;
        }
        paintDrawable.setCornerRadius(f11);
        if (this.P > 0 && this.Q > 0 && isEnabled()) {
            paintDrawable.setShaderFactory(new b());
        } else if (this.R > 0 && this.S > 0 && !isEnabled()) {
            paintDrawable.setShaderFactory(new c());
        }
        PaintDrawable paintDrawable2 = paintDrawable;
        if (this.K > 0) {
            PaintDrawable[] paintDrawableArr = new PaintDrawable[2];
            paintDrawableArr[0] = paintDrawable;
            PaintDrawable paintDrawable3 = new PaintDrawable(c3.a.d(getContext(), i11));
            paintDrawable3.setShape(new RectShape());
            paintDrawable3.getPaint().setAntiAlias(true);
            paintDrawable3.getPaint().setStyle(Paint.Style.STROKE);
            paintDrawable3.getPaint().setStrokeWidth(this.K);
            float f12 = this.L;
            if (f12 <= 0.0f) {
                f12 = (getHeight() - this.K) / 2.0f;
            }
            paintDrawable3.setCornerRadius(f12);
            v vVar = v.f59242a;
            paintDrawableArr[1] = paintDrawable3;
            LayerDrawable layerDrawable = new LayerDrawable(paintDrawableArr);
            int ceil = (int) Math.ceil(this.K / 2.0f);
            layerDrawable.setLayerInset(1, ceil, ceil, ceil, ceil);
            paintDrawable2 = layerDrawable;
        }
        ColorStateList valueOf = ColorStateList.valueOf(c3.a.d(getContext(), this.M));
        PaintDrawable paintDrawable4 = new PaintDrawable(c3.a.d(getContext(), 17170443));
        paintDrawable4.setShape(new RectShape());
        float f13 = this.L;
        if (f13 <= 0.0f) {
            f13 = getHeight() / 2.0f;
        }
        paintDrawable4.setCornerRadius(f13);
        v vVar2 = v.f59242a;
        setBackground(new RippleDrawable(valueOf, paintDrawable2, paintDrawable4));
    }

    public final int getBackgroundGradientEndColor() {
        return this.Q;
    }

    public final int getBackgroundGradientStartColor() {
        return this.P;
    }

    public final int getBorderColor() {
        return this.I;
    }

    public final int getBorderWidth() {
        return this.K;
    }

    public final float getCornerRadius() {
        return this.L;
    }

    public final int getDisabledBackgroundColor() {
        return this.N;
    }

    public final int getDisabledBackgroundGradientEndColor() {
        return this.S;
    }

    public final int getDisabledBackgroundGradientStartColor() {
        return this.R;
    }

    public final int getIcon() {
        return this.E;
    }

    public final int getIconPadding() {
        return this.F;
    }

    public final int getRippleOverlayColor() {
        return this.M;
    }

    public final int getRoundedButtonViewBackgroundColor() {
        return this.O;
    }

    public final String getTitle() {
        return this.f25592z;
    }

    public final int getTitleColor() {
        return this.A;
    }

    public final float getTitleSize() {
        return this.D;
    }

    public final int getTitleStyle() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: yd.e1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                RoundedButtonView.b(RoundedButtonView.this, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        addOnLayoutChangeListener(onLayoutChangeListener);
        this.f25590x = onLayoutChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        View.OnLayoutChangeListener onLayoutChangeListener = this.f25590x;
        if (onLayoutChangeListener != null) {
            removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.f25590x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        c();
    }

    public final void setBackgroundGradientEndColor(int i10) {
        this.Q = i10;
        c();
    }

    public final void setBackgroundGradientStartColor(int i10) {
        this.P = i10;
        c();
    }

    public final void setBorderColor(int i10) {
        this.I = i10;
        c();
    }

    public final void setBorderWidth(int i10) {
        this.K = i10;
        c();
    }

    public final void setCornerRadius(float f10) {
        this.L = f10;
        c();
    }

    public final void setDisabledBackgroundColor(int i10) {
        this.N = i10;
        c();
    }

    public final void setDisabledBackgroundGradientEndColor(int i10) {
        this.S = i10;
        c();
    }

    public final void setDisabledBackgroundGradientStartColor(int i10) {
        this.R = i10;
        c();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        boolean isEnabled = isEnabled();
        super.setEnabled(z10);
        if (isEnabled != z10) {
            c();
        }
    }

    public final void setIcon(int i10) {
        this.E = i10;
        c();
    }

    public final void setIconPadding(int i10) {
        this.F = i10;
        c();
    }

    public final void setRippleOverlayColor(int i10) {
        this.M = i10;
        c();
    }

    public final void setRoundedButtonViewBackgroundColor(int i10) {
        this.O = i10;
        c();
    }

    public final void setTitle(String str) {
        this.f25592z = str;
        c();
    }

    public final void setTitleColor(int i10) {
        this.A = i10;
        c();
    }

    public final void setTitleSize(float f10) {
        this.D = f10;
        c();
    }

    public final void setTitleStyle(int i10) {
        this.C = i10;
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedButtonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25589w = (im) f.e(LayoutInflater.from(context), b1.view_rounded_button, this, true);
        this.f25592z = "";
        this.A = 17170443;
        this.B = w0.U0;
        this.G = -2;
        this.I = 17170443;
        int i11 = w0.Y;
        this.J = i11;
        this.M = w0.V0;
        this.N = i11;
        this.O = w0.f42242u0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.f42090m3, 0, 0);
            setTitle(obtainStyledAttributes.getString(h1.D3));
            setDisabledTitleColor(obtainStyledAttributes.getResourceId(h1.f42138u3, this.B));
            setTitleColor(obtainStyledAttributes.getResourceId(h1.E3, this.A));
            setTitleStyle(obtainStyledAttributes.getInt(h1.G3, 0));
            setTitleSize(obtainStyledAttributes.getDimension(h1.F3, this.D));
            setIcon(obtainStyledAttributes.getResourceId(h1.f42144v3, this.E));
            setIconPadding(obtainStyledAttributes.getDimensionPixelSize(h1.f42150w3, this.F));
            setRoundedButtonViewIconSize(obtainStyledAttributes.getDimensionPixelSize(h1.C3, -2));
            setRoundedButtonViewIconAlignRight(obtainStyledAttributes.getBoolean(h1.B3, false));
            setBorderColor(obtainStyledAttributes.getResourceId(h1.f42108p3, this.I));
            setDisabledBorderColor(obtainStyledAttributes.getResourceId(h1.f42132t3, this.J));
            setBorderWidth(obtainStyledAttributes.getDimensionPixelSize(h1.f42114q3, this.K));
            setCornerRadius(obtainStyledAttributes.getDimension(h1.f42120r3, this.L));
            setRippleOverlayColor(obtainStyledAttributes.getResourceId(h1.f42156x3, this.M));
            setRoundedButtonViewBackgroundColor(obtainStyledAttributes.getResourceId(h1.f42162y3, this.O));
            setDisabledBackgroundColor(obtainStyledAttributes.getResourceId(h1.f42126s3, this.N));
            setBackgroundGradientStartColor(obtainStyledAttributes.getResourceId(h1.f42102o3, this.P));
            setBackgroundGradientEndColor(obtainStyledAttributes.getResourceId(h1.f42096n3, this.Q));
            setDisabledBackgroundGradientStartColor(obtainStyledAttributes.getResourceId(h1.A3, this.R));
            setDisabledBackgroundGradientEndColor(obtainStyledAttributes.getResourceId(h1.f42168z3, this.S));
            obtainStyledAttributes.recycle();
        }
    }
}
