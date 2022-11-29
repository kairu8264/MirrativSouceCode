package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.platform.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<s1.k, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14663w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(s1.k kVar) {
            jo.p.h(kVar, "it");
            w1.m j10 = w1.r.j(kVar);
            w1.k j11 = j10 != null ? j10.j() : null;
            boolean z10 = true;
            if (!(j11 != null && j11.s()) || !j11.g(w1.j.f57906a.p())) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final /* synthetic */ boolean a(w1.a aVar, Object obj) {
        return j(aVar, obj);
    }

    public static final /* synthetic */ boolean b(w1.q qVar) {
        return k(qVar);
    }

    public static final /* synthetic */ boolean c(w1.q qVar) {
        return l(qVar);
    }

    public static final /* synthetic */ s1.k d(s1.k kVar, io.l lVar) {
        return n(kVar, lVar);
    }

    public static final /* synthetic */ boolean e(w1.q qVar) {
        return q(qVar);
    }

    public static final /* synthetic */ boolean f(w1.q qVar) {
        return r(qVar);
    }

    public static final /* synthetic */ boolean g(w1.q qVar) {
        return s(qVar);
    }

    public static final /* synthetic */ boolean h(w1.q qVar) {
        return t(qVar);
    }

    public static final /* synthetic */ boolean i(w1.q qVar, t.g gVar) {
        return u(qVar, gVar);
    }

    public static final boolean j(w1.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (obj instanceof w1.a) {
            w1.a aVar2 = (w1.a) obj;
            if (jo.p.c(aVar.b(), aVar2.b())) {
                if (aVar.a() != null || aVar2.a() == null) {
                    return aVar.a() == null || aVar2.a() != null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean k(w1.q qVar) {
        return w1.l.a(qVar.h(), w1.t.f57947a.d()) == null;
    }

    public static final boolean l(w1.q qVar) {
        w1.k j10;
        if (!t(qVar) || jo.p.c(w1.l.a(qVar.s(), w1.t.f57947a.g()), Boolean.TRUE)) {
            s1.k n10 = n(qVar.k(), a.f14663w);
            if (n10 != null) {
                w1.m j11 = w1.r.j(n10);
                if (!((j11 == null || (j10 = j11.j()) == null) ? false : jo.p.c(w1.l.a(j10, w1.t.f57947a.g()), Boolean.TRUE))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final t1 m(List<t1> list, int i10) {
        jo.p.h(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).d() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final s1.k n(s1.k kVar, io.l<? super s1.k, Boolean> lVar) {
        for (s1.k u02 = kVar.u0(); u02 != null; u02 = u02.u0()) {
            if (lVar.invoke(u02).booleanValue()) {
                return u02;
            }
        }
        return null;
    }

    public static final Map<Integer, u1> o(w1.s sVar) {
        jo.p.h(sVar, "<this>");
        w1.q a10 = sVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a10.k().g() && a10.k().L0()) {
            Region region = new Region();
            region.set(c1.z0.a(a10.f()));
            p(region, a10, linkedHashMap, a10);
        }
        return linkedHashMap;
    }

    public static final void p(Region region, w1.q qVar, Map<Integer, u1> map, w1.q qVar2) {
        b1.h hVar;
        q1.v j10;
        boolean z10 = false;
        boolean z11 = (qVar2.k().g() && qVar2.k().L0()) ? false : true;
        if (!region.isEmpty() || qVar2.i() == qVar.i()) {
            if (!z11 || qVar2.t()) {
                Rect a10 = c1.z0.a(qVar2.r());
                Region region2 = new Region();
                region2.set(a10);
                int i10 = qVar2.i() == qVar.i() ? -1 : qVar2.i();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer valueOf = Integer.valueOf(i10);
                    Rect bounds = region2.getBounds();
                    jo.p.g(bounds, "region.bounds");
                    map.put(valueOf, new u1(qVar2, bounds));
                    List<w1.q> o10 = qVar2.o();
                    for (int size = o10.size() - 1; -1 < size; size--) {
                        p(region, qVar, map, o10.get(size));
                    }
                    region.op(a10, region, Region.Op.REVERSE_DIFFERENCE);
                } else if (!qVar2.t()) {
                    if (i10 == -1) {
                        Integer valueOf2 = Integer.valueOf(i10);
                        Rect bounds2 = region2.getBounds();
                        jo.p.g(bounds2, "region.bounds");
                        map.put(valueOf2, new u1(qVar2, bounds2));
                    }
                } else {
                    w1.q m10 = qVar2.m();
                    if (m10 != null && (j10 = m10.j()) != null && j10.g()) {
                        z10 = true;
                    }
                    if (z10) {
                        hVar = m10.f();
                    } else {
                        hVar = new b1.h(0.0f, 0.0f, 10.0f, 10.0f);
                    }
                    map.put(Integer.valueOf(i10), new u1(qVar2, c1.z0.a(hVar)));
                }
            }
        }
    }

    public static final boolean q(w1.q qVar) {
        return qVar.h().g(w1.t.f57947a.o());
    }

    public static final boolean r(w1.q qVar) {
        return qVar.h().g(w1.t.f57947a.p());
    }

    public static final boolean s(w1.q qVar) {
        return qVar.j().getLayoutDirection() == m2.q.Rtl;
    }

    public static final boolean t(w1.q qVar) {
        return qVar.s().g(w1.j.f57906a.p());
    }

    public static final boolean u(w1.q qVar, t.g gVar) {
        Iterator<Map.Entry<? extends w1.x<?>, ? extends Object>> it = gVar.b().iterator();
        while (it.hasNext()) {
            if (!qVar.h().g(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
