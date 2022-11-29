package yg;

import ai.fz;
import ai.uj0;
import android.util.Log;

/* loaded from: classes3.dex */
public final class p1 extends uj0 {
    public static void k(String str) {
        if (m()) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : uj0.f10721a.d(str)) {
                    if (z10) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void l(String str, Throwable th2) {
        if (m()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean m() {
        return uj0.j(2) && fz.f4253a.e().booleanValue();
    }
}
