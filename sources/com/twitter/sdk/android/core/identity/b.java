package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;
import jn.g;
import ln.c;

/* loaded from: classes4.dex */
public class b extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final String f28277a;

    /* renamed from: b  reason: collision with root package name */
    public final a f28278b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(WebView webView, String str);

        void b(g gVar);

        void c(Bundle bundle);
    }

    public b(String str, a aVar) {
        this.f28277a = str;
        this.f28278b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f28278b.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f28278b.b(new g(i10, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.f28278b.b(new g(sslError.getPrimaryError(), null, null));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f28277a)) {
            TreeMap<String, String> b10 = c.b(URI.create(str), false);
            Bundle bundle = new Bundle(b10.size());
            for (Map.Entry<String, String> entry : b10.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            this.f28278b.c(bundle);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
