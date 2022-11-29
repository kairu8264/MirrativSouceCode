package com.dena.mirrativ.user.mypage.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.user.mypage.contract.WebViewWithToolbarActivity;
import jo.h;
import jo.p;
import jo.q;
import nc.e;
import pc.a0;
import so.n;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class WebViewWithToolbarActivity extends e.b {
    public static final a R = new a(null);
    public static final int S = 8;
    public a0 O;
    public final f P = g.a(new c());
    public final f Q = g.a(new d());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2) {
            p.h(context, "context");
            p.h(str, "title");
            p.h(str2, "url");
            Intent putExtra = new Intent(context, WebViewWithToolbarActivity.class).putExtra("EXTRA_TITLE", str).putExtra("EXTRA_URL", str2);
            p.g(putExtra, "Intent(context, WebViewW….putExtra(EXTRA_URL, url)");
            return putExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (url == null) {
                return true;
            }
            String host = url.getHost();
            if (host == null) {
                host = "";
            }
            if (n.C(host, "href", false, 2, null)) {
                WebViewWithToolbarActivity.this.startActivity(new Intent("android.intent.action.VIEW", url));
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return WebViewWithToolbarActivity.this.getIntent().getStringExtra("EXTRA_TITLE");
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
            String stringExtra = WebViewWithToolbarActivity.this.getIntent().getStringExtra("EXTRA_URL");
            if (stringExtra != null) {
                return stringExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final void A3(WebViewWithToolbarActivity webViewWithToolbarActivity, View view) {
        p.h(webViewWithToolbarActivity, "this$0");
        webViewWithToolbarActivity.finish();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_web_view_with_toolbar);
        p.g(g10, "setContentView(this, R.l…ty_web_view_with_toolbar)");
        a0 a0Var = (a0) g10;
        this.O = a0Var;
        a0 a0Var2 = null;
        if (a0Var == null) {
            p.v("binding");
            a0Var = null;
        }
        Toolbar toolbar = a0Var.B.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ad.x2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewWithToolbarActivity.A3(WebViewWithToolbarActivity.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(e.B6);
        if (textView != null) {
            p.g(textView, "findViewById<TextView>(R…ar_title) ?: return@apply");
            toolbar.setBackgroundResource(nc.h.f41869c);
            textView.setVisibility(0);
            textView.setText(y3());
        }
        a0 a0Var3 = this.O;
        if (a0Var3 == null) {
            p.v("binding");
            a0Var3 = null;
        }
        a0Var3.C.setWebViewClient(new b());
        a0 a0Var4 = this.O;
        if (a0Var4 == null) {
            p.v("binding");
        } else {
            a0Var2 = a0Var4;
        }
        a0Var2.C.loadUrl(z3());
    }

    public final String y3() {
        return (String) this.P.getValue();
    }

    public final String z3() {
        return (String) this.Q.getValue();
    }
}
