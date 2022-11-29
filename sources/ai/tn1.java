package ai;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tn1 {
    public static String a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (b(optJSONArray2, str) && !b(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static boolean b(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                } catch (PatternSyntaxException e10) {
                    wg.t.h().k(e10, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if (Pattern.compile(jSONArray.optString(i10)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
