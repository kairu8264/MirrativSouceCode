package com.dena.mirrativ.otherfeature.campaign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import db.o;
import jo.p;
import ya.g0;

/* loaded from: classes2.dex */
public final class CampaignPrizeView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final o f21727w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignPrizeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f21727w = (o) f.e(LayoutInflater.from(getContext()), wa.f.view_campaign_prize, this, true);
    }

    public final void a(g0 g0Var) {
        p.h(g0Var, "bindModel");
        this.f21727w.T(g0Var);
    }
}
