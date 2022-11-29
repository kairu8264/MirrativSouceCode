package ai;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdym;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jw1 implements fp2<iw1, ew1> {

    /* renamed from: a  reason: collision with root package name */
    public final String f5943a;

    public jw1(String str) {
        this.f5943a = str;
    }

    @Override // ai.fp2
    public final /* bridge */ /* synthetic */ ew1 a(iw1 iw1Var) throws Exception {
        JSONObject jSONObject;
        le0 le0Var;
        le0 le0Var2;
        le0 le0Var3;
        le0 le0Var4;
        le0 le0Var5;
        le0 le0Var6;
        le0 le0Var7;
        JSONObject jSONObject2;
        iw1 iw1Var2 = iw1Var;
        jSONObject = iw1Var2.f5432a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        le0Var = iw1Var2.f5433b;
        if (le0Var.a() == -2) {
            HashMap hashMap = new HashMap();
            le0Var2 = iw1Var2.f5433b;
            if (le0Var2.g() && !TextUtils.isEmpty(this.f5943a)) {
                hashMap.put("Cookie", this.f5943a);
            }
            le0Var3 = iw1Var2.f5433b;
            String str = "";
            if (le0Var3.f()) {
                jSONObject2 = iw1Var2.f5432a;
                JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    }
                } else {
                    yg.p1.k("DSID signal does not exist.");
                }
            }
            le0Var4 = iw1Var2.f5433b;
            if (le0Var4 != null) {
                le0Var6 = iw1Var2.f5433b;
                if (!TextUtils.isEmpty(le0Var6.d())) {
                    le0Var7 = iw1Var2.f5433b;
                    str = le0Var7.d();
                }
            }
            le0Var5 = iw1Var2.f5433b;
            return new ew1(le0Var5.e(), optInt, hashMap, str);
        } else if (le0Var.a() == 1) {
            if (le0Var.b() != null) {
                uj0.c(TextUtils.join(", ", le0Var.b()));
            }
            throw new zzdym(2, "Error building request URL.");
        } else {
            throw new zzdym(1);
        }
    }
}
