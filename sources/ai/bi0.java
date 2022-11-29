package ai;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class bi0 {

    /* renamed from: a  reason: collision with root package name */
    public static bi0 f2355a;

    public static synchronized bi0 d(Context context) {
        synchronized (bi0.class) {
            bi0 bi0Var = f2355a;
            if (bi0Var != null) {
                return bi0Var;
            }
            Context applicationContext = context.getApplicationContext();
            ox.a(applicationContext);
            yg.r1 p10 = wg.t.h().p();
            p10.p(applicationContext);
            eh0 eh0Var = new eh0(null);
            eh0Var.a(applicationContext);
            eh0Var.b(wg.t.k());
            eh0Var.c(p10);
            eh0Var.d(wg.t.a());
            bi0 e10 = eh0Var.e();
            f2355a = e10;
            e10.a().a();
            f2355a.b().e();
            final gi0 c10 = f2355a.c();
            if (((Boolean) ft.c().c(ox.f8029l0)).booleanValue()) {
                final HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) ft.c().c(ox.f8045n0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                String optString = optJSONArray.optString(i10);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        c10.c(str);
                    }
                    c10.b(new fi0(c10, hashMap) { // from class: ai.di0

                        /* renamed from: a  reason: collision with root package name */
                        public final gi0 f3298a;

                        /* renamed from: b  reason: collision with root package name */
                        public final Map f3299b;

                        {
                            this.f3298a = c10;
                            this.f3299b = hashMap;
                        }

                        @Override // ai.fi0
                        public final void a(SharedPreferences sharedPreferences, String str2, String str3) {
                            this.f3298a.d(this.f3299b, sharedPreferences, str2, str3);
                        }
                    });
                } catch (JSONException e11) {
                    uj0.b("Failed to parse listening list", e11);
                }
            }
            return f2355a;
        }
    }

    public abstract xg0 a();

    public abstract ch0 b();

    public abstract gi0 c();
}
