package ai;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zv0 implements mv0 {

    /* renamed from: a  reason: collision with root package name */
    public final ch0 f13207a;

    public zv0(ch0 ch0Var) {
        this.f13207a = ch0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ai.ch0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // ai.mv0
    public final void u(JSONObject jSONObject) {
        this.f13207a.d(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
