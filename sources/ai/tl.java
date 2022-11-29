package ai;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class tl implements Runnable {
    public final /* synthetic */ vl A;

    /* renamed from: w  reason: collision with root package name */
    public final ValueCallback<String> f10344w = new rl(this);

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ kl f10345x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ WebView f10346y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10347z;

    public tl(vl vlVar, kl klVar, WebView webView, boolean z10) {
        this.A = vlVar;
        this.f10345x = klVar;
        this.f10346y = webView;
        this.f10347z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10346y.getSettings().getJavaScriptEnabled()) {
            try {
                this.f10346y.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f10344w);
            } catch (Throwable unused) {
                ((rl) this.f10344w).onReceiveValue("");
            }
        }
    }
}
