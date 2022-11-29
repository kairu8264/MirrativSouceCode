package ai;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ls0 implements rn3<te0> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f6653a;

    public ls0(eo3<Context> eo3Var) {
        this.f6653a = eo3Var;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final te0 zzb() {
        Context a10 = ((tr0) this.f6653a).a();
        y70 a11 = wg.t.q().a(a10, zj0.p());
        s70<JSONObject> s70Var = v70.f10994b;
        a11.a("google.afma.request.getAdDictionary", s70Var, s70Var);
        return new se0(a10, wg.t.q().a(a10, zj0.p()).a("google.afma.sdkConstants.getSdkConstants", s70Var, s70Var));
    }
}
