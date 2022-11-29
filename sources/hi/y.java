package hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, x> f36072a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final l0 f36073b = new l0();

    public y() {
        b(new w());
        b(new z());
        b(new a0());
        b(new e0());
        b(new j0());
        b(new k0());
        b(new m0());
    }

    public final q a(u4 u4Var, q qVar) {
        x xVar;
        v5.c(u4Var);
        if (qVar instanceof r) {
            r rVar = (r) qVar;
            ArrayList<q> b10 = rVar.b();
            String a10 = rVar.a();
            if (this.f36072a.containsKey(a10)) {
                xVar = this.f36072a.get(a10);
            } else {
                xVar = this.f36073b;
            }
            return xVar.a(a10, u4Var, b10);
        }
        return qVar;
    }

    public final void b(x xVar) {
        for (n0 n0Var : xVar.f36056a) {
            this.f36072a.put(n0Var.c().toString(), xVar);
        }
    }
}
