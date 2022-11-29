package wg;

import ai.as;
import ai.ty;
import ai.uc2;
import ai.uj0;
import ai.zj0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Context f58721a;

    /* renamed from: b  reason: collision with root package name */
    public final String f58722b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f58723c = new TreeMap();

    /* renamed from: d  reason: collision with root package name */
    public String f58724d;

    /* renamed from: e  reason: collision with root package name */
    public String f58725e;

    /* renamed from: f  reason: collision with root package name */
    public final String f58726f;

    public r(Context context, String str) {
        String concat;
        this.f58721a = context.getApplicationContext();
        this.f58722b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = xh.c.a(context).f(context.getPackageName(), 0).versionName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb2.append(packageName);
            sb2.append("-");
            sb2.append(str2);
            concat = sb2.toString();
        } catch (PackageManager.NameNotFoundException e10) {
            uj0.d("Unable to get package version name for reporting", e10);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f58726f = concat;
    }

    public final String a() {
        return this.f58725e;
    }

    public final String b() {
        return this.f58724d;
    }

    public final String c() {
        return this.f58722b;
    }

    public final String d() {
        return this.f58726f;
    }

    public final Map<String, String> e() {
        return this.f58723c;
    }

    public final void f(as asVar, zj0 zj0Var) {
        this.f58724d = asVar.F.f9608w;
        Bundle bundle = asVar.I;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String e10 = ty.f10505c.e();
        for (String str : bundle2.keySet()) {
            if (e10.equals(str)) {
                this.f58725e = bundle2.getString(str);
            } else if (str.startsWith("csa_")) {
                this.f58723c.put(str.substring(4), bundle2.getString(str));
            }
        }
        this.f58723c.put("SDKVersion", zj0Var.f13013w);
        if (ty.f10503a.e().booleanValue()) {
            try {
                Bundle a10 = uc2.a(this.f58721a, new JSONArray(ty.f10504b.e()));
                for (String str2 : a10.keySet()) {
                    this.f58723c.put(str2, a10.get(str2).toString());
                }
            } catch (JSONException e11) {
                uj0.d("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e11);
            }
        }
    }
}
