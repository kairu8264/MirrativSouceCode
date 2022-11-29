package ai;

import com.dena.mirrorman.clientlog.logs.MRLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fs1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f4179a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4180b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4181c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4182d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4183e;

    public fs1(String str, String str2, int i10, String str3, int i11) {
        this.f4179a = str;
        this.f4180b = str2;
        this.f4181c = i10;
        this.f4182d = str3;
        this.f4183e = i11;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f4179a);
        jSONObject.put("version", this.f4180b);
        jSONObject.put("status", this.f4181c);
        jSONObject.put(MRLog.PAYLOAD_KEY_DESCRIPTION, this.f4182d);
        jSONObject.put("initializationLatencyMillis", this.f4183e);
        return jSONObject;
    }
}
