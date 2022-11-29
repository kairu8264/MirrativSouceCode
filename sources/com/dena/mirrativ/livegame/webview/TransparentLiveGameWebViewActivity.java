package com.dena.mirrativ.livegame.webview;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import ce.l;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.LiveGameInterruptibleBcsvrResponse;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import jf.b0;
import jo.f0;
import kf.x;
import kotlin.KotlinNothingValueException;
import nd.f1;
import nd.r0;
import org.greenrobot.eventbus.ThreadMode;
import tb.c;
import uo.q0;
import wn.v;
import xo.w;
import yd.g1;
import yd.t1;

/* loaded from: classes.dex */
public final class TransparentLiveGameWebViewActivity extends e.b implements q0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f21594b0 = new a(null);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f21595c0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new m());
    public final wn.f Q = wn.g.a(new b());
    public final wn.f R = wn.g.a(new c());
    public final wn.f S = wn.g.a(new l());
    public final wn.f T = wn.g.a(new d());
    public final wn.f U = wn.g.a(new e());
    public ka.e V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21596a0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2, String str3, String str4, boolean z10, String str5) {
            jo.p.h(context, "context");
            jo.p.h(str, "referer");
            jo.p.h(str2, "gameId");
            jo.p.h(str3, "gameUrl");
            jo.p.h(str4, "playId");
            Intent intent = new Intent(context, TransparentLiveGameWebViewActivity.class);
            intent.putExtra("EXTRA_REFERER", str);
            intent.putExtra("EXTRA_GAME_ID", str2);
            intent.putExtra("EXTRA_GAME_URL", str3);
            intent.putExtra("EXTRA_PLAY_ID", str4);
            intent.putExtra("EXTRA_IS_LAND_SCAPE", z10);
            intent.putExtra("EXTRA_LIVE_ID", str5);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = TransparentLiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_GAME_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = TransparentLiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_GAME_URL");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(TransparentLiveGameWebViewActivity.this.getIntent().getBooleanExtra("EXTRA_IS_LAND_SCAPE", false));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return TransparentLiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_LIVE_ID");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            jo.p.h(webView, "view");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("webview redirect url:");
            jo.p.e(str);
            sb2.append(str);
            g9.a.g(sb2.toString());
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            jo.p.e(scheme);
            if (so.n.q("mirr", scheme, true)) {
                r0.f42205a.b().a(str);
                TransparentLiveGameWebViewActivity.this.N3(parse);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<View, v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            TransparentLiveGameWebViewActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$onCreate$3", f = "TransparentLiveGameWebViewActivity.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21603w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TransparentLiveGameWebViewActivity f21605w;

            public a(TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity) {
                this.f21605w = transparentLiveGameWebViewActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                this.f21605w.finish();
                return v.f59242a;
            }
        }

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21603w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<v> m10 = TransparentLiveGameWebViewActivity.this.H3().m();
                a aVar = new a(TransparentLiveGameWebViewActivity.this);
                this.f21603w = 1;
                if (m10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$onCreate$4", f = "TransparentLiveGameWebViewActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21606w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TransparentLiveGameWebViewActivity f21608w;

            public a(TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity) {
                this.f21608w = transparentLiveGameWebViewActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                this.f21608w.finish();
                return v.f59242a;
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21606w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<v> o10 = TransparentLiveGameWebViewActivity.this.H3().o();
                a aVar = new a(TransparentLiveGameWebViewActivity.this);
                this.f21606w = 1;
                if (o10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$onCreate$5", f = "TransparentLiveGameWebViewActivity.kt", l = {141}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21609w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<LiveDetailResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TransparentLiveGameWebViewActivity f21611w;

            public a(TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity) {
                this.f21611w = transparentLiveGameWebViewActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveDetailResponse liveDetailResponse, ao.d<? super v> dVar) {
                if (liveDetailResponse.isLive()) {
                    tb.c G3 = this.f21611w.G3();
                    TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity = this.f21611w;
                    String liveId = liveDetailResponse.getLiveId();
                    String K3 = this.f21611w.K3();
                    jo.p.g(K3, "referer");
                    Intent f10 = c.a.f(G3, transparentLiveGameWebViewActivity, liveId, K3, null, null, false, false, false, false, this.f21611w.E3(), 488, null);
                    f10.addFlags(335544320);
                    this.f21611w.startActivity(f10);
                    this.f21611w.finish();
                } else {
                    t1.a aVar = t1.f61795x;
                    TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity2 = this.f21611w;
                    String string = transparentLiveGameWebViewActivity2.getString(f1.error_broadcast_is_already_finished);
                    jo.p.g(string, "getString(com.dena.mirro…cast_is_already_finished)");
                    aVar.a(transparentLiveGameWebViewActivity2, string);
                    this.f21611w.finish();
                }
                return v.f59242a;
            }
        }

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21609w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<LiveDetailResponse> l10 = TransparentLiveGameWebViewActivity.this.H3().l();
                a aVar = new a(TransparentLiveGameWebViewActivity.this);
                this.f21609w = 1;
                if (l10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$onCreate$6", f = "TransparentLiveGameWebViewActivity.kt", l = {170}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21612w;

        @co.f(c = "com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$onCreate$6$1", f = "TransparentLiveGameWebViewActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.q<GiftItem, LiveGameInterruptibleBcsvrResponse, ao.d<? super GiftItem>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f21614w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f21615x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f21616y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ TransparentLiveGameWebViewActivity f21617z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity, ao.d<? super a> dVar) {
                super(3, dVar);
                this.f21617z = transparentLiveGameWebViewActivity;
            }

            @Override // io.q
            /* renamed from: a */
            public final Object s0(GiftItem giftItem, LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse, ao.d<? super GiftItem> dVar) {
                a aVar = new a(this.f21617z, dVar);
                aVar.f21615x = giftItem;
                aVar.f21616y = liveGameInterruptibleBcsvrResponse;
                return aVar.invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f21614w == 0) {
                    wn.m.b(obj);
                    GiftItem giftItem = (GiftItem) this.f21615x;
                    LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse = (LiveGameInterruptibleBcsvrResponse) this.f21616y;
                    if (giftItem != null && liveGameInterruptibleBcsvrResponse.getInterruptible() && this.f21617z.a3().e0("LiveGameRankUpDialogFragment") == null) {
                        return giftItem;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements xo.d<GiftItem> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TransparentLiveGameWebViewActivity f21618w;

            @co.f(c = "com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$onCreate$6$2", f = "TransparentLiveGameWebViewActivity.kt", l = {176}, m = "emit")
            /* loaded from: classes.dex */
            public static final class a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f21619w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f21620x;

                /* renamed from: z  reason: collision with root package name */
                public int f21622z;

                public a(ao.d<? super a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f21620x = obj;
                    this.f21622z |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(TransparentLiveGameWebViewActivity transparentLiveGameWebViewActivity) {
                this.f21618w = transparentLiveGameWebViewActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(com.dena.mirrorman.net.bcsvr.response.GiftItem r8, ao.d<? super wn.v> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity.k.b.a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$k$b$a r0 = (com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity.k.b.a) r0
                    int r1 = r0.f21622z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f21622z = r1
                    goto L18
                L13:
                    com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$k$b$a r0 = new com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity$k$b$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f21620x
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f21622z
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r8 = r0.f21619w
                    com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity r8 = (com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity) r8
                    wn.m.b(r9)
                    goto L92
                L2d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L35:
                    wn.m.b(r9)
                    if (r8 != 0) goto L3d
                    wn.v r8 = wn.v.f59242a
                    return r8
                L3d:
                    java.lang.String r9 = r8.getLiveSentGiftId()
                    if (r9 != 0) goto L46
                    wn.v r8 = wn.v.f59242a
                    return r8
                L46:
                    java.util.List r2 = r8.getRankings()
                    java.util.Iterator r2 = r2.iterator()
                L4e:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L62
                    java.lang.Object r4 = r2.next()
                    r5 = r4
                    com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse r5 = (com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse) r5
                    boolean r5 = r5.isAppEventRankUp()
                    if (r5 == 0) goto L4e
                    goto L63
                L62:
                    r4 = 0
                L63:
                    com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse r4 = (com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse) r4
                    if (r4 == 0) goto L9c
                    int r2 = r4.getEventId()
                    com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity r4 = r7.f21618w
                    java.lang.String r4 = com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity.B3(r4)
                    if (r4 == 0) goto L99
                    com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity r5 = r7.f21618w
                    be.w2$a r6 = be.w2.S0
                    be.w2 r8 = r6.a(r2, r8, r4, r9)
                    androidx.fragment.app.FragmentManager r9 = r5.a3()
                    java.lang.String r2 = "supportFragmentManager"
                    jo.p.g(r9, r2)
                    r0.f21619w = r5
                    r0.f21622z = r3
                    java.lang.String r2 = "LiveGameRankUpDialogFragment"
                    java.lang.Object r8 = r8.J3(r9, r2, r0)
                    if (r8 != r1) goto L91
                    return r1
                L91:
                    r8 = r5
                L92:
                    pa.a r8 = com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity.x3(r8)
                    r8.e()
                L99:
                    wn.v r8 = wn.v.f59242a
                    return r8
                L9c:
                    wn.v r8 = wn.v.f59242a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity.k.b.emit(com.dena.mirrorman.net.bcsvr.response.GiftItem, ao.d):java.lang.Object");
            }
        }

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21612w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c h10 = xo.e.h(TransparentLiveGameWebViewActivity.this.H3().k(), TransparentLiveGameWebViewActivity.this.H3().n(), new a(TransparentLiveGameWebViewActivity.this, null));
                b bVar = new b(TransparentLiveGameWebViewActivity.this);
                this.f21612w = 1;
                if (h10.a(bVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<String> {
        public l() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = TransparentLiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_PLAY_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<String> {
        public m() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = TransparentLiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21625w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21626x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21627y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21625w = componentCallbacks;
            this.f21626x = aVar;
            this.f21627y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f21625w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f21626x, this.f21627y);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<pa.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21628w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21629x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21630y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21628w = componentCallbacks;
            this.f21629x = aVar;
            this.f21630y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [pa.a, java.lang.Object] */
        @Override // io.a
        public final pa.a invoke() {
            ComponentCallbacks componentCallbacks = this.f21628w;
            return gq.a.a(componentCallbacks).c(f0.b(pa.a.class), this.f21629x, this.f21630y);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<pa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21631w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21632x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21633y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21631w = componentCallbacks;
            this.f21632x = aVar;
            this.f21633y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [pa.c, java.lang.Object] */
        @Override // io.a
        public final pa.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21631w;
            return gq.a.a(componentCallbacks).c(f0.b(pa.c.class), this.f21632x, this.f21633y);
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21634w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21635x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21636y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21634w = componentCallbacks;
            this.f21635x = aVar;
            this.f21636y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21634w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f21635x, this.f21636y);
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21637w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21638x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21639y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21637w = componentCallbacks;
            this.f21638x = aVar;
            this.f21639y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21637w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21638x, this.f21639y);
        }
    }

    public TransparentLiveGameWebViewActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.W = wn.g.b(iVar, new n(this, null, null));
        this.X = wn.g.b(iVar, new o(this, null, null));
        this.Y = wn.g.b(iVar, new p(this, null, null));
        this.Z = wn.g.b(iVar, new q(this, null, null));
        this.f21596a0 = wn.g.b(iVar, new r(this, null, null));
    }

    public final pa.a D3() {
        return (pa.a) this.X.getValue();
    }

    public final String E3() {
        return (String) this.Q.getValue();
    }

    public final String F3() {
        return (String) this.R.getValue();
    }

    public final tb.c G3() {
        return (tb.c) this.f21596a0.getValue();
    }

    public final pa.c H3() {
        return (pa.c) this.Y.getValue();
    }

    public final String I3() {
        return (String) this.U.getValue();
    }

    public final String J3() {
        return (String) this.S.getValue();
    }

    public final String K3() {
        return (String) this.P.getValue();
    }

    public final of.k L3() {
        return (of.k) this.Z.getValue();
    }

    public final x M3() {
        return (x) this.W.getValue();
    }

    public final void N3(Uri uri) {
        if (uri == null) {
            return;
        }
        String uri2 = uri.toString();
        jo.p.g(uri2, "uri.toString()");
        b0 a10 = L3().a(uri2);
        if (a10 instanceof b0.j0) {
            finish();
        } else if (a10 instanceof b0.v) {
            D3().d(Referer.LIVE_GAME, ((b0.v) a10).b());
        } else {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_GAME, a10));
            finish();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void O3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
    }

    public final boolean P3() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i0 i0Var) {
        jo.p.h(i0Var, "event");
        if (jo.p.c(i0Var.a(), "PlayerService") && i0Var.b().getUserIds().contains(M3().T4())) {
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        dq.c.c().p(this);
        setRequestedOrientation(P3() ? 6 : 1);
        ViewDataBinding g10 = androidx.databinding.f.g(this, ja.m.activity_live_game_web_view);
        jo.p.g(g10, "setContentView(this, R.l…ivity_live_game_web_view)");
        ka.e eVar = (ka.e) g10;
        this.V = eVar;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.E.requestFocus();
        ka.e eVar2 = this.V;
        if (eVar2 == null) {
            jo.p.v("binding");
            eVar2 = null;
        }
        eVar2.E.setBackgroundColor(0);
        ka.e eVar3 = this.V;
        if (eVar3 == null) {
            jo.p.v("binding");
            eVar3 = null;
        }
        eVar3.E.setWebViewClient(new f());
        ka.e eVar4 = this.V;
        if (eVar4 == null) {
            jo.p.v("binding");
            eVar4 = null;
        }
        eVar4.E.loadUrl(F3());
        ka.e eVar5 = this.V;
        if (eVar5 == null) {
            jo.p.v("binding");
            eVar5 = null;
        }
        AppCompatImageView appCompatImageView = eVar5.B;
        jo.p.g(appCompatImageView, "binding.closeButtonImageView");
        g1.a(appCompatImageView, new g());
        ka.e eVar6 = this.V;
        if (eVar6 == null) {
            jo.p.v("binding");
            eVar6 = null;
        }
        WebSettings settings = eVar6.E.getSettings();
        jo.p.g(settings, "binding.webView.settings");
        O3(settings);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebViewActivity.X.c(false);
        ka.e eVar = this.V;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.E.destroy();
        uo.r0.d(this, null, 1, null);
        dq.c.c().r(this);
        pa.a D3 = D3();
        String K3 = K3();
        jo.p.g(K3, "referer");
        String J3 = J3();
        jo.p.g(J3, "playId");
        D3.c(K3, J3, I3());
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        D3().g();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        pa.a D3 = D3();
        String K3 = K3();
        jo.p.g(K3, "referer");
        String J3 = J3();
        jo.p.g(J3, "playId");
        D3.f(K3, J3, I3());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.j0 j0Var) {
        jo.p.h(j0Var, "event");
        if (jo.p.c(j0Var.a(), "PlayerService")) {
            finish();
        }
    }
}
