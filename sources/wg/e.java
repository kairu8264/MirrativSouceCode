package wg;

import ai.ft;
import ai.hk0;
import ai.j43;
import ai.kk0;
import ai.n70;
import ai.ox;
import ai.p33;
import ai.s43;
import ai.s70;
import ai.t43;
import ai.uj0;
import ai.v70;
import ai.y70;
import ai.zi0;
import ai.zj0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import org.json.JSONObject;
import yg.p1;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Context f58704a;

    /* renamed from: b  reason: collision with root package name */
    public long f58705b = 0;

    public final void a(Context context, zj0 zj0Var, String str, Runnable runnable) {
        c(context, zj0Var, true, null, str, null, runnable);
    }

    public final void b(Context context, zj0 zj0Var, String str, zi0 zi0Var) {
        c(context, zj0Var, false, zi0Var, zi0Var != null ? zi0Var.e() : null, str, null);
    }

    public final void c(Context context, zj0 zj0Var, boolean z10, zi0 zi0Var, String str, String str2, Runnable runnable) {
        PackageInfo f10;
        if (t.k().elapsedRealtime() - this.f58705b < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            uj0.f("Not retrying to fetch app settings");
            return;
        }
        this.f58705b = t.k().elapsedRealtime();
        if (zi0Var != null) {
            if (t.k().currentTimeMillis() - zi0Var.b() <= ((Long) ft.c().c(ox.f8127x2)).longValue() && zi0Var.c()) {
                return;
            }
        }
        if (context == null) {
            uj0.f("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            uj0.f("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f58704a = applicationContext;
            y70 b10 = t.q().b(this.f58704a, zj0Var);
            s70<JSONObject> s70Var = v70.f10994b;
            n70 a10 = b10.a("google.afma.config.fetchAppSettings", s70Var, s70Var);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(MRLog.PAYLOAD_KEY_APP_ID, str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", ox.c()));
                try {
                    ApplicationInfo applicationInfo = this.f58704a.getApplicationInfo();
                    if (applicationInfo != null && (f10 = xh.c.a(context).f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", f10.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    p1.k("Error fetching PackageInfo.");
                }
                s43 b11 = a10.b(jSONObject);
                p33 p33Var = d.f58703a;
                t43 t43Var = hk0.f4883f;
                s43 i10 = j43.i(b11, p33Var, t43Var);
                if (runnable != null) {
                    b11.c(runnable, t43Var);
                }
                kk0.a(i10, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e10) {
                uj0.d("Error requesting application settings", e10);
            }
        }
    }
}
