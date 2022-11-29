package com.dena.mirrativ.emomo.giftranking;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.i2;
import be.p5;
import com.dena.mirrativ.emomo.giftranking.GiftRankingActivity;
import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingAttributedText;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingBroadcasterRank;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingButtonStyle;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingDate;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingDateType;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventDetailResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingReward;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingUserDetail;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.feature.event.LandingPageDescriptionListView;
import com.dena.mirrorman.feature.event.LandingPageTitleView;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.b0;
import jo.i0;
import kq.a;
import nf.j0;
import tb.c;
import ud.n1;
import ud.o1;
import ud.s1;
import ud.t1;
import uo.q0;
import uo.r0;
import yd.g1;
import z9.c0;

/* loaded from: classes.dex */
public final class GiftRankingActivity extends e.b implements q0 {

    /* renamed from: j0  reason: collision with root package name */
    public static final a f20989j0 = new a(null);

    /* renamed from: k0  reason: collision with root package name */
    public static final int f20990k0 = 8;

    /* renamed from: l0  reason: collision with root package name */
    public static final List<String> f20991l0 = xn.s.m(Referer.LIVE_VIEW, Referer.CLOSET);
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = new s0(jo.f0.b(z9.a.class), new d0(this), new c0(new b0(this), null, null, gq.a.a(this)));
    public final wn.f Q = new s0(jo.f0.b(z9.w.class), new g0(this), new f0(new e0(this), null, null, gq.a.a(this)));
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final z9.l W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final f f20992a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f20993b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f20994c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f20995d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f20996e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f20997f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f20998g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f20999h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21000i0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, int i10, Integer num, String str) {
            jo.p.h(context, "context");
            jo.p.h(str, "referer");
            Intent intent = new Intent(context, GiftRankingActivity.class);
            intent.putExtra("EXTRA_GIFT_EVENT_ID", i10);
            intent.putExtra("EXTRA_BROADCASTER_ID", num);
            intent.putExtra("EXTRA_PREV_REFERER", str);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21001w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21002x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21003y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21001w = componentCallbacks;
            this.f21002x = aVar;
            this.f21003y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21001w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f21002x, this.f21003y);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f21005x;

        public b(boolean z10) {
            this.f21005x = z10;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            float width = GiftRankingActivity.this.Z3().f52475k0.getWidth() + de.a.b(GiftRankingActivity.this, 8);
            boolean z10 = this.f21005x;
            float f10 = z10 ? 0.0f : width;
            if (!z10) {
                width = 0.0f;
            }
            if (width == GiftRankingActivity.this.Z3().f52475k0.getTranslationX()) {
                return;
            }
            GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
            uo.l.d(giftRankingActivity, null, null, new c(f10, width, null), 3, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21006w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentActivity componentActivity) {
            super(0);
            this.f21006w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21006w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.giftranking.GiftRankingActivity$animateRewardTypeInnerView$1$1", f = "GiftRankingActivity.kt", l = {547}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21007w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f21009y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f21010z;

        /* loaded from: classes.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftRankingActivity f21011a;

            public a(GiftRankingActivity giftRankingActivity) {
                this.f21011a = giftRankingActivity;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = this.f21011a.Z3().f52475k0;
                Object animatedValue = valueAnimator.getAnimatedValue();
                jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setTranslationX(((Float) animatedValue).floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10, float f11, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f21009y = f10;
            this.f21010z = f11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f21009y, this.f21010z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21007w;
            if (i10 == 0) {
                wn.m.b(obj);
                GiftRankingActivity.this.f20996e0 = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21009y, this.f21010z);
                GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new a(giftRankingActivity));
                jo.p.g(ofFloat, "ofFloat(start, end).appl…      }\n                }");
                this.f21007w = 1;
                if (de.b.a(ofFloat, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            GiftRankingActivity.this.f20996e0 = false;
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21012w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21013x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21014y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21015z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21012w = aVar;
            this.f21013x = aVar2;
            this.f21014y = aVar3;
            this.f21015z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21012w;
            vq.a aVar2 = this.f21013x;
            io.a aVar3 = this.f21014y;
            xq.a aVar4 = this.f21015z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(z9.a.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<s9.g> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final s9.g invoke() {
            return (s9.g) androidx.databinding.f.g(GiftRankingActivity.this, q9.h.activity_gift_ranking);
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21017w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentActivity componentActivity) {
            super(0);
            this.f21017w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21017w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<Integer> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(GiftRankingActivity.this.getIntent().getIntExtra("EXTRA_BROADCASTER_ID", 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21019w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentActivity componentActivity) {
            super(0);
            this.f21019w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21019w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends ViewOutlineProvider {
        public f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.a.b(GiftRankingActivity.this, 12));
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21021w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21022x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21023y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21024z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21021w = aVar;
            this.f21022x = aVar2;
            this.f21023y = aVar3;
            this.f21024z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21021w;
            vq.a aVar2 = this.f21022x;
            io.a aVar3 = this.f21023y;
            xq.a aVar4 = this.f21024z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(z9.w.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<Integer> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(GiftRankingActivity.this.getIntent().getIntExtra("EXTRA_GIFT_EVENT_ID", 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21026w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentActivity componentActivity) {
            super(0);
            this.f21026w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21026w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f21027a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f21028b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f21029c;

        public h(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f21027a = c0Var;
            this.f21028b = liveData;
            this.f21029c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f21027a.f();
            Object f11 = this.f21028b.f();
            Object f12 = this.f21029c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            wn.k kVar = (wn.k) f10;
            this.f21027a.p(wn.q.a(Boolean.valueOf(((Boolean) f11).booleanValue()), Boolean.valueOf(((Boolean) f12).booleanValue())));
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftRankingEventResponse f21030w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftRankingActivity f21031x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(GiftRankingEventResponse giftRankingEventResponse, GiftRankingActivity giftRankingActivity) {
            super(0);
            this.f21030w = giftRankingEventResponse;
            this.f21031x = giftRankingActivity;
        }

        public final void a() {
            String ruleUrl = this.f21030w.getRuleUrl();
            if (ruleUrl != null) {
                p5.U0.a(ruleUrl).z3(this.f21031x.a3(), "WebViewDialogFragment");
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftRankingEventDetailResponse f21032w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(GiftRankingEventDetailResponse giftRankingEventDetailResponse) {
            super(2);
            this.f21032w = giftRankingEventDetailResponse;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            GiftRankingBroadcasterRank broadcaster = this.f21032w.getBroadcaster();
            if (broadcaster == null) {
                return;
            }
            z9.r.a(null, z9.o.f62863k.a(broadcaster), iVar, 0, 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<String> {
        public j() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = GiftRankingActivity.this.getIntent().getStringExtra("EXTRA_PREV_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<Integer, wn.v> {
        public k() {
            super(1);
        }

        public final void a(int i10) {
            List<GiftRankingDate> dates;
            GiftRankingDate giftRankingDate;
            GiftRankingEventResponse f10 = GiftRankingActivity.this.d4().g().f();
            if (f10 == null || (dates = f10.getDates()) == null || (giftRankingDate = dates.get(i10)) == null) {
                return;
            }
            GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
            giftRankingActivity.c4().m(giftRankingDate.getKey());
            z9.a.k(giftRankingActivity.c4(), giftRankingActivity.b4(), giftRankingDate.getKey(), giftRankingActivity.a4(), false, 8, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<Integer, wn.v> {
        public l() {
            super(1);
        }

        public final void a(int i10) {
            GiftRankingUserDetail rankReward;
            GiftRankingEventDetailResponse f10 = GiftRankingActivity.this.d4().h().f();
            if (f10 == null || (rankReward = f10.getRankReward()) == null) {
                return;
            }
            GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
            if (rankReward.getUserId() == i10 || GiftRankingActivity.f20991l0.contains(giftRankingActivity.f4())) {
                return;
            }
            giftRankingActivity.startActivity(giftRankingActivity.e4().s(giftRankingActivity, String.valueOf(i10), Referer.Event.GIFT_RANKING));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.l<String, wn.v> {
        public m() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "liveId");
            if (GiftRankingActivity.f20991l0.contains(GiftRankingActivity.this.f4())) {
                return;
            }
            Intent f10 = c.a.f(GiftRankingActivity.this.e4(), GiftRankingActivity.this, str, Referer.Event.GIFT_RANKING, null, null, false, false, false, false, null, 960, null);
            GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
            f10.addFlags(67108864);
            giftRankingActivity.f21000i0.a(f10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<wn.v> {
        public n() {
            super(0);
        }

        public final void a() {
            GiftRankingActivity.this.c4().h(true);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.l<Integer, wn.v> {
        public o() {
            super(1);
        }

        public final void a(int i10) {
            GiftRankingUserDetail receivedGiftReward;
            GiftRankingEventDetailResponse f10 = GiftRankingActivity.this.d4().h().f();
            if (f10 != null) {
                GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
                Boolean f11 = giftRankingActivity.d4().l().f();
                if (f11 == null) {
                    f11 = Boolean.FALSE;
                }
                jo.p.g(f11, "giftRankingStore.isPointReward.value ?: false");
                boolean booleanValue = f11.booleanValue();
                Boolean f12 = giftRankingActivity.d4().n().f();
                if (f12 == null) {
                    f12 = Boolean.FALSE;
                }
                jo.p.g(f12, "giftRankingStore.isRewar…ntTypeSent.value ?: false");
                boolean booleanValue2 = f12.booleanValue();
                if (!booleanValue) {
                    receivedGiftReward = f10.getRankReward();
                } else if (booleanValue2) {
                    receivedGiftReward = f10.getSentGiftReward();
                } else {
                    receivedGiftReward = f10.getReceivedGiftReward();
                }
                GiftRankingEventResponse f13 = giftRankingActivity.d4().g().f();
                giftRankingActivity.y4(receivedGiftReward, i10, (f13 == null || (r2 = f13.getAchievedImageUrl()) == null) ? "" : "");
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.l<Integer, wn.v> {
        public p() {
            super(1);
        }

        public final void a(int i10) {
            GiftRankingEventDetailResponse f10 = GiftRankingActivity.this.d4().h().f();
            if (f10 != null) {
                GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
                Boolean f11 = giftRankingActivity.d4().l().f();
                if (f11 == null) {
                    f11 = Boolean.FALSE;
                }
                jo.p.g(f11, "giftRankingStore.isPointReward.value ?: false");
                GiftRankingUserDetail broadcasterRankReward = !f11.booleanValue() ? f10.getBroadcasterRankReward() : f10.getBroadcasterReceivedGiftReward();
                GiftRankingEventResponse f12 = giftRankingActivity.d4().g().f();
                String str = (f12 == null || (str = f12.getAchievedImageUrl()) == null) ? "" : "";
                if (broadcasterRankReward != null) {
                    giftRankingActivity.y4(broadcasterRankReward, i10, str);
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.l<View, wn.v> {
        public q() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (GiftRankingActivity.this.f20996e0 || jo.p.c(GiftRankingActivity.this.d4().k().f(), Boolean.TRUE)) {
                return;
            }
            GiftRankingActivity.this.c4().o(false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {
        public r() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (GiftRankingActivity.this.f20996e0 || jo.p.c(GiftRankingActivity.this.d4().k().f(), Boolean.TRUE)) {
                return;
            }
            GiftRankingActivity.this.c4().o(true);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.l<View, wn.v> {
        public s() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            GiftRankingActivity.this.c4().n(false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.l<View, wn.v> {
        public t() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            GiftRankingActivity.this.c4().n(true);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.l<View, wn.v> {
        public u() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            GiftRankingActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.l<View, wn.v> {
        public v() {
            super(1);
        }

        public final void a(View view) {
            String gradeHelpUrl;
            jo.p.h(view, "it");
            GiftRankingEventDetailResponse f10 = GiftRankingActivity.this.d4().h().f();
            if (f10 == null || (gradeHelpUrl = f10.getGradeHelpUrl()) == null) {
                return;
            }
            GiftRankingActivity giftRankingActivity = GiftRankingActivity.this;
            jf.b0 a10 = giftRankingActivity.i4().a(gradeHelpUrl);
            if (!(a10 instanceof b0.l0)) {
                giftRankingActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(giftRankingActivity, Referer.Event.GIFT_RANKING, a10));
            } else {
                giftRankingActivity.startActivity(WebViewActivity.a.b(WebViewActivity.X, giftRankingActivity, gradeHelpUrl, false, false, 12, null));
            }
            giftRankingActivity.c4().l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return (i10 == 1 || i10 == 3) ? 3 : 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21046w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21047x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21048y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21046w = componentCallbacks;
            this.f21047x = aVar;
            this.f21048y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21046w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f21047x, this.f21048y);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21049w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21050x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21051y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21049w = componentCallbacks;
            this.f21050x = aVar;
            this.f21051y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f21049w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.v.class), this.f21050x, this.f21051y);
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<j0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21052w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21053x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21054y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21052w = componentCallbacks;
            this.f21053x = aVar;
            this.f21054y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.j0, java.lang.Object] */
        @Override // io.a
        public final j0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21052w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(j0.class), this.f21053x, this.f21054y);
        }
    }

    public GiftRankingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new x(this, null, null));
        this.S = wn.g.b(iVar, new y(this, null, null));
        this.T = wn.g.b(iVar, new z(this, null, null));
        this.U = wn.g.b(iVar, new a0(this, null, null));
        this.V = wn.g.a(new d());
        this.W = new z9.l();
        this.X = wn.g.a(new g());
        this.Y = wn.g.a(new e());
        this.Z = wn.g.a(new j());
        this.f20992a0 = new f();
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: z9.b
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                GiftRankingActivity.t4(GiftRankingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…ERER, result.data))\n    }");
        this.f21000i0 = V2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.platform.ComposeView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final void k4(GiftRankingActivity giftRankingActivity, GiftRankingEventDetailResponse giftRankingEventDetailResponse) {
        boolean z10;
        GiftRankingEventDetailResponse giftRankingEventDetailResponse2;
        Object obj;
        boolean z11;
        boolean z12;
        GiftRankingEventResponse giftRankingEventResponse;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z13;
        jo.p.h(giftRankingActivity, "this$0");
        if (giftRankingEventDetailResponse == null) {
            return;
        }
        GiftRankingEventResponse f10 = giftRankingActivity.d4().g().f();
        if (f10 != null) {
            Boolean f11 = giftRankingActivity.d4().l().f();
            if (f11 == null) {
                f11 = Boolean.FALSE;
            }
            jo.p.g(f11, "giftRankingStore.isPointReward.value ?: false");
            boolean booleanValue = f11.booleanValue();
            Boolean f12 = giftRankingActivity.d4().n().f();
            if (f12 == null) {
                f12 = Boolean.FALSE;
            }
            jo.p.g(f12, "giftRankingStore.isRewar…ntTypeSent.value ?: false");
            boolean booleanValue2 = f12.booleanValue();
            Iterator it = f10.getDates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int key = ((GiftRankingDate) obj).getKey();
                Integer f13 = giftRankingActivity.d4().f().f();
                if (f13 == null) {
                    f13 = 0;
                }
                if (f13 != null && key == f13.intValue()) {
                    z13 = true;
                    continue;
                } else {
                    z13 = false;
                    continue;
                }
                if (z13) {
                    break;
                }
            }
            GiftRankingDate giftRankingDate = (GiftRankingDate) obj;
            if (giftRankingDate != null) {
                boolean z14 = giftRankingDate.getType() == GiftRankingDateType.FUTURE.getRawValue();
                z9.l lVar = giftRankingActivity.W;
                String string = giftRankingActivity.getString(!booleanValue ? q9.i.text_event_ranking_rank_broadcaster : q9.i.text_event_ranking_received_gift_point_broadcaster);
                jo.p.g(string, "getString(\n             …                        )");
                SpannableString X3 = giftRankingActivity.X3(giftRankingEventDetailResponse.getRankReward().getUserGrade(), f10.getInfoHighlightColor());
                GiftRankingUserDetail broadcasterRankReward = giftRankingEventDetailResponse.getBroadcasterRankReward();
                SpannableString X32 = giftRankingActivity.X3(broadcasterRankReward != null ? broadcasterRankReward.getUserGrade() : null, f10.getInfoHighlightColor());
                SpannableString Y3 = giftRankingActivity.Y3(giftRankingEventDetailResponse.getRankReward().getRank(), z14, giftRankingEventDetailResponse.isBannedUser());
                GiftRankingUserDetail broadcasterRankReward2 = giftRankingEventDetailResponse.getBroadcasterRankReward();
                SpannableString Y32 = giftRankingActivity.Y3(broadcasterRankReward2 != null ? broadcasterRankReward2.getRank() : 0, z14, giftRankingEventDetailResponse.isBannedBroadcaster());
                if (booleanValue2) {
                    drawable = giftRankingActivity.f20999h0;
                    if (drawable == null) {
                        jo.p.v("rewardTypePointNotActiveBackground");
                        drawable2 = null;
                    }
                    drawable2 = drawable;
                } else {
                    drawable = giftRankingActivity.f20998g0;
                    if (drawable == null) {
                        jo.p.v("rewardTypePointActiveBackground");
                        drawable2 = null;
                    }
                    drawable2 = drawable;
                }
                if (booleanValue2) {
                    Drawable drawable4 = giftRankingActivity.f20998g0;
                    if (drawable4 == null) {
                        jo.p.v("rewardTypePointActiveBackground");
                        drawable3 = null;
                        String string2 = giftRankingActivity.getString(q9.i.text_gift_ranking_title_grade_ranking, new Object[]{giftRankingEventDetailResponse.getRankReward().getUserGrade()});
                        jo.p.g(string2, "getString(R.string.text_…ing.rankReward.userGrade)");
                        z11 = booleanValue2;
                        z12 = booleanValue;
                        z10 = false;
                        giftRankingEventResponse = f10;
                        giftRankingEventDetailResponse2 = giftRankingEventDetailResponse;
                        lVar.a(f10, giftRankingEventDetailResponse, booleanValue, z11, z14, string, X3, X32, Y3, Y32, drawable2, drawable3, string2, giftRankingActivity.W3(f10.getRankingBackground().getStartColorInt(), f10.getRankingBackground().getEndColorInt(), 0, 0.0f, 0.0f));
                    } else {
                        drawable3 = drawable4;
                        String string22 = giftRankingActivity.getString(q9.i.text_gift_ranking_title_grade_ranking, new Object[]{giftRankingEventDetailResponse.getRankReward().getUserGrade()});
                        jo.p.g(string22, "getString(R.string.text_…ing.rankReward.userGrade)");
                        z11 = booleanValue2;
                        z12 = booleanValue;
                        z10 = false;
                        giftRankingEventResponse = f10;
                        giftRankingEventDetailResponse2 = giftRankingEventDetailResponse;
                        lVar.a(f10, giftRankingEventDetailResponse, booleanValue, z11, z14, string, X3, X32, Y3, Y32, drawable2, drawable3, string22, giftRankingActivity.W3(f10.getRankingBackground().getStartColorInt(), f10.getRankingBackground().getEndColorInt(), 0, 0.0f, 0.0f));
                    }
                } else {
                    Drawable drawable5 = giftRankingActivity.f20999h0;
                    if (drawable5 == null) {
                        jo.p.v("rewardTypePointNotActiveBackground");
                        drawable3 = null;
                        String string222 = giftRankingActivity.getString(q9.i.text_gift_ranking_title_grade_ranking, new Object[]{giftRankingEventDetailResponse.getRankReward().getUserGrade()});
                        jo.p.g(string222, "getString(R.string.text_…ing.rankReward.userGrade)");
                        z11 = booleanValue2;
                        z12 = booleanValue;
                        z10 = false;
                        giftRankingEventResponse = f10;
                        giftRankingEventDetailResponse2 = giftRankingEventDetailResponse;
                        lVar.a(f10, giftRankingEventDetailResponse, booleanValue, z11, z14, string, X3, X32, Y3, Y32, drawable2, drawable3, string222, giftRankingActivity.W3(f10.getRankingBackground().getStartColorInt(), f10.getRankingBackground().getEndColorInt(), 0, 0.0f, 0.0f));
                    } else {
                        drawable3 = drawable5;
                        String string2222 = giftRankingActivity.getString(q9.i.text_gift_ranking_title_grade_ranking, new Object[]{giftRankingEventDetailResponse.getRankReward().getUserGrade()});
                        jo.p.g(string2222, "getString(R.string.text_…ing.rankReward.userGrade)");
                        z11 = booleanValue2;
                        z12 = booleanValue;
                        z10 = false;
                        giftRankingEventResponse = f10;
                        giftRankingEventDetailResponse2 = giftRankingEventDetailResponse;
                        lVar.a(f10, giftRankingEventDetailResponse, booleanValue, z11, z14, string, X3, X32, Y3, Y32, drawable2, drawable3, string2222, giftRankingActivity.W3(f10.getRankingBackground().getStartColorInt(), f10.getRankingBackground().getEndColorInt(), 0, 0.0f, 0.0f));
                    }
                }
            } else {
                z11 = booleanValue2;
                z12 = booleanValue;
                z10 = false;
                giftRankingEventResponse = f10;
                giftRankingEventDetailResponse2 = giftRankingEventDetailResponse;
            }
            giftRankingActivity.A4(giftRankingEventResponse, giftRankingEventDetailResponse2, z10);
            giftRankingActivity.B4(giftRankingEventDetailResponse2, z12, z11);
        } else {
            z10 = false;
            giftRankingEventDetailResponse2 = giftRankingEventDetailResponse;
        }
        giftRankingActivity.Z3().f52487w0.setVisibility((giftRankingEventDetailResponse.isVisibleImmediateBroadcasterRankView() && jo.p.c(giftRankingActivity.f4(), Referer.LIVE_VIEW)) ? z10 : 8);
        giftRankingActivity.Z3().f52486v0.setVisibility(giftRankingActivity.Z3().f52487w0.getVisibility());
        giftRankingActivity.Z3().f52487w0.setContent(s0.c.c(1035093009, true, new i(giftRankingEventDetailResponse2)));
        giftRankingActivity.c4().h(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l4(com.dena.mirrativ.emomo.giftranking.GiftRankingActivity r17, wn.k r18) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.emomo.giftranking.GiftRankingActivity.l4(com.dena.mirrativ.emomo.giftranking.GiftRankingActivity, wn.k):void");
    }

    public static final void m4(GiftRankingActivity giftRankingActivity, Boolean bool) {
        GiftRankingEventResponse f10;
        GiftRankingEventDetailResponse f11;
        jo.p.h(giftRankingActivity, "this$0");
        jo.p.g(bool, "isRankingExpanded");
        if (!bool.booleanValue() || (f10 = giftRankingActivity.d4().g().f()) == null || (f11 = giftRankingActivity.d4().h().f()) == null) {
            return;
        }
        jo.p.g(f11, "giftEventRanking");
        giftRankingActivity.A4(f10, f11, bool.booleanValue());
    }

    public static final void n4(GiftRankingActivity giftRankingActivity, MRError mRError) {
        jo.p.h(giftRankingActivity, "this$0");
        if (mRError == null) {
            return;
        }
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(giftRankingActivity, mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(giftRankingActivity, mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(giftRankingActivity);
        }
    }

    public static final void o4(GiftRankingActivity giftRankingActivity, MRError mRError) {
        jo.p.h(giftRankingActivity, "this$0");
        if (mRError == null) {
            return;
        }
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(giftRankingActivity, mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(giftRankingActivity, mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(giftRankingActivity);
        }
    }

    public static final void p4(GiftRankingActivity giftRankingActivity, wn.k kVar) {
        jo.p.h(giftRankingActivity, "this$0");
        giftRankingActivity.Z3().K0.setVisibility((((Boolean) kVar.a()).booleanValue() || !((Boolean) kVar.b()).booleanValue()) ? 8 : 0);
    }

    public static final void q4(final GiftRankingActivity giftRankingActivity, final Integer num) {
        GiftRankingEventResponse f10;
        GiftRankingButtonStyle futureDateButton;
        jo.p.h(giftRankingActivity, "this$0");
        jo.p.g(num, "currentTerm");
        if (num.intValue() <= 0 || String.valueOf(num).length() != 8 || (f10 = giftRankingActivity.d4().g().f()) == null) {
            return;
        }
        RecyclerView.h adapter = giftRankingActivity.Z3().f52470h1.getAdapter();
        z9.y yVar = adapter instanceof z9.y ? (z9.y) adapter : null;
        if (yVar != null) {
            List<GiftRankingDate> dates = f10.getDates();
            ArrayList arrayList = new ArrayList(xn.t.u(dates, 10));
            for (GiftRankingDate giftRankingDate : dates) {
                if (giftRankingDate.getKey() == num.intValue()) {
                    futureDateButton = f10.getActiveDateButton();
                } else if (giftRankingDate.getType() == GiftRankingDateType.PAST.getRawValue()) {
                    futureDateButton = f10.getPastDateButton();
                } else if (giftRankingDate.getType() == GiftRankingDateType.TODAY.getRawValue()) {
                    futureDateButton = f10.getTodayButton();
                } else {
                    futureDateButton = giftRankingDate.getType() == GiftRankingDateType.FUTURE.getRawValue() ? f10.getFutureDateButton() : f10.getPastDateButton();
                }
                arrayList.add(z9.z.E.a(giftRankingDate, futureDateButton));
            }
            yVar.f(arrayList, new Runnable() { // from class: z9.k
                @Override // java.lang.Runnable
                public final void run() {
                    GiftRankingActivity.r4(GiftRankingActivity.this, num);
                }
            });
        }
    }

    public static final void r4(GiftRankingActivity giftRankingActivity, Integer num) {
        jo.p.h(giftRankingActivity, "this$0");
        jo.p.g(num, "currentTerm");
        v4(giftRankingActivity, num.intValue(), false, 2, null);
    }

    public static final void s4(GiftRankingActivity giftRankingActivity, GiftRankingEventResponse giftRankingEventResponse) {
        String ruleUrl;
        jo.p.h(giftRankingActivity, "this$0");
        if (giftRankingEventResponse == null) {
            return;
        }
        z9.l lVar = giftRankingActivity.W;
        String imageUrl = giftRankingEventResponse.getImageUrl();
        Drawable W3 = giftRankingActivity.W3(giftRankingEventResponse.getInfoBackground().getStartColorInt(), giftRankingEventResponse.getInfoBackground().getEndColorInt(), 0, 0.0f, 0.0f);
        i0 i0Var = i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format, "format(format, *args)");
        int parseColor = Color.parseColor(format);
        String format2 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getInfoHighlightColor()}, 1));
        jo.p.g(format2, "format(format, *args)");
        lVar.Y(imageUrl, W3, giftRankingActivity.W3(parseColor, Color.parseColor(format2), 0, de.a.c(giftRankingActivity, 10), 0.0f));
        String format3 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getSelectedTabColor()}, 1));
        jo.p.g(format3, "format(format, *args)");
        int parseColor2 = Color.parseColor(format3);
        String format4 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getSelectedTabColor()}, 1));
        jo.p.g(format4, "format(format, *args)");
        giftRankingActivity.f20998g0 = giftRankingActivity.W3(parseColor2, Color.parseColor(format4), c3.a.d(giftRankingActivity, q9.d.G), de.a.c(giftRankingActivity, 10), de.a.b(giftRankingActivity, 1));
        String format5 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getUnselectedTabColor()}, 1));
        jo.p.g(format5, "format(format, *args)");
        int parseColor3 = Color.parseColor(format5);
        String format6 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getUnselectedTabColor()}, 1));
        jo.p.g(format6, "format(format, *args)");
        int parseColor4 = Color.parseColor(format6);
        String format7 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getUnselectedTabColor()}, 1));
        jo.p.g(format7, "format(format, *args)");
        giftRankingActivity.f20999h0 = giftRankingActivity.W3(parseColor3, parseColor4, Color.parseColor(format7), de.a.c(giftRankingActivity, 10), de.a.b(giftRankingActivity, 1));
        giftRankingActivity.f20997f0 = Math.max((giftRankingActivity.f20993b0 - (giftRankingEventResponse.getDates().size() * giftRankingActivity.getResources().getDimensionPixelSize(q9.e.gift_ranking_term_width))) / 2, de.a.b(giftRankingActivity, 16));
        if (giftRankingActivity.Z3().f52470h1.getItemDecorationCount() > 0) {
            giftRankingActivity.Z3().f52470h1.d1(0);
        }
        RecyclerView recyclerView = giftRankingActivity.Z3().f52470h1;
        int i10 = giftRankingActivity.f20997f0;
        recyclerView.g(new p001if.c(0, i10, 0, i10, 0, 0));
        giftRankingActivity.c4().m(giftRankingEventResponse.getCurrentDate());
        giftRankingActivity.c4().j(giftRankingActivity.b4(), giftRankingEventResponse.getCurrentDate(), giftRankingActivity.a4(), true);
        giftRankingActivity.C4(giftRankingEventResponse);
        giftRankingActivity.z4(giftRankingEventResponse);
        if (!giftRankingActivity.g4().j3() || (ruleUrl = giftRankingEventResponse.getRuleUrl()) == null) {
            return;
        }
        p5.U0.a(ruleUrl).z3(giftRankingActivity.a3(), "WebViewDialogFragment");
        giftRankingActivity.g4().V1(false);
    }

    public static final void t4(GiftRankingActivity giftRankingActivity, androidx.activity.result.a aVar) {
        jo.p.h(giftRankingActivity, "this$0");
        giftRankingActivity.startActivity(giftRankingActivity.e4().x(giftRankingActivity, Referer.Event.GIFT_RANKING, aVar.a()));
    }

    public static /* synthetic */ void v4(GiftRankingActivity giftRankingActivity, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        giftRankingActivity.u4(i10, z10);
    }

    public final void A4(GiftRankingEventResponse giftRankingEventResponse, GiftRankingEventDetailResponse giftRankingEventDetailResponse, boolean z10) {
        z9.m mVar;
        int d10;
        List<GiftRankingUserDetail> rankings = giftRankingEventDetailResponse.getRankings();
        if (rankings == null) {
            rankings = xn.s.k();
        }
        List<GiftRankingUserDetail> list = rankings;
        int size = list.size();
        if (!z10) {
            size = Math.min(5, size);
        }
        List<GiftRankingUserDetail> subList = list.subList(0, size);
        RecyclerView.h adapter = Z3().f52489y0.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.giftranking.GiftRankingWholeRankingAdapter");
        z9.b0 b0Var = (z9.b0) adapter;
        ArrayList arrayList = new ArrayList(xn.t.u(subList, 10));
        Iterator<T> it = subList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GiftRankingUserDetail giftRankingUserDetail = (GiftRankingUserDetail) it.next();
            c0.a aVar = z9.c0.N;
            int rank = giftRankingUserDetail.getRank();
            if (rank == 1) {
                d10 = c3.a.d(this, q9.d.f48811o);
            } else if (rank == 2) {
                d10 = c3.a.d(this, q9.d.f48812p);
            } else if (rank != 3) {
                d10 = c3.a.d(this, q9.d.f48804b);
            } else {
                d10 = c3.a.d(this, q9.d.f48813q);
            }
            i0 i0Var = i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getRankingHighlightColor()}, 1));
            jo.p.g(format, "format(format, *args)");
            arrayList.add(aVar.a(this, giftRankingUserDetail, d10, Color.parseColor(format), !f20991l0.contains(f4()) && (so.n.r(giftRankingUserDetail.getLiveId()) ^ true), giftRankingUserDetail.getUserId() != ((GiftRankingUserDetail) xn.a0.i0(subList)).getUserId()));
        }
        if (z10 || list.size() <= 5) {
            mVar = null;
        } else {
            String rankingLink = giftRankingEventResponse.getRankingLink();
            i0 i0Var2 = i0.f38149a;
            String format2 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getRankingHighlightColor()}, 1));
            jo.p.g(format2, "format(format, *args)");
            mVar = new z9.m(rankingLink, Color.parseColor(format2), null, 4, null);
        }
        b0Var.d(xn.a0.o0(arrayList, xn.s.n(mVar)));
        Z3().f52488x0.setVisibility(list.isEmpty() ? 0 : 8);
    }

    public final void B4(GiftRankingEventDetailResponse giftRankingEventDetailResponse, boolean z10, boolean z11) {
        GiftRankingUserDetail receivedGiftReward;
        List<z9.u> k10;
        List<GiftRankingReward> rewards;
        GiftRankingEventResponse f10 = d4().g().f();
        String str = (f10 == null || (str = f10.getAchievedImageUrl()) == null) ? "" : "";
        if (!z10) {
            receivedGiftReward = giftRankingEventDetailResponse.getRankReward();
        } else if (z11) {
            receivedGiftReward = giftRankingEventDetailResponse.getSentGiftReward();
        } else {
            receivedGiftReward = giftRankingEventDetailResponse.getReceivedGiftReward();
        }
        RecyclerView.h adapter = Z3().M0.getAdapter();
        z9.t tVar = adapter instanceof z9.t ? (z9.t) adapter : null;
        if (tVar != null) {
            List<GiftRankingReward> rewards2 = receivedGiftReward.getRewards();
            ArrayList arrayList = new ArrayList(xn.t.u(rewards2, 10));
            for (GiftRankingReward giftRankingReward : rewards2) {
                z9.u uVar = new z9.u(null, 1, null);
                uVar.a(giftRankingReward, str, this.f20994c0, this.f20995d0);
                arrayList.add(uVar);
            }
            tVar.f(arrayList);
        }
        Z3().M0.getLayoutParams().height = this.f20995d0 * (((int) Math.ceil(receivedGiftReward.getRewards().size() / 4.0d)) + 1);
        Z3().M0.requestLayout();
        GiftRankingUserDetail broadcasterRankReward = !z10 ? giftRankingEventDetailResponse.getBroadcasterRankReward() : giftRankingEventDetailResponse.getBroadcasterReceivedGiftReward();
        RecyclerView.h adapter2 = Z3().J.getAdapter();
        z9.t tVar2 = adapter2 instanceof z9.t ? (z9.t) adapter2 : null;
        if (tVar2 != null) {
            if (broadcasterRankReward != null && (rewards = broadcasterRankReward.getRewards()) != null) {
                k10 = new ArrayList<>(xn.t.u(rewards, 10));
                for (GiftRankingReward giftRankingReward2 : rewards) {
                    z9.u uVar2 = new z9.u(null, 1, null);
                    uVar2.a(giftRankingReward2, str, this.f20994c0, this.f20995d0);
                    k10.add(uVar2);
                }
            } else {
                k10 = xn.s.k();
            }
            tVar2.f(k10);
        }
        Z3().J.getLayoutParams().height = this.f20995d0 * ((int) Math.ceil(receivedGiftReward.getRewards().size() / 4.0d));
        Z3().J.requestLayout();
    }

    public final void C4(GiftRankingEventResponse giftRankingEventResponse) {
        LandingPageTitleView landingPageTitleView = Z3().f52485u0;
        t1 t1Var = new t1();
        SpannableString V3 = V3(giftRankingEventResponse.getTitle(), de.a.c(this, 17));
        SpannableString V32 = V3(giftRankingEventResponse.getSubtitle(), de.a.c(this, 12));
        String ruleLink = giftRankingEventResponse.getRuleLink();
        i0 i0Var = i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getRuleButton().getTextColor()}, 1));
        jo.p.g(format, "format(format, *args)");
        int parseColor = Color.parseColor(format);
        Drawable W3 = W3(giftRankingEventResponse.getTitleBackground().getStartColorInt(), giftRankingEventResponse.getTitleBackground().getEndColorInt(), 0, 0.0f, 0.0f);
        String format2 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getRuleButton().getBackgroundColor()}, 1));
        jo.p.g(format2, "format(format, *args)");
        int parseColor2 = Color.parseColor(format2);
        String format3 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getRuleButton().getBackgroundColor()}, 1));
        jo.p.g(format3, "format(format, *args)");
        int parseColor3 = Color.parseColor(format3);
        String format4 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getRuleButton().getFrameColor()}, 1));
        jo.p.g(format4, "format(format, *args)");
        t1Var.a(V3, V32, ruleLink, parseColor, W3, W3(parseColor2, parseColor3, Color.parseColor(format4), de.a.b(this, 20), de.a.b(this, 1)));
        landingPageTitleView.w(t1Var, new h0(giftRankingEventResponse, this));
    }

    @SuppressLint({"Recycle"})
    public final void U3(boolean z10) {
        if (this.f20996e0) {
            return;
        }
        View view = Z3().f52475k0;
        jo.p.g(view, "binding.eventInfoRewardTypeInnerView");
        if (o3.c0.V(view) && !view.isLayoutRequested()) {
            float width = Z3().f52475k0.getWidth() + de.a.b(this, 8);
            float f10 = z10 ? 0.0f : width;
            if (!z10) {
                width = 0.0f;
            }
            if (width == Z3().f52475k0.getTranslationX()) {
                return;
            }
            uo.l.d(this, null, null, new c(f10, width, null), 3, null);
            return;
        }
        view.addOnLayoutChangeListener(new b(z10));
    }

    public final SpannableString V3(List<GiftRankingAttributedText> list, int i10) {
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

    public final Drawable W3(int i10, int i11, int i12, float f10, float f11) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(i10), Integer.valueOf(i11))));
        gradientDrawable.setStroke((int) f11, i12);
        gradientDrawable.setCornerRadius(f10);
        return gradientDrawable;
    }

    public final SpannableString X3(String str, String str2) {
        if (str != null && str2 != null) {
            String string = getString(q9.i.text_gift_ranking_title_grade_ranking_reward, new Object[]{str});
            jo.p.g(string, "getString(R.string.text_…de_ranking_reward, grade)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string);
            i0 i0Var = i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{str2}, 1));
            jo.p.g(format, "format(format, *args)");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(format)), 0, so.o.U(string, str, 0, false, 6, null) + str.length() + 1, 33);
            SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
            jo.p.g(valueOf, "valueOf(\n            Spa…)\n            }\n        )");
            return valueOf;
        }
        return new SpannableString("");
    }

    public final SpannableString Y3(int i10, boolean z10, boolean z11) {
        String string;
        int d10;
        if (z11) {
            string = getString(q9.i.text_gift_event_banned);
        } else if (z10) {
            string = getString(q9.i.text_event_ranking_before_start);
        } else {
            string = i10 == 0 ? getString(q9.i.text_gift_ranking_out_of_ranking) : "";
        }
        jo.p.g(string, "when {\n            isBan…     else -> \"\"\n        }");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z11) {
            spannableStringBuilder.append((CharSequence) string);
            int length = string.length() + 0;
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(de.a.c(this, 12)), 0, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(this, q9.d.f48804b)), 0, length, 33);
        } else if (!z10 && i10 != 0) {
            String valueOf = String.valueOf(i10);
            spannableStringBuilder.append((CharSequence) valueOf);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(de.a.c(this, 22)), 0, valueOf.length() + 0, 33);
            if (i10 == 1) {
                d10 = c3.a.d(this, q9.d.f48811o);
            } else if (i10 == 2) {
                d10 = c3.a.d(this, q9.d.f48812p);
            } else if (i10 != 3) {
                d10 = c3.a.d(this, q9.d.f48816t);
            } else {
                d10 = c3.a.d(this, q9.d.f48813q);
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(d10), 0, valueOf.length() + 0, 33);
        } else {
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(de.a.c(this, 12)), 0, string.length() + 0, 33);
        }
        SpannableString valueOf2 = SpannableString.valueOf(spannableStringBuilder);
        jo.p.g(valueOf2, "valueOf(spannableStringBuilder)");
        return valueOf2;
    }

    public final s9.g Z3() {
        Object value = this.V.getValue();
        jo.p.g(value, "<get-binding>(...)");
        return (s9.g) value;
    }

    public final int a4() {
        return ((Number) this.Y.getValue()).intValue();
    }

    public final int b4() {
        return ((Number) this.X.getValue()).intValue();
    }

    public final z9.a c4() {
        return (z9.a) this.P.getValue();
    }

    public final z9.w d4() {
        return (z9.w) this.Q.getValue();
    }

    public final tb.c e4() {
        return (tb.c) this.U.getValue();
    }

    public final String f4() {
        return (String) this.Z.getValue();
    }

    public final kf.v g4() {
        return (kf.v) this.S.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final j0 h4() {
        return (j0) this.T.getValue();
    }

    public final of.k i4() {
        return (of.k) this.R.getValue();
    }

    @SuppressLint({"RestrictedApi"})
    public final void j4() {
        d4().f().i(this, new androidx.lifecycle.f0() { // from class: z9.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.q4(GiftRankingActivity.this, (Integer) obj);
            }
        });
        d4().g().i(this, new androidx.lifecycle.f0() { // from class: z9.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.s4(GiftRankingActivity.this, (GiftRankingEventResponse) obj);
            }
        });
        d4().h().i(this, new androidx.lifecycle.f0() { // from class: z9.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.k4(GiftRankingActivity.this, (GiftRankingEventDetailResponse) obj);
            }
        });
        Boolean bool = Boolean.FALSE;
        wn.k a10 = wn.q.a(bool, bool);
        LiveData<Boolean> l10 = d4().l();
        LiveData<Boolean> n10 = d4().n();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(a10);
        for (LiveData liveData : xn.s.m(l10, n10)) {
            c0Var.q(liveData, new h(c0Var, l10, n10));
        }
        LiveData a11 = p0.a(c0Var);
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(this, new androidx.lifecycle.f0() { // from class: z9.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.l4(GiftRankingActivity.this, (wn.k) obj);
            }
        });
        d4().m().i(this, new androidx.lifecycle.f0() { // from class: z9.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.m4(GiftRankingActivity.this, (Boolean) obj);
            }
        });
        d4().j().i(this, new androidx.lifecycle.f0() { // from class: z9.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.n4(GiftRankingActivity.this, (MRError) obj);
            }
        });
        d4().i().i(this, new androidx.lifecycle.f0() { // from class: z9.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.o4(GiftRankingActivity.this, (MRError) obj);
            }
        });
        nd.t0.a(d4().l(), h4().e()).i(this, new androidx.lifecycle.f0() { // from class: z9.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftRankingActivity.p4(GiftRankingActivity.this, (wn.k) obj);
            }
        });
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(16908290).setSystemUiVisibility(1280);
        Z3().M(this);
        Z3().T(this.W);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = getSystemService("window");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        this.f20993b0 = i10;
        int b10 = (i10 - de.a.b(this, 52)) / 4;
        this.f20994c0 = b10;
        this.f20995d0 = (b10 * 98) / 84;
        x4();
        w4();
        j4();
        c4().i(b4());
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r0.d(this, null, 1, null);
    }

    public final void u4(int i10, boolean z10) {
        GiftRankingEventResponse f10 = d4().g().f();
        if (f10 == null || f10.getDates().size() * getResources().getDimensionPixelSize(q9.e.gift_ranking_term_width) <= this.f20993b0) {
            return;
        }
        Iterator<GiftRankingDate> it = f10.getDates().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().getKey() == i10) {
                break;
            }
            i11++;
        }
        RecyclerView.p layoutManager = Z3().f52470h1.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int e22 = ((LinearLayoutManager) layoutManager).e2();
        int i12 = this.f20997f0;
        Resources resources = getResources();
        int i13 = q9.e.gift_ranking_term_width;
        int dimensionPixelSize = i12 + (e22 * resources.getDimensionPixelSize(i13));
        int dimensionPixelSize2 = (this.f20997f0 + (i11 * getResources().getDimensionPixelSize(i13))) - (this.f20993b0 / 2);
        if (z10) {
            Z3().f52470h1.t1(dimensionPixelSize2 - dimensionPixelSize, 0);
        } else {
            Z3().f52470h1.scrollBy(dimensionPixelSize2 - dimensionPixelSize, 0);
        }
    }

    public final void w4() {
        RecyclerView recyclerView = Z3().f52470h1;
        z9.y yVar = new z9.y();
        yVar.j(new k());
        recyclerView.setAdapter(yVar);
        RecyclerView recyclerView2 = Z3().M0;
        z9.t tVar = new z9.t();
        tVar.d(new o());
        recyclerView2.setAdapter(tVar);
        RecyclerView recyclerView3 = Z3().J;
        z9.t tVar2 = new z9.t();
        tVar2.d(new p());
        recyclerView3.setAdapter(tVar2);
        View view = Z3().f52481q0;
        jo.p.g(view, "binding.eventInfoRewardTypeRankingContainer");
        g1.a(view, new q());
        View view2 = Z3().f52476l0;
        jo.p.g(view2, "binding.eventInfoRewardTypePointContainer");
        g1.a(view2, new r());
        View view3 = Z3().f52478n0;
        jo.p.g(view3, "binding.eventInfoRewardTypePointReceivedContainer");
        g1.a(view3, new s());
        View view4 = Z3().f52479o0;
        jo.p.g(view4, "binding.eventInfoRewardTypePointSentContainer");
        g1.a(view4, new t());
        ConstraintLayout constraintLayout = Z3().f52459c0;
        jo.p.g(constraintLayout, "binding.closeButtonContainer");
        g1.a(constraintLayout, new u());
        ConstraintLayout constraintLayout2 = Z3().G0;
        jo.p.g(constraintLayout2, "binding.rewardListGradeHelpContainer");
        g1.a(constraintLayout2, new v());
        RecyclerView recyclerView4 = Z3().f52489y0;
        z9.b0 b0Var = new z9.b0();
        b0Var.i(new l());
        b0Var.h(new m());
        b0Var.g(new n());
        recyclerView4.setAdapter(b0Var);
    }

    public final void x4() {
        Z3().f52470h1.setLayoutManager(new LinearLayoutManager(this, 0, false));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.giftranking.GiftRankingActivity$setupLayout$rewardListRecyclerViewLayoutManager$1
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
        };
        gridLayoutManager.o3(new w());
        Z3().M0.setLayoutManager(gridLayoutManager);
        Z3().J.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.giftranking.GiftRankingActivity$setupLayout$2
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
        Z3().N0.getLayoutParams().width = this.f20994c0 * 2;
        Z3().N0.getLayoutParams().height = this.f20995d0 * 2;
        Z3().E0.setOutlineProvider(this.f20992a0);
        Z3().E0.setClipToOutline(true);
        Z3().G.setOutlineProvider(this.f20992a0);
        Z3().G.setClipToOutline(true);
        RecyclerView recyclerView = Z3().f52489y0;
        final Context context = Z3().u().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.dena.mirrativ.emomo.giftranking.GiftRankingActivity$setupLayout$3
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        Z3().f52489y0.setOutlineProvider(this.f20992a0);
        Z3().f52489y0.setClipToOutline(true);
    }

    public final void y4(GiftRankingUserDetail giftRankingUserDetail, int i10, String str) {
        s1 a10;
        if (a3().e0("LandingPageRewardListDialog") != null) {
            return;
        }
        i2.a aVar = i2.Q0;
        List<GiftRankingReward> rewards = giftRankingUserDetail.getRewards();
        ArrayList arrayList = new ArrayList(xn.t.u(rewards, 10));
        for (GiftRankingReward giftRankingReward : rewards) {
            s1.a aVar2 = s1.O;
            String iconUrl = giftRankingReward.getIconUrl();
            String imageUrl = giftRankingReward.getImageUrl();
            String badgeUrl = giftRankingReward.getBadgeUrl();
            String str2 = "";
            String str3 = giftRankingReward.getAchieved() ? str : "";
            String partTypeIconUrl = giftRankingReward.getPartTypeIconUrl();
            if (partTypeIconUrl != null) {
                str2 = partTypeIconUrl;
            }
            a10 = aVar2.a(iconUrl, imageUrl, badgeUrl, (r27 & 8) != 0 ? "" : str3, (r27 & 16) != 0 ? "" : str2, giftRankingReward.getName(), giftRankingReward.getRarity(), giftRankingReward.getCondition(), giftRankingReward.getDescription(), giftRankingReward.getDisabled(), (r27 & 1024) != 0 ? null : null);
            arrayList.add(a10);
        }
        aVar.a(arrayList, i10).z3(a3(), "LandingPageRewardListDialog");
    }

    public final void z4(GiftRankingEventResponse giftRankingEventResponse) {
        LandingPageDescriptionListView landingPageDescriptionListView = Z3().f52461d0;
        o1 o1Var = new o1();
        List<Description> descriptions = giftRankingEventResponse.getDescriptions();
        ArrayList arrayList = new ArrayList(xn.t.u(descriptions, 10));
        for (Description description : descriptions) {
            n1 n1Var = new n1(null, 1, null);
            String title = description.getTitle();
            String text = description.getText();
            i0 i0Var = i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingEventResponse.getDescriptionColor()}, 1));
            jo.p.g(format, "format(format, *args)");
            n1Var.a(title, text, Color.parseColor(format));
            arrayList.add(n1Var);
        }
        o1Var.a(arrayList, false, W3(giftRankingEventResponse.getDescriptionBackground().getStartColorInt(), giftRankingEventResponse.getDescriptionBackground().getEndColorInt(), 0, 0.0f, 0.0f));
        landingPageDescriptionListView.w(o1Var);
    }
}
