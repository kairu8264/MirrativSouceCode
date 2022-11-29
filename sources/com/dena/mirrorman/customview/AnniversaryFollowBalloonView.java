package com.dena.mirrorman.customview;

import ae.g8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.net.api.response.user.AnniversaryType;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class AnniversaryFollowBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final g8 f25298w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnniversaryFollowBalloonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25298w = (g8) f.e(LayoutInflater.from(getContext()), b1.view_anniversary_follow_balloon, this, true);
    }

    public final void a(Anniversary anniversary) {
        p.h(anniversary, "anniversary");
        if (anniversary.getType() != AnniversaryType.FOLLOWER) {
            return;
        }
        this.f25298w.D.setText(String.valueOf(anniversary.getCount()));
    }
}
