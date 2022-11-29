package ai;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bx extends gx<Long> {
    public bx(int i10, String str, Long l10) {
        super(1, str, l10, null);
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Long a(Bundle bundle) {
        String e10 = e();
        if (bundle.containsKey(e10.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e10) : new String("com.google.android.gms.ads.flag."))) {
            String e11 = e();
            return Long.valueOf(bundle.getLong(e11.length() != 0 ? "com.google.android.gms.ads.flag.".concat(e11) : new String("com.google.android.gms.ads.flag.")));
        }
        return f();
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Long l10) {
        editor.putLong(e(), l10.longValue());
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Long c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(e(), f().longValue()));
    }

    @Override // ai.gx
    public final /* bridge */ /* synthetic */ Long d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(e(), f().longValue()));
    }
}
