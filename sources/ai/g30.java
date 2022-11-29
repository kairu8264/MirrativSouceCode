package ai;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        JSONObject d10;
        rp0 rp0Var2 = rp0Var;
        yz S = rp0Var2.S();
        if (S != null && (d10 = S.d()) != null) {
            rp0Var2.c("nativeClickMetaReady", d10);
        } else {
            rp0Var2.c("nativeClickMetaReady", new JSONObject());
        }
    }
}
