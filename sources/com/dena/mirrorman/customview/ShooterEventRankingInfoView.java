package com.dena.mirrorman.customview;

import ae.km;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.ShooterEventRankingInfoView;
import io.l;
import jo.p;
import nd.b1;
import ud.m3;
import ud.y3;
import wn.v;

/* loaded from: classes2.dex */
public final class ShooterEventRankingInfoView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final km f25595w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShooterEventRankingInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25595w = (km) f.e(LayoutInflater.from(getContext()), b1.view_shooter_event_ranking_info, this, true);
    }

    public static final void c(l lVar, m3 m3Var, View view) {
        p.h(m3Var, "$bindModel");
        if (lVar != null) {
            lVar.invoke(m3Var.m());
        }
    }

    public final void b(final m3 m3Var, final l<? super String, v> lVar) {
        p.h(m3Var, "bindModel");
        this.f25595w.T(m3Var);
        km kmVar = this.f25595w;
        ShooterVictoryCountView shooterVictoryCountView = kmVar.P;
        y3.a aVar = y3.f55762e;
        Context context = kmVar.u().getContext();
        p.g(context, "binding.root.context");
        shooterVictoryCountView.a(aVar.a(context, m3Var.o(), m3Var.n()));
        this.f25595w.C.setOnClickListener(new View.OnClickListener() { // from class: yd.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShooterEventRankingInfoView.c(io.l.this, m3Var, view);
            }
        });
    }
}
