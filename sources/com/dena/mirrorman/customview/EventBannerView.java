package com.dena.mirrorman.customview;

import ae.s9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import c3.a;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import jo.h;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class EventBannerView extends ConstraintLayout {
    public final s9 U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ EventBannerView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void w(EventBannerResponse eventBannerResponse, int i10) {
        p.h(eventBannerResponse, "eventBanner");
        GlideApp.with(this).load(eventBannerResponse.getIconUrl()).into(this.U.C);
        this.U.D.setText(eventBannerResponse.getTitle());
        this.U.B.setText(eventBannerResponse.getDescription());
        this.U.D.setTextColor(a.d(getContext(), i10));
        this.U.B.setTextColor(a.d(getContext(), i10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (s9) f.e(LayoutInflater.from(getContext()), b1.view_event_banner, this, true);
    }
}
