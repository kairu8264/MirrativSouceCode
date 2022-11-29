package ai;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ax extends gx<Integer> {
    public ax(int i10, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Integer a(Bundle bundle) {
        String e10 = e();
        if (bundle.containsKey(e10.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e10) : new String("com.google.android.gms.ads.flag."))) {
            String e11 = e();
            return Integer.valueOf(bundle.getInt(e11.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e11) : new String("com.google.android.gms.ads.flag.")));
        }
        return f();
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(e(), num.intValue());
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Integer c(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(e(), f().intValue()));
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Integer d(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(e(), f().intValue()));
    }
}
