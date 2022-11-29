package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n30 implements r30<rp0> {
    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        String str = (String) map.get(ActionLogBase.ACTION);
        if ("pause".equals(str)) {
            rp0Var2.p0();
        } else if ("resume".equals(str)) {
            rp0Var2.s0();
        }
    }
}
