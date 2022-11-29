package y1;

import java.util.ArrayList;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final a f61063a = new a("", null, null, 6, null);

    public static final boolean c(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if ((i12 == i13) == (i10 == i11)) {
                return true;
            }
        }
        return false;
    }

    public static final a d() {
        return f61063a;
    }

    public static final <T> List<a.b<T>> e(List<? extends a.b<? extends T>> list, int i10, int i11) {
        if (i10 <= i11) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                a.b<? extends T> bVar = list.get(i12);
                a.b<? extends T> bVar2 = bVar;
                if (g(i10, i11, bVar2.f(), bVar2.d())) {
                    arrayList.add(bVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                a.b bVar3 = (a.b) arrayList.get(i13);
                arrayList2.add(new a.b(bVar3.e(), Math.max(i10, bVar3.f()) - i10, Math.min(i11, bVar3.d()) - i10, bVar3.g()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
    }

    public static final List<a.b<v>> f(a aVar, int i10, int i11) {
        if (i10 == i11) {
            return xn.s.k();
        }
        if (i10 == 0 && i11 >= aVar.g().length()) {
            return aVar.e();
        }
        List<a.b<v>> e10 = aVar.e();
        ArrayList arrayList = new ArrayList(e10.size());
        int size = e10.size();
        for (int i12 = 0; i12 < size; i12++) {
            a.b<v> bVar = e10.get(i12);
            a.b<v> bVar2 = bVar;
            if (g(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            a.b bVar3 = (a.b) arrayList.get(i13);
            arrayList2.add(new a.b(bVar3.e(), po.n.m(bVar3.f(), i10, i11) - i10, po.n.m(bVar3.d(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean g(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || c(i10, i11, i12, i13) || c(i12, i13, i10, i11);
    }

    public static final List<a.b<n>> h(a aVar, n nVar) {
        jo.p.h(aVar, "<this>");
        jo.p.h(nVar, "defaultParagraphStyle");
        int length = aVar.g().length();
        List<a.b<n>> d10 = aVar.d();
        ArrayList arrayList = new ArrayList();
        int size = d10.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            a.b<n> bVar = d10.get(i10);
            n a10 = bVar.a();
            int b10 = bVar.b();
            int c10 = bVar.c();
            if (b10 != i11) {
                arrayList.add(new a.b(nVar, i11, b10));
            }
            arrayList.add(new a.b(nVar.i(a10), b10, c10));
            i10++;
            i11 = c10;
        }
        if (i11 != length) {
            arrayList.add(new a.b(nVar, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new a.b(nVar, 0, 0));
        }
        return arrayList;
    }

    public static final a i(a aVar, int i10, int i11) {
        String str;
        if (i10 != i11) {
            str = aVar.g().substring(i10, i11);
            jo.p.g(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new a(str, f(aVar, i10, i11), null, 4, null);
    }
}
