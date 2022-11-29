package com.dena.mirrorman.customview;

import ae.qn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import c3.a;
import jo.p;
import nd.f1;
import nd.w0;
import nd.y0;
import ud.z4;

/* loaded from: classes2.dex */
public final class UserProfileYellStatusConditionProgressView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final qn f25623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileYellStatusConditionProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        qn T = qn.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f25623w = T;
    }

    public final void a(z4 z4Var) {
        int i10;
        p.h(z4Var, "bindModel");
        int d10 = a.d(getContext(), z4Var.h() ? w0.f42240r0 : w0.f42224a);
        int d11 = a.d(getContext(), z4Var.h() ? w0.f42230e0 : w0.f42224a);
        Context context = getContext();
        if (z4Var.h()) {
            i10 = z4Var.i() ? w0.S : w0.f42242u0;
        } else {
            i10 = w0.f42224a;
        }
        int d12 = a.d(context, i10);
        this.f25623w.G.setText(getContext().getString(z4Var.g()));
        this.f25623w.G.setTextColor(d10);
        this.f25623w.D.setImageDrawable(a.f(getContext(), z4Var.b()));
        this.f25623w.E.setProgressDrawable(a.f(getContext(), z4Var.h() ? z4Var.f() : y0.bg_progress_bar_not_enabled_yell_status_condition));
        this.f25623w.E.setMax(z4Var.c());
        this.f25623w.E.setProgress(z4Var.e());
        this.f25623w.F.setText(z4Var.h() ? z4Var.d() : getContext().getString(f1.text_season_yell_conditions_disable_progress_max));
        this.f25623w.F.setTextColor(d11);
        this.f25623w.C.setText(z4Var.h() ? z4Var.a() : "-");
        this.f25623w.C.setTextColor(d12);
        this.f25623w.B.setText(z4Var.h() ? z4Var.a() : "-");
        this.f25623w.B.setTextColor(d12);
        this.f25623w.C.setVisibility(z4Var.i() ? 8 : 0);
        this.f25623w.B.setVisibility(z4Var.i() ? 0 : 8);
    }
}
