package ai;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w42 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, y42> f11487a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a52> f11488b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Map<String, List<y42>>> f11489c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Executor f11490d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f11491e;

    public w42(Executor executor) {
        this.f11490d = executor;
    }

    public static final Bundle l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void a() {
        wg.t.h().p().f(new Runnable(this) { // from class: ai.t42

            /* renamed from: w  reason: collision with root package name */
            public final w42 f10145w;

            {
                this.f10145w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10145w.e();
            }
        });
        this.f11490d.execute(new Runnable(this) { // from class: ai.u42

            /* renamed from: w  reason: collision with root package name */
            public final w42 f10606w;

            {
                this.f10606w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10606w.f();
            }
        });
    }

    public final synchronized Map<String, a52> b() {
        return d03.e(this.f11488b);
    }

    public final synchronized Map<String, List<Bundle>> c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, List<y42>> map = this.f11489c.get(str);
            if (map == null) {
                return d03.d();
            }
            List<y42> list = map.get(str2);
            if (list == null) {
                list = map.get(tn1.a(this.f11491e, str2, str));
            }
            if (list == null) {
                return d03.d();
            }
            HashMap hashMap = new HashMap();
            for (y42 y42Var : list) {
                String str3 = y42Var.f12443a;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(y42Var.f12445c);
            }
            return d03.e(hashMap);
        }
        return d03.d();
    }

    public final synchronized void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f11487a.containsKey(str)) {
            return;
        }
        this.f11487a.put(str, new y42(str, "", new Bundle()));
    }

    public final /* synthetic */ void e() {
        this.f11490d.execute(new Runnable(this) { // from class: ai.v42

            /* renamed from: w  reason: collision with root package name */
            public final w42 f10975w;

            {
                this.f10975w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10975w.f();
            }
        });
    }

    /* renamed from: g */
    public final synchronized void f() {
        this.f11488b.clear();
        this.f11487a.clear();
        i();
        h();
    }

    public final synchronized void h() {
        if (!hz.f5048e.e().booleanValue()) {
            if (((Boolean) ft.c().c(ox.f7998h1)).booleanValue()) {
                JSONObject g10 = wg.t.h().p().n().g();
                if (g10 == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = g10.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle l10 = l(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f11488b.put(optString, new a52(optString, optBoolean2, optBoolean, l10));
                        }
                    }
                } catch (JSONException e10) {
                    yg.p1.l("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    public final synchronized void i() {
        JSONArray optJSONArray;
        JSONObject g10 = wg.t.h().p().n().g();
        if (g10 != null) {
            try {
                JSONArray optJSONArray2 = g10.optJSONArray("ad_unit_id_settings");
                this.f11491e = g10.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i10);
                        String optString = jSONObject.optString("ad_unit_id", "");
                        String optString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                arrayList.addAll(j(optJSONArray.getJSONObject(i11), optString2));
                            }
                        }
                        k(optString2, optString, arrayList);
                    }
                }
            } catch (JSONException e10) {
                yg.p1.l("Malformed config loading JSON.", e10);
            }
        }
    }

    public final synchronized List<y42> j(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle l10 = l(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            String optString = optJSONArray.optString(i10, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) arrayList2.get(i11);
            d(str2);
            if (this.f11487a.get(str2) != null) {
                arrayList.add(new y42(str2, str, l10));
            }
        }
        return arrayList;
    }

    public final synchronized void k(String str, String str2, List<y42> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, List<y42>> map = this.f11489c.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        this.f11489c.put(str, map);
        List<y42> list2 = map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }
}
