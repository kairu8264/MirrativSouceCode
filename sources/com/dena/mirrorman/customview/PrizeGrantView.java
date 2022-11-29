package com.dena.mirrorman.customview;

import ae.yl;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import ud.e3;

/* loaded from: classes2.dex */
public final class PrizeGrantView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final yl f25579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrizeGrantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25579w = (yl) f.e(LayoutInflater.from(getContext()), b1.view_prize_grant, this, true);
    }

    public final void a(e3 e3Var) {
        p.h(e3Var, "bindModel");
        this.f25579w.T(e3Var);
    }
}
