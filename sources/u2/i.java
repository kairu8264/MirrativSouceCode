package u2;

import java.util.ArrayList;
import t2.e;

/* loaded from: classes.dex */
public class i {
    public static o a(t2.e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        int j12;
        if (i10 == 0) {
            i11 = eVar.G0;
        } else {
            i11 = eVar.H0;
        }
        if (i11 != -1 && (oVar == null || i11 != oVar.f54334b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof t2.i) && (j12 = ((t2.i) eVar).j1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i13);
                    if (oVar3.c() == j12) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof t2.g) {
                t2.g gVar = (t2.g) eVar;
                gVar.i1().b(gVar.j1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.G0 = oVar.c();
                eVar.N.b(i10, arrayList, oVar);
                eVar.P.b(i10, arrayList, oVar);
            } else {
                eVar.H0 = oVar.c();
                eVar.O.b(i10, arrayList, oVar);
                eVar.R.b(i10, arrayList, oVar);
                eVar.Q.b(i10, arrayList, oVar);
            }
            eVar.U.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f54334b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0390 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(t2.f r16, u2.b.InterfaceC0853b r17) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.i.c(t2.f, u2.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
