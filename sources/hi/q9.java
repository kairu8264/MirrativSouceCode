package hi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q9 {
    public static final int a(int i10, Object obj, Object obj2) {
        p9 p9Var = (p9) obj;
        o9 o9Var = (o9) obj2;
        if (p9Var.isEmpty()) {
            return 0;
        }
        Iterator it = p9Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object b(Object obj, Object obj2) {
        p9 p9Var = (p9) obj;
        p9 p9Var2 = (p9) obj2;
        if (!p9Var2.isEmpty()) {
            if (!p9Var.i()) {
                p9Var = p9Var.f();
            }
            p9Var.h(p9Var2);
        }
        return p9Var;
    }
}
