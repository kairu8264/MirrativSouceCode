package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uc2 implements xc2<wc2<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f10673a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f10674b;

    public uc2(t43 t43Var, Context context) {
        this.f10673a = t43Var;
        this.f10674b = context;
    }

    public static Bundle a(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i11 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i11 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = i11 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public final /* synthetic */ wc2 b() throws Exception {
        String str = (String) ft.c().c(ox.f8097t4);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle a10 = a(this.f10674b, new JSONArray(str));
            return new wc2(a10) { // from class: ai.tc2

                /* renamed from: a  reason: collision with root package name */
                public final Bundle f10234a;

                {
                    this.f10234a = a10;
                }

                @Override // ai.wc2
                public final void d(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", this.f10234a);
                }
            };
        } catch (JSONException e10) {
            uj0.b("JSON parsing error", e10);
            return null;
        }
    }

    @Override // ai.xc2
    public final s43<wc2<Bundle>> zza() {
        return this.f10673a.h(new Callable(this) { // from class: ai.sc2

            /* renamed from: a  reason: collision with root package name */
            public final uc2 f9798a;

            {
                this.f9798a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9798a.b();
            }
        });
    }
}
