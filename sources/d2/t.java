package d2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t {
    public final List<k> a(List<? extends k> list, x xVar, int i10) {
        jo.p.h(list, "fontList");
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= size) {
                break;
            }
            k kVar = list.get(i12);
            k kVar2 = kVar;
            if ((jo.p.c(kVar2.b(), xVar) && u.f(kVar2.c(), i10)) ? false : false) {
                arrayList.add(kVar);
            }
            i12++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        wn.v vVar = wn.v.f59242a;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            k kVar3 = list.get(i13);
            if (u.f(kVar3.c(), i10)) {
                arrayList2.add(kVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        x.a aVar = x.f29149x;
        x xVar2 = null;
        if (xVar.compareTo(aVar.e()) < 0) {
            int size3 = list.size();
            x xVar3 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                x b10 = list.get(i14).b();
                if (b10.compareTo(xVar) < 0) {
                    if (xVar2 == null || b10.compareTo(xVar2) > 0) {
                        xVar2 = b10;
                    }
                } else if (b10.compareTo(xVar) <= 0) {
                    xVar3 = b10;
                    xVar2 = xVar3;
                    break;
                } else if (xVar3 == null || b10.compareTo(xVar3) < 0) {
                    xVar3 = b10;
                }
                i14++;
            }
            if (xVar2 != null) {
                xVar3 = xVar2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i11 < size4) {
                k kVar4 = list.get(i11);
                if (jo.p.c(kVar4.b(), xVar3)) {
                    arrayList3.add(kVar4);
                }
                i11++;
            }
            return arrayList3;
        } else if (xVar.compareTo(aVar.f()) > 0) {
            int size5 = list.size();
            x xVar4 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                x b11 = list.get(i15).b();
                if (b11.compareTo(xVar) < 0) {
                    if (xVar2 == null || b11.compareTo(xVar2) > 0) {
                        xVar2 = b11;
                    }
                } else if (b11.compareTo(xVar) <= 0) {
                    xVar4 = b11;
                    xVar2 = xVar4;
                    break;
                } else if (xVar4 == null || b11.compareTo(xVar4) < 0) {
                    xVar4 = b11;
                }
                i15++;
            }
            if (xVar4 == null) {
                xVar4 = xVar2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i11 < size6) {
                k kVar5 = list.get(i11);
                if (jo.p.c(kVar5.b(), xVar4)) {
                    arrayList4.add(kVar5);
                }
                i11++;
            }
            return arrayList4;
        } else {
            x f10 = aVar.f();
            int size7 = list.size();
            x xVar5 = null;
            x xVar6 = null;
            int i16 = 0;
            while (true) {
                if (i16 >= size7) {
                    break;
                }
                x b12 = list.get(i16).b();
                if (f10 == null || b12.compareTo(f10) <= 0) {
                    if (b12.compareTo(xVar) < 0) {
                        if (xVar5 == null || b12.compareTo(xVar5) > 0) {
                            xVar5 = b12;
                        }
                    } else if (b12.compareTo(xVar) <= 0) {
                        xVar5 = b12;
                        xVar6 = xVar5;
                        break;
                    } else if (xVar6 == null || b12.compareTo(xVar6) < 0) {
                        xVar6 = b12;
                    }
                }
                i16++;
            }
            if (xVar6 != null) {
                xVar5 = xVar6;
            }
            ArrayList arrayList5 = new ArrayList(list.size());
            int size8 = list.size();
            for (int i17 = 0; i17 < size8; i17++) {
                k kVar6 = list.get(i17);
                if (jo.p.c(kVar6.b(), xVar5)) {
                    arrayList5.add(kVar6);
                }
            }
            if (arrayList5.isEmpty()) {
                x f11 = x.f29149x.f();
                int size9 = list.size();
                x xVar7 = null;
                int i18 = 0;
                while (true) {
                    if (i18 >= size9) {
                        break;
                    }
                    x b13 = list.get(i18).b();
                    if (f11 == null || b13.compareTo(f11) >= 0) {
                        if (b13.compareTo(xVar) < 0) {
                            if (xVar2 == null || b13.compareTo(xVar2) > 0) {
                                xVar2 = b13;
                            }
                        } else if (b13.compareTo(xVar) <= 0) {
                            xVar2 = b13;
                            xVar7 = xVar2;
                            break;
                        } else if (xVar7 == null || b13.compareTo(xVar7) < 0) {
                            xVar7 = b13;
                        }
                    }
                    i18++;
                }
                if (xVar7 != null) {
                    xVar2 = xVar7;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size10 = list.size();
                while (i11 < size10) {
                    k kVar7 = list.get(i11);
                    if (jo.p.c(kVar7.b(), xVar2)) {
                        arrayList6.add(kVar7);
                    }
                    i11++;
                }
                return arrayList6;
            }
            return arrayList5;
        }
    }
}
