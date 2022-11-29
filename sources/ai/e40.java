package ai;

import com.google.android.gms.internal.ads.zzbtv;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e40 implements f40 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ mk0 f3525a;

    public e40(g40 g40Var, mk0 mk0Var) {
        this.f3525a = mk0Var;
    }

    @Override // ai.f40
    public final void t(String str) {
        this.f3525a.e(new zzbtv(str));
    }

    @Override // ai.f40
    public final void u(JSONObject jSONObject) {
        this.f3525a.d(jSONObject);
    }
}
