package nb;

import com.dena.mirrorman.net.api.response.GiftPanelBanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.q;
import jf.s;
import jo.p;
import ud.a1;
import ud.b1;
import ud.y0;
import ud.z0;
import xn.a0;
import xn.r;
import xn.t;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f41765a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41766b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41767a;

        static {
            int[] iArr = new int[ve.d.values().length];
            iArr[ve.d.EMOMO_QUEST_GIFT_GACHA_TICKET.ordinal()] = 1;
            f41767a = iArr;
        }
    }

    public i(int i10, int i11) {
        this.f41765a = i10;
        this.f41766b = i11;
    }

    public final List<List<ud.a>> a(List<s> list) {
        p.h(list, "panels");
        List<List<ud.a>> b10 = b(list);
        ArrayList arrayList = new ArrayList(t.u(b10, 10));
        Iterator<T> it = b10.iterator();
        while (it.hasNext()) {
            arrayList.add(e(c((List) it.next())));
        }
        return arrayList;
    }

    public final List<List<ud.a>> b(List<s> list) {
        ud.a a10;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (s sVar : list) {
            boolean z10 = ve.a.Companion.a(sVar.j()) == ve.a.HISTORY;
            GiftPanelBanner c10 = sVar.c();
            List n10 = xn.s.n(c10 != null ? y0.H.a(sVar, c10) : null);
            List<q> R = a0.R(sVar.d(), z10 ? Math.max(sVar.d().size() - (this.f41765a * this.f41766b), 0) : 0);
            ArrayList arrayList2 = new ArrayList(t.u(R, 10));
            for (q qVar : R) {
                if (a.f41767a[qVar.q().ordinal()] == 1) {
                    a10 = a1.f54731y.a(qVar);
                } else {
                    a10 = b1.f54776y.a(qVar);
                }
                arrayList2.add(a10);
            }
            arrayList.add(a0.o0(n10, arrayList2));
        }
        return arrayList;
    }

    public final List<ud.a> c(List<? extends ud.a> list) {
        List d10;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (ud.a aVar : list) {
            if (aVar instanceof y0) {
                List d11 = r.d(aVar);
                int i10 = ((this.f41765a * this.f41766b) / 2) - 1;
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    arrayList2.add(new z0(i11, false, null, 4, null));
                }
                d10 = a0.o0(d11, arrayList2);
            } else {
                d10 = r.d(aVar);
            }
            arrayList.add(d10);
        }
        return t.v(arrayList);
    }

    public final List<ud.a> d(List<? extends ud.a> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i12 + (i13 * i10);
                Object obj = (ud.a) a0.a0(list, i14);
                if (obj == null) {
                    obj = new z0(i14, i13 == 0, null, 4, null);
                }
                arrayList.add(obj);
                i13++;
            }
        }
        return arrayList;
    }

    public final List<ud.a> e(List<? extends ud.a> list) {
        boolean z10;
        int i10 = this.f41765a * this.f41766b;
        List<List> N = a0.N(list, i10);
        ArrayList arrayList = new ArrayList(t.u(N, 10));
        for (List<ud.a> list2 : N) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (ud.a aVar : list2) {
                    if (aVar instanceof y0) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            int i11 = z10 ? 2 : 1;
            int i12 = i10 / i11;
            List N2 = a0.N(list2, i12);
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList2.add(xn.s.k());
            }
            List<List<? extends ud.a>> w02 = a0.w0(a0.o0(N2, arrayList2), i11);
            ArrayList arrayList3 = new ArrayList(t.u(w02, 10));
            for (List<? extends ud.a> list3 : w02) {
                int i14 = this.f41765a;
                arrayList3.add(d(list3, i12 / i14, i14));
            }
            arrayList.add(t.v(arrayList3));
        }
        return t.v(arrayList);
    }
}
