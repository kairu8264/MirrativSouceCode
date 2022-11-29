package p6;

import java.io.ObjectStreamField;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements Serializable {
    public static final ObjectStreamField[] H = {new ObjectStreamField("trackerToken", String.class), new ObjectStreamField("trackerName", String.class), new ObjectStreamField("network", String.class), new ObjectStreamField("campaign", String.class), new ObjectStreamField("adgroup", String.class), new ObjectStreamField("creative", String.class), new ObjectStreamField("clickLabel", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("costType", String.class), new ObjectStreamField("costAmount", Double.class), new ObjectStreamField("costCurrency", String.class)};
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public Double F;
    public String G;

    /* renamed from: w  reason: collision with root package name */
    public String f45922w;

    /* renamed from: x  reason: collision with root package name */
    public String f45923x;

    /* renamed from: y  reason: collision with root package name */
    public String f45924y;

    /* renamed from: z  reason: collision with root package name */
    public String f45925z;

    public static f a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return null;
        }
        f fVar = new f();
        if ("unity".equals(str2)) {
            fVar.f45922w = jSONObject.optString("tracker_token", "");
            fVar.f45923x = jSONObject.optString("tracker_name", "");
            fVar.f45924y = jSONObject.optString("network", "");
            fVar.f45925z = jSONObject.optString("campaign", "");
            fVar.A = jSONObject.optString("adgroup", "");
            fVar.B = jSONObject.optString("creative", "");
            fVar.C = jSONObject.optString("click_label", "");
            if (str == null) {
                str = "";
            }
            fVar.D = str;
            fVar.E = jSONObject.optString("cost_type", "");
            fVar.F = Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            fVar.G = jSONObject.optString("cost_currency", "");
        } else {
            fVar.f45922w = jSONObject.optString("tracker_token");
            fVar.f45923x = jSONObject.optString("tracker_name");
            fVar.f45924y = jSONObject.optString("network");
            fVar.f45925z = jSONObject.optString("campaign");
            fVar.A = jSONObject.optString("adgroup");
            fVar.B = jSONObject.optString("creative");
            fVar.C = jSONObject.optString("click_label");
            fVar.D = str;
            fVar.E = jSONObject.optString("cost_type");
            fVar.F = Double.valueOf(jSONObject.optDouble("cost_amount"));
            fVar.G = jSONObject.optString("cost_currency");
        }
        return fVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            return c1.i(this.f45922w, fVar.f45922w) && c1.i(this.f45923x, fVar.f45923x) && c1.i(this.f45924y, fVar.f45924y) && c1.i(this.f45925z, fVar.f45925z) && c1.i(this.A, fVar.A) && c1.i(this.B, fVar.B) && c1.i(this.C, fVar.C) && c1.i(this.D, fVar.D) && c1.i(this.E, fVar.E) && c1.j(this.F, fVar.F) && c1.i(this.G, fVar.G);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((629 + c1.L(this.f45922w)) * 37) + c1.L(this.f45923x)) * 37) + c1.L(this.f45924y)) * 37) + c1.L(this.f45925z)) * 37) + c1.L(this.A)) * 37) + c1.L(this.B)) * 37) + c1.L(this.C)) * 37) + c1.L(this.D)) * 37) + c1.L(this.E)) * 37) + c1.H(this.F)) * 37) + c1.L(this.G);
    }

    public String toString() {
        return c1.k("tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s adid:%s ct:%s ca:%.2f cc:%s", this.f45922w, this.f45923x, this.f45924y, this.f45925z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }
}
