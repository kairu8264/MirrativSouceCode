package com.dena.mirrativ.emomo.emomoquest.ranking;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.api.Referer;
import da.j;
import io.l;
import java.util.List;
import jf.b0;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import l0.i;
import of.k;
import uo.q0;
import uo.r0;
import w9.m;
import wn.v;

/* loaded from: classes.dex */
public final class EmomoQuestRankingActivity extends e.b implements q0 {
    public static final a U = new a(null);
    public static final int V = 8;
    public final /* synthetic */ j O = new j();
    public final wn.f P = wn.g.a(new b());
    public final wn.f Q = wn.g.a(new e());
    public final wn.f R = wn.g.a(new c());
    public final wn.f S;
    public final wn.f T;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, String str, int i10, boolean z10) {
            p.h(context, "context");
            p.h(str, "prevReferer");
            Intent intent = new Intent(context, EmomoQuestRankingActivity.class);
            intent.putExtra("EXTRA_PREV_REFERER", str);
            intent.putExtra("EXTRA_GIFT_EVENT_ID", i10);
            intent.putExtra("EXTRA_HIDE_LISTING", z10);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<Integer> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(EmomoQuestRankingActivity.this.getIntent().getIntExtra("EXTRA_GIFT_EVENT_ID", 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(!EmomoQuestRankingActivity.this.getIntent().getBooleanExtra("EXTRA_HIDE_LISTING", false));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.p<i, Integer, v> {

        /* loaded from: classes.dex */
        public static final class a extends q implements l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestRankingActivity f20976w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EmomoQuestRankingActivity emomoQuestRankingActivity) {
                super(1);
                this.f20976w = emomoQuestRankingActivity;
            }

            public final void a(String str) {
                p.h(str, "popupUrl");
                b0 a10 = this.f20976w.F3().a(str);
                if (!(a10 instanceof b0.l0)) {
                    EmomoQuestRankingActivity emomoQuestRankingActivity = this.f20976w;
                    emomoQuestRankingActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(emomoQuestRankingActivity, "event.emomo_quest_ranking", a10));
                    return;
                }
                EmomoQuestRankingActivity emomoQuestRankingActivity2 = this.f20976w;
                emomoQuestRankingActivity2.startActivity(WebViewActivity.a.b(WebViewActivity.X, emomoQuestRankingActivity2, str, false, false, 12, null));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestRankingActivity f20977w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EmomoQuestRankingActivity emomoQuestRankingActivity) {
                super(1);
                this.f20977w = emomoQuestRankingActivity;
            }

            public final void a(String str) {
                p.h(str, "lpUrl");
                b0 a10 = this.f20977w.F3().a(str);
                if (!(a10 instanceof b0.l0)) {
                    EmomoQuestRankingActivity emomoQuestRankingActivity = this.f20977w;
                    emomoQuestRankingActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(emomoQuestRankingActivity, "event.emomo_quest_ranking", a10));
                    return;
                }
                EmomoQuestRankingActivity emomoQuestRankingActivity2 = this.f20977w;
                emomoQuestRankingActivity2.startActivity(WebViewActivity.a.b(WebViewActivity.X, emomoQuestRankingActivity2, str, false, false, 12, null));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements l<Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestRankingActivity f20978w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(EmomoQuestRankingActivity emomoQuestRankingActivity) {
                super(1);
                this.f20978w = emomoQuestRankingActivity;
            }

            public final void a(int i10) {
                if (p.c(this.f20978w.E3(), Referer.LIVE_VIEW)) {
                    return;
                }
                tb.a m10 = this.f20978w.D3().m(String.valueOf(i10), "event.emomo_quest_ranking", false, false);
                m10.a().z3(this.f20978w.a3(), m10.b());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Integer num) {
                a(num.intValue());
                return v.f59242a;
            }
        }

        /* renamed from: com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingActivity$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0184d extends q implements io.p<Integer, List<? extends aa.e>, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestRankingActivity f20979w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0184d(EmomoQuestRankingActivity emomoQuestRankingActivity) {
                super(2);
                this.f20979w = emomoQuestRankingActivity;
            }

            public final void a(int i10, List<? extends aa.e> list) {
                p.h(list, "rewards");
                if (this.f20979w.a3().e0("LandingPageRewardDetailListDialogFragment") != null) {
                    return;
                }
                aa.f.P0.a(list, i10).z3(this.f20979w.a3(), "LandingPageRewardDetailListDialogFragment");
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(Integer num, List<? extends aa.e> list) {
                a(num.intValue(), list);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends q implements io.p<Integer, List<? extends aa.e>, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestRankingActivity f20980w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(EmomoQuestRankingActivity emomoQuestRankingActivity) {
                super(2);
                this.f20980w = emomoQuestRankingActivity;
            }

            public final void a(int i10, List<? extends aa.e> list) {
                p.h(list, "rewards");
                if (this.f20980w.a3().e0("LandingPageRewardDetailListDialogFragment") != null) {
                    return;
                }
                aa.f.P0.a(list, i10).z3(this.f20980w.a3(), "LandingPageRewardDetailListDialogFragment");
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(Integer num, List<? extends aa.e> list) {
                a(num.intValue(), list);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestRankingActivity f20981w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(EmomoQuestRankingActivity emomoQuestRankingActivity) {
                super(0);
                this.f20981w = emomoQuestRankingActivity;
            }

            public final void a() {
                EmomoQuestRankingActivity emomoQuestRankingActivity = this.f20981w;
                emomoQuestRankingActivity.startActivity(emomoQuestRankingActivity.D3().D(this.f20981w));
                this.f20981w.finish();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public d() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                m.a("event.emomo_quest_ranking", EmomoQuestRankingActivity.this.C3(), EmomoQuestRankingActivity.this.G3(), new a(EmomoQuestRankingActivity.this), new b(EmomoQuestRankingActivity.this), new c(EmomoQuestRankingActivity.this), new C0184d(EmomoQuestRankingActivity.this), new e(EmomoQuestRankingActivity.this), new f(EmomoQuestRankingActivity.this), iVar, 6);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = EmomoQuestRankingActivity.this.getIntent().getStringExtra("EXTRA_PREV_REFERER");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20983w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20984x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20985y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20983w = componentCallbacks;
            this.f20984x = aVar;
            this.f20985y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f20983w;
            return gq.a.a(componentCallbacks).c(f0.b(k.class), this.f20984x, this.f20985y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20986w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20987x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20988y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20986w = componentCallbacks;
            this.f20987x = aVar;
            this.f20988y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20986w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f20987x, this.f20988y);
        }
    }

    public EmomoQuestRankingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S = wn.g.b(iVar, new f(this, null, null));
        this.T = wn.g.b(iVar, new g(this, null, null));
    }

    public final int C3() {
        return ((Number) this.P.getValue()).intValue();
    }

    public final tb.c D3() {
        return (tb.c) this.T.getValue();
    }

    public final String E3() {
        return (String) this.Q.getValue();
    }

    public final k F3() {
        return (k) this.S.getValue();
    }

    public final boolean G3() {
        return ((Boolean) this.R.getValue()).booleanValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a.b(this, null, s0.c.c(-1063807111, true, new d()), 1, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
