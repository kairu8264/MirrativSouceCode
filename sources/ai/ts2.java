package ai;

import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class ts2 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final WebView f10459w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ us2 f10460x;

    public ts2(us2 us2Var) {
        WebView webView;
        this.f10460x = us2Var;
        webView = us2Var.f10823d;
        this.f10459w = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10459w.destroy();
    }
}
