package nd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import oq.a;

/* loaded from: classes2.dex */
public final class j1 extends WebViewClient implements uo.q0, oq.a {
    public static final a B = new a(null);
    public static final int C = 8;
    public String A;

    /* renamed from: w  reason: collision with root package name */
    public final hf.r f42182w;

    /* renamed from: x  reason: collision with root package name */
    public final kf.x f42183x;

    /* renamed from: y  reason: collision with root package name */
    public final MRLogger f42184y;

    /* renamed from: z  reason: collision with root package name */
    public WebView f42185z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.SpeedTestClient$callbackHandler$2", f = "SpeedTestClient.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42186w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42186w == 0) {
                wn.m.b(obj);
                j1.this.g();
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.SpeedTestClient$onReceivedError$1", f = "SpeedTestClient.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42188w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42188w == 0) {
                wn.m.b(obj);
                j1.this.g();
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.SpeedTestClient$startTracking$1", f = "SpeedTestClient.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42190w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f42192y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f42193z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42192y = context;
            this.f42193z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42192y, this.f42193z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42190w == 0) {
                wn.m.b(obj);
                j1.this.d(this.f42192y, this.f42193z);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public j1(hf.r rVar, kf.x xVar, MRLogger mRLogger) {
        jo.p.h(rVar, "featureHelper");
        jo.p.h(xVar, "userPreference");
        jo.p.h(mRLogger, "logger");
        this.f42182w = rVar;
        this.f42183x = xVar;
        this.f42184y = mRLogger;
    }

    public final boolean c() {
        return 21600 <= ((int) (System.currentTimeMillis() / 1000)) - this.f42182w.j();
    }

    @JavascriptInterface
    public final void callbackHandler(String str) {
        jo.p.h(str, "value");
        Log.d(j1.class.getName() + "#callbackHandler", str);
        MRLogger mRLogger = this.f42184y;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SPPEDTEST);
        builder.setTargetType(MRLog.TARGET_TYPE_USER);
        builder.setTargetId(this.f42183x.T4());
        builder.setPageId(this.A);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str)));
        mRLogger.sendLog(builder.build());
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void d(Context context, String str) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        WebView webView = new WebView(context);
        webView.setWebViewClient(this);
        webView.addJavascriptInterface(this, "Android");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString(ApiUtil.INSTANCE.userAgent());
        webView.loadUrl("https://speed.mirrativ.com/?t=" + currentTimeMillis);
        this.f42185z = webView;
        this.f42182w.u(currentTimeMillis);
        Log.d(j1.class.getName(), "startTracking");
    }

    public final void f(Context context, String str) {
        jo.p.h(context, "context");
        jo.p.h(str, "referer");
        String name = j1.class.getName();
        Log.d(name, "speedtest=" + this.f42182w.i() + ",elapsed=" + c());
        if (this.f42185z == null && this.f42182w.i() && c()) {
            this.A = str;
            uo.l.d(this, null, null, new d(context, str, null), 3, null);
        }
    }

    public final void g() {
        if (this.f42185z == null) {
            return;
        }
        Log.d(j1.class.getName(), "stopTracking");
        WebView webView = this.f42185z;
        if (webView != null) {
            webView.removeJavascriptInterface("Android");
        }
        WebView webView2 = this.f42185z;
        if (webView2 != null) {
            webView2.destroy();
        }
        this.f42185z = null;
        this.A = null;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return uo.g1.c();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        jo.p.h(webView, "view");
        jo.p.h(webResourceRequest, "request");
        jo.p.h(webResourceError, MRLog.PAYLOAD_KEY_ERROR);
        Log.d(j1.class.getName() + "#onReceivedError", webResourceError.getDescription().toString());
        uo.l.d(this, null, null, new c(null), 3, null);
    }
}
