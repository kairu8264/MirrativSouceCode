package com.dena.mirrorman.customview;

import ae.u8;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import de.n;
import jo.h;
import jo.p;
import nd.b1;
import nd.h1;
import nd.w0;

/* loaded from: classes2.dex */
public final class BorderedTextView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f25314x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25315y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final u8 f25316w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25316w = (u8) f.e(LayoutInflater.from(getContext()), b1.view_bordered_text, this, true);
        setup(attributeSet);
    }

    public final void setBorderedTextViewBorderColor(Integer num) {
        if (num != null) {
            num.intValue();
            this.f25316w.B.setTextColor(num.intValue());
        }
    }

    public final void setBorderedTextViewText(String str) {
        this.f25316w.C.setText(str);
        this.f25316w.B.setText(str);
    }

    public final void setBorderedTextViewTextColor(Integer num) {
        if (num != null) {
            num.intValue();
            this.f25316w.C.setTextColor(num.intValue());
        }
    }

    public final void setup(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h1.J, 0, 0);
            float dimension = obtainStyledAttributes.getDimension(h1.Q, n.b(this, 10));
            float dimension2 = obtainStyledAttributes.getDimension(h1.L, n.b(this, 2));
            int i10 = h1.K;
            if (obtainStyledAttributes.getType(i10) == 1) {
                setBorderedTextViewBorderColor(Integer.valueOf(c3.a.d(getContext(), obtainStyledAttributes.getResourceId(i10, w0.f42229d))));
            } else {
                setBorderedTextViewBorderColor(Integer.valueOf(obtainStyledAttributes.getColor(i10, -16777216)));
            }
            int i11 = h1.P;
            if (obtainStyledAttributes.getType(i11) == 1) {
                setBorderedTextViewTextColor(Integer.valueOf(c3.a.d(getContext(), obtainStyledAttributes.getResourceId(i11, w0.U0))));
            } else {
                setBorderedTextViewTextColor(Integer.valueOf(obtainStyledAttributes.getColor(i11, -16777216)));
            }
            this.f25316w.C.setTextSize(0, dimension);
            this.f25316w.B.setTextSize(0, dimension);
            this.f25316w.B.getPaint().setStrokeWidth(dimension2);
            this.f25316w.B.getPaint().setStyle(Paint.Style.STROKE);
            int i12 = obtainStyledAttributes.getInt(h1.N, 0);
            if (i12 == 0) {
                this.f25316w.C.setGravity(17);
                this.f25316w.B.setGravity(17);
            } else if (i12 == 1) {
                this.f25316w.C.setGravity(8388611);
                this.f25316w.B.setGravity(8388611);
            }
            int resourceId = obtainStyledAttributes.getResourceId(h1.M, 0);
            if (resourceId != 0) {
                try {
                    Typeface h10 = e3.h.h(getContext(), resourceId);
                    this.f25316w.C.setTypeface(h10);
                    this.f25316w.B.setTypeface(h10);
                } catch (Throwable th2) {
                    g9.a.c(th2);
                }
            }
            String string = obtainStyledAttributes.getString(h1.O);
            if (string != null) {
                setBorderedTextViewText(string);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
