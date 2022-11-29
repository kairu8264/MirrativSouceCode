package com.dena.mirrorman.customview;

import ae.qb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class GiftRankingAchievedRewardView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final qb f25452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftRankingAchievedRewardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25452w = (qb) f.e(LayoutInflater.from(getContext()), b1.view_gift_ranking_achieved_reward, this, true);
    }

    public final void a(String str) {
        p.h(str, "imageUrl");
        this.f25452w.T(str);
        this.f25452w.D.r();
    }
}
