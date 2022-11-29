package com.dena.mirrativ.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import h9.e;
import jo.p;
import m9.a;

/* loaded from: classes.dex */
public final class MirraClassSeasonRatingCardView extends CardView {
    public final a F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MirraClassSeasonRatingCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.F = (a) f.e(LayoutInflater.from(getContext()), e.cardview_mirra_class_season_rating, this, true);
    }

    public final void g(h9.a aVar) {
        p.h(aVar, "bindModel");
        this.F.C.setImageResource(aVar.a());
        this.F.G.setProgress(aVar.d());
        this.F.G.setProgressDrawable(c3.a.f(getContext(), aVar.e()));
        this.F.E.d(aVar.f());
        this.F.E.setText(aVar.b());
        this.F.F.setText(aVar.c());
        this.F.D.setText("/");
        this.F.I.setText(aVar.g());
    }
}
