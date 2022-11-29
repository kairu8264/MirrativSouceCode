package com.dena.mirrativ.livegame.ranking;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import da.j;
import hf.v0;
import io.l;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import l0.i;
import nf.z;
import oa.g;
import oa.k;
import oa.u;
import tb.c;
import uo.q0;
import uo.r0;
import wn.f;
import wn.v;

/* loaded from: classes.dex */
public final class LiveGameDailyRankingActivity extends e.b implements q0 {
    public static final a T = new a(null);
    public static final int U = 8;
    public final /* synthetic */ j O = new j();
    public final f P;
    public final String Q;
    public final f R;
    public final f S;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, LiveGameDailyRankingActivity.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.p<i, Integer, v> {

        /* loaded from: classes.dex */
        public static final class a extends q implements l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDailyRankingActivity f21530w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LiveGameDailyRankingActivity liveGameDailyRankingActivity) {
                super(1);
                this.f21530w = liveGameDailyRankingActivity;
            }

            public final void a(String str) {
                p.h(str, "userId");
                if (p.c(this.f21530w.D3().x(), str)) {
                    LiveGameDailyRankingActivity liveGameDailyRankingActivity = this.f21530w;
                    liveGameDailyRankingActivity.startActivity(liveGameDailyRankingActivity.B3().z0(this.f21530w));
                    return;
                }
                LiveGameDailyRankingActivity liveGameDailyRankingActivity2 = this.f21530w;
                tb.c B3 = liveGameDailyRankingActivity2.B3();
                LiveGameDailyRankingActivity liveGameDailyRankingActivity3 = this.f21530w;
                liveGameDailyRankingActivity2.startActivity(B3.s(liveGameDailyRankingActivity3, str, liveGameDailyRankingActivity3.Q));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* renamed from: com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0188b extends q implements l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDailyRankingActivity f21531w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0188b(LiveGameDailyRankingActivity liveGameDailyRankingActivity) {
                super(1);
                this.f21531w = liveGameDailyRankingActivity;
            }

            public final void a(String str) {
                p.h(str, "liveId");
                if (str.length() == 0) {
                    return;
                }
                tb.c B3 = this.f21531w.B3();
                LiveGameDailyRankingActivity liveGameDailyRankingActivity = this.f21531w;
                Intent f10 = c.a.f(B3, liveGameDailyRankingActivity, str, liveGameDailyRankingActivity.Q, null, null, false, false, false, false, null, 960, null);
                LiveGameDailyRankingActivity liveGameDailyRankingActivity2 = this.f21531w;
                f10.addFlags(67108864);
                liveGameDailyRankingActivity2.startActivity(f10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDailyRankingActivity f21532w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(LiveGameDailyRankingActivity liveGameDailyRankingActivity) {
                super(0);
                this.f21532w = liveGameDailyRankingActivity;
            }

            public final void a() {
                u.R0.a(this.f21532w.Q).z3(this.f21532w.a3(), "LiveGameDailyRankingYesterdayDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends q implements l<g, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDailyRankingActivity f21533w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(LiveGameDailyRankingActivity liveGameDailyRankingActivity) {
                super(1);
                this.f21533w = liveGameDailyRankingActivity;
            }

            public final void a(g gVar) {
                p.h(gVar, "bindModel");
                k.P0.a(this.f21533w.Q, gVar.j()).z3(this.f21533w.a3(), "LiveGameDailyRankingRuleDialogFragment");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(g gVar) {
                a(gVar);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDailyRankingActivity f21534w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(LiveGameDailyRankingActivity liveGameDailyRankingActivity) {
                super(0);
                this.f21534w = liveGameDailyRankingActivity;
            }

            public final void a() {
                this.f21534w.finish();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                oa.j.a(r0.g(LiveGameDailyRankingActivity.this.C3()) ? LiveGameDailyRankingActivity.this.C3().s0().f() : null, new a(LiveGameDailyRankingActivity.this), new C0188b(LiveGameDailyRankingActivity.this), new c(LiveGameDailyRankingActivity.this), new d(LiveGameDailyRankingActivity.this), new e(LiveGameDailyRankingActivity.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21535w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21536x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21537y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21535w = componentCallbacks;
            this.f21536x = aVar;
            this.f21537y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21535w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21536x, this.f21537y);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21538w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21539x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21540y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21538w = componentCallbacks;
            this.f21539x = aVar;
            this.f21540y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final z invoke() {
            ComponentCallbacks componentCallbacks = this.f21538w;
            return gq.a.a(componentCallbacks).c(f0.b(z.class), this.f21539x, this.f21540y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21541w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21542x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21543y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21541w = componentCallbacks;
            this.f21542x = aVar;
            this.f21543y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21541w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f21542x, this.f21543y);
        }
    }

    public LiveGameDailyRankingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new c(this, null, null));
        this.Q = "live_game.daily_ranking";
        this.R = wn.g.b(iVar, new d(this, null, null));
        this.S = wn.g.b(iVar, new e(this, null, null));
    }

    public final tb.c B3() {
        return (tb.c) this.P.getValue();
    }

    public final z C3() {
        return (z) this.R.getValue();
    }

    public final v0 D3() {
        return (v0) this.S.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a.b(this, null, s0.c.c(-1142312873, true, new b()), 1, null);
    }
}
