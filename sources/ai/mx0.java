package ai;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mx0 implements rn3<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<fl2> f7092a;

    public mx0(eo3<fl2> eo3Var) {
        this.f7092a = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((k11) this.f7092a).a().f4115z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
