package ai;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
/* loaded from: classes3.dex */
public final class uq0 extends vq0 {
    public uq0(rp0 rp0Var, qn qnVar, boolean z10) {
        super(rp0Var, qnVar, z10);
    }

    @Override // ai.yp0, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return y0(webView, str, null);
    }
}
