package com.dena.mirrorman.customview;

import ae.cm;
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
public final class RemainingKandumeView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final cm f25584w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemainingKandumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25584w = (cm) f.e(LayoutInflater.from(getContext()), b1.view_remaining_kandume_view, this, true);
        setRemainingKandume(0);
    }

    public final void setRemainingKandume(int i10) {
        AppCompatTextView appCompatTextView = this.f25584w.D;
        p.g(appCompatTextView, "binding.remainingKandumeTextView");
        b.c(appCompatTextView, Integer.valueOf(i10));
    }
}
