package ai;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class us2 extends rs2 {

    /* renamed from: d  reason: collision with root package name */
    public WebView f10823d;

    /* renamed from: e  reason: collision with root package name */
    public Long f10824e = null;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, yr2> f10825f;

    public us2(Map<String, yr2> map, String str) {
        this.f10825f = map;
    }

    @Override // ai.rs2
    public final void a() {
        WebView webView = new WebView(hs2.a().b());
        this.f10823d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        c(this.f10823d);
        WebView webView2 = this.f10823d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator<String> it = this.f10825f.keySet().iterator();
        if (!it.hasNext()) {
            this.f10824e = Long.valueOf(System.nanoTime());
            return;
        }
        this.f10825f.get(it.next());
        throw null;
    }

    @Override // ai.rs2
    public final void b() {
        super.b();
        new Handler().postDelayed(new ts2(this), Math.max(4000 - (this.f10824e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f10824e.longValue(), TimeUnit.NANOSECONDS)), (long) SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.f10823d = null;
    }

    @Override // ai.rs2
    public final void h(sr2 sr2Var, qr2 qr2Var) {
        JSONObject jSONObject = new JSONObject();
        Map<String, yr2> e10 = qr2Var.e();
        for (String str : e10.keySet()) {
            vs2.c(jSONObject, str, e10.get(str));
        }
        i(sr2Var, qr2Var, jSONObject);
    }
}
