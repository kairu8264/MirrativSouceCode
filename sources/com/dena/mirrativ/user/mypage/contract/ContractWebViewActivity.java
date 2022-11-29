package com.dena.mirrativ.user.mypage.contract;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.user.mypage.contract.ContractWebViewActivity;
import jo.h;
import jo.p;
import jo.q;
import pc.g;
import so.n;
import wn.f;

/* loaded from: classes2.dex */
public final class ContractWebViewActivity extends ComponentActivity {
    public static final a L = new a(null);
    public static final int M = 8;
    public g H;
    public final f I = wn.g.a(new d());
    public ValueCallback<Uri[]> J;
    public final androidx.activity.result.c<Intent> K;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            ContractWebViewActivity.this.J = valueCallback;
            ContractWebViewActivity.this.K.a(fileChooserParams != null ? fileChooserParams.createIntent() : null);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (n.p(str == null ? "" : str, "formResponse", false, 2, null)) {
                ContractWebViewActivity.this.setResult(-1);
                ContractWebViewActivity.this.finish();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String uri = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
            if (uri == null) {
                uri = "";
            }
            if (n.p(uri, "mode=complete", false, 2, null)) {
                ContractWebViewActivity.this.setResult(-1);
                ContractWebViewActivity.this.finish();
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = ContractWebViewActivity.this.getIntent().getStringExtra("EXTRA_URL");
            if (stringExtra != null) {
                return stringExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public ContractWebViewActivity() {
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: ad.f2
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ContractWebViewActivity.c3(ContractWebViewActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul…Callback = null\n        }");
        this.K = V2;
    }

    public static final void c3(ContractWebViewActivity contractWebViewActivity, androidx.activity.result.a aVar) {
        ValueCallback<Uri[]> valueCallback;
        Uri data;
        p.h(contractWebViewActivity, "this$0");
        if (aVar.b() == -1 && (valueCallback = contractWebViewActivity.J) != null) {
            Uri[] uriArr = new Uri[1];
            Intent a10 = aVar.a();
            if (a10 == null || (data = a10.getData()) == null) {
                return;
            }
            uriArr[0] = data;
            valueCallback.onReceiveValue(uriArr);
        }
        contractWebViewActivity.J = null;
    }

    public final String a3() {
        return (String) this.I.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void b3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }

    @Override // androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_contract_webview);
        p.g(g10, "setContentView(\n        …ontract_webview\n        )");
        g gVar = (g) g10;
        this.H = gVar;
        g gVar2 = null;
        if (gVar == null) {
            p.v("binding");
            gVar = null;
        }
        gVar.B.setWebChromeClient(new b());
        g gVar3 = this.H;
        if (gVar3 == null) {
            p.v("binding");
            gVar3 = null;
        }
        gVar3.B.setWebViewClient(new c());
        g gVar4 = this.H;
        if (gVar4 == null) {
            p.v("binding");
            gVar4 = null;
        }
        WebSettings settings = gVar4.B.getSettings();
        p.g(settings, "binding.webview.settings");
        b3(settings);
        g gVar5 = this.H;
        if (gVar5 == null) {
            p.v("binding");
        } else {
            gVar2 = gVar5;
        }
        gVar2.B.loadUrl(a3());
    }
}
