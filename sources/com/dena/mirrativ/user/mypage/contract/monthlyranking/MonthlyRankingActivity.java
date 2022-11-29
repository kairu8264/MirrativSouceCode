package com.dena.mirrativ.user.mypage.contract.monthlyranking;

import ad.l2;
import ae.e8;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.user.mypage.contract.WebViewWithToolbarActivity;
import com.dena.mirrativ.user.mypage.contract.monthlyranking.MonthlyRankingActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import ha.a;
import hf.v0;
import io.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import od.s;
import pc.o;
import wn.l;
import wn.m;
import wn.v;
import xn.r;
import yd.g1;

/* loaded from: classes2.dex */
public final class MonthlyRankingActivity extends e.b {
    public static final a V = new a(null);
    public static final int W = 8;
    public o O;
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, MonthlyRankingActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24695a;

        static {
            int[] iArr = new int[l2.values().length];
            iArr[l2.DIAMOND.ordinal()] = 1;
            iArr[l2.PLATINUM.ordinal()] = 2;
            iArr[l2.EMERALD.ordinal()] = 3;
            iArr[l2.GOLD.ordinal()] = 4;
            iArr[l2.SILVER.ordinal()] = 5;
            iArr[l2.NOT_RANK.ordinal()] = 6;
            f24695a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<dd.h> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f24696w = new c();

        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final dd.h invoke() {
            return new dd.h();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ed.a f24698x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ed.a aVar) {
            super(1);
            this.f24698x = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            MonthlyRankingActivity monthlyRankingActivity = MonthlyRankingActivity.this;
            WebViewWithToolbarActivity.a aVar = WebViewWithToolbarActivity.R;
            String string = monthlyRankingActivity.getString(nc.i.text_contract_how_to_page_title);
            p.g(string, "getString(R.string.text_…ntract_how_to_page_title)");
            monthlyRankingActivity.startActivity(aVar.a(monthlyRankingActivity, string, this.f24698x.i()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<v> {
        public e() {
            super(0);
        }

        public final void a() {
            MonthlyRankingActivity.this.B3().c("");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<dd.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24700w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24701x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24702y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24700w = componentCallbacks;
            this.f24701x = aVar;
            this.f24702y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, dd.a] */
        @Override // io.a
        public final dd.a invoke() {
            ComponentCallbacks componentCallbacks = this.f24700w;
            return gq.a.a(componentCallbacks).c(f0.b(dd.a.class), this.f24701x, this.f24702y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<dd.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24703w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24704x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24705y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24703w = componentCallbacks;
            this.f24704x = aVar;
            this.f24705y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dd.f, java.lang.Object] */
        @Override // io.a
        public final dd.f invoke() {
            ComponentCallbacks componentCallbacks = this.f24703w;
            return gq.a.a(componentCallbacks).c(f0.b(dd.f.class), this.f24704x, this.f24705y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24706w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24707x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24708y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24706w = componentCallbacks;
            this.f24707x = aVar;
            this.f24708y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.s, java.lang.Object] */
        @Override // io.a
        public final s invoke() {
            ComponentCallbacks componentCallbacks = this.f24706w;
            return gq.a.a(componentCallbacks).c(f0.b(s.class), this.f24707x, this.f24708y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24709w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24710x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24711y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24709w = componentCallbacks;
            this.f24710x = aVar;
            this.f24711y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24709w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24710x, this.f24711y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24712w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24713x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24714y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24712w = componentCallbacks;
            this.f24713x = aVar;
            this.f24714y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24712w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f24713x, this.f24714y);
        }
    }

    public MonthlyRankingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new f(this, null, null));
        this.Q = wn.g.b(iVar, new g(this, null, null));
        this.R = wn.g.a(c.f24696w);
        this.S = wn.g.b(iVar, new h(this, null, null));
        this.T = wn.g.b(iVar, new i(this, null, null));
        this.U = wn.g.b(iVar, new j(this, null, null));
    }

    public static final void I3(MonthlyRankingActivity monthlyRankingActivity, ed.a aVar) {
        Object a10;
        p.h(monthlyRankingActivity, "this$0");
        p.g(aVar, "bindModel");
        monthlyRankingActivity.N3(aVar);
        monthlyRankingActivity.O3(aVar);
        monthlyRankingActivity.C3().c(aVar.m());
        o oVar = monthlyRankingActivity.O;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        oVar.O.setText(monthlyRankingActivity.getString(nc.i.text_gift_received_this_month));
        o oVar2 = monthlyRankingActivity.O;
        if (oVar2 == null) {
            p.v("binding");
            oVar2 = null;
        }
        oVar2.W.setText(monthlyRankingActivity.getString(nc.i.text_contract_period_covered, new Object[]{aVar.b(monthlyRankingActivity), aVar.a(monthlyRankingActivity)}));
        o oVar3 = monthlyRankingActivity.O;
        if (oVar3 == null) {
            p.v("binding");
            oVar3 = null;
        }
        oVar3.B.setText(aVar.o());
        o oVar4 = monthlyRankingActivity.O;
        if (oVar4 == null) {
            p.v("binding");
            oVar4 = null;
        }
        oVar4.f46479a0.setText(aVar.l());
        o oVar5 = monthlyRankingActivity.O;
        if (oVar5 == null) {
            p.v("binding");
            oVar5 = null;
        }
        oVar5.V.setText(aVar.j());
        o oVar6 = monthlyRankingActivity.O;
        if (oVar6 == null) {
            p.v("binding");
            oVar6 = null;
        }
        oVar6.N.setText(aVar.f());
        o oVar7 = monthlyRankingActivity.O;
        if (oVar7 == null) {
            p.v("binding");
            oVar7 = null;
        }
        oVar7.f46485g0.setText(monthlyRankingActivity.getString(nc.i.text_explain_ranking_prize_example2, new Object[]{String.valueOf(aVar.p()), String.valueOf(aVar.q())}));
        o oVar8 = monthlyRankingActivity.O;
        if (oVar8 == null) {
            p.v("binding");
            oVar8 = null;
        }
        AppCompatTextView appCompatTextView = oVar8.D;
        p.g(appCompatTextView, "binding.checkRankingRulesDetailTextView");
        g1.a(appCompatTextView, new d(aVar));
        MRLogger E3 = monthlyRankingActivity.E3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CONTRACT_RANKING_VIEW);
        builder.setTargetId(monthlyRankingActivity.G3().x());
        String n10 = aVar.n();
        String o10 = aVar.o();
        try {
            l.a aVar2 = wn.l.f59224w;
            Date c10 = aVar.c();
            a10 = wn.l.a(c10 != null ? new SimpleDateFormat("yyyyMM").format(c10) : null);
        } catch (Throwable th2) {
            l.a aVar3 = wn.l.f59224w;
            a10 = wn.l.a(m.a(th2));
        }
        String str = wn.l.c(a10) ? null : a10;
        if (str == null) {
            str = "";
        }
        builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new dd.g(n10, o10, str).a())));
        E3.sendLog(builder.build());
    }

    public static final void J3(MonthlyRankingActivity monthlyRankingActivity, ha.a aVar) {
        p.h(monthlyRankingActivity, "this$0");
        o oVar = null;
        if (aVar instanceof a.b) {
            o oVar2 = monthlyRankingActivity.O;
            if (oVar2 == null) {
                p.v("binding");
                oVar2 = null;
            }
            oVar2.f46489k0.b(StatusView.b.C0181b.f20790w);
            o oVar3 = monthlyRankingActivity.O;
            if (oVar3 == null) {
                p.v("binding");
            } else {
                oVar = oVar3;
            }
            NestedScrollView nestedScrollView = oVar.f46481c0;
            p.g(nestedScrollView, "binding.rankingContainer");
            nestedScrollView.setVisibility(8);
        } else if (aVar instanceof a.C0439a) {
            o oVar4 = monthlyRankingActivity.O;
            if (oVar4 == null) {
                p.v("binding");
                oVar4 = null;
            }
            StatusView statusView = oVar4.f46489k0;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = monthlyRankingActivity.getString(nc.i.f41875e);
                p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new e()));
            o oVar5 = monthlyRankingActivity.O;
            if (oVar5 == null) {
                p.v("binding");
            } else {
                oVar = oVar5;
            }
            NestedScrollView nestedScrollView2 = oVar.f46481c0;
            p.g(nestedScrollView2, "binding.rankingContainer");
            nestedScrollView2.setVisibility(8);
        } else {
            o oVar6 = monthlyRankingActivity.O;
            if (oVar6 == null) {
                p.v("binding");
                oVar6 = null;
            }
            oVar6.f46489k0.b(StatusView.b.c.f20791w);
            o oVar7 = monthlyRankingActivity.O;
            if (oVar7 == null) {
                p.v("binding");
            } else {
                oVar = oVar7;
            }
            NestedScrollView nestedScrollView3 = oVar.f46481c0;
            p.g(nestedScrollView3, "binding.rankingContainer");
            nestedScrollView3.setVisibility(0);
        }
    }

    public static final void L3(MonthlyRankingActivity monthlyRankingActivity, View view) {
        p.h(monthlyRankingActivity, "this$0");
        monthlyRankingActivity.finish();
    }

    public final dd.a B3() {
        return (dd.a) this.P.getValue();
    }

    public final dd.h C3() {
        return (dd.h) this.R.getValue();
    }

    public final s D3() {
        return (s) this.S.getValue();
    }

    public final MRLogger E3() {
        return (MRLogger) this.T.getValue();
    }

    public final dd.f F3() {
        return (dd.f) this.Q.getValue();
    }

    public final v0 G3() {
        return (v0) this.U.getValue();
    }

    @SuppressLint({"SimpleDateFormat"})
    public final void H3() {
        F3().a().i(this, new androidx.lifecycle.f0() { // from class: dd.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MonthlyRankingActivity.I3(MonthlyRankingActivity.this, (ed.a) obj);
            }
        });
        F3().c().i(this, new androidx.lifecycle.f0() { // from class: dd.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MonthlyRankingActivity.J3(MonthlyRankingActivity.this, (ha.a) obj);
            }
        });
    }

    public final void K3(e8 e8Var) {
        Toolbar toolbar = e8Var.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: dd.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MonthlyRankingActivity.L3(MonthlyRankingActivity.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        toolbar.setBackgroundResource(nc.h.f41869c);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView != null) {
            p.g(textView, "findViewById<TextView>(R.id.toolbar_title)");
            textView.setVisibility(0);
            textView.setText(getString(nc.i.text_monthly_ranking_title));
        }
    }

    public final void M3() {
        o oVar = this.O;
        o oVar2 = null;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        oVar.f46480b0.setAdapter(C3());
        o oVar3 = this.O;
        if (oVar3 == null) {
            p.v("binding");
        } else {
            oVar2 = oVar3;
        }
        oVar2.f46480b0.setLayoutManager(new LinearLayoutManager(this));
    }

    public final void N3(ed.a aVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        o oVar = this.O;
        o oVar2 = null;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        cVar.g(oVar.f46483e0);
        o oVar3 = this.O;
        if (oVar3 == null) {
            p.v("binding");
            oVar3 = null;
        }
        int id2 = oVar3.E.getId();
        o oVar4 = this.O;
        if (oVar4 == null) {
            p.v("binding");
            oVar4 = null;
        }
        int id3 = oVar4.f46482d0.getId();
        switch (b.f24695a[aVar.h().ordinal()]) {
            case 1:
                o oVar5 = this.O;
                if (oVar5 == null) {
                    p.v("binding");
                    oVar5 = null;
                }
                View view = oVar5.H;
                p.g(view, "binding.diamondBorderLine");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                i10 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2;
                break;
            case 2:
                o oVar6 = this.O;
                if (oVar6 == null) {
                    p.v("binding");
                    oVar6 = null;
                }
                View view2 = oVar6.H;
                p.g(view2, "binding.diamondBorderLine");
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i11 = marginLayoutParams2 == null ? 0 : marginLayoutParams2.topMargin;
                o oVar7 = this.O;
                if (oVar7 == null) {
                    p.v("binding");
                    oVar7 = null;
                }
                View view3 = oVar7.X;
                p.g(view3, "binding.platinumBorderLine");
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i14 = marginLayoutParams3 == null ? 0 : marginLayoutParams3.topMargin;
                o oVar8 = this.O;
                if (oVar8 == null) {
                    p.v("binding");
                    oVar8 = null;
                }
                View view4 = oVar8.H;
                p.g(view4, "binding.diamondBorderLine");
                ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i12 = (i14 - (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0)) / 2;
                i13 = i11 + i12;
                i10 = i13;
                break;
            case 3:
                o oVar9 = this.O;
                if (oVar9 == null) {
                    p.v("binding");
                    oVar9 = null;
                }
                View view5 = oVar9.X;
                p.g(view5, "binding.platinumBorderLine");
                ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                i11 = marginLayoutParams5 == null ? 0 : marginLayoutParams5.topMargin;
                o oVar10 = this.O;
                if (oVar10 == null) {
                    p.v("binding");
                    oVar10 = null;
                }
                View view6 = oVar10.K;
                p.g(view6, "binding.emeraldBorderLine");
                ViewGroup.LayoutParams layoutParams6 = view6.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                int i15 = marginLayoutParams6 == null ? 0 : marginLayoutParams6.topMargin;
                o oVar11 = this.O;
                if (oVar11 == null) {
                    p.v("binding");
                    oVar11 = null;
                }
                View view7 = oVar11.X;
                p.g(view7, "binding.platinumBorderLine");
                ViewGroup.LayoutParams layoutParams7 = view7.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                i12 = (i15 - (marginLayoutParams7 != null ? marginLayoutParams7.topMargin : 0)) / 2;
                i13 = i11 + i12;
                i10 = i13;
                break;
            case 4:
                o oVar12 = this.O;
                if (oVar12 == null) {
                    p.v("binding");
                    oVar12 = null;
                }
                View view8 = oVar12.K;
                p.g(view8, "binding.emeraldBorderLine");
                ViewGroup.LayoutParams layoutParams8 = view8.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                i11 = marginLayoutParams8 == null ? 0 : marginLayoutParams8.topMargin;
                o oVar13 = this.O;
                if (oVar13 == null) {
                    p.v("binding");
                    oVar13 = null;
                }
                View view9 = oVar13.P;
                p.g(view9, "binding.goldBorderLine");
                ViewGroup.LayoutParams layoutParams9 = view9.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
                int i16 = marginLayoutParams9 == null ? 0 : marginLayoutParams9.topMargin;
                o oVar14 = this.O;
                if (oVar14 == null) {
                    p.v("binding");
                    oVar14 = null;
                }
                View view10 = oVar14.K;
                p.g(view10, "binding.emeraldBorderLine");
                ViewGroup.LayoutParams layoutParams10 = view10.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
                i12 = (i16 - (marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0)) / 2;
                i13 = i11 + i12;
                i10 = i13;
                break;
            case 5:
                o oVar15 = this.O;
                if (oVar15 == null) {
                    p.v("binding");
                    oVar15 = null;
                }
                View view11 = oVar15.P;
                p.g(view11, "binding.goldBorderLine");
                ViewGroup.LayoutParams layoutParams11 = view11.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                i11 = marginLayoutParams11 == null ? 0 : marginLayoutParams11.topMargin;
                o oVar16 = this.O;
                if (oVar16 == null) {
                    p.v("binding");
                    oVar16 = null;
                }
                View view12 = oVar16.f46486h0;
                p.g(view12, "binding.silverBorderLine");
                ViewGroup.LayoutParams layoutParams12 = view12.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                int i17 = marginLayoutParams12 == null ? 0 : marginLayoutParams12.topMargin;
                o oVar17 = this.O;
                if (oVar17 == null) {
                    p.v("binding");
                    oVar17 = null;
                }
                View view13 = oVar17.P;
                p.g(view13, "binding.goldBorderLine");
                ViewGroup.LayoutParams layoutParams13 = view13.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams13 : null;
                i12 = (i17 - (marginLayoutParams13 != null ? marginLayoutParams13.topMargin : 0)) / 2;
                i13 = i11 + i12;
                i10 = i13;
                break;
            case 6:
                o oVar18 = this.O;
                if (oVar18 == null) {
                    p.v("binding");
                    oVar18 = null;
                }
                View view14 = oVar18.f46486h0;
                p.g(view14, "binding.silverBorderLine");
                ViewGroup.LayoutParams layoutParams14 = view14.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams14 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams14 : null;
                int i18 = marginLayoutParams14 == null ? 0 : marginLayoutParams14.topMargin;
                o oVar19 = this.O;
                if (oVar19 == null) {
                    p.v("binding");
                    oVar19 = null;
                }
                int i19 = oVar19.f46482d0.getLayoutParams().height;
                o oVar20 = this.O;
                if (oVar20 == null) {
                    p.v("binding");
                    oVar20 = null;
                }
                View view15 = oVar20.f46486h0;
                p.g(view15, "binding.silverBorderLine");
                ViewGroup.LayoutParams layoutParams15 = view15.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams15 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams15 : null;
                i13 = i18 + ((i19 - (marginLayoutParams15 != null ? marginLayoutParams15.topMargin : 0)) / 2);
                i10 = i13;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        cVar.j(id2, 3, id3, 3, i10);
        o oVar21 = this.O;
        if (oVar21 == null) {
            p.v("binding");
        } else {
            oVar2 = oVar21;
        }
        cVar.c(oVar2.f46483e0);
    }

    @SuppressLint({"SetTextI18n"})
    public final void O3(ed.a aVar) {
        o oVar = this.O;
        o oVar2 = null;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        oVar.I.setText(aVar.d());
        o oVar3 = this.O;
        if (oVar3 == null) {
            p.v("binding");
            oVar3 = null;
        }
        oVar3.Y.setText(aVar.k());
        o oVar4 = this.O;
        if (oVar4 == null) {
            p.v("binding");
            oVar4 = null;
        }
        oVar4.L.setText(aVar.e());
        o oVar5 = this.O;
        if (oVar5 == null) {
            p.v("binding");
            oVar5 = null;
        }
        oVar5.Q.setText(aVar.g());
        o oVar6 = this.O;
        if (oVar6 == null) {
            p.v("binding");
            oVar6 = null;
        }
        oVar6.f46487i0.setText(aVar.r());
        o oVar7 = this.O;
        if (oVar7 == null) {
            p.v("binding");
            oVar7 = null;
        }
        oVar7.F.setText(aVar.n());
        o oVar8 = this.O;
        if (oVar8 == null) {
            p.v("binding");
            oVar8 = null;
        }
        oVar8.f46484f0.setVisibility(aVar.s() ? 8 : 0);
        o oVar9 = this.O;
        if (oVar9 == null) {
            p.v("binding");
            oVar9 = null;
        }
        oVar9.F.setVisibility(aVar.s() ? 8 : 0);
        o oVar10 = this.O;
        if (oVar10 == null) {
            p.v("binding");
            oVar10 = null;
        }
        oVar10.G.setVisibility(aVar.s() ? 8 : 0);
        o oVar11 = this.O;
        if (oVar11 == null) {
            p.v("binding");
            oVar11 = null;
        }
        oVar11.S.setVisibility(aVar.s() ? 0 : 8);
        o oVar12 = this.O;
        if (oVar12 == null) {
            p.v("binding");
        } else {
            oVar2 = oVar12;
        }
        oVar2.T.setVisibility(aVar.s() ? 0 : 8);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_monthly_ranking);
        p.g(g10, "setContentView(this, R.l…activity_monthly_ranking)");
        o oVar = (o) g10;
        this.O = oVar;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        e8 e8Var = oVar.f46490l0;
        p.g(e8Var, "binding.toolbar");
        K3(e8Var);
        M3();
        H3();
        B3().c("");
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        D3().h();
        super.onResume();
    }
}
