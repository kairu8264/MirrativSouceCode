package g1;

import g1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xn.i0;

/* loaded from: classes.dex */
public final class g {
    public static final List<f> a(char c10, float[] fArr) {
        ArrayList arrayList;
        Object mVar;
        jo.p.h(fArr, "args");
        if (c10 == 'z' || c10 == 'Z') {
            return xn.r.d(f.b.f32415c);
        }
        if (c10 == 'm') {
            po.g s10 = po.n.s(new po.i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(xn.t.u(s10, 10));
            Iterator<Integer> it = s10.iterator();
            while (it.hasNext()) {
                int b10 = ((i0) it).b();
                float[] o10 = xn.n.o(fArr, b10, b10 + 2);
                Object nVar = new f.n(o10[0], o10[1]);
                if ((nVar instanceof f.C0374f) && b10 > 0) {
                    nVar = new f.e(o10[0], o10[1]);
                } else if (b10 > 0) {
                    nVar = new f.m(o10[0], o10[1]);
                }
                arrayList.add(nVar);
            }
        } else if (c10 == 'M') {
            po.g s11 = po.n.s(new po.i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(xn.t.u(s11, 10));
            Iterator<Integer> it2 = s11.iterator();
            while (it2.hasNext()) {
                int b11 = ((i0) it2).b();
                float[] o11 = xn.n.o(fArr, b11, b11 + 2);
                Object c0374f = new f.C0374f(o11[0], o11[1]);
                if (b11 > 0) {
                    c0374f = new f.e(o11[0], o11[1]);
                } else if ((c0374f instanceof f.n) && b11 > 0) {
                    c0374f = new f.m(o11[0], o11[1]);
                }
                arrayList.add(c0374f);
            }
        } else if (c10 == 'l') {
            po.g s12 = po.n.s(new po.i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(xn.t.u(s12, 10));
            Iterator<Integer> it3 = s12.iterator();
            while (it3.hasNext()) {
                int b12 = ((i0) it3).b();
                float[] o12 = xn.n.o(fArr, b12, b12 + 2);
                Object mVar2 = new f.m(o12[0], o12[1]);
                if ((mVar2 instanceof f.C0374f) && b12 > 0) {
                    mVar2 = new f.e(o12[0], o12[1]);
                } else if ((mVar2 instanceof f.n) && b12 > 0) {
                    mVar2 = new f.m(o12[0], o12[1]);
                }
                arrayList.add(mVar2);
            }
        } else if (c10 == 'L') {
            po.g s13 = po.n.s(new po.i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(xn.t.u(s13, 10));
            Iterator<Integer> it4 = s13.iterator();
            while (it4.hasNext()) {
                int b13 = ((i0) it4).b();
                float[] o13 = xn.n.o(fArr, b13, b13 + 2);
                Object eVar = new f.e(o13[0], o13[1]);
                if ((eVar instanceof f.C0374f) && b13 > 0) {
                    eVar = new f.e(o13[0], o13[1]);
                } else if ((eVar instanceof f.n) && b13 > 0) {
                    eVar = new f.m(o13[0], o13[1]);
                }
                arrayList.add(eVar);
            }
        } else if (c10 == 'h') {
            po.g s14 = po.n.s(new po.i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(xn.t.u(s14, 10));
            Iterator<Integer> it5 = s14.iterator();
            while (it5.hasNext()) {
                int b14 = ((i0) it5).b();
                float[] o14 = xn.n.o(fArr, b14, b14 + 1);
                Object lVar = new f.l(o14[0]);
                if ((lVar instanceof f.C0374f) && b14 > 0) {
                    lVar = new f.e(o14[0], o14[1]);
                } else if ((lVar instanceof f.n) && b14 > 0) {
                    lVar = new f.m(o14[0], o14[1]);
                }
                arrayList.add(lVar);
            }
        } else if (c10 == 'H') {
            po.g s15 = po.n.s(new po.i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(xn.t.u(s15, 10));
            Iterator<Integer> it6 = s15.iterator();
            while (it6.hasNext()) {
                int b15 = ((i0) it6).b();
                float[] o15 = xn.n.o(fArr, b15, b15 + 1);
                Object dVar = new f.d(o15[0]);
                if ((dVar instanceof f.C0374f) && b15 > 0) {
                    dVar = new f.e(o15[0], o15[1]);
                } else if ((dVar instanceof f.n) && b15 > 0) {
                    dVar = new f.m(o15[0], o15[1]);
                }
                arrayList.add(dVar);
            }
        } else if (c10 == 'v') {
            po.g s16 = po.n.s(new po.i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(xn.t.u(s16, 10));
            Iterator<Integer> it7 = s16.iterator();
            while (it7.hasNext()) {
                int b16 = ((i0) it7).b();
                float[] o16 = xn.n.o(fArr, b16, b16 + 1);
                Object rVar = new f.r(o16[0]);
                if ((rVar instanceof f.C0374f) && b16 > 0) {
                    rVar = new f.e(o16[0], o16[1]);
                } else if ((rVar instanceof f.n) && b16 > 0) {
                    rVar = new f.m(o16[0], o16[1]);
                }
                arrayList.add(rVar);
            }
        } else if (c10 == 'V') {
            po.g s17 = po.n.s(new po.i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(xn.t.u(s17, 10));
            Iterator<Integer> it8 = s17.iterator();
            while (it8.hasNext()) {
                int b17 = ((i0) it8).b();
                float[] o17 = xn.n.o(fArr, b17, b17 + 1);
                Object sVar = new f.s(o17[0]);
                if ((sVar instanceof f.C0374f) && b17 > 0) {
                    sVar = new f.e(o17[0], o17[1]);
                } else if ((sVar instanceof f.n) && b17 > 0) {
                    sVar = new f.m(o17[0], o17[1]);
                }
                arrayList.add(sVar);
            }
        } else {
            char c11 = 5;
            if (c10 == 'c') {
                po.g s18 = po.n.s(new po.i(0, fArr.length - 6), 6);
                arrayList = new ArrayList(xn.t.u(s18, 10));
                Iterator<Integer> it9 = s18.iterator();
                while (it9.hasNext()) {
                    int b18 = ((i0) it9).b();
                    float[] o18 = xn.n.o(fArr, b18, b18 + 6);
                    Object kVar = new f.k(o18[0], o18[1], o18[2], o18[3], o18[4], o18[c11]);
                    if (!(kVar instanceof f.C0374f) || b18 <= 0) {
                        mVar = (!(kVar instanceof f.n) || b18 <= 0) ? kVar : new f.m(o18[0], o18[1]);
                    } else {
                        mVar = new f.e(o18[0], o18[1]);
                    }
                    arrayList.add(mVar);
                    c11 = 5;
                }
            } else if (c10 == 'C') {
                po.g s19 = po.n.s(new po.i(0, fArr.length - 6), 6);
                arrayList = new ArrayList(xn.t.u(s19, 10));
                Iterator<Integer> it10 = s19.iterator();
                while (it10.hasNext()) {
                    int b19 = ((i0) it10).b();
                    float[] o19 = xn.n.o(fArr, b19, b19 + 6);
                    Object cVar = new f.c(o19[0], o19[1], o19[2], o19[3], o19[4], o19[5]);
                    if ((cVar instanceof f.C0374f) && b19 > 0) {
                        cVar = new f.e(o19[0], o19[1]);
                    } else if ((cVar instanceof f.n) && b19 > 0) {
                        cVar = new f.m(o19[0], o19[1]);
                    }
                    arrayList.add(cVar);
                }
            } else if (c10 == 's') {
                po.g s20 = po.n.s(new po.i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(xn.t.u(s20, 10));
                Iterator<Integer> it11 = s20.iterator();
                while (it11.hasNext()) {
                    int b20 = ((i0) it11).b();
                    float[] o20 = xn.n.o(fArr, b20, b20 + 4);
                    Object pVar = new f.p(o20[0], o20[1], o20[2], o20[3]);
                    if ((pVar instanceof f.C0374f) && b20 > 0) {
                        pVar = new f.e(o20[0], o20[1]);
                    } else if ((pVar instanceof f.n) && b20 > 0) {
                        pVar = new f.m(o20[0], o20[1]);
                    }
                    arrayList.add(pVar);
                }
            } else if (c10 == 'S') {
                po.g s21 = po.n.s(new po.i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(xn.t.u(s21, 10));
                Iterator<Integer> it12 = s21.iterator();
                while (it12.hasNext()) {
                    int b21 = ((i0) it12).b();
                    float[] o21 = xn.n.o(fArr, b21, b21 + 4);
                    Object hVar = new f.h(o21[0], o21[1], o21[2], o21[3]);
                    if ((hVar instanceof f.C0374f) && b21 > 0) {
                        hVar = new f.e(o21[0], o21[1]);
                    } else if ((hVar instanceof f.n) && b21 > 0) {
                        hVar = new f.m(o21[0], o21[1]);
                    }
                    arrayList.add(hVar);
                }
            } else if (c10 == 'q') {
                po.g s22 = po.n.s(new po.i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(xn.t.u(s22, 10));
                Iterator<Integer> it13 = s22.iterator();
                while (it13.hasNext()) {
                    int b22 = ((i0) it13).b();
                    float[] o22 = xn.n.o(fArr, b22, b22 + 4);
                    Object oVar = new f.o(o22[0], o22[1], o22[2], o22[3]);
                    if ((oVar instanceof f.C0374f) && b22 > 0) {
                        oVar = new f.e(o22[0], o22[1]);
                    } else if ((oVar instanceof f.n) && b22 > 0) {
                        oVar = new f.m(o22[0], o22[1]);
                    }
                    arrayList.add(oVar);
                }
            } else if (c10 == 'Q') {
                po.g s23 = po.n.s(new po.i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(xn.t.u(s23, 10));
                Iterator<Integer> it14 = s23.iterator();
                while (it14.hasNext()) {
                    int b23 = ((i0) it14).b();
                    float[] o23 = xn.n.o(fArr, b23, b23 + 4);
                    Object gVar = new f.g(o23[0], o23[1], o23[2], o23[3]);
                    if ((gVar instanceof f.C0374f) && b23 > 0) {
                        gVar = new f.e(o23[0], o23[1]);
                    } else if ((gVar instanceof f.n) && b23 > 0) {
                        gVar = new f.m(o23[0], o23[1]);
                    }
                    arrayList.add(gVar);
                }
            } else if (c10 == 't') {
                po.g s24 = po.n.s(new po.i(0, fArr.length - 2), 2);
                arrayList = new ArrayList(xn.t.u(s24, 10));
                Iterator<Integer> it15 = s24.iterator();
                while (it15.hasNext()) {
                    int b24 = ((i0) it15).b();
                    float[] o24 = xn.n.o(fArr, b24, b24 + 2);
                    Object qVar = new f.q(o24[0], o24[1]);
                    if ((qVar instanceof f.C0374f) && b24 > 0) {
                        qVar = new f.e(o24[0], o24[1]);
                    } else if ((qVar instanceof f.n) && b24 > 0) {
                        qVar = new f.m(o24[0], o24[1]);
                    }
                    arrayList.add(qVar);
                }
            } else if (c10 == 'T') {
                po.g s25 = po.n.s(new po.i(0, fArr.length - 2), 2);
                arrayList = new ArrayList(xn.t.u(s25, 10));
                Iterator<Integer> it16 = s25.iterator();
                while (it16.hasNext()) {
                    int b25 = ((i0) it16).b();
                    float[] o25 = xn.n.o(fArr, b25, b25 + 2);
                    Object iVar = new f.i(o25[0], o25[1]);
                    if ((iVar instanceof f.C0374f) && b25 > 0) {
                        iVar = new f.e(o25[0], o25[1]);
                    } else if ((iVar instanceof f.n) && b25 > 0) {
                        iVar = new f.m(o25[0], o25[1]);
                    }
                    arrayList.add(iVar);
                }
            } else if (c10 == 'a') {
                po.g s26 = po.n.s(new po.i(0, fArr.length - 7), 7);
                arrayList = new ArrayList(xn.t.u(s26, 10));
                Iterator<Integer> it17 = s26.iterator();
                while (it17.hasNext()) {
                    int b26 = ((i0) it17).b();
                    float[] o26 = xn.n.o(fArr, b26, b26 + 7);
                    Object jVar = new f.j(o26[0], o26[1], o26[2], Float.compare(o26[3], 0.0f) != 0, Float.compare(o26[4], 0.0f) != 0, o26[5], o26[6]);
                    if ((jVar instanceof f.C0374f) && b26 > 0) {
                        jVar = new f.e(o26[0], o26[1]);
                    } else if ((jVar instanceof f.n) && b26 > 0) {
                        jVar = new f.m(o26[0], o26[1]);
                    }
                    arrayList.add(jVar);
                }
            } else if (c10 == 'A') {
                po.g s27 = po.n.s(new po.i(0, fArr.length - 7), 7);
                arrayList = new ArrayList(xn.t.u(s27, 10));
                Iterator<Integer> it18 = s27.iterator();
                while (it18.hasNext()) {
                    int b27 = ((i0) it18).b();
                    float[] o27 = xn.n.o(fArr, b27, b27 + 7);
                    Object aVar = new f.a(o27[0], o27[1], o27[2], Float.compare(o27[3], 0.0f) != 0, Float.compare(o27[4], 0.0f) != 0, o27[5], o27[6]);
                    if ((aVar instanceof f.C0374f) && b27 > 0) {
                        aVar = new f.e(o27[0], o27[1]);
                    } else if ((aVar instanceof f.n) && b27 > 0) {
                        aVar = new f.m(o27[0], o27[1]);
                    }
                    arrayList.add(aVar);
                }
            } else {
                throw new IllegalArgumentException("Unknown command for: " + c10);
            }
        }
        return arrayList;
    }
}
