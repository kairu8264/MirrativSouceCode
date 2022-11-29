package ai;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class lf0 extends sh.a {
    public static final Parcelable.Creator<lf0> CREATOR = new mf0();

    /* renamed from: w  reason: collision with root package name */
    public final String f6553w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6554x;

    public lf0(String str, int i10) {
        this.f6553w = str;
        this.f6554x = i10;
    }

    public static lf0 p(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new lf0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof lf0)) {
            lf0 lf0Var = (lf0) obj;
            if (rh.n.a(this.f6553w, lf0Var.f6553w) && rh.n.a(Integer.valueOf(this.f6554x), Integer.valueOf(lf0Var.f6554x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return rh.n.b(this.f6553w, Integer.valueOf(this.f6554x));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f6553w, false);
        sh.b.k(parcel, 3, this.f6554x);
        sh.b.b(parcel, a10);
    }
}
