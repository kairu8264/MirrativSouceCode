package ai;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        JSONObject b10;
        rp0 rp0Var2 = rp0Var;
        yz S = rp0Var2.S();
        if (S != null && (b10 = S.b()) != null) {
            rp0Var2.c("nativeAdViewSignalsReady", b10);
        } else {
            rp0Var2.c("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
