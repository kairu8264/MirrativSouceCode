package ai;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ex extends gx<String> {
    public ex(int i10, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ String a(Bundle bundle) {
        String e10 = e();
        if (bundle.containsKey(e10.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e10) : new String("com.google.android.gms.ads.flag."))) {
            String e11 = e();
            return bundle.getString(e11.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e11) : new String("com.google.android.gms.ads.flag."));
        }
        return f();
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, String str) {
        editor.putString(e(), str);
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ String c(JSONObject jSONObject) {
        return jSONObject.optString(e(), f());
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ String d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(e(), f());
    }
}
