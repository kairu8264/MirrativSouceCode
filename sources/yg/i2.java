package yg;

import ai.qn;
import ai.rp0;
import ai.uj0;
import ai.wq0;
import ai.yp0;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes3.dex */
public class i2 extends h2 {
    @Override // yg.e
    public final CookieManager k(Context context) {
        if (e.s()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            uj0.d("Failed to obtain CookieManager.", th2);
            wg.t.h().k(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // yg.e
    public final yp0 l(rp0 rp0Var, qn qnVar, boolean z10) {
        return new wq0(rp0Var, qnVar, z10);
    }

    @Override // yg.e
    public final int m() {
        return 16974374;
    }

    @Override // yg.e
    public final WebResourceResponse n(String str, String str2, int i10, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }
}
