package ai;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class n41 extends kv {
    public final String A;

    /* renamed from: w  reason: collision with root package name */
    public final String f7184w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7185x;

    /* renamed from: y  reason: collision with root package name */
    public final List<js> f7186y;

    /* renamed from: z  reason: collision with root package name */
    public final long f7187z;

    public n41(fl2 fl2Var, String str, vy1 vy1Var, kl2 kl2Var) {
        String str2 = null;
        this.f7185x = fl2Var == null ? null : fl2Var.X;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = fl2Var.f4111v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f7184w = str2 != null ? str2 : str;
        this.f7186y = vy1Var.e();
        this.f7187z = wg.t.k().currentTimeMillis() / 1000;
        this.A = (!((Boolean) ft.c().c(ox.G6)).booleanValue() || kl2Var == null || TextUtils.isEmpty(kl2Var.f6283h)) ? "" : kl2Var.f6283h;
    }

    public final long R5() {
        return this.f7187z;
    }

    public final String S5() {
        return this.A;
    }

    @Override // ai.lv
    public final String a() {
        return this.f7185x;
    }

    @Override // ai.lv
    public final String c() {
        return this.f7184w;
    }

    @Override // ai.lv
    public final List<js> f() {
        if (((Boolean) ft.c().c(ox.X5)).booleanValue()) {
            return this.f7186y;
        }
        return null;
    }
}
