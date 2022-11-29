package com.dena.mirrorman.feature.event;

import ae.wj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.g2;
import io.l;
import java.util.List;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.x0;
import rd.g0;
import ud.p1;
import ud.q1;
import ud.r1;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes2.dex */
public final class LandingPageRankingView extends ConstraintLayout {
    public final wj U;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f25822w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(1);
            this.f25822w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f25822w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LandingPageRankingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LandingPageRankingView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void w(p1 p1Var, io.a<v> aVar, g2 g2Var) {
        p.h(p1Var, "bindModel");
        p.h(aVar, "expandClickListener");
        p.h(g2Var, "listener");
        this.U.T(p1Var);
        ConstraintLayout constraintLayout = this.U.D;
        p.g(constraintLayout, "binding.rankingExpandButtonContainer");
        g1.a(constraintLayout, new a(aVar));
        RecyclerView.h adapter = this.U.H.getAdapter();
        g0 g0Var = adapter instanceof g0 ? (g0) adapter : null;
        if (g0Var != null) {
            List<q1> f10 = p1Var.i().f();
            if (f10 == null) {
                f10 = s.k();
            }
            g0Var.d(f10);
        }
        RecyclerView.h adapter2 = this.U.H.getAdapter();
        g0 g0Var2 = adapter2 instanceof g0 ? (g0) adapter2 : null;
        if (g0Var2 != null) {
            g0Var2.h(g2Var);
        }
        List<q1> f11 = p1Var.i().f();
        int i10 = 0;
        if (f11 != null) {
            int i11 = 0;
            for (q1 q1Var : f11) {
                int dimensionPixelSize = i11 + getResources().getDimensionPixelSize(x0.gift_ranking_list_header_height);
                List<r1> f12 = q1Var.h().f();
                i11 = dimensionPixelSize + ((f12 != null ? f12.size() : 0) * getResources().getDimensionPixelSize(x0.gift_ranking_user_height)) + getResources().getDimensionPixelSize(x0.gift_ranking_list_inner_margin_height);
            }
            i10 = i11;
        }
        this.U.H.getLayoutParams().height = i10;
        this.U.H.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingPageRankingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        wj wjVar = (wj) f.e(LayoutInflater.from(context), b1.view_landing_page_ranking, this, true);
        this.U = wjVar;
        wjVar.H.setLayoutManager(new LinearLayoutManager(wjVar.u().getContext()) { // from class: com.dena.mirrorman.feature.event.LandingPageRankingView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        wjVar.H.setAdapter(new g0());
    }
}
