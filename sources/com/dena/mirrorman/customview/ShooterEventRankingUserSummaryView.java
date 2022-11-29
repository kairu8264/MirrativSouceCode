package com.dena.mirrorman.customview;

import ae.mm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.ShooterEventRankingUserSummaryView;
import io.l;
import jo.p;
import nd.b1;
import ud.n3;
import ud.y3;
import wn.v;

/* loaded from: classes2.dex */
public final class ShooterEventRankingUserSummaryView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final mm f25596w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShooterEventRankingUserSummaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25596w = (mm) f.e(LayoutInflater.from(getContext()), b1.view_shooter_event_ranking_user_summary, this, true);
    }

    public static final void c(l lVar, n3 n3Var, View view) {
        p.h(n3Var, "$bindModel");
        if (lVar != null) {
            lVar.invoke(n3Var.m());
        }
    }

    public final void b(final n3 n3Var, final l<? super String, v> lVar) {
        p.h(n3Var, "bindModel");
        this.f25596w.T(n3Var);
        mm mmVar = this.f25596w;
        ShooterVictoryCountView shooterVictoryCountView = mmVar.U;
        y3.a aVar = y3.f55762e;
        Context context = mmVar.u().getContext();
        p.g(context, "binding.root.context");
        shooterVictoryCountView.a(aVar.a(context, n3Var.o(), n3Var.n()));
        this.f25596w.B.setOnClickListener(new View.OnClickListener() { // from class: yd.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShooterEventRankingUserSummaryView.c(io.l.this, n3Var, view);
            }
        });
    }
}
