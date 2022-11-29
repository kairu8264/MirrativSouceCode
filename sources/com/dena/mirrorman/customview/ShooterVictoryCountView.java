package com.dena.mirrorman.customview;

import ae.qm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import ud.y3;

/* loaded from: classes2.dex */
public final class ShooterVictoryCountView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final qm f25598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShooterVictoryCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25598w = (qm) f.e(LayoutInflater.from(getContext()), b1.view_shooter_victory_count, this, true);
    }

    public final void a(y3 y3Var) {
        p.h(y3Var, "bindModel");
        this.f25598w.T(y3Var);
    }
}
