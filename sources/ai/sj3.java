package ai;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sj3 {
    public static final int a(int i10, Object obj, Object obj2) {
        rj3 rj3Var = (rj3) obj;
        qj3 qj3Var = (qj3) obj2;
        if (rj3Var.isEmpty()) {
            return 0;
        }
        Iterator it = rj3Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean b(Object obj) {
        return !((rj3) obj).i();
    }

    public static final Object c(Object obj, Object obj2) {
        rj3 rj3Var = (rj3) obj;
        rj3 rj3Var2 = (rj3) obj2;
        if (!rj3Var2.isEmpty()) {
            if (!rj3Var.i()) {
                rj3Var = rj3Var.g();
            }
            rj3Var.f(rj3Var2);
        }
        return rj3Var;
    }
}
