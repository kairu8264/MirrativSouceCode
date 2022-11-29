package eh;

import ai.ox;
import ai.uj0;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import rg.f;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30557a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f30558b;

    /* renamed from: c  reason: collision with root package name */
    public final ai.u f30559c;

    public a(WebView webView, ai.u uVar) {
        this.f30558b = webView;
        this.f30557a = webView.getContext();
        this.f30559c = uVar;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        ox.a(this.f30557a);
        try {
            return this.f30559c.b().a(this.f30557a, str, this.f30558b);
        } catch (RuntimeException e10) {
            uj0.d("Exception getting click signals. ", e10);
            wg.t.h().k(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        wg.t.d();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f30557a;
        rg.b bVar = rg.b.BANNER;
        f.a aVar = new f.a();
        aVar.b(AdMobAdapter.class, bundle);
        fh.b.a(context, bVar, aVar.c(), new k(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        ox.a(this.f30557a);
        try {
            return this.f30559c.b().e(this.f30557a, this.f30558b, null);
        } catch (RuntimeException e10) {
            uj0.d("Exception getting view signals. ", e10);
            wg.t.h().k(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        ox.a(this.f30557a);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i12 = jSONObject.getInt("x");
            int i13 = jSONObject.getInt("y");
            int i14 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i15 = jSONObject.getInt("type");
            if (i15 != 0) {
                if (i15 == 1) {
                    i11 = 1;
                } else if (i15 == 2) {
                    i11 = 2;
                } else if (i15 != 3) {
                    i10 = -1;
                } else {
                    i11 = 3;
                }
                this.f30559c.d(MotionEvent.obtain(0L, i14, i11, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            }
            i10 = 0;
            i11 = i10;
            this.f30559c.d(MotionEvent.obtain(0L, i14, i11, i12, i13, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e10) {
            uj0.d("Failed to parse the touch string. ", e10);
            wg.t.h().k(e10, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
