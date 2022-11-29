package rg;

import ai.sr;
import androidx.annotation.RecentlyNonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f51336a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51337b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51338c;

    /* renamed from: d  reason: collision with root package name */
    public final a f51339d;

    public a(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i10, str, str2, null);
    }

    public a(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, a aVar) {
        this.f51336a = i10;
        this.f51337b = str;
        this.f51338c = str2;
        this.f51339d = aVar;
    }

    public int a() {
        return this.f51336a;
    }

    public String b() {
        return this.f51338c;
    }

    public String c() {
        return this.f51337b;
    }

    public final sr d() {
        a aVar = this.f51339d;
        return new sr(this.f51336a, this.f51337b, this.f51338c, aVar == null ? null : new sr(aVar.f51336a, aVar.f51337b, aVar.f51338c, null, null), null);
    }

    @RecentlyNonNull
    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f51336a);
        jSONObject.put("Message", this.f51337b);
        jSONObject.put("Domain", this.f51338c);
        a aVar = this.f51339d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", aVar.e());
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
