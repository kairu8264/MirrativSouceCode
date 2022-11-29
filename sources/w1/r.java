package w1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r {
    public static final int e(q qVar) {
        return qVar.i() + 2000000000;
    }

    public static final s1.k f(s1.k kVar, io.l<? super s1.k, Boolean> lVar) {
        for (s1.k u02 = kVar.u0(); u02 != null; u02 = u02.u0()) {
            if (lVar.invoke(u02).booleanValue()) {
                return u02;
            }
        }
        return null;
    }

    public static final List<m> g(s1.k kVar, List<m> list) {
        m0.e<s1.k> z02 = kVar.z0();
        int p10 = z02.p();
        if (p10 > 0) {
            int i10 = 0;
            s1.k[] n10 = z02.n();
            do {
                s1.k kVar2 = n10[i10];
                m j10 = j(kVar2);
                if (j10 != null) {
                    list.add(j10);
                } else {
                    g(kVar2, list);
                }
                i10++;
            } while (i10 < p10);
            return list;
        }
        return list;
    }

    public static /* synthetic */ List h(s1.k kVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return g(kVar, list);
    }

    public static final m i(s1.k kVar) {
        m mVar;
        jo.p.h(kVar, "<this>");
        s1.p s02 = kVar.s0();
        while (s02 != null && !s1.e.m(s02.u1(), s1.e.f51834a.f())) {
            s02 = s02.H1();
        }
        if (s02 == null || (mVar = (m) s1.e.n(s02.u1(), s1.e.f51834a.f())) == null) {
            return null;
        }
        s1.p b10 = mVar.b();
        while (b10 != null) {
            while (mVar != null) {
                if (mVar.c().a1().s()) {
                    return mVar;
                }
                mVar = mVar.d();
            }
            b10 = b10.H1();
            mVar = b10 != null ? (m) s1.e.n(b10.u1(), s1.e.f51834a.f()) : null;
        }
        return null;
    }

    public static final m j(s1.k kVar) {
        m mVar;
        jo.p.h(kVar, "<this>");
        s1.p s02 = kVar.s0();
        while (s02 != null && !s1.e.m(s02.u1(), s1.e.f51834a.f())) {
            s02 = s02.H1();
        }
        if (s02 == null || (mVar = (m) s1.e.n(s02.u1(), s1.e.f51834a.f())) == null) {
            return null;
        }
        s1.p b10 = mVar.b();
        while (b10 != null) {
            if (mVar != null) {
                return mVar;
            }
            b10 = b10.H1();
            mVar = b10 != null ? (m) s1.e.n(b10.u1(), s1.e.f51834a.f()) : null;
        }
        return null;
    }

    public static final h k(q qVar) {
        return (h) l.a(qVar.s(), t.f57947a.r());
    }

    public static final int l(q qVar) {
        return qVar.i() + 1000000000;
    }
}
