package ai;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ll2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f6613a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6614b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f6615c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f6616d;

    public ll2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject c10 = yg.y0.c(jsonReader);
        this.f6616d = c10;
        this.f6613a = c10.optString("ad_html", null);
        this.f6614b = c10.optString("ad_base_url", null);
        this.f6615c = c10.optJSONObject("ad_json");
    }
}
