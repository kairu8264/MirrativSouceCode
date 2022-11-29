package com.dena.mirrativ.emomo.run;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.w;
import be.g2;
import be.i2;
import be.l1;
import com.dena.mirrativ.emomo.run.EmomoRunActivity;
import com.dena.mirrativ.emomo.run.EmomoRunRankingActivity;
import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserDetail;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserList;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingAttributedText;
import com.dena.mirrorman.feature.event.LandingPageDescriptionListView;
import com.dena.mirrorman.feature.event.LandingPageRankingView;
import com.dena.mirrorman.feature.event.LandingPageTitleView;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import jo.i0;
import kq.a;
import nd.i1;
import tb.c;
import ud.b0;
import ud.d0;
import ud.n1;
import ud.o1;
import ud.p1;
import ud.q1;
import ud.r1;
import ud.s1;
import ud.t1;
import ud.x0;
import uo.q0;
import uo.r0;
import wn.v;
import xn.a0;
import xn.s;
import xn.t;
import yd.g1;

/* loaded from: classes.dex */
public final class EmomoRunRankingActivity extends e.b implements q0, g2 {

    /* renamed from: c0  reason: collision with root package name */
    public static final a f21175c0 = new a(null);

    /* renamed from: d0  reason: collision with root package name */
    public static final int f21176d0 = 8;

    /* renamed from: e0  reason: collision with root package name */
    public static final List<String> f21177e0 = s.m(Referer.LIVE_VIEW, Referer.CLOSET);
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = new s0(f0.b(ba.a.class), new m(this), new l(new k(this), null, null, gq.a.a(this)));
    public final wn.f Q = new s0(f0.b(w.class), new p(this), new o(new n(this), null, null, gq.a.a(this)));
    public final wn.f R = wn.g.a(new b());
    public final b0 S = new b0();
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21178a0;

    /* renamed from: b0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21179b0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, int i10, String str) {
            jo.p.h(context, "context");
            jo.p.h(str, "referer");
            Intent intent = new Intent(context, EmomoRunRankingActivity.class);
            intent.putExtra("EXTRA_GIFT_EVENT_ID", i10);
            intent.putExtra("EXTRA_PREV_REFERER", str);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<s9.e> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final s9.e invoke() {
            return (s9.e) androidx.databinding.f.g(EmomoRunRankingActivity.this, q9.h.activity_emomo_run_ranking);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Integer> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(EmomoRunRankingActivity.this.getIntent().getIntExtra("EXTRA_GIFT_EVENT_ID", 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = EmomoRunRankingActivity.this.getIntent().getStringExtra("EXTRA_PREV_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<Integer, v> {
        public e() {
            super(1);
        }

        public final void a(int i10) {
            EmomoRunEventResponse f10 = EmomoRunRankingActivity.this.Q3().j().f();
            if (f10 != null) {
                EmomoRunRankingActivity.this.d4(f10.getScoreReward(), i10, f10.getAchievedImageUrl());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Integer, v> {
        public f() {
            super(1);
        }

        public final void a(int i10) {
            EmomoRunEventResponse f10 = EmomoRunRankingActivity.this.Q3().j().f();
            if (f10 != null) {
                EmomoRunRankingActivity.this.d4(f10.getRankReward(), i10, f10.getAchievedImageUrl());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<View, v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (!jo.p.c(EmomoRunRankingActivity.this.T3(), Referer.CLOSET)) {
                if (!EmomoRunRankingActivity.this.U3().a().c()) {
                    of.n nVar = of.n.f45411a;
                    EmomoRunRankingActivity emomoRunRankingActivity = EmomoRunRankingActivity.this;
                    nVar.B(emomoRunRankingActivity, emomoRunRankingActivity.getString(q9.i.text_emomo_run_force_stop), false);
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                EmomoRunEventResponse f10 = EmomoRunRankingActivity.this.Q3().j().f();
                if (currentTimeMillis >= (f10 != null ? f10.getStartsAt() : 0)) {
                    EmomoRunEventResponse f11 = EmomoRunRankingActivity.this.Q3().j().f();
                    if ((f11 != null ? f11.getEndsAt() : 0) >= currentTimeMillis) {
                        androidx.activity.result.c cVar = EmomoRunRankingActivity.this.f21179b0;
                        EmomoRunActivity.a aVar = EmomoRunActivity.f21055e0;
                        EmomoRunRankingActivity emomoRunRankingActivity2 = EmomoRunRankingActivity.this;
                        cVar.a(aVar.a(emomoRunRankingActivity2, emomoRunRankingActivity2.R3()));
                        return;
                    }
                }
                of.n nVar2 = of.n.f45411a;
                EmomoRunRankingActivity emomoRunRankingActivity3 = EmomoRunRankingActivity.this;
                nVar2.B(emomoRunRankingActivity3, emomoRunRankingActivity3.getString(q9.i.text_emomo_run_event_is_closed), false);
                return;
            }
            of.n nVar3 = of.n.f45411a;
            EmomoRunRankingActivity emomoRunRankingActivity4 = EmomoRunRankingActivity.this;
            nVar3.B(emomoRunRankingActivity4, emomoRunRankingActivity4.getString(q9.i.text_disabled_notice_while_in_closet), false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<View, v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EmomoRunRankingActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21187w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21188x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21189y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21187w = componentCallbacks;
            this.f21188x = aVar;
            this.f21189y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f21187w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f21188x, this.f21189y);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21190w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21191x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21192y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21190w = componentCallbacks;
            this.f21191x = aVar;
            this.f21192y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21190w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21191x, this.f21192y);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21193w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f21193w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21193w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21194w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21195x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21196y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21197z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21194w = aVar;
            this.f21195x = aVar2;
            this.f21196y = aVar3;
            this.f21197z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21194w;
            vq.a aVar2 = this.f21195x;
            io.a aVar3 = this.f21196y;
            xq.a aVar4 = this.f21197z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(ba.a.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21198w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f21198w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21198w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21199w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f21199w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21199w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21200w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21201x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21202y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21203z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21200w = aVar;
            this.f21201x = aVar2;
            this.f21202y = aVar3;
            this.f21203z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21200w;
            vq.a aVar2 = this.f21201x;
            io.a aVar3 = this.f21202y;
            xq.a aVar4 = this.f21203z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(w.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21204w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f21204w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21204w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<v> {
        public q() {
            super(0);
        }

        public final void a() {
            EmomoRunRankingActivity.this.P3().i(true);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ EmomoRunEventResponse f21206w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ EmomoRunRankingActivity f21207x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EmomoRunEventResponse emomoRunEventResponse, EmomoRunRankingActivity emomoRunRankingActivity) {
            super(0);
            this.f21206w = emomoRunEventResponse;
            this.f21207x = emomoRunRankingActivity;
        }

        public final void a() {
            l1.R0.a(this.f21206w.getRulePopupImageUrl()).z3(this.f21207x.a3(), "EmomoRunRankingRuleDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public EmomoRunRankingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T = wn.g.b(iVar, new i(this, null, null));
        this.U = wn.g.b(iVar, new j(this, null, null));
        this.V = wn.g.a(new c());
        this.W = wn.g.a(new d());
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: ba.k
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                EmomoRunRankingActivity.a4(EmomoRunRankingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…ult.data)\n        )\n    }");
        this.f21178a0 = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: ba.l
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                EmomoRunRankingActivity.N3(EmomoRunRankingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V22, "registerForActivityResul…FERER, giftEventId)\n    }");
        this.f21179b0 = V22;
    }

    public static final void N3(EmomoRunRankingActivity emomoRunRankingActivity, androidx.activity.result.a aVar) {
        jo.p.h(emomoRunRankingActivity, "this$0");
        emomoRunRankingActivity.P3().j(Referer.Event.EMOMO_RUN_RANKING, emomoRunRankingActivity.R3());
    }

    public static final void W3(EmomoRunRankingActivity emomoRunRankingActivity, EmomoRunEventResponse emomoRunEventResponse) {
        jo.p.h(emomoRunRankingActivity, "this$0");
        if (emomoRunEventResponse == null) {
            return;
        }
        b0 b0Var = emomoRunRankingActivity.S;
        Drawable L3 = emomoRunRankingActivity.L3(emomoRunEventResponse.getInfoBackground().getStartColorInt(), emomoRunEventResponse.getInfoBackground().getEndColorInt(), 0, 0.0f, 0.0f);
        i0 i0Var = i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHeaderColor()}, 1));
        jo.p.g(format, "format(format, *args)");
        int parseColor = Color.parseColor(format);
        String format2 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHeaderColor()}, 1));
        jo.p.g(format2, "format(format, *args)");
        Drawable L32 = emomoRunRankingActivity.L3(parseColor, Color.parseColor(format2), 0, 0.0f, 0.0f);
        int i10 = q9.d.G;
        int d10 = c3.a.d(emomoRunRankingActivity, i10);
        int d11 = c3.a.d(emomoRunRankingActivity, i10);
        String format3 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format3, "format(format, *args)");
        Drawable L33 = emomoRunRankingActivity.L3(d10, d11, Color.parseColor(format3), de.a.b(emomoRunRankingActivity, 6), de.a.b(emomoRunRankingActivity, 2));
        String format4 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format4, "format(format, *args)");
        int parseColor2 = Color.parseColor(format4);
        String format5 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format5, "format(format, *args)");
        int parseColor3 = Color.parseColor(format5);
        String format6 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format6, "format(format, *args)");
        b0Var.r(L3, L32, L33, emomoRunRankingActivity.L3(parseColor2, parseColor3, Color.parseColor(format6), de.a.b(emomoRunRankingActivity, 6), de.a.b(emomoRunRankingActivity, 2)));
        b0 b0Var2 = emomoRunRankingActivity.S;
        SpannableString M3 = emomoRunRankingActivity.M3(emomoRunEventResponse.getRankReward().getRank());
        int i11 = q9.i.text_emomo_run_high_score;
        String format7 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(emomoRunEventResponse.getRankReward().getHighScore())}, 1));
        jo.p.g(format7, "format(format, *args)");
        String string = emomoRunRankingActivity.getString(i11, new Object[]{format7});
        jo.p.g(string, "getString(R.string.text_…nt.rankReward.highScore))");
        b0Var2.a(emomoRunEventResponse, M3, string);
        emomoRunRankingActivity.h4(emomoRunEventResponse);
        emomoRunRankingActivity.g4(emomoRunEventResponse);
        emomoRunRankingActivity.f4(emomoRunEventResponse, false);
        emomoRunRankingActivity.P3().i(false);
        emomoRunRankingActivity.e4(emomoRunEventResponse);
    }

    public static final void X3(EmomoRunRankingActivity emomoRunRankingActivity, Boolean bool) {
        EmomoRunEventResponse f10;
        jo.p.h(emomoRunRankingActivity, "this$0");
        jo.p.g(bool, "isRankingExpanded");
        if (!bool.booleanValue() || (f10 = emomoRunRankingActivity.Q3().j().f()) == null) {
            return;
        }
        emomoRunRankingActivity.f4(f10, bool.booleanValue());
    }

    public static final void Y3(EmomoRunRankingActivity emomoRunRankingActivity, Boolean bool) {
        jo.p.h(emomoRunRankingActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (bool.booleanValue()) {
            emomoRunRankingActivity.finish();
        }
    }

    public static final void Z3(EmomoRunRankingActivity emomoRunRankingActivity, MRError mRError) {
        jo.p.h(emomoRunRankingActivity, "this$0");
        if (mRError == null) {
            return;
        }
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(emomoRunRankingActivity, mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(emomoRunRankingActivity, mRError.getMessage(), false);
            emomoRunRankingActivity.finish();
        } else if (mRError instanceof MRError.Network) {
            of.n.z(emomoRunRankingActivity);
        }
    }

    public static final void a4(EmomoRunRankingActivity emomoRunRankingActivity, androidx.activity.result.a aVar) {
        jo.p.h(emomoRunRankingActivity, "this$0");
        emomoRunRankingActivity.startActivity(emomoRunRankingActivity.S3().x(emomoRunRankingActivity, Referer.Event.EMOMO_RUN_RANKING, aVar.a()));
    }

    @Override // be.g2
    public void G(int i10) {
        EmomoRunUserDetail rankReward;
        EmomoRunEventResponse f10 = Q3().j().f();
        if (f10 == null || (rankReward = f10.getRankReward()) == null || rankReward.getUserId() == i10 || f21177e0.contains(T3())) {
            return;
        }
        startActivity(S3().s(this, String.valueOf(i10), Referer.Event.EMOMO_RUN_RANKING));
    }

    public final SpannableString K3(List<GiftRankingAttributedText> list, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        for (GiftRankingAttributedText giftRankingAttributedText : list) {
            spannableStringBuilder.append((CharSequence) giftRankingAttributedText.getValue());
            i0 i0Var = i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingAttributedText.getColor()}, 1));
            jo.p.g(format, "format(format, *args)");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(format)), i11, giftRankingAttributedText.getValue().length() + i11, 33);
            i11 += giftRankingAttributedText.getValue().length();
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i10), 0, i11, 33);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        jo.p.g(valueOf, "valueOf(spannableStringBuilder)");
        return valueOf;
    }

    public final Drawable L3(int i10, int i11, int i12, float f10, float f11) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, a0.A0(s.m(Integer.valueOf(i10), Integer.valueOf(i11))));
        gradientDrawable.setStroke((int) f11, i12);
        gradientDrawable.setCornerRadius(f10);
        return gradientDrawable;
    }

    public final SpannableString M3(int i10) {
        String string = i10 == 0 ? getString(q9.i.text_gift_ranking_out_of_ranking) : String.valueOf(i10);
        jo.p.g(string, "if (rank == 0) getString…ing) else rank.toString()");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(de.a.c(this, i10 == 0 ? 16 : 22)), 0, string.length(), 33);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        jo.p.g(valueOf, "valueOf(spannableStringBuilder)");
        return valueOf;
    }

    public final s9.e O3() {
        Object value = this.R.getValue();
        jo.p.g(value, "<get-binding>(...)");
        return (s9.e) value;
    }

    public final ba.a P3() {
        return (ba.a) this.P.getValue();
    }

    public final w Q3() {
        return (w) this.Q.getValue();
    }

    public final int R3() {
        return ((Number) this.V.getValue()).intValue();
    }

    public final tb.c S3() {
        return (tb.c) this.U.getValue();
    }

    public final String T3() {
        return (String) this.W.getValue();
    }

    public final i1 U3() {
        return (i1) this.T.getValue();
    }

    public final void V3() {
        Q3().j().i(this, new androidx.lifecycle.f0() { // from class: ba.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunRankingActivity.W3(EmomoRunRankingActivity.this, (EmomoRunEventResponse) obj);
            }
        });
        Q3().z().i(this, new androidx.lifecycle.f0() { // from class: ba.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunRankingActivity.X3(EmomoRunRankingActivity.this, (Boolean) obj);
            }
        });
        Q3().y().i(this, new androidx.lifecycle.f0() { // from class: ba.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunRankingActivity.Y3(EmomoRunRankingActivity.this, (Boolean) obj);
            }
        });
        Q3().r().i(this, new androidx.lifecycle.f0() { // from class: ba.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunRankingActivity.Z3(EmomoRunRankingActivity.this, (MRError) obj);
            }
        });
    }

    public final void b4() {
        RecyclerView recyclerView = O3().f52445i0;
        rd.p pVar = new rd.p();
        pVar.d(new e());
        recyclerView.setAdapter(pVar);
        RecyclerView recyclerView2 = O3().O;
        rd.p pVar2 = new rd.p();
        pVar2.d(new f());
        recyclerView2.setAdapter(pVar2);
        View view = O3().F;
        jo.p.g(view, "binding.eventFooterPlayView");
        g1.a(view, new g());
        ConstraintLayout constraintLayout = O3().B;
        jo.p.g(constraintLayout, "binding.closeButtonContainer");
        g1.a(constraintLayout, new h());
    }

    public final void c4() {
        O3().f52445i0.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.run.EmomoRunRankingActivity$setupLayout$1
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean v() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        O3().O.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.run.EmomoRunRankingActivity$setupLayout$2
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean v() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        O3().R.setClipToOutline(true);
    }

    public final void d4(EmomoRunUserDetail emomoRunUserDetail, int i10, String str) {
        if (a3().e0("LandingPageRewardListDialog") != null) {
            return;
        }
        i2.a aVar = i2.Q0;
        List<EmomoRunReward> rewards = emomoRunUserDetail.getRewards();
        ArrayList arrayList = new ArrayList(t.u(rewards, 10));
        for (EmomoRunReward emomoRunReward : rewards) {
            GiftItemEffect effect = emomoRunReward.getEffect();
            x0 b10 = effect != null ? x0.a.b(x0.I, this, effect, null, 4, null) : null;
            s1.a aVar2 = s1.O;
            String iconUrl = emomoRunReward.getIconUrl();
            String imageUrl = emomoRunReward.getImageUrl();
            String badgeUrl = emomoRunReward.getBadgeUrl();
            String str2 = emomoRunReward.getAchieved() ? str : "";
            String partTypeIconUrl = emomoRunReward.getPartTypeIconUrl();
            if (partTypeIconUrl == null) {
                partTypeIconUrl = "";
            }
            arrayList.add(aVar2.a(iconUrl, imageUrl, badgeUrl, str2, partTypeIconUrl, emomoRunReward.getName(), emomoRunReward.getRarity(), emomoRunReward.getCondition(), emomoRunReward.getDescription(), emomoRunReward.getDisabled(), b10));
        }
        aVar.a(arrayList, i10).z3(a3(), "LandingPageRewardListDialog");
    }

    public final void e4(EmomoRunEventResponse emomoRunEventResponse) {
        LandingPageDescriptionListView landingPageDescriptionListView = O3().C;
        o1 o1Var = new o1();
        List<Description> descriptions = emomoRunEventResponse.getDescriptions();
        ArrayList arrayList = new ArrayList(t.u(descriptions, 10));
        for (Description description : descriptions) {
            n1 n1Var = new n1(null, 1, null);
            String title = description.getTitle();
            String text = description.getText();
            i0 i0Var = i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getDescriptionColor()}, 1));
            jo.p.g(format, "format(format, *args)");
            n1Var.a(title, text, Color.parseColor(format));
            arrayList.add(n1Var);
        }
        o1Var.a(arrayList, true, L3(emomoRunEventResponse.getDescriptionBackground().getStartColorInt(), emomoRunEventResponse.getDescriptionBackground().getEndColorInt(), 0, 0.0f, 0.0f));
        landingPageDescriptionListView.w(o1Var);
    }

    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [ud.a$a, jo.h] */
    /* JADX WARN: Type inference failed for: r1v21 */
    public final void f4(EmomoRunEventResponse emomoRunEventResponse, boolean z10) {
        LandingPageRankingView landingPageRankingView = O3().I;
        p1 p1Var = new p1();
        List<EmomoRunUserList> rankings = emomoRunEventResponse.getRankings();
        int i10 = 1;
        int size = emomoRunEventResponse.getRankings().size();
        if (!z10) {
            size = Math.min(1, size);
        }
        List<EmomoRunUserList> subList = rankings.subList(0, size);
        int i11 = 10;
        ArrayList arrayList = new ArrayList(t.u(subList, 10));
        for (EmomoRunUserList emomoRunUserList : subList) {
            ?? r12 = 0;
            q1 q1Var = new q1(null, i10, null);
            List<EmomoRunUserDetail> users = emomoRunUserList.getUsers();
            ArrayList arrayList2 = new ArrayList(t.u(users, i11));
            Iterator it = users.iterator();
            while (it.hasNext()) {
                EmomoRunUserDetail emomoRunUserDetail = (EmomoRunUserDetail) it.next();
                r1 r1Var = new r1(r12, i10, r12);
                int rank = emomoRunUserDetail.getRank();
                int userId = emomoRunUserDetail.getUserId();
                String liveId = emomoRunUserDetail.getLiveId();
                String iconUrl = emomoRunUserDetail.getIconUrl();
                String badgeImageUrl = emomoRunUserDetail.getBadgeImageUrl();
                String labelImageUrl = emomoRunUserDetail.getLabelImageUrl();
                String name = emomoRunUserDetail.getName();
                Resources resources = getResources();
                int i12 = q9.i.text_emomo_run_reward_amount_with_space;
                Iterator it2 = it;
                Object[] objArr = new Object[i10];
                i0 i0Var = i0.f38149a;
                q1 q1Var2 = q1Var;
                Object[] objArr2 = new Object[i10];
                objArr2[0] = Integer.valueOf(emomoRunUserDetail.getHighScore());
                String format = String.format("%,d", Arrays.copyOf(objArr2, i10));
                jo.p.g(format, "format(format, *args)");
                objArr[0] = format;
                String string = resources.getString(i12, objArr);
                jo.p.g(string, "resources.getString(R.st…, rankingUser.highScore))");
                String format2 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingHighlightColor()}, 1));
                jo.p.g(format2, "format(format, *args)");
                r1Var.a(rank, userId, liveId, iconUrl, badgeImageUrl, labelImageUrl, name, string, Color.parseColor(format2), !f21177e0.contains(T3()), emomoRunUserDetail.getUserId() != ((EmomoRunUserDetail) a0.i0(emomoRunUserList.getUsers())).getUserId(), c3.a.f(this, q9.f.divider_left_margin42_white_five));
                arrayList2.add(r1Var);
                it = it2;
                q1Var = q1Var2;
                r12 = 0;
                i10 = 1;
            }
            q1 q1Var3 = q1Var;
            String title = emomoRunUserList.getTitle();
            i0 i0Var2 = i0.f38149a;
            String format3 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingHeaderColor()}, 1));
            jo.p.g(format3, "format(format, *args)");
            int parseColor = Color.parseColor(format3);
            String format4 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingHeaderColor()}, 1));
            jo.p.g(format4, "format(format, *args)");
            Drawable L3 = L3(parseColor, Color.parseColor(format4), 0, 0.0f, 0.0f);
            String format5 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingHeaderTitleColor()}, 1));
            jo.p.g(format5, "format(format, *args)");
            q1.b(q1Var3, false, arrayList2, title, L3, Color.parseColor(format5), false, 32, null);
            arrayList.add(q1Var3);
            i10 = 1;
            i11 = 10;
        }
        String rankingLink = emomoRunEventResponse.getRankingLink();
        String string2 = getString(q9.i.text_event_ranking_title_whole_ranking);
        jo.p.g(string2, "getString(R.string.text_…king_title_whole_ranking)");
        boolean z11 = emomoRunEventResponse.getRankings().size() > 1 && !z10;
        i0 i0Var3 = i0.f38149a;
        String format6 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingColor()}, 1));
        jo.p.g(format6, "format(format, *args)");
        int parseColor2 = Color.parseColor(format6);
        String format7 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingHighlightColor()}, 1));
        jo.p.g(format7, "format(format, *args)");
        int parseColor3 = Color.parseColor(format7);
        String format8 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingButton().getTextColor()}, 1));
        jo.p.g(format8, "format(format, *args)");
        int parseColor4 = Color.parseColor(format8);
        String format9 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getBeforeOpenColor()}, 1));
        jo.p.g(format9, "format(format, *args)");
        int parseColor5 = Color.parseColor(format9);
        Drawable L32 = L3(emomoRunEventResponse.getRankingBackground().getStartColorInt(), emomoRunEventResponse.getRankingBackground().getEndColorInt(), 0, 0.0f, 0.0f);
        String format10 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingButton().getBackgroundColor()}, 1));
        jo.p.g(format10, "format(format, *args)");
        int parseColor6 = Color.parseColor(format10);
        String format11 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingButton().getBackgroundColor()}, 1));
        jo.p.g(format11, "format(format, *args)");
        int parseColor7 = Color.parseColor(format11);
        String format12 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingButton().getFrameColor()}, 1));
        jo.p.g(format12, "format(format, *args)");
        p1Var.a(arrayList, rankingLink, string2, z11, parseColor2, parseColor3, parseColor4, parseColor5, L32, L3(parseColor6, parseColor7, Color.parseColor(format12), de.a.b(this, 20), de.a.b(this, 1)));
        landingPageRankingView.w(p1Var, new q(), this);
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [ud.a$a, jo.h] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8, types: [ud.a$a, jo.h] */
    public final void g4(EmomoRunEventResponse emomoRunEventResponse) {
        int i10;
        String str;
        String str2;
        rd.p pVar;
        EmomoRunRankingActivity emomoRunRankingActivity = this;
        EmomoRunEventResponse f10 = Q3().j().f();
        String str3 = (f10 == null || (r0 = f10.getAchievedImageUrl()) == null) ? "" : "";
        int i11 = emomoRunRankingActivity.Z;
        EmomoRunReward emomoRunReward = (EmomoRunReward) a0.Z(emomoRunEventResponse.getScoreReward().getRewards());
        int i12 = 0;
        int b10 = i11 + ((emomoRunReward != null ? emomoRunReward.getRarity() : 0) > 0 ? de.a.b(emomoRunRankingActivity, 16) : 0);
        RecyclerView.h adapter = O3().f52445i0.getAdapter();
        ?? r12 = 0;
        rd.p pVar2 = adapter instanceof rd.p ? (rd.p) adapter : null;
        String str4 = "format(format, *args)";
        String str5 = "#%s";
        int i13 = 10;
        int i14 = 1;
        if (pVar2 == null) {
            i10 = 10;
            str = "#%s";
            str2 = "format(format, *args)";
            pVar = null;
        } else {
            List<EmomoRunReward> rewards = emomoRunEventResponse.getScoreReward().getRewards();
            ArrayList arrayList = new ArrayList(t.u(rewards, 10));
            for (EmomoRunReward emomoRunReward2 : rewards) {
                d0 d0Var = new d0(r12, i14, r12);
                int i15 = emomoRunRankingActivity.Y;
                int d10 = c3.a.d(emomoRunRankingActivity, emomoRunReward2.getAchieved() ? q9.d.G : q9.d.D);
                int d11 = c3.a.d(emomoRunRankingActivity, emomoRunReward2.getAchieved() ? q9.d.G : q9.d.D);
                i0 i0Var = i0.f38149a;
                Object[] objArr = new Object[i14];
                objArr[i12] = emomoRunEventResponse.getInfoHeaderColor();
                String format = String.format(str5, Arrays.copyOf(objArr, i14));
                jo.p.g(format, str4);
                ArrayList arrayList2 = arrayList;
                d0Var.a(emomoRunReward2, str3, i15, b10, L3(d10, d11, Color.parseColor(format), (float) ((emomoRunRankingActivity.Y * 0.81d) / 2.0d), de.a.b(emomoRunRankingActivity, emomoRunReward2.getAchieved() ? 2 : i12)));
                arrayList2.add(d0Var);
                i13 = 10;
                str4 = str4;
                str5 = str5;
                r12 = r12;
                pVar2 = pVar2;
                i14 = 1;
                i12 = 0;
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            i10 = i13;
            str = str5;
            str2 = str4;
            pVar = r12;
            pVar2.f(arrayList3);
        }
        O3().f52445i0.getLayoutParams().height = ((int) Math.ceil(emomoRunEventResponse.getScoreReward().getRewards().size() / 4.0d)) * b10;
        O3().f52445i0.requestLayout();
        int i16 = emomoRunRankingActivity.Z;
        EmomoRunReward emomoRunReward3 = (EmomoRunReward) a0.Z(emomoRunEventResponse.getRankReward().getRewards());
        int b11 = i16 + ((emomoRunReward3 != null ? emomoRunReward3.getRarity() : 0) > 0 ? de.a.b(emomoRunRankingActivity, 16) : 0);
        RecyclerView.h adapter2 = O3().O.getAdapter();
        rd.p pVar3 = adapter2 instanceof rd.p ? (rd.p) adapter2 : pVar;
        if (pVar3 != null) {
            List<EmomoRunReward> rewards2 = emomoRunEventResponse.getRankReward().getRewards();
            ArrayList arrayList4 = new ArrayList(t.u(rewards2, i10));
            ?? r52 = pVar;
            for (EmomoRunReward emomoRunReward4 : rewards2) {
                d0 d0Var2 = new d0(r52, 1, r52);
                int i17 = emomoRunRankingActivity.Y;
                int d12 = c3.a.d(emomoRunRankingActivity, emomoRunReward4.getAchieved() ? q9.d.G : q9.d.D);
                int d13 = c3.a.d(emomoRunRankingActivity, emomoRunReward4.getAchieved() ? q9.d.G : q9.d.D);
                i0 i0Var2 = i0.f38149a;
                String format2 = String.format(str, Arrays.copyOf(new Object[]{emomoRunEventResponse.getInfoHeaderColor()}, 1));
                jo.p.g(format2, str2);
                float f11 = (float) ((emomoRunRankingActivity.Y * 0.81d) / 2.0d);
                emomoRunRankingActivity = this;
                Drawable L3 = L3(d12, d13, Color.parseColor(format2), f11, de.a.b(emomoRunRankingActivity, emomoRunReward4.getAchieved() ? 2 : 0));
                ArrayList arrayList5 = arrayList4;
                d0Var2.a(emomoRunReward4, str3, i17, b11, L3);
                arrayList5.add(d0Var2);
                arrayList4 = arrayList5;
                str2 = str2;
                str = str;
                r52 = 0;
            }
            pVar3.f(arrayList4);
        }
        O3().O.getLayoutParams().height = b11 * ((int) Math.ceil(emomoRunEventResponse.getRankReward().getRewards().size() / 4.0d));
        O3().O.requestLayout();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h4(EmomoRunEventResponse emomoRunEventResponse) {
        LandingPageTitleView landingPageTitleView = O3().J;
        t1 t1Var = new t1();
        SpannableString K3 = K3(emomoRunEventResponse.getTitle(), de.a.c(this, 17));
        SpannableString K32 = K3(emomoRunEventResponse.getSubtitle(), de.a.c(this, 12));
        String ruleLink = emomoRunEventResponse.getRuleLink();
        i0 i0Var = i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRuleButton().getTextColor()}, 1));
        jo.p.g(format, "format(format, *args)");
        int parseColor = Color.parseColor(format);
        Drawable L3 = L3(emomoRunEventResponse.getTitleBackground().getStartColorInt(), emomoRunEventResponse.getTitleBackground().getEndColorInt(), 0, 0.0f, 0.0f);
        String format2 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRuleButton().getBackgroundColor()}, 1));
        jo.p.g(format2, "format(format, *args)");
        int parseColor2 = Color.parseColor(format2);
        String format3 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRuleButton().getBackgroundColor()}, 1));
        jo.p.g(format3, "format(format, *args)");
        int parseColor3 = Color.parseColor(format3);
        String format4 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRuleButton().getFrameColor()}, 1));
        jo.p.g(format4, "format(format, *args)");
        t1Var.a(K3, K32, ruleLink, parseColor, L3, L3(parseColor2, parseColor3, Color.parseColor(format4), de.a.b(this, 20), de.a.b(this, 1)));
        landingPageTitleView.w(t1Var, new r(emomoRunEventResponse, this));
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(16908290).setSystemUiVisibility(1280);
        O3().M(this);
        O3().T(this.S);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = getSystemService("window");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        this.X = i10;
        int b10 = (i10 - de.a.b(this, 52)) / 4;
        this.Y = b10;
        this.Z = b10 + de.a.b(this, 14);
        c4();
        b4();
        V3();
        P3().j(Referer.Event.EMOMO_RUN_RANKING, R3());
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r0.d(this, null, 1, null);
    }

    @Override // be.g2
    public void u1(String str) {
        jo.p.h(str, "liveId");
        if (f21177e0.contains(T3())) {
            return;
        }
        Intent f10 = c.a.f(S3(), this, str, Referer.Event.EMOMO_RUN_RANKING, null, null, false, false, false, false, null, 960, null);
        f10.addFlags(67108864);
        this.f21178a0.a(f10);
    }
}
