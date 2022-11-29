package pi;

import hi.wc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ra {

    /* renamed from: a  reason: collision with root package name */
    public String f48201a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f48202b;

    /* renamed from: c  reason: collision with root package name */
    public hi.y4 f48203c;

    /* renamed from: d  reason: collision with root package name */
    public BitSet f48204d;

    /* renamed from: e  reason: collision with root package name */
    public BitSet f48205e;

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, Long> f48206f;

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, List<Long>> f48207g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ xa f48208h;

    public /* synthetic */ ra(xa xaVar, String str, qa qaVar) {
        this.f48208h = xaVar;
        this.f48201a = str;
        this.f48202b = true;
        this.f48204d = new BitSet();
        this.f48205e = new BitSet();
        this.f48206f = new s.a();
        this.f48207g = new s.a();
    }

    public static /* bridge */ /* synthetic */ BitSet b(ra raVar) {
        return raVar.f48204d;
    }

    public final hi.e4 a(int i10) {
        ArrayList arrayList;
        List list;
        hi.d4 s10 = hi.e4.s();
        s10.o(i10);
        s10.r(this.f48202b);
        hi.y4 y4Var = this.f48203c;
        if (y4Var != null) {
            s10.s(y4Var);
        }
        hi.x4 w10 = hi.y4.w();
        w10.q(da.J(this.f48204d));
        w10.s(da.J(this.f48205e));
        Map<Integer, Long> map = this.f48206f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f48206f.keySet()) {
                int intValue = num.intValue();
                Long l10 = this.f48206f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    hi.f4 t10 = hi.g4.t();
                    t10.q(intValue);
                    t10.o(l10.longValue());
                    arrayList2.add(t10.h());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            w10.o(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f48207g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f48207g.keySet()) {
                hi.z4 u10 = hi.a5.u();
                u10.q(num2.intValue());
                List<Long> list2 = this.f48207g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u10.o(list2);
                }
                arrayList3.add((hi.a5) u10.h());
            }
            list = arrayList3;
        }
        w10.r(list);
        s10.q(w10);
        return s10.h();
    }

    public final void c(va vaVar) {
        int a10 = vaVar.a();
        Boolean bool = vaVar.f48294c;
        if (bool != null) {
            this.f48205e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = vaVar.f48295d;
        if (bool2 != null) {
            this.f48204d.set(a10, bool2.booleanValue());
        }
        if (vaVar.f48296e != null) {
            Map<Integer, Long> map = this.f48206f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = map.get(valueOf);
            long longValue = vaVar.f48296e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f48206f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (vaVar.f48297f != null) {
            Map<Integer, List<Long>> map2 = this.f48207g;
            Integer valueOf2 = Integer.valueOf(a10);
            List<Long> list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList<>();
                this.f48207g.put(valueOf2, list);
            }
            if (vaVar.c()) {
                list.clear();
            }
            wc.b();
            g y10 = this.f48208h.f48285a.y();
            String str = this.f48201a;
            b3<Boolean> b3Var = c3.f47689a0;
            if (y10.A(str, b3Var) && vaVar.b()) {
                list.clear();
            }
            wc.b();
            if (this.f48208h.f48285a.y().A(this.f48201a, b3Var)) {
                Long valueOf3 = Long.valueOf(vaVar.f48297f.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(vaVar.f48297f.longValue() / 1000));
        }
    }

    public /* synthetic */ ra(xa xaVar, String str, hi.y4 y4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, qa qaVar) {
        this.f48208h = xaVar;
        this.f48201a = str;
        this.f48204d = bitSet;
        this.f48205e = bitSet2;
        this.f48206f = map;
        this.f48207g = new s.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f48207g.put(num, arrayList);
        }
        this.f48202b = false;
        this.f48203c = y4Var;
    }
}
