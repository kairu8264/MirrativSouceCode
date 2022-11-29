package hi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class k {
    public static q a(m mVar, q qVar, u4 u4Var, List<q> list) {
        if (mVar.g(qVar.h())) {
            q s10 = mVar.s(qVar.h());
            if (s10 instanceof j) {
                return ((j) s10).a(u4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", qVar.h()));
        } else if ("hasOwnProperty".equals(qVar.h())) {
            v5.h("hasOwnProperty", 1, list);
            return mVar.g(u4Var.b(list.get(0)).h()) ? q.f35926k : q.f35927l;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", qVar.h()));
        }
    }

    public static Iterator<q> b(Map<String, q> map) {
        return new l(map.keySet().iterator());
    }
}
