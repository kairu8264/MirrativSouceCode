package hf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i<T> implements h<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // hf.h
    public List<T> a(List<? extends T> list, int i10, int i11) {
        jo.p.h(list, "items");
        int i12 = i10 * i11;
        if (list.size() % i12 != 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        int i13 = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                xn.s.t();
            }
            arrayList.add(list.get(((i13 % i11) * i10) + ((i13 % i12) / i11) + ((i13 / i12) * i12)));
            i13 = i14;
        }
        return arrayList;
    }
}
