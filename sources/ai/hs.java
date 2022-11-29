package ai;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hs extends sh.a {
    public static final Parcelable.Creator<hs> CREATOR = new is();

    /* renamed from: w  reason: collision with root package name */
    public final int f4952w;

    /* renamed from: x  reason: collision with root package name */
    public final int f4953x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4954y;

    /* renamed from: z  reason: collision with root package name */
    public final long f4955z;

    public hs(int i10, int i11, String str, long j10) {
        this.f4952w = i10;
        this.f4953x = i11;
        this.f4954y = str;
        this.f4955z = j10;
    }

    public static hs p(JSONObject jSONObject) throws JSONException {
        return new hs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f4952w);
        sh.b.k(parcel, 2, this.f4953x);
        sh.b.q(parcel, 3, this.f4954y, false);
        sh.b.n(parcel, 4, this.f4955z);
        sh.b.b(parcel, a10);
    }
}
