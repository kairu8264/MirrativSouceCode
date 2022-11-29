package yg;

import ai.ft;
import ai.ox;
import ai.qn;
import ai.rp0;
import ai.uj0;
import ai.uq0;
import ai.yp0;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

@TargetApi(16)
/* loaded from: classes3.dex */
public class e {
    public e() {
    }

    public /* synthetic */ e(j2 j2Var) {
    }

    public static e r(int i10) {
        return i10 >= 28 ? new d() : i10 >= 26 ? new b() : i10 >= 24 ? new k2() : i10 >= 21 ? new i2() : i10 >= 19 ? new h2() : i10 >= 18 ? new g2() : i10 >= 17 ? new f2() : new e();
    }

    public static final boolean s() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public boolean a(final Context context, final WebSettings webSettings) {
        g1.a(context, new Callable(context, webSettings) { // from class: yg.e2

            /* renamed from: a  reason: collision with root package name */
            public final Context f61879a;

            /* renamed from: b  reason: collision with root package name */
            public final WebSettings f61880b;

            {
                this.f61879a = context;
                this.f61880b = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.f61879a;
                WebSettings webSettings2 = this.f61880b;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) ft.c().c(ox.f8117w0)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public String b(Context context) {
        return "";
    }

    public void c(Context context) {
    }

    public Drawable d(Context context, Bitmap bitmap, boolean z10, float f10) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public int e(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int f(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public boolean g(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int h() {
        return 5;
    }

    public long i() {
        return -1L;
    }

    public ViewGroup.LayoutParams j() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public CookieManager k(Context context) {
        if (s()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            uj0.d("Failed to obtain CookieManager.", th2);
            wg.t.h().k(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public yp0 l(rp0 rp0Var, qn qnVar, boolean z10) {
        return new uq0(rp0Var, qnVar, z10);
    }

    public int m() {
        return 1;
    }

    public WebResourceResponse n(String str, String str2, int i10, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public boolean o(Activity activity, Configuration configuration) {
        return false;
    }

    public int p(Context context, TelephonyManager telephonyManager) {
        return AnalyticsListener.EVENT_LOAD_COMPLETED;
    }

    public void q(Activity activity) {
    }
}
