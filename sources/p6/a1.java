package p6;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f45884a;

    public a1(Context context) {
        this.f45884a = context.getSharedPreferences("adjust_preferences", 0);
    }

    public synchronized void A() {
        v("disable_third_party_sharing", true);
    }

    public synchronized void B() {
        v("install_tracked", true);
    }

    public synchronized void C(long j10) {
        w("preinstall_payload_read_status", j10);
    }

    public synchronized void D() {
        try {
            JSONArray l10 = l();
            boolean z10 = false;
            for (int i10 = 0; i10 < l10.length(); i10++) {
                JSONArray jSONArray = l10.getJSONArray(i10);
                if (jSONArray.optInt(2, -1) == 1) {
                    jSONArray.put(2, 0);
                    z10 = true;
                }
            }
            if (z10) {
                y(l10);
            }
        } catch (JSONException unused) {
        }
    }

    public final synchronized boolean a(String str, boolean z10) {
        try {
        } catch (ClassCastException unused) {
            return z10;
        }
        return this.f45884a.getBoolean(str, z10);
    }

    public synchronized long b() {
        return g("deeplink_click_time", -1L);
    }

    public synchronized String c() {
        return n("deeplink_url");
    }

    public synchronized boolean d() {
        return a("disable_third_party_sharing", false);
    }

    public synchronized boolean e() {
        return a("gdpr_forget_me", false);
    }

    public synchronized boolean f() {
        return a("install_tracked", false);
    }

    public final synchronized long g(String str, long j10) {
        try {
        } catch (ClassCastException unused) {
            return j10;
        }
        return this.f45884a.getLong(str, j10);
    }

    public synchronized long h() {
        return g("preinstall_payload_read_status", 0L);
    }

    public synchronized String i() {
        return n("preinstall_system_installer_referrer");
    }

    public synchronized String j() {
        return n("push_token");
    }

    public synchronized JSONArray k(String str, long j10) {
        int m10 = m(str, j10);
        if (m10 >= 0) {
            try {
                return l().getJSONArray(m10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public synchronized JSONArray l() {
        String n10 = n("raw_referrers");
        if (n10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(n10);
                if (jSONArray.length() > 10) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i10 = 0; i10 < 10; i10++) {
                        jSONArray2.put(jSONArray.get(i10));
                    }
                    y(jSONArray2);
                    return jSONArray2;
                }
                return new JSONArray(n10);
            } catch (Throwable unused) {
            }
        }
        return new JSONArray();
    }

    public final synchronized int m(String str, long j10) {
        try {
            JSONArray l10 = l();
            for (int i10 = 0; i10 < l10.length(); i10++) {
                JSONArray jSONArray = l10.getJSONArray(i10);
                String optString = jSONArray.optString(0, null);
                if (optString != null && optString.equals(str) && jSONArray.optLong(1, -1L) == j10) {
                    return i10;
                }
            }
        } catch (JSONException unused) {
        }
        return -1;
    }

    public final synchronized String n(String str) {
        try {
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable unused2) {
            if (str.equals("raw_referrers")) {
                o("raw_referrers");
            }
            return null;
        }
        return this.f45884a.getString(str, null);
    }

    public final synchronized void o(String str) {
        this.f45884a.edit().remove(str).apply();
    }

    public synchronized void p() {
        o("deeplink_url");
        o("deeplink_click_time");
    }

    public synchronized void q() {
        o("disable_third_party_sharing");
    }

    public synchronized void r() {
        o("gdpr_forget_me");
    }

    public synchronized void s() {
        o("preinstall_system_installer_referrer");
    }

    public synchronized void t() {
        o("push_token");
    }

    public synchronized void u(String str, long j10) {
        if (str != null) {
            if (str.length() != 0) {
                int m10 = m(str, j10);
                if (m10 < 0) {
                    return;
                }
                JSONArray l10 = l();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < l10.length(); i10++) {
                    if (i10 != m10) {
                        try {
                            jSONArray.put(l10.getJSONArray(i10));
                        } catch (JSONException unused) {
                        }
                    }
                }
                z("raw_referrers", jSONArray.toString());
            }
        }
    }

    public final synchronized void v(String str, boolean z10) {
        this.f45884a.edit().putBoolean(str, z10).apply();
    }

    public final synchronized void w(String str, long j10) {
        this.f45884a.edit().putLong(str, j10).apply();
    }

    public synchronized void x(String str) {
        z("push_token", str);
    }

    public synchronized void y(JSONArray jSONArray) {
        try {
            z("raw_referrers", jSONArray.toString());
        } catch (Throwable unused) {
            o("raw_referrers");
        }
    }

    public final synchronized void z(String str, String str2) {
        this.f45884a.edit().putString(str, str2).apply();
    }
}
