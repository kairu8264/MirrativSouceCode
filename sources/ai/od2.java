package ai;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class od2 implements wc2<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final AdvertisingIdClient.Info f7722a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7723b;

    public od2(AdvertisingIdClient.Info info, String str) {
        this.f7722a = info;
        this.f7723b = str;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(JSONObject jSONObject) {
        try {
            JSONObject g10 = yg.y0.g(jSONObject, "pii");
            AdvertisingIdClient.Info info = this.f7722a;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                g10.put("rdid", this.f7722a.getId());
                g10.put("is_lat", this.f7722a.isLimitAdTrackingEnabled());
                g10.put("idtype", "adid");
                return;
            }
            g10.put("pdid", this.f7723b);
            g10.put("pdidtype", "ssaid");
        } catch (JSONException e10) {
            yg.p1.l("Failed putting Ad ID.", e10);
        }
    }
}
