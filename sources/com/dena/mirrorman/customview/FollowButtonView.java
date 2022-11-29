package com.dena.mirrorman.customview;

import ae.aa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import c3.a;
import jo.h;
import jo.p;
import nd.b1;
import nd.d1;
import nd.f1;
import nd.w0;
import nd.y0;

/* loaded from: classes2.dex */
public final class FollowButtonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final aa f25339w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FollowButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ FollowButtonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setFollowing(boolean z10) {
        if (z10) {
            this.f25339w.C.setBackgroundResource(y0.rectangle_corner4_tealish);
            this.f25339w.B.setImageResource(y0.ic_check_circle_large);
            this.f25339w.D.setText(getResources().getString(f1.text_status_following));
            this.f25339w.D.setTextColor(a.d(getContext(), w0.U0));
            return;
        }
        this.f25339w.C.setBackgroundResource(y0.rectangle_corner4_whitethree_tealish1);
        this.f25339w.B.setImageResource(d1.f41951e);
        this.f25339w.D.setText(getResources().getString(f1.f41967d2));
        this.f25339w.D.setTextColor(a.d(getContext(), w0.f42242u0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowButtonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25339w = (aa) f.e(LayoutInflater.from(context), b1.view_follow_button, this, true);
    }
}
