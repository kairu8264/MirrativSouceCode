package com.dena.mirrorman.customview;

import ae.ek;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class LiveBadgeView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ek f25470w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        this.f25470w = (ek) f.e(LayoutInflater.from(getContext()), b1.view_live_badge, this, true);
    }

    private static /* synthetic */ void getBinding$annotations() {
    }
}
