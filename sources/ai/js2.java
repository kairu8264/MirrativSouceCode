package ai;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class js2 {

    /* renamed from: a  reason: collision with root package name */
    public static final js2 f5915a = new js2();

    public static js2 a() {
        return f5915a;
    }

    public final void b(WebView webView, JSONObject jSONObject) {
        g(webView, "init", jSONObject);
    }

    public final void c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void d(WebView webView) {
        g(webView, "finishSession", new Object[0]);
    }

    public final void e(WebView webView, String str) {
        g(webView, "setNativeViewHierarchy", str);
    }

    public final void f(WebView webView, float f10) {
        g(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public final void g(WebView webView, String str, Object... objArr) {
        String str2;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb2.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb2.append(obj2);
                        } else {
                            sb2.append('\"');
                            sb2.append(obj2);
                            sb2.append('\"');
                        }
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new is2(this, webView, sb3));
                return;
            } else {
                webView.loadUrl(sb3);
                return;
            }
        }
        if (str.length() != 0) {
            str2 = "The WebView is null for ".concat(str);
        } else {
            str2 = new String("The WebView is null for ");
        }
        if (!kr2.f6344a.booleanValue() || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i("OMIDLIB", str2);
    }
}
