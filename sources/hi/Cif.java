package hi;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: hi.if  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap<Integer, p> f35815a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap<Integer, p> f35816b = new TreeMap<>();

    public static final int c(u4 u4Var, p pVar, q qVar) {
        q a10 = pVar.a(u4Var, Collections.singletonList(qVar));
        if (a10 instanceof i) {
            return v5.b(a10.e().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, p pVar, String str2) {
        TreeMap<Integer, p> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f35816b;
        } else if (!"edit".equals(str2)) {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        } else {
            treeMap = this.f35815a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), pVar);
    }

    public final void b(u4 u4Var, c cVar) {
        t9 t9Var = new t9(cVar);
        for (Integer num : this.f35815a.keySet()) {
            b clone = cVar.b().clone();
            int c10 = c(u4Var, this.f35815a.get(num), t9Var);
            if (c10 == 2 || c10 == -1) {
                cVar.f(clone);
            }
        }
        for (Integer num2 : this.f35816b.keySet()) {
            c(u4Var, this.f35816b.get(num2), t9Var);
        }
    }
}
