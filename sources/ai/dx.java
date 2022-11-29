package ai;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dx extends gx<Float> {
    public dx(int i10, String str, Float f10) {
        super(1, str, f10, null);
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Float a(Bundle bundle) {
        String e10 = e();
        if (bundle.containsKey(e10.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e10) : new String("com.google.android.gms.ads.flag."))) {
            String e11 = e();
            return Float.valueOf(bundle.getFloat(e11.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e11) : new String("com.google.android.gms.ads.flag.")));
        }
        return f();
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Float f10) {
        editor.putFloat(e(), f10.floatValue());
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Float c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(e(), f().floatValue()));
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Float d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(e(), f().floatValue()));
    }
}
