package com.dena.mirrorman.customview;

import ae.wk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import ud.h2;

/* loaded from: classes2.dex */
public final class MissionTopIconView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public wk f25524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionTopIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        ViewDataBinding e10 = f.e(LayoutInflater.from(getContext()), b1.view_mission_top_icon, this, true);
        p.g(e10, "inflate(LayoutInflater.f…ion_top_icon, this, true)");
        this.f25524w = (wk) e10;
    }

    public final void a(h2 h2Var) {
        p.h(h2Var, "missionStatusBindModel");
        this.f25524w.F.setText(h2Var.d());
        AppCompatTextView appCompatTextView = this.f25524w.F;
        p.g(appCompatTextView, "binding.unreceivedMissionNumTextView");
        appCompatTextView.setVisibility(h2Var.a() ? 0 : 8);
        AppCompatImageView appCompatImageView = this.f25524w.B;
        p.g(appCompatImageView, "binding.completeMissionBadgeImageView");
        appCompatImageView.setVisibility(h2Var.a() ? 0 : 8);
        this.f25524w.E.setText(h2Var.c());
        ConstraintLayout constraintLayout = this.f25524w.C;
        p.g(constraintLayout, "binding.missionContainer");
        constraintLayout.setVisibility(h2Var.b() ? 0 : 8);
        if (h2Var.a()) {
            this.f25524w.D.r();
            return;
        }
        this.f25524w.D.h();
        this.f25524w.D.setFrame(0);
    }
}
