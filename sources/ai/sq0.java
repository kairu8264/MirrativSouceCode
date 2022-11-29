package ai;

import ai.ar0;
import ai.cr0;
import ai.tq0;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

@TargetApi(17)
/* loaded from: classes3.dex */
public final class sq0<WebViewT extends tq0 & ar0 & cr0> {

    /* renamed from: a  reason: collision with root package name */
    public final rq0 f9905a;

    /* renamed from: b  reason: collision with root package name */
    public final WebViewT f9906b;

    public sq0(WebViewT webviewt, rq0 rq0Var) {
        this.f9905a = rq0Var;
        this.f9906b = webviewt;
    }

    public final /* synthetic */ void a(String str) {
        this.f9905a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            yg.p1.k("Click string is empty, not proceeding.");
            return "";
        }
        u w10 = this.f9906b.w();
        if (w10 == null) {
            yg.p1.k("Signal utils is empty, ignoring.");
            return "";
        }
        q b10 = w10.b();
        if (b10 == null) {
            yg.p1.k("Signals object is empty, ignoring.");
            return "";
        } else if (this.f9906b.getContext() == null) {
            yg.p1.k("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.f9906b.getContext();
            WebViewT webviewt = this.f9906b;
            return b10.f(context, str, (View) webviewt, webviewt.g());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            uj0.f("URL is empty, ignoring message");
        } else {
            yg.d2.f61866i.post(new Runnable(this, str) { // from class: ai.qq0

                /* renamed from: w  reason: collision with root package name */
                public final sq0 f9058w;

                /* renamed from: x  reason: collision with root package name */
                public final String f9059x;

                {
                    this.f9058w = this;
                    this.f9059x = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9058w.a(this.f9059x);
                }
            });
        }
    }
}
