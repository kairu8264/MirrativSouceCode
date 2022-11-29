package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vj1 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f11108a;

    /* renamed from: b  reason: collision with root package name */
    public final qj1 f11109b;

    public vj1(Executor executor, qj1 qj1Var) {
        this.f11108a = executor;
        this.f11109b = qj1Var;
    }

    public final s43<List<uj1>> a(JSONObject jSONObject, String str) {
        s43 a10;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return j43.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                a10 = j43.a(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    a10 = j43.a(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        a10 = j43.a(new uj1(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        a10 = j43.j(this.f11109b.a(optJSONObject, "image_value"), new bx2(optString) { // from class: ai.tj1

                            /* renamed from: a  reason: collision with root package name */
                            public final String f10327a;

                            {
                                this.f10327a = optString;
                            }

                            @Override // ai.bx2
                            public final Object apply(Object obj) {
                                return new uj1(this.f10327a, (wz) obj);
                            }
                        }, this.f11108a);
                    } else {
                        a10 = j43.a(null);
                    }
                }
            }
            arrayList.add(a10);
        }
        return j43.j(j43.k(arrayList), sj1.f9847a, this.f11108a);
    }
}
