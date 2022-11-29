package w1;

import java.util.ArrayList;
import java.util.List;
import w1.f;
import xn.a0;

/* loaded from: classes.dex */
public final class z {
    public static final s1.k a(s1.k kVar, io.l<? super s1.k, Boolean> lVar) {
        jo.p.h(kVar, "<this>");
        jo.p.h(lVar, "predicate");
        if (lVar.invoke(kVar).booleanValue()) {
            return kVar;
        }
        List<s1.k> W = kVar.W();
        int size = W.size();
        for (int i10 = 0; i10 < size; i10++) {
            s1.k a10 = a(W.get(i10), lVar);
            if (a10 != null) {
                return a10;
            }
        }
        return null;
    }

    public static final List<m> b(s1.k kVar, List<m> list) {
        jo.p.h(kVar, "<this>");
        jo.p.h(list, "list");
        if (kVar.L0()) {
            ArrayList arrayList = new ArrayList();
            List<s1.k> W = kVar.W();
            int size = W.size();
            for (int i10 = 0; i10 < size; i10++) {
                s1.k kVar2 = W.get(i10);
                if (kVar2.L0()) {
                    arrayList.add(new f(kVar, kVar2));
                }
            }
            List<f> d10 = d(arrayList);
            ArrayList arrayList2 = new ArrayList(d10.size());
            int size2 = d10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(d10.get(i11).e());
            }
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                s1.k kVar3 = (s1.k) arrayList2.get(i12);
                m j10 = r.j(kVar3);
                if (j10 != null) {
                    list.add(j10);
                } else {
                    b(kVar3, list);
                }
            }
            return list;
        }
        return list;
    }

    public static /* synthetic */ List c(s1.k kVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return b(kVar, list);
    }

    public static final List<f> d(List<f> list) {
        try {
            f.A.a(f.b.Stripe);
            List<f> D0 = a0.D0(list);
            xn.w.w(D0);
            return D0;
        } catch (IllegalArgumentException unused) {
            f.A.a(f.b.Location);
            List<f> D02 = a0.D0(list);
            xn.w.w(D02);
            return D02;
        }
    }

    public static final s1.p e(s1.k kVar) {
        s1.p b10;
        jo.p.h(kVar, "<this>");
        m i10 = r.i(kVar);
        if (i10 == null) {
            i10 = r.j(kVar);
        }
        return (i10 == null || (b10 = i10.b()) == null) ? kVar.c0() : b10;
    }
}
