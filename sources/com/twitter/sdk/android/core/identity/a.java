package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.identity.b;
import com.twitter.sdk.android.core.internal.oauth.d;
import com.twitter.sdk.android.core.internal.oauth.g;
import in.h;
import in.l;
import in.o;
import in.q;
import in.r;

/* loaded from: classes4.dex */
public class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f28269a;

    /* renamed from: b  reason: collision with root package name */
    public r f28270b;

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f28271c;

    /* renamed from: d  reason: collision with root package name */
    public final WebView f28272d;

    /* renamed from: e  reason: collision with root package name */
    public final q f28273e;

    /* renamed from: f  reason: collision with root package name */
    public final d f28274f;

    /* renamed from: com.twitter.sdk.android.core.identity.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0258a extends in.c<g> {
        public C0258a() {
        }

        @Override // in.c
        public void c(TwitterException twitterException) {
            o.g().c("Twitter", "Failed to get request token", twitterException);
            a.this.i(1, new TwitterAuthException("Failed to get request token"));
        }

        @Override // in.c
        public void d(l<g> lVar) {
            a aVar = a.this;
            aVar.f28270b = lVar.f36917a.f28293w;
            String i10 = aVar.f28274f.i(a.this.f28270b);
            o.g().b("Twitter", "Redirecting user to web view to complete authorization flow");
            a aVar2 = a.this;
            aVar2.n(aVar2.f28272d, new com.twitter.sdk.android.core.identity.b(a.this.f28274f.g(a.this.f28273e), a.this), i10, new jn.d());
        }
    }

    /* loaded from: classes4.dex */
    public class b extends in.c<g> {
        public b() {
        }

        @Override // in.c
        public void c(TwitterException twitterException) {
            o.g().c("Twitter", "Failed to get access token", twitterException);
            a.this.i(1, new TwitterAuthException("Failed to get access token"));
        }

        @Override // in.c
        public void d(l<g> lVar) {
            Intent intent = new Intent();
            g gVar = lVar.f36917a;
            intent.putExtra("screen_name", gVar.f28294x);
            intent.putExtra(LogBase.USER_ID, gVar.f28295y);
            intent.putExtra("tk", gVar.f28293w.f36933x);
            intent.putExtra(TopicConstant.EXTEND_HLS_TS, gVar.f28293w.f36934y);
            a.this.f28269a.a(-1, intent);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(int i10, Intent intent);
    }

    public a(ProgressBar progressBar, WebView webView, q qVar, d dVar, c cVar) {
        this.f28271c = progressBar;
        this.f28272d = webView;
        this.f28273e = qVar;
        this.f28274f = dVar;
        this.f28269a = cVar;
    }

    @Override // com.twitter.sdk.android.core.identity.b.a
    public void a(WebView webView, String str) {
        g();
        webView.setVisibility(0);
    }

    @Override // com.twitter.sdk.android.core.identity.b.a
    public void b(jn.g gVar) {
        j(gVar);
        h();
    }

    @Override // com.twitter.sdk.android.core.identity.b.a
    public void c(Bundle bundle) {
        k(bundle);
        h();
    }

    public final void g() {
        this.f28271c.setVisibility(8);
    }

    public final void h() {
        this.f28272d.stopLoading();
        g();
    }

    public void i(int i10, TwitterAuthException twitterAuthException) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", twitterAuthException);
        this.f28269a.a(i10, intent);
    }

    public final void j(jn.g gVar) {
        o.g().c("Twitter", "OAuth web view completed with an error", gVar);
        i(1, new TwitterAuthException("OAuth web view completed with an error"));
    }

    public final void k(Bundle bundle) {
        String string;
        o.g().b("Twitter", "OAuth web view completed successfully");
        if (bundle != null && (string = bundle.getString("oauth_verifier")) != null) {
            o.g().b("Twitter", "Converting the request token to an access token.");
            this.f28274f.m(l(), this.f28270b, string);
            return;
        }
        h g10 = o.g();
        g10.c("Twitter", "Failed to get authorization, bundle incomplete " + bundle, null);
        i(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
    }

    public in.c<g> l() {
        return new b();
    }

    public in.c<g> m() {
        return new C0258a();
    }

    public void n(WebView webView, WebViewClient webViewClient, String str, WebChromeClient webChromeClient) {
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(str);
        webView.setVisibility(4);
        webView.setWebChromeClient(webChromeClient);
    }

    public void o() {
        o.g().b("Twitter", "Obtaining request token to start the sign in flow");
        this.f28274f.n(m());
    }
}
