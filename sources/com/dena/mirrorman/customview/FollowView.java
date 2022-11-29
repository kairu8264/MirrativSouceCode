package com.dena.mirrorman.customview;

import ae.y9;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.FollowView;
import de.n;
import jo.h;
import jo.p;
import nd.b1;
import nd.f1;
import nd.h1;
import nd.w0;
import nd.y0;
import wn.v;

/* loaded from: classes2.dex */
public final class FollowView extends ConstraintLayout {
    public final y9 U;
    public ViewTreeObserver.OnGlobalLayoutListener V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public String f25343a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f25344b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f25345c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f25346d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f25347e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f25348f0;

    /* loaded from: classes2.dex */
    public static final class a extends ShapeDrawable.ShaderFactory {
        public a() {
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        /* renamed from: a */
        public LinearGradient resize(int i10, int i11) {
            return new LinearGradient(FollowView.this.W, FollowView.this.W, i10 - FollowView.this.W, i11 - FollowView.this.W, c3.a.d(FollowView.this.getContext(), w0.X), c3.a.d(FollowView.this.getContext(), w0.f42242u0), Shader.TileMode.REPEAT);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ShapeDrawable.ShaderFactory {
        public b() {
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        /* renamed from: a */
        public LinearGradient resize(int i10, int i11) {
            return new LinearGradient(FollowView.this.W, FollowView.this.W, i10 - FollowView.this.W, i11 - FollowView.this.W, c3.a.d(FollowView.this.getContext(), w0.X), c3.a.d(FollowView.this.getContext(), w0.f42242u0), Shader.TileMode.REPEAT);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ FollowView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setBackgroundTransparencyEnabled(boolean z10) {
        this.f25348f0 = z10;
        z();
    }

    public static final void x(FollowView followView) {
        p.h(followView, "this$0");
        if (followView.getHeight() == 0 || followView.getWidth() == 0) {
            return;
        }
        ViewTreeObserver viewTreeObserver = followView.U.u().getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = followView.V;
        if (onGlobalLayoutListener == null) {
            p.v("globalLayoutListener");
            onGlobalLayoutListener = null;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        followView.z();
    }

    public final boolean getFollowing() {
        return this.f25347e0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.U.u().getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.V;
        if (onGlobalLayoutListener == null) {
            p.v("globalLayoutListener");
            onGlobalLayoutListener = null;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        super.onDetachedFromWindow();
    }

    public final void setFollowing(boolean z10) {
        this.f25347e0 = z10;
        z();
    }

    public final void z() {
        if (this.f25347e0) {
            AppCompatTextView appCompatTextView = this.U.D;
            Context context = getContext();
            int i10 = w0.U0;
            appCompatTextView.setTextColor(c3.a.d(context, i10));
            this.U.D.setText(this.f25345c0);
            this.U.D.setTextSize(2, this.f25346d0);
            this.U.C.setImageResource(y0.ic_checked);
            ConstraintLayout constraintLayout = this.U.B;
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[0]}, new int[]{c3.a.d(getContext(), w0.whiteThree95)});
            PaintDrawable paintDrawable = new PaintDrawable(c3.a.d(getContext(), i10));
            paintDrawable.setShape(new RectShape());
            paintDrawable.setCornerRadius(getHeight() / 2.0f);
            v vVar = v.f59242a;
            PaintDrawable paintDrawable2 = new PaintDrawable();
            paintDrawable2.setShape(new RectShape());
            paintDrawable2.setCornerRadius((getHeight() - this.W) / 2.0f);
            paintDrawable2.setShaderFactory(new a());
            LayerDrawable layerDrawable = new LayerDrawable(new PaintDrawable[]{paintDrawable, paintDrawable2});
            int i11 = this.W;
            layerDrawable.setLayerInset(1, i11, i11, i11, i11);
            constraintLayout.setBackground(new RippleDrawable(colorStateList, layerDrawable, null));
            return;
        }
        AppCompatTextView appCompatTextView2 = this.U.D;
        Context context2 = getContext();
        int i12 = w0.f42242u0;
        appCompatTextView2.setTextColor(c3.a.d(context2, i12));
        this.U.D.setText(this.f25343a0);
        this.U.D.setTextSize(2, this.f25344b0);
        this.U.C.setImageResource(y0.ic_follow);
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[0]}, new int[]{c3.a.d(getContext(), w0.tealish50)});
        if (this.f25348f0) {
            ConstraintLayout constraintLayout2 = this.U.B;
            PaintDrawable paintDrawable3 = new PaintDrawable(c3.a.d(getContext(), 17170444));
            paintDrawable3.setShape(new RectShape());
            paintDrawable3.setCornerRadius(getHeight() / 2.0f);
            v vVar2 = v.f59242a;
            PaintDrawable paintDrawable4 = new PaintDrawable(c3.a.d(getContext(), i12));
            paintDrawable4.setShape(new RectShape());
            paintDrawable4.setCornerRadius(getHeight() / 2.0f);
            paintDrawable4.getPaint().setStyle(Paint.Style.STROKE);
            paintDrawable4.getPaint().setStrokeWidth(this.W);
            LayerDrawable layerDrawable2 = new LayerDrawable(new PaintDrawable[]{paintDrawable3, paintDrawable4});
            int i13 = this.W;
            layerDrawable2.setLayerInset(1, i13, i13, i13, i13);
            constraintLayout2.setBackground(new RippleDrawable(colorStateList2, layerDrawable2, null));
            return;
        }
        ConstraintLayout constraintLayout3 = this.U.B;
        PaintDrawable paintDrawable5 = new PaintDrawable();
        paintDrawable5.setShape(new RectShape());
        paintDrawable5.setCornerRadius((getHeight() - this.W) / 2.0f);
        paintDrawable5.setShaderFactory(new b());
        v vVar3 = v.f59242a;
        PaintDrawable paintDrawable6 = new PaintDrawable(c3.a.d(getContext(), w0.U0));
        paintDrawable6.setShape(new RectShape());
        paintDrawable6.setCornerRadius(getHeight() / 2.0f);
        LayerDrawable layerDrawable3 = new LayerDrawable(new PaintDrawable[]{paintDrawable5, paintDrawable6});
        int i14 = this.W;
        layerDrawable3.setLayerInset(1, i14, i14, i14, i14);
        constraintLayout3.setBackground(new RippleDrawable(colorStateList2, layerDrawable3, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        y9 y9Var = (y9) f.e(LayoutInflater.from(context), b1.view_follow, this, true);
        this.U = y9Var;
        String string = getResources().getString(f1.f41967d2);
        p.g(string, "resources.getString(R.string.text_follow)");
        this.f25343a0 = string;
        this.f25344b0 = 14.0f;
        String string2 = getResources().getString(f1.text_status_following);
        p.g(string2, "resources.getString(R.st…ng.text_status_following)");
        this.f25345c0 = string2;
        this.f25346d0 = 14.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.E0, 0, 0);
            this.W = n.b(this, obtainStyledAttributes.getInteger(h1.I0, 2));
            setBackgroundTransparencyEnabled(obtainStyledAttributes.getBoolean(h1.H0, false));
            String string3 = obtainStyledAttributes.getString(h1.F0);
            if (string3 != null) {
                p.g(string3, "it");
                this.f25343a0 = string3;
            }
            String string4 = obtainStyledAttributes.getString(h1.J0);
            if (string4 != null) {
                p.g(string4, "it");
                this.f25345c0 = string4;
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(h1.L0, n.b(this, 18));
            y9Var.C.getLayoutParams().width = dimensionPixelSize;
            y9Var.C.getLayoutParams().height = dimensionPixelSize;
            this.f25344b0 = obtainStyledAttributes.getFloat(h1.G0, this.f25344b0);
            this.f25346d0 = obtainStyledAttributes.getFloat(h1.K0, this.f25346d0);
            obtainStyledAttributes.recycle();
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: yd.l
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                FollowView.x(FollowView.this);
            }
        };
        y9Var.u().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        this.V = onGlobalLayoutListener;
    }
}
