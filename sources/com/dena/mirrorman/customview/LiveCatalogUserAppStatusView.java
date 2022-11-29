package com.dena.mirrorman.customview;

import ae.kk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrorman.net.api.response.live.UserAppStatus;
import jo.h;
import jo.p;
import nd.b1;
import td.a;

/* loaded from: classes2.dex */
public final class LiveCatalogUserAppStatusView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final kk f25473w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveCatalogUserAppStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LiveCatalogUserAppStatusView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a(UserAppStatus userAppStatus) {
        p.h(userAppStatus, "userAppStatus");
        AppCompatImageView appCompatImageView = this.f25473w.B;
        p.g(appCompatImageView, "binding.iconImageView");
        a.f(appCompatImageView, userAppStatus.getIconUrl());
        this.f25473w.C.setText(userAppStatus.getLabel());
        this.f25473w.D.setText(userAppStatus.getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCatalogUserAppStatusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25473w = (kk) f.e(LayoutInflater.from(getContext()), b1.view_live_catalog_user_app_status, this, true);
    }
}
