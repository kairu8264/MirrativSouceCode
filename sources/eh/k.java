package eh;

import ai.uj0;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k extends fh.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f30600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f30601b;

    public k(a aVar, String str) {
        this.f30601b = aVar;
        this.f30600a = str;
    }

    @Override // fh.c
    public final void a(String str) {
        WebView webView;
        String valueOf = String.valueOf(str);
        uj0.f(valueOf.length() != 0 ? "Failed to generate query info for the tagging library, error: ".concat(valueOf) : new String("Failed to generate query info for the tagging library, error: "));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f30600a, str);
        webView = this.f30601b.f30558b;
        webView.evaluateJavascript(format, null);
    }

    @Override // fh.c
    public final void b(fh.b bVar) {
        String format;
        WebView webView;
        String b10 = bVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f30600a);
            jSONObject.put("signal", b10);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f30600a, bVar.b());
        }
        webView = this.f30601b.f30558b;
        webView.evaluateJavascript(format, null);
    }
}
