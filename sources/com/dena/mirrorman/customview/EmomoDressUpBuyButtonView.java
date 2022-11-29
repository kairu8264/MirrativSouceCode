package com.dena.mirrorman.customview;

import ae.m9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import td.b;

/* loaded from: classes2.dex */
public final class EmomoDressUpBuyButtonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final m9 f25334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmomoDressUpBuyButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25334w = (m9) f.e(LayoutInflater.from(getContext()), b1.view_emomo_dress_up_buy_button, this, true);
    }

    public final void a(int i10) {
        AppCompatTextView appCompatTextView = this.f25334w.E;
        p.g(appCompatTextView, "binding.requiredKandumeTextView");
        b.c(appCompatTextView, Integer.valueOf(i10));
    }
}
