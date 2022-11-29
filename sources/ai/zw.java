package ai;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zw extends gx<Boolean> {
    public zw(int i10, String str, Boolean bool) {
        super(i10, str, bool, null);
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Boolean a(Bundle bundle) {
        String e10 = e();
        if (bundle.containsKey(e10.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e10) : new String("com.google.android.gms.ads.flag."))) {
            String e11 = e();
            return Boolean.valueOf(bundle.getBoolean(e11.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e11) : new String("com.google.android.gms.ads.flag.")));
        }
        return f();
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(e(), bool.booleanValue());
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Boolean c(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(e(), f().booleanValue()));
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Boolean d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(e(), f().booleanValue()));
    }
}
