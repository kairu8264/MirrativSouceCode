package ai;

import com.google.android.gms.internal.ads.zzbtv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j80 implements f40 {

    /* renamed from: a  reason: collision with root package name */
    public final mk0 f5660a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k80 f5661b;

    public j80(k80 k80Var, mk0 mk0Var) {
        this.f5661b = k80Var;
        this.f5660a = mk0Var;
    }

    @Override // ai.f40
    public final void t(String str) {
        try {
            if (str == null) {
                this.f5660a.e(new zzbtv());
            } else {
                this.f5660a.e(new zzbtv(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // ai.f40
    public final void u(JSONObject jSONObject) {
        try {
            this.f5660a.d(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f5660a.e(e10);
        }
    }
}
