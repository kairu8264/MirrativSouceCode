package com.dena.mirrativ.user.mypage;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.ListPopupWindow;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.user.mypage.FaqActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.MRUrl;
import hf.v0;
import ie.f;
import java.util.LinkedHashMap;
import java.util.Map;
import jo.f0;
import jo.p;
import jo.q;
import kf.x;
import nf.k;
import p.d;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class FaqActivity extends e.b implements f.b {
    public static final a U = new a(null);
    public static final int V = 8;
    public final wn.f O = wn.g.a(new b());
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, FaqActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<pc.i> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final pc.i invoke() {
            return (pc.i) androidx.databinding.f.g(FaqActivity.this, nc.f.activity_faq);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            if (80 <= i10) {
                FaqActivity.this.E3().D.b(StatusView.b.c.f20791w);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, mm.c> f24256a = new LinkedHashMap();

        public d() {
        }

        public final mm.c a(String str) {
            if (str == null) {
                return null;
            }
            if (this.f24256a.containsKey(str)) {
                return this.f24256a.get(str);
            }
            mm.c e10 = gm.c.c().e(str, "GET");
            p.g(e10, "getInstance().newHttpMet…rformance.HttpMethod.GET)");
            e10.b("userId", FaqActivity.this.J3().T4());
            e10.c(200);
            this.f24256a.put(str, e10);
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
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || webView == null) {
                return true;
            }
            webView.loadUrl(url.toString());
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24258w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24259x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24260y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24258w = componentCallbacks;
            this.f24259x = aVar;
            this.f24260y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24258w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f24259x, this.f24260y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24261w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24262x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24263y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24261w = componentCallbacks;
            this.f24262x = aVar;
            this.f24263y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f24261w;
            return gq.a.a(componentCallbacks).c(f0.b(k.class), this.f24262x, this.f24263y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24264w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24265x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24264w = componentCallbacks;
            this.f24265x = aVar;
            this.f24266y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f24264w;
            return gq.a.a(componentCallbacks).c(f0.b(ServerConfig.class), this.f24265x, this.f24266y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24267w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24268x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24269y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24267w = componentCallbacks;
            this.f24268x = aVar;
            this.f24269y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f24267w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f24268x, this.f24269y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24270w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24272y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24270w = componentCallbacks;
            this.f24271x = aVar;
            this.f24272y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24270w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24271x, this.f24272y);
        }
    }

    public FaqActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new e(this, null, null));
        this.Q = wn.g.b(iVar, new f(this, null, null));
        this.R = wn.g.b(iVar, new g(this, null, null));
        this.S = wn.g.b(iVar, new h(this, null, null));
        this.T = wn.g.b(iVar, new i(this, null, null));
    }

    public static final void L3(FaqActivity faqActivity, View view) {
        p.h(faqActivity, "this$0");
        faqActivity.finish();
    }

    public static final void M3(FaqActivity faqActivity, View view) {
        p.h(faqActivity, "this$0");
        faqActivity.P3();
    }

    public static final void Q3(FaqActivity faqActivity, ListPopupWindow listPopupWindow, AdapterView adapterView, View view, int i10, long j10) {
        p.h(faqActivity, "this$0");
        p.h(listPopupWindow, "$this_apply");
        MRLogger G3 = faqActivity.G3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_INQUIRY_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_USER);
        builder.setTargetId(faqActivity.I3().x());
        builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "inquiry")));
        G3.sendLog(builder.build());
        if (i10 == 0) {
            faqActivity.O3();
        } else if (i10 == 1) {
            faqActivity.C3();
        }
        listPopupWindow.dismiss();
    }

    public final void C3() {
        if (F3().j()) {
            D3();
        } else {
            N3();
        }
    }

    public final void D3() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{getString(nc.i.email_support)});
        intent.putExtra("android.intent.extra.SUBJECT", getString(nc.i.text_inquiry_mail_title));
        intent.putExtra("android.intent.extra.TEXT", getString(nc.i.f41883o3, new Object[]{I3().x(), BuildConfig.VERSION_NAME, Build.MODEL, Build.VERSION.RELEASE}));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public final pc.i E3() {
        Object value = this.O.getValue();
        p.g(value, "<get-binding>(...)");
        return (pc.i) value;
    }

    public final k F3() {
        return (k) this.Q.getValue();
    }

    public final MRLogger G3() {
        return (MRLogger) this.T.getValue();
    }

    public final ServerConfig H3() {
        return (ServerConfig) this.R.getValue();
    }

    public final v0 I3() {
        return (v0) this.P.getValue();
    }

    public final x J3() {
        return (x) this.S.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void K3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }

    public final void N3() {
        f.a aVar = ie.f.V0;
        String string = getString(nc.i.f41889s5);
        p.g(string, "getString(R.string.text_…pdate_due_to_app_version)");
        f.a.b(aVar, string, getString(nc.i.W5), getString(nc.i.B), null, false, 24, null).z3(a3(), "CustomYesNoDialog");
    }

    public final void O3() {
        new d.a().a().a(this, MRUrl.Feedback.INSTANCE.getUriValue());
    }

    public final void P3() {
        final ListPopupWindow listPopupWindow = new ListPopupWindow(E3().u().getContext());
        listPopupWindow.setModal(true);
        listPopupWindow.setWidth(de.a.b(this, 180));
        listPopupWindow.setAnchorView(E3().B);
        listPopupWindow.setAdapter(new ArrayAdapter(E3().u().getContext(), 17367043, 16908308, s.m(getString(nc.i.text_inquiry_requests), getString(nc.i.text_inquiry_bugs))));
        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: rc.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                FaqActivity.Q3(FaqActivity.this, listPopupWindow, adapterView, view, i10, j10);
            }
        });
        listPopupWindow.show();
    }

    @Override // ie.f.b
    public void b(String str) {
        p.h(str, "tag");
        new d.a().a().a(this, Uri.parse(ApiUtil.INSTANCE.urlForceUpdate(H3())));
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (E3().F.canGoBack()) {
            E3().F.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E3().E.B.setNavigationOnClickListener(new View.OnClickListener() { // from class: rc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqActivity.L3(FaqActivity.this, view);
            }
        });
        E3().E.B.setNavigationIcon(nc.d.f41815v);
        E3().E.B.setBackgroundResource(nc.h.f41869c);
        E3().E.C.setTextColor(c3.a.d(this, nc.b.F));
        E3().E.C.setText(getString(nc.i.text_support));
        WebSettings settings = E3().F.getSettings();
        p.g(settings, "binding.webView.settings");
        K3(settings);
        E3().D.b(StatusView.b.C0181b.f20790w);
        E3().F.loadUrl(MRUrl.Faq.INSTANCE.getUrl());
        E3().F.setWebChromeClient(new c());
        E3().F.setWebViewClient(new d());
        E3().B.setOnClickListener(new View.OnClickListener() { // from class: rc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqActivity.M3(FaqActivity.this, view);
            }
        });
    }
}
