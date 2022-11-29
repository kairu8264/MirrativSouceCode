package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q33<V> extends s33<V, List<V>> {
    public q33(uz2<? extends s43<? extends V>> uz2Var, boolean z10) {
        super(uz2Var, true);
        T();
    }

    @Override // ai.s33
    public final /* bridge */ /* synthetic */ Object X(List list) {
        ArrayList a10 = r03.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r33 r33Var = (r33) it.next();
            a10.add(r33Var != null ? r33Var.f9328a : null);
        }
        return Collections.unmodifiableList(a10);
    }
}
