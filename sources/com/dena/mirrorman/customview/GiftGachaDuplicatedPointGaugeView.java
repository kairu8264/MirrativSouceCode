package com.dena.mirrorman.customview;

import ae.ma;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import ao.g;
import c3.a;
import da.c;
import jo.p;
import nd.b1;
import uo.b3;
import uo.g1;
import uo.q0;
import uo.r0;
import yd.o;

/* loaded from: classes2.dex */
public final class GiftGachaDuplicatedPointGaugeView extends FrameLayout implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final g f25364w;

    /* renamed from: x  reason: collision with root package name */
    public final ma f25365x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGachaDuplicatedPointGaugeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25364w = g1.c().plus(b3.b(null, 1, null)).plus(new c());
        ma maVar = (ma) f.e(LayoutInflater.from(getContext()), b1.view_gift_gacha_duplicated_point_gauge, this, true);
        this.f25365x = maVar;
        setClipChildren(false);
        maVar.B.setOnCompleteProgress(new o(this));
        maVar.E.e(new yd.p(this));
        setup(attributeSet);
    }

    private final void setup(AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.f25365x.B.setup(attributeSet);
            this.f25365x.D.setup(attributeSet);
        }
    }

    public final void b() {
        this.f25365x.F.setAlpha(0.0f);
        this.f25365x.C.setVisibility(0);
        this.f25365x.E.setVisibility(8);
        this.f25365x.F.clearAnimation();
        this.f25365x.E.clearAnimation();
        this.f25365x.E.h();
    }

    public final void c(int i10, int i11, boolean z10) {
        BorderedTextView borderedTextView = this.f25365x.D;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 % i11);
        sb2.append('/');
        sb2.append(i11);
        borderedTextView.setBorderedTextViewText(sb2.toString());
        GaugeView gaugeView = this.f25365x.B;
        p.g(gaugeView, "binding.gaugeView");
        GaugeView.j(gaugeView, (i10 * 1.0f) / i11, false, z10, 0L, 10, null);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f25364w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    public final void setGaugeColor(int i10) {
        this.f25365x.B.setGaugeColor(a.d(getContext(), i10));
    }
}
