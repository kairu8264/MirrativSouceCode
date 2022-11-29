package com.dena.mirrorman.customview;

import ae.ga;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import nd.h1;
import nd.y0;

/* loaded from: classes2.dex */
public final class FollowsYouView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ga f25351w;

    /* renamed from: x  reason: collision with root package name */
    public AttributeSet f25352x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowsYouView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25351w = (ga) f.e(LayoutInflater.from(getContext()), b1.view_follows_you, this, true);
        this.f25352x = attributeSet;
        a();
    }

    public final void a() {
        AttributeSet attributeSet = this.f25352x;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h1.M0, 0, 0);
            this.f25351w.B.setBackgroundResource(obtainStyledAttributes.getResourceId(h1.N0, y0.bg_follows_you_blackthree20));
            obtainStyledAttributes.recycle();
        }
    }
}
