package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tg0 extends sh.a {
    public static final Parcelable.Creator<tg0> CREATOR = new ug0();
    public final List<String> A;
    public final boolean B;
    public final boolean C;
    public final List<String> D;

    /* renamed from: w  reason: collision with root package name */
    public final String f10284w;

    /* renamed from: x  reason: collision with root package name */
    public final String f10285x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f10286y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f10287z;

    public tg0(String str, String str2, boolean z10, boolean z11, List<String> list, boolean z12, boolean z13, List<String> list2) {
        this.f10284w = str;
        this.f10285x = str2;
        this.f10286y = z10;
        this.f10287z = z11;
        this.A = list;
        this.B = z12;
        this.C = z13;
        this.D = list2 == null ? new ArrayList<>() : list2;
    }

    public static tg0 p(JSONObject jSONObject) throws JSONException {
        return new tg0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), yg.y0.a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), yg.y0.a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f10284w, false);
        sh.b.q(parcel, 3, this.f10285x, false);
        sh.b.c(parcel, 4, this.f10286y);
        sh.b.c(parcel, 5, this.f10287z);
        sh.b.s(parcel, 6, this.A, false);
        sh.b.c(parcel, 7, this.B);
        sh.b.c(parcel, 8, this.C);
        sh.b.s(parcel, 9, this.D, false);
        sh.b.b(parcel, a10);
    }
}
