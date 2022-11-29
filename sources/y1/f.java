package y1;

import java.util.ArrayList;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class f {
    public static final List<a.b<p>> b(List<a.b<p>> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            a.b<p> bVar = list.get(i12);
            a.b<p> bVar2 = bVar;
            if (b.g(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            a.b bVar3 = (a.b) arrayList.get(i13);
            if (i10 <= bVar3.f() && bVar3.d() <= i11) {
                arrayList2.add(new a.b(bVar3.e(), bVar3.f() - i10, bVar3.d() - i10));
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
