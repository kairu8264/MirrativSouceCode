package com.dena.mirrorman.customview;

import ae.ak;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import nd.y0;
import td.a;
import ud.u1;

/* loaded from: classes2.dex */
public final class LiveAnnounceAppView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ak f25469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAnnounceAppView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25469w = (ak) f.e(LayoutInflater.from(getContext()), b1.view_live_announce_app, this, true);
    }

    public final void a(u1 u1Var) {
        p.h(u1Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f25469w.B;
        p.g(appCompatImageView, "binding.appImageView");
        a.n(appCompatImageView, u1Var.b(), y0.f42250e2);
        this.f25469w.C.setText(u1Var.d());
    }
}
