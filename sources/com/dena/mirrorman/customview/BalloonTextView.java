package com.dena.mirrorman.customview;

import ae.o8;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import c3.a;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import de.n;
import jo.h;
import jo.p;
import nd.b1;
import nd.h1;
import nd.w0;

/* loaded from: classes2.dex */
public final class BalloonTextView extends ConstraintLayout {
    public final o8 U;
    public int V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public String f25305a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f25306b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f25307c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f25308d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f25309e0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalloonTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ BalloonTextView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setBalloonBackgroundColor(int i10) {
        this.f25307c0 = i10;
        this.U.Q.setColor(i10);
        this.U.M.setColor(i10);
        this.U.I.setColor(i10);
        this.U.G.setColor(i10);
        this.U.N.setColor(i10);
        this.U.J.setColor(i10);
        View view = this.U.B;
        PaintDrawable paintDrawable = new PaintDrawable(i10);
        paintDrawable.setCornerRadius(Math.max(0, this.f25306b0 - n.b(this, 1)));
        view.setBackground(paintDrawable);
    }

    private final void setBalloonBorderColor(int i10) {
        this.f25308d0 = i10;
        this.U.R.setColor(i10);
        this.U.P.setColor(i10);
        this.U.L.setColor(i10);
        this.U.H.setColor(i10);
        this.U.O.setColor(i10);
        this.U.K.setColor(i10);
        View view = this.U.D;
        PaintDrawable paintDrawable = new PaintDrawable(i10);
        paintDrawable.setCornerRadius(this.f25306b0);
        view.setBackground(paintDrawable);
    }

    public final String getBalloonText() {
        return this.f25305a0;
    }

    public final String getDirection() {
        return this.f25309e0;
    }

    public final int getTextColor() {
        return this.V;
    }

    public final float getTextSize() {
        return this.W;
    }

    public final void setBalloonText(String str) {
        p.h(str, "value");
        this.f25305a0 = str;
        this.U.F.setText(str);
    }

    public final void setDirection(String str) {
        p.h(str, "value");
        this.f25309e0 = str;
        switch (str.hashCode()) {
            case -1436089959:
                if (str.equals("rightTop")) {
                    this.U.R.setVisibility(4);
                    this.U.Q.setVisibility(4);
                    this.U.P.setVisibility(4);
                    this.U.M.setVisibility(4);
                    this.U.H.setVisibility(4);
                    this.U.G.setVisibility(4);
                    this.U.L.setVisibility(4);
                    this.U.I.setVisibility(4);
                    this.U.O.setVisibility(0);
                    this.U.N.setVisibility(0);
                    this.U.K.setVisibility(4);
                    this.U.J.setVisibility(4);
                    return;
                }
                return;
            case -1383228885:
                if (str.equals("bottom")) {
                    this.U.R.setVisibility(4);
                    this.U.Q.setVisibility(4);
                    this.U.P.setVisibility(4);
                    this.U.M.setVisibility(4);
                    this.U.H.setVisibility(0);
                    this.U.G.setVisibility(0);
                    this.U.L.setVisibility(4);
                    this.U.I.setVisibility(4);
                    this.U.O.setVisibility(4);
                    this.U.N.setVisibility(4);
                    this.U.K.setVisibility(4);
                    this.U.J.setVisibility(4);
                    return;
                }
                return;
            case 115029:
                if (str.equals("top")) {
                    this.U.R.setVisibility(0);
                    this.U.Q.setVisibility(0);
                    this.U.P.setVisibility(4);
                    this.U.M.setVisibility(4);
                    this.U.H.setVisibility(4);
                    this.U.G.setVisibility(4);
                    this.U.L.setVisibility(4);
                    this.U.I.setVisibility(4);
                    this.U.O.setVisibility(4);
                    this.U.N.setVisibility(4);
                    this.U.K.setVisibility(4);
                    this.U.J.setVisibility(4);
                    return;
                }
                return;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    this.U.R.setVisibility(4);
                    this.U.Q.setVisibility(4);
                    this.U.P.setVisibility(4);
                    this.U.M.setVisibility(4);
                    this.U.H.setVisibility(4);
                    this.U.G.setVisibility(4);
                    this.U.L.setVisibility(0);
                    this.U.I.setVisibility(0);
                    this.U.O.setVisibility(4);
                    this.U.N.setVisibility(4);
                    this.U.K.setVisibility(4);
                    this.U.J.setVisibility(4);
                    return;
                }
                return;
            case 55433166:
                if (str.equals("leftTop")) {
                    this.U.R.setVisibility(4);
                    this.U.Q.setVisibility(4);
                    this.U.P.setVisibility(4);
                    this.U.M.setVisibility(4);
                    this.U.H.setVisibility(4);
                    this.U.G.setVisibility(4);
                    this.U.L.setVisibility(4);
                    this.U.I.setVisibility(4);
                    this.U.O.setVisibility(4);
                    this.U.N.setVisibility(4);
                    this.U.K.setVisibility(0);
                    this.U.J.setVisibility(0);
                    return;
                }
                return;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    this.U.R.setVisibility(4);
                    this.U.Q.setVisibility(4);
                    this.U.P.setVisibility(0);
                    this.U.M.setVisibility(0);
                    this.U.H.setVisibility(4);
                    this.U.G.setVisibility(4);
                    this.U.L.setVisibility(4);
                    this.U.I.setVisibility(4);
                    this.U.O.setVisibility(4);
                    this.U.N.setVisibility(4);
                    this.U.K.setVisibility(4);
                    this.U.J.setVisibility(4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void setTextColor(int i10) {
        this.V = i10;
        this.U.F.setTextColor(i10);
    }

    public final void setTextSize(float f10) {
        this.W = f10;
        this.U.F.setTextSize(2, f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        o8 o8Var = (o8) f.e(LayoutInflater.from(getContext()), b1.view_balloon_text, this, true);
        this.U = o8Var;
        this.V = -1;
        this.W = 14.0f;
        this.f25305a0 = "";
        this.f25306b0 = n.b(this, 20);
        String str = "top";
        this.f25309e0 = "top";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.f42152x, 0, 0);
            String string = obtainStyledAttributes.getString(h1.G);
            if (string != null) {
                p.g(string, "getString(R.styleable.Ba…xtViewDirection) ?: \"top\"");
                str = string;
            }
            setDirection(str);
            o8Var.F.setText(obtainStyledAttributes.getString(h1.H));
            o8Var.C.setImageResource(obtainStyledAttributes.getResourceId(h1.A, 0));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(h1.B, 0);
            if (dimensionPixelSize > 0) {
                o8Var.F.setMinHeight(dimensionPixelSize);
            }
            this.f25306b0 = obtainStyledAttributes.getDimensionPixelSize(h1.C, this.f25306b0);
            o8Var.F.setTypeface(obtainStyledAttributes.getBoolean(h1.D, true) ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            setTextColor(obtainStyledAttributes.getColor(h1.E, -1));
            setBalloonBackgroundColor(obtainStyledAttributes.getColor(h1.f42158y, a.d(context, w0.f42242u0)));
            setBalloonBorderColor(obtainStyledAttributes.getColor(h1.f42164z, a.d(context, w0.U0)));
            setTextSize(obtainStyledAttributes.getFloat(h1.F, this.W));
            obtainStyledAttributes.recycle();
        }
    }
}
