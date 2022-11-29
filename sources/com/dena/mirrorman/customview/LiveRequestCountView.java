package com.dena.mirrorman.customview;

import ae.sk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import java.util.Arrays;
import jo.i0;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class LiveRequestCountView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final sk f25496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRequestCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25496w = (sk) f.e(LayoutInflater.from(getContext()), b1.view_live_request_count, this, true);
    }

    public final void setRequestCount(long j10) {
        AppCompatTextView appCompatTextView = this.f25496w.E;
        i0 i0Var = i0.f38149a;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
        p.g(format, "format(format, *args)");
        appCompatTextView.setText(format);
    }
}
