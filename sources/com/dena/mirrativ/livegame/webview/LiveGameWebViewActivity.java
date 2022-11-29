package com.dena.mirrativ.livegame.webview;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import ce.l;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.LiveGameInterruptibleBcsvrResponse;
import ie.f;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.b0;
import jo.f0;
import kf.x;
import kotlin.KotlinNothingValueException;
import nd.f1;
import nd.r0;
import org.greenrobot.eventbus.ThreadMode;
import tb.c;
import uo.b1;
import uo.q0;
import wn.v;
import xo.w;
import yd.g1;
import yd.t1;

/* loaded from: classes.dex */
public final class LiveGameWebViewActivity extends e.b implements f.b, q0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f21544b0 = new a(null);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f21545c0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new o());
    public final wn.f Q = wn.g.a(new b());
    public final wn.f R = wn.g.a(new c());
    public final wn.f S = wn.g.a(new n());
    public final wn.f T = wn.g.a(new d());
    public final wn.f U = wn.g.a(new e());
    public ka.e V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21546a0;

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
            Intent intent = new Intent(context, LiveGameWebViewActivity.class);
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
            String stringExtra = LiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_GAME_ID");
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
            String stringExtra = LiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_GAME_URL");
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
            return Boolean.valueOf(LiveGameWebViewActivity.this.getIntent().getBooleanExtra("EXTRA_IS_LAND_SCAPE", false));
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
            return LiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_LIVE_ID");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends WebChromeClient {
        public f() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            if (80 <= i10) {
                ka.e eVar = LiveGameWebViewActivity.this.V;
                if (eVar == null) {
                    jo.p.v("binding");
                    eVar = null;
                }
                eVar.D.b(StatusView.b.c.f20791w);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, mm.c> f21552a = new LinkedHashMap();

        public g() {
        }

        public final mm.c a(String str) {
            if (str == null) {
                return null;
            }
            if (this.f21552a.containsKey(str)) {
                return this.f21552a.get(str);
            }
            mm.c e10 = gm.c.c().e(str, "GET");
            jo.p.g(e10, "getInstance().newHttpMet…rformance.HttpMethod.GET)");
            e10.b("userId", LiveGameWebViewActivity.this.Q3().T4());
            e10.c(200);
            this.f21552a.put(str, e10);
            return e10;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            mm.c a10 = a(str);
            if (a10 == null) {
                return;
            }
            a10.f();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            mm.c a10 = a(str);
            if (a10 == null) {
                return;
            }
            a10.e();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String mimeType;
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            boolean z10 = true;
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                z10 = false;
            }
            if (z10) {
                Uri url = webResourceRequest.getUrl();
                mm.c a10 = a(url != null ? url.toString() : null);
                if (a10 == null) {
                    return;
                }
                if (webResourceResponse != null) {
                    a10.c(webResourceResponse.getStatusCode());
                }
                if (webResourceResponse == null || (mimeType = webResourceResponse.getMimeType()) == null) {
                    return;
                }
                a10.d(mimeType);
            }
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
                LiveGameWebViewActivity.this.R3(parse);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<View, v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            f.a aVar = ie.f.V0;
            String string = LiveGameWebViewActivity.this.getString(f1.text_live_game_confirm_close);
            jo.p.g(string, "getString(com.dena.mirro…_live_game_confirm_close)");
            f.a.b(aVar, string, LiveGameWebViewActivity.this.getString(f1.X1), LiveGameWebViewActivity.this.getString(f1.f41995w0), null, false, 24, null).z3(LiveGameWebViewActivity.this.a3(), "CustomYesNoDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$4", f = "LiveGameWebViewActivity.kt", l = {198}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21555w;

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
            int i10 = this.f21555w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (LiveGameWebViewActivity.this.T3()) {
                    this.f21555w = 1;
                    if (b1.a(1000L, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            ka.e eVar = LiveGameWebViewActivity.this.V;
            if (eVar == null) {
                jo.p.v("binding");
                eVar = null;
            }
            eVar.E.loadUrl(LiveGameWebViewActivity.this.J3());
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$5", f = "LiveGameWebViewActivity.kt", l = {204}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21557w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameWebViewActivity f21559w;

            public a(LiveGameWebViewActivity liveGameWebViewActivity) {
                this.f21559w = liveGameWebViewActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                this.f21559w.finish();
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
            int i10 = this.f21557w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<v> m10 = LiveGameWebViewActivity.this.L3().m();
                a aVar = new a(LiveGameWebViewActivity.this);
                this.f21557w = 1;
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

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$6", f = "LiveGameWebViewActivity.kt", l = {211}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21560w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameWebViewActivity f21562w;

            public a(LiveGameWebViewActivity liveGameWebViewActivity) {
                this.f21562w = liveGameWebViewActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                this.f21562w.finish();
                return v.f59242a;
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
            int i10 = this.f21560w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<v> o10 = LiveGameWebViewActivity.this.L3().o();
                a aVar = new a(LiveGameWebViewActivity.this);
                this.f21560w = 1;
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

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$7", f = "LiveGameWebViewActivity.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21563w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<LiveDetailResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameWebViewActivity f21565w;

            public a(LiveGameWebViewActivity liveGameWebViewActivity) {
                this.f21565w = liveGameWebViewActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveDetailResponse liveDetailResponse, ao.d<? super v> dVar) {
                if (liveDetailResponse.isLive()) {
                    tb.c K3 = this.f21565w.K3();
                    LiveGameWebViewActivity liveGameWebViewActivity = this.f21565w;
                    String liveId = liveDetailResponse.getLiveId();
                    String O3 = this.f21565w.O3();
                    jo.p.g(O3, "referer");
                    Intent f10 = c.a.f(K3, liveGameWebViewActivity, liveId, O3, null, null, false, false, false, false, this.f21565w.I3(), 488, null);
                    f10.addFlags(335544320);
                    this.f21565w.startActivity(f10);
                    this.f21565w.finish();
                } else {
                    t1.a aVar = t1.f61795x;
                    LiveGameWebViewActivity liveGameWebViewActivity2 = this.f21565w;
                    String string = liveGameWebViewActivity2.getString(f1.error_broadcast_is_already_finished);
                    jo.p.g(string, "getString(com.dena.mirro…cast_is_already_finished)");
                    aVar.a(liveGameWebViewActivity2, string);
                    this.f21565w.finish();
                }
                return v.f59242a;
            }
        }

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21563w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<LiveDetailResponse> l10 = LiveGameWebViewActivity.this.L3().l();
                a aVar = new a(LiveGameWebViewActivity.this);
                this.f21563w = 1;
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

    @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$8", f = "LiveGameWebViewActivity.kt", l = {246}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21566w;

        @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$8$1", f = "LiveGameWebViewActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.q<GiftItem, LiveGameInterruptibleBcsvrResponse, ao.d<? super GiftItem>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f21568w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f21569x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f21570y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ LiveGameWebViewActivity f21571z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LiveGameWebViewActivity liveGameWebViewActivity, ao.d<? super a> dVar) {
                super(3, dVar);
                this.f21571z = liveGameWebViewActivity;
            }

            @Override // io.q
            /* renamed from: a */
            public final Object s0(GiftItem giftItem, LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse, ao.d<? super GiftItem> dVar) {
                a aVar = new a(this.f21571z, dVar);
                aVar.f21569x = giftItem;
                aVar.f21570y = liveGameInterruptibleBcsvrResponse;
                return aVar.invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f21568w == 0) {
                    wn.m.b(obj);
                    GiftItem giftItem = (GiftItem) this.f21569x;
                    LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse = (LiveGameInterruptibleBcsvrResponse) this.f21570y;
                    if (giftItem != null && liveGameInterruptibleBcsvrResponse.getInterruptible() && this.f21571z.a3().e0("LiveGameRankUpDialogFragment") == null) {
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
            public final /* synthetic */ LiveGameWebViewActivity f21572w;

            @co.f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$onCreate$8$2", f = "LiveGameWebViewActivity.kt", l = {252}, m = "emit")
            /* loaded from: classes.dex */
            public static final class a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f21573w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f21574x;

                /* renamed from: z  reason: collision with root package name */
                public int f21576z;

                public a(ao.d<? super a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f21574x = obj;
                    this.f21576z |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(LiveGameWebViewActivity liveGameWebViewActivity) {
                this.f21572w = liveGameWebViewActivity;
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
                    boolean r0 = r9 instanceof com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity.m.b.a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$m$b$a r0 = (com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity.m.b.a) r0
                    int r1 = r0.f21576z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f21576z = r1
                    goto L18
                L13:
                    com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$m$b$a r0 = new com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity$m$b$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f21574x
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f21576z
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r8 = r0.f21573w
                    com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity r8 = (com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity) r8
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
                    com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity r4 = r7.f21572w
                    java.lang.String r4 = com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity.D3(r4)
                    if (r4 == 0) goto L99
                    com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity r5 = r7.f21572w
                    be.w2$a r6 = be.w2.S0
                    be.w2 r8 = r6.a(r2, r8, r4, r9)
                    androidx.fragment.app.FragmentManager r9 = r5.a3()
                    java.lang.String r2 = "supportFragmentManager"
                    jo.p.g(r9, r2)
                    r0.f21573w = r5
                    r0.f21576z = r3
                    java.lang.String r2 = "LiveGameRankUpDialogFragment"
                    java.lang.Object r8 = r8.J3(r9, r2, r0)
                    if (r8 != r1) goto L91
                    return r1
                L91:
                    r8 = r5
                L92:
                    pa.a r8 = com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity.x3(r8)
                    r8.e()
                L99:
                    wn.v r8 = wn.v.f59242a
                    return r8
                L9c:
                    wn.v r8 = wn.v.f59242a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity.m.b.emit(com.dena.mirrorman.net.bcsvr.response.GiftItem, ao.d):java.lang.Object");
            }
        }

        public m(ao.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new m(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21566w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c h10 = xo.e.h(LiveGameWebViewActivity.this.L3().k(), LiveGameWebViewActivity.this.L3().n(), new a(LiveGameWebViewActivity.this, null));
                b bVar = new b(LiveGameWebViewActivity.this);
                this.f21566w = 1;
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
    public static final class n extends jo.q implements io.a<String> {
        public n() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = LiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_PLAY_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<String> {
        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = LiveGameWebViewActivity.this.getIntent().getStringExtra("EXTRA_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21579w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21580x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21581y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21579w = componentCallbacks;
            this.f21580x = aVar;
            this.f21581y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f21579w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f21580x, this.f21581y);
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<pa.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21582w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21583x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21582w = componentCallbacks;
            this.f21583x = aVar;
            this.f21584y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [pa.a, java.lang.Object] */
        @Override // io.a
        public final pa.a invoke() {
            ComponentCallbacks componentCallbacks = this.f21582w;
            return gq.a.a(componentCallbacks).c(f0.b(pa.a.class), this.f21583x, this.f21584y);
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<pa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21585w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21586x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21587y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21585w = componentCallbacks;
            this.f21586x = aVar;
            this.f21587y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [pa.c, java.lang.Object] */
        @Override // io.a
        public final pa.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21585w;
            return gq.a.a(componentCallbacks).c(f0.b(pa.c.class), this.f21586x, this.f21587y);
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21588w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21589x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21590y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21588w = componentCallbacks;
            this.f21589x = aVar;
            this.f21590y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21588w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f21589x, this.f21590y);
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21591w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21592x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21593y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21591w = componentCallbacks;
            this.f21592x = aVar;
            this.f21593y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21591w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21592x, this.f21593y);
        }
    }

    public LiveGameWebViewActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.W = wn.g.b(iVar, new p(this, null, null));
        this.X = wn.g.b(iVar, new q(this, null, null));
        this.Y = wn.g.b(iVar, new r(this, null, null));
        this.Z = wn.g.b(iVar, new s(this, null, null));
        this.f21546a0 = wn.g.b(iVar, new t(this, null, null));
    }

    public final pa.a H3() {
        return (pa.a) this.X.getValue();
    }

    public final String I3() {
        return (String) this.Q.getValue();
    }

    public final String J3() {
        return (String) this.R.getValue();
    }

    public final tb.c K3() {
        return (tb.c) this.f21546a0.getValue();
    }

    public final pa.c L3() {
        return (pa.c) this.Y.getValue();
    }

    public final String M3() {
        return (String) this.U.getValue();
    }

    public final String N3() {
        return (String) this.S.getValue();
    }

    public final String O3() {
        return (String) this.P.getValue();
    }

    public final of.k P3() {
        return (of.k) this.Z.getValue();
    }

    public final x Q3() {
        return (x) this.W.getValue();
    }

    public final void R3(Uri uri) {
        if (uri == null) {
            return;
        }
        String uri2 = uri.toString();
        jo.p.g(uri2, "uri.toString()");
        b0 a10 = P3().a(uri2);
        if (a10 instanceof b0.k0) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_GAME, a10));
        } else if (a10 instanceof b0.j0) {
            finish();
        } else if (a10 instanceof b0.v) {
            H3().d(Referer.LIVE_GAME, ((b0.v) a10).b());
        } else if (a10 instanceof b0.w) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_GAME, a10));
        } else {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_GAME, a10));
            finish();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void S3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
    }

    public final boolean T3() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        finish();
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    @Override // android.app.Activity
    public void finish() {
        pa.a H3 = H3();
        String O3 = O3();
        jo.p.g(O3, "referer");
        String N3 = N3();
        jo.p.g(N3, "playId");
        H3.c(O3, N3, M3());
        super.finish();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i0 i0Var) {
        jo.p.h(i0Var, "event");
        if (jo.p.c(i0Var.a(), "PlayerService") && i0Var.b().getUserIds().contains(Q3().T4())) {
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dq.c.c().p(this);
        setRequestedOrientation(T3() ? 6 : 1);
        ViewDataBinding g10 = androidx.databinding.f.g(this, ja.m.activity_live_game_web_view);
        jo.p.g(g10, "setContentView(this, R.l…ivity_live_game_web_view)");
        ka.e eVar = (ka.e) g10;
        this.V = eVar;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.D.b(StatusView.b.C0181b.f20790w);
        ka.e eVar2 = this.V;
        if (eVar2 == null) {
            jo.p.v("binding");
            eVar2 = null;
        }
        eVar2.E.requestFocus();
        ka.e eVar3 = this.V;
        if (eVar3 == null) {
            jo.p.v("binding");
            eVar3 = null;
        }
        eVar3.E.setWebChromeClient(new f());
        ka.e eVar4 = this.V;
        if (eVar4 == null) {
            jo.p.v("binding");
            eVar4 = null;
        }
        eVar4.E.setWebViewClient(new g());
        ka.e eVar5 = this.V;
        if (eVar5 == null) {
            jo.p.v("binding");
            eVar5 = null;
        }
        AppCompatImageView appCompatImageView = eVar5.B;
        jo.p.g(appCompatImageView, "binding.closeButtonImageView");
        g1.a(appCompatImageView, new h());
        ka.e eVar6 = this.V;
        if (eVar6 == null) {
            jo.p.v("binding");
            eVar6 = null;
        }
        WebSettings settings = eVar6.E.getSettings();
        jo.p.g(settings, "binding.webView.settings");
        S3(settings);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new m(null), 3, null);
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
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        H3().g();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        pa.a H3 = H3();
        String O3 = O3();
        jo.p.g(O3, "referer");
        String N3 = N3();
        jo.p.g(N3, "playId");
        H3.f(O3, N3, M3());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.j0 j0Var) {
        jo.p.h(j0Var, "event");
        if (jo.p.c(j0Var.a(), "PlayerService")) {
            finish();
        }
    }
}
