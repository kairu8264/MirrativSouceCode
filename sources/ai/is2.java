package ai;

import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class is2 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ WebView f5338w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5339x;

    public is2(js2 js2Var, WebView webView, String str) {
        this.f5338w = webView;
        this.f5339x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5338w.loadUrl(this.f5339x);
    }
}
