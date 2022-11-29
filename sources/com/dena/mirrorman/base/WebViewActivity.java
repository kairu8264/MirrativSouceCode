package com.dena.mirrorman.base;

import ae.c0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ce.v;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.api.Referer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.b0;
import jo.f0;
import jo.p;
import jo.q;
import kf.x;
import nd.b1;
import nd.r0;
import of.k;
import of.n;
import so.o;
import tb.c;
import xn.n0;

/* loaded from: classes2.dex */
public final class WebViewActivity extends e.b {
    public static final a X = new a(null);
    public static final int Y = 8;
    public static boolean Z;
    public final wn.f O = wn.g.a(new b());
    public final wn.f P = wn.g.a(new c());
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public boolean U;
    public boolean V;
    public Intent W;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                z11 = false;
            }
            return aVar.a(context, str, z10, z11);
        }

        public final Intent a(Context context, String str, boolean z10, boolean z11) {
            p.h(context, "context");
            p.h(str, "url");
            Intent intent = new Intent(context, WebViewActivity.class);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            intent.putExtra("extra_url", str);
            intent.putExtra("disable_close", z10);
            intent.putExtra("finish_at_onPause", z11);
            return intent;
        }

        public final void c(boolean z10) {
            WebViewActivity.Z = z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<c0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            WebViewActivity.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final c0 invoke() {
            return (c0) androidx.databinding.f.g(WebViewActivity.this, b1.activity_webview);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<HashMap<String, String>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            WebViewActivity.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final HashMap<String, String> invoke() {
            return n0.g(wn.q.a("x-idfv", n.c(WebViewActivity.this)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends WebChromeClient {
        public d() {
            WebViewActivity.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            if (80 <= i10) {
                WebViewActivity.this.F3().B.b(StatusView.b.c.f20791w);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends WebViewClient {

        /* renamed from: a */
        public final Map<String, mm.c> f25278a = new LinkedHashMap();

        /* renamed from: b */
        public final /* synthetic */ String f25279b;

        /* renamed from: c */
        public final /* synthetic */ WebViewActivity f25280c;

        /* renamed from: d */
        public final /* synthetic */ String f25281d;

        /* renamed from: e */
        public final /* synthetic */ androidx.activity.result.c<Intent> f25282e;

        public e(String str, WebViewActivity webViewActivity, String str2, androidx.activity.result.c<Intent> cVar) {
            this.f25279b = str;
            this.f25280c = webViewActivity;
            this.f25281d = str2;
            this.f25282e = cVar;
        }

        public final mm.c a(String str) {
            if (str == null) {
                return null;
            }
            if (this.f25278a.containsKey(str)) {
                return this.f25278a.get(str);
            }
            mm.c e10 = gm.c.c().e(str, "GET");
            p.g(e10, "getInstance().newHttpMet…rformance.HttpMethod.GET)");
            e10.b("userId", this.f25280c.K3().T4());
            e10.c(200);
            this.f25278a.put(str, e10);
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
            mm.c a10;
            String mimeType;
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            boolean z10 = true;
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                z10 = false;
            }
            if (!z10 || (a10 = a(this.f25279b)) == null) {
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

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            p.h(webView, "view");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("webview redirect url:");
            p.e(str);
            sb2.append(str);
            g9.a.g(sb2.toString());
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String scheme = parse.getScheme();
            if (o.H(str, "callback://mirror.dena", false, 2, null)) {
                String queryParameter = parse.getQueryParameter("oauth_verifier");
                if (!TextUtils.isEmpty(queryParameter) && !parse.getQueryParameterNames().contains("denied")) {
                    Intent intent = this.f25280c.W;
                    if (intent != null) {
                        intent.putExtra("oauth_verifier", queryParameter);
                    }
                    Intent intent2 = this.f25280c.W;
                    if (intent2 != null) {
                        intent2.putExtra("referer_detail_twitter", this.f25281d);
                    }
                    WebViewActivity webViewActivity = this.f25280c;
                    webViewActivity.setResult(-1, webViewActivity.W);
                    this.f25280c.finish();
                    return true;
                }
                this.f25280c.setResult(0);
                this.f25280c.finish();
                return true;
            } else if ((so.n.C(str, "http:", false, 2, null) || so.n.C(str, "https:", false, 2, null)) && this.f25280c.I3().checkDomainWhiteList(host)) {
                String b10 = n.f45411a.b(this.f25280c.I3(), str);
                g9.a.g("webview url+auth:" + b10);
                if (b10 != null) {
                    webView.loadUrl(b10, this.f25280c.G3());
                }
                return false;
            } else {
                p.e(scheme);
                if (so.n.q("mirr", scheme, true)) {
                    r0.f42205a.b().a(str);
                    this.f25280c.L3(parse);
                    return true;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                List<ResolveInfo> queryIntentActivities = this.f25280c.getPackageManager().queryIntentActivities(intent3, 0);
                p.g(queryIntentActivities, "pm.queryIntentActivities(intent, 0)");
                if (queryIntentActivities.size() >= 1) {
                    this.f25282e.a(intent3);
                }
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<k> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f25283w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f25284x;

        /* renamed from: y */
        public final /* synthetic */ io.a f25285y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25283w = componentCallbacks;
            this.f25284x = aVar;
            this.f25285y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f25283w;
            return gq.a.a(componentCallbacks).c(f0.b(k.class), this.f25284x, this.f25285y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<ServerConfig> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f25286w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f25287x;

        /* renamed from: y */
        public final /* synthetic */ io.a f25288y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25286w = componentCallbacks;
            this.f25287x = aVar;
            this.f25288y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f25286w;
            return gq.a.a(componentCallbacks).c(f0.b(ServerConfig.class), this.f25287x, this.f25288y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<x> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f25289w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f25290x;

        /* renamed from: y */
        public final /* synthetic */ io.a f25291y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25289w = componentCallbacks;
            this.f25290x = aVar;
            this.f25291y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f25289w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f25290x, this.f25291y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<tb.c> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f25292w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f25293x;

        /* renamed from: y */
        public final /* synthetic */ io.a f25294y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25292w = componentCallbacks;
            this.f25293x = aVar;
            this.f25294y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25292w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25293x, this.f25294y);
        }
    }

    public WebViewActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q = wn.g.b(iVar, new f(this, null, null));
        this.R = wn.g.b(iVar, new g(this, null, null));
        this.S = wn.g.b(iVar, new h(this, null, null));
        this.T = wn.g.b(iVar, new i(this, null, null));
    }

    public static final void O3(WebViewActivity webViewActivity, androidx.activity.result.a aVar) {
        p.h(webViewActivity, "this$0");
        webViewActivity.finish();
    }

    public final void E3(String str) {
        ApiUtil apiUtil = ApiUtil.INSTANCE;
        boolean z10 = false;
        Z = (o.H(str, apiUtil.urlForceUpdate(I3()), false, 2, null) || o.H(str, apiUtil.urlMaintenance(I3()), false, 2, null)) ? true : true;
    }

    public final c0 F3() {
        Object value = this.O.getValue();
        p.g(value, "<get-binding>(...)");
        return (c0) value;
    }

    public final HashMap<String, String> G3() {
        return (HashMap) this.P.getValue();
    }

    public final tb.c H3() {
        return (tb.c) this.T.getValue();
    }

    public final ServerConfig I3() {
        return (ServerConfig) this.R.getValue();
    }

    public final k J3() {
        return (k) this.Q.getValue();
    }

    public final x K3() {
        return (x) this.S.getValue();
    }

    public final void L3(Uri uri) {
        if (uri == null) {
            return;
        }
        String uri2 = uri.toString();
        p.g(uri2, "uri.toString()");
        b0 a10 = J3().a(uri2);
        if (a10 instanceof b0.j0) {
            finish();
        } else if (a10 instanceof b0.i0) {
            b0.i0 i0Var = (b0.i0) a10;
            if (i0Var.c()) {
                tb.a i10 = c.a.i(H3(), i0Var.b(), Referer.WEBVIEW, true, false, 8, null);
                i10.a().z3(a3(), i10.b());
                return;
            }
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.WEBVIEW, a10));
        } else {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.WEBVIEW, a10));
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void M3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }

    public final void N3(String str) {
        String b10 = n.f45411a.b(I3(), str);
        if (b10 != null) {
            F3().C.loadUrl(b10, G3());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (F3().C.canGoBack()) {
            F3().C.goBack();
        } else if (this.U) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(3);
        this.W = getIntent();
        String stringExtra = getIntent().getStringExtra("extra_url");
        p.e(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("referer_detail_twitter");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        g9.a.g("webview url:" + stringExtra);
        this.U = getIntent().getBooleanExtra("disable_close", false);
        this.V = getIntent().getBooleanExtra("finish_at_onPause", false);
        E3(stringExtra);
        WebSettings settings = F3().C.getSettings();
        p.g(settings, "binding.webView.settings");
        M3(settings);
        androidx.activity.result.c V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: sd.c
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                WebViewActivity.O3(WebViewActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul…       finish()\n        }");
        F3().B.b(StatusView.b.C0181b.f20790w);
        F3().C.setLayerType(2, null);
        F3().C.setWebChromeClient(new d());
        F3().C.setWebViewClient(new e(stringExtra, this, stringExtra2, V2));
        N3(stringExtra);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        F3().C.destroy();
        Z = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        dq.c.c().l(new v());
        if (this.V) {
            finish();
        }
    }
}
