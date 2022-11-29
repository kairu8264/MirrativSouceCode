package ai;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* loaded from: classes3.dex */
public class vq0 extends yp0 {
    public vq0(rp0 rp0Var, qn qnVar, boolean z10) {
        super(rp0Var, qnVar, z10);
    }

    public final WebResourceResponse y0(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof rp0)) {
            uj0.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        rp0 rp0Var = (rp0) webView;
        wg0 wg0Var = this.Q;
        if (wg0Var != null) {
            wg0Var.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (rp0Var.i0() != null) {
            rp0Var.i0().x();
        }
        if (rp0Var.q().g()) {
            str2 = (String) ft.c().c(ox.J);
        } else if (rp0Var.T()) {
            str2 = (String) ft.c().c(ox.I);
        } else {
            str2 = (String) ft.c().c(ox.H);
        }
        wg.t.d();
        return yg.d2.b(rp0Var.getContext(), rp0Var.m().f13013w, str2);
    }
}
