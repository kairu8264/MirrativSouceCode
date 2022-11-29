package com.dena.mirrorman.customview;

import ae.ml;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import de.n;
import java.util.List;
import jf.y;
import jo.p;
import nd.b1;
import nd.f1;
import td.a;
import xn.a0;

/* loaded from: classes2.dex */
public final class NextLiveView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ml f25549w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25549w = (ml) f.e(LayoutInflater.from(getContext()), b1.view_next_live, this, true);
    }

    public final void a(LiveBasicParams liveBasicParams) {
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        AppCompatImageView appCompatImageView = this.f25549w.D;
        p.g(appCompatImageView, "binding.liveImageView");
        a.b(appCompatImageView, liveBasicParams.getImage_url());
        AppCompatImageView appCompatImageView2 = this.f25549w.B;
        p.g(appCompatImageView2, "binding.appImageView");
        List<String> appIconUrls = liveBasicParams.getAppIconUrls();
        a.d(appCompatImageView2, appIconUrls != null ? (String) a0.Z(appIconUrls) : null);
        ProfileImageView profileImageView = this.f25549w.G;
        p.g(profileImageView, "binding.profileImageView");
        String profileImageUrl = liveBasicParams.getOwner().getProfileImageUrl();
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.Z(liveBasicParams.getOwner().getBadges());
        ProfileImageView.b(profileImageView, profileImageUrl, userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null, Integer.valueOf(n.b(this, 1)), null, 8, null);
        this.f25549w.I.setText(liveBasicParams.getOwner().getName());
        this.f25549w.F.setText(liveBasicParams.getTitle());
        AppCompatTextView appCompatTextView = this.f25549w.H;
        appCompatTextView.setText(liveBasicParams.getTotalViewerNum() + ' ' + getResources().getString(f1.text_views));
        this.f25549w.E.b(y.f38026d.a(liveBasicParams));
    }
}
