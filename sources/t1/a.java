package t1;

import b1.f;
import b1.g;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import jo.q;
import p3.c;
import w1.k;
import w1.l;
import w1.t;
import xn.a0;
import xn.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: t1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0819a extends q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0819a f53019w = new C0819a();

        public C0819a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f53020w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(List<w1.q> list) {
        List k10;
        long u10;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            k10 = new ArrayList();
            w1.q qVar = list.get(0);
            int l10 = s.l(list);
            int i10 = 0;
            while (i10 < l10) {
                i10++;
                w1.q qVar2 = list.get(i10);
                w1.q qVar3 = qVar2;
                w1.q qVar4 = qVar;
                k10.add(f.d(g.a(Math.abs(f.m(qVar4.f().g()) - f.m(qVar3.f().g())), Math.abs(f.n(qVar4.f().g()) - f.n(qVar3.f().g())))));
                qVar = qVar2;
            }
        } else {
            k10 = s.k();
        }
        if (k10.size() == 1) {
            u10 = ((f) a0.X(k10)).u();
        } else if (!k10.isEmpty()) {
            Object X = a0.X(k10);
            int l11 = s.l(k10);
            if (1 <= l11) {
                int i11 = 1;
                while (true) {
                    X = f.d(f.r(((f) X).u(), ((f) k10.get(i11)).u()));
                    if (i11 == l11) {
                        break;
                    }
                    i11++;
                }
            }
            u10 = ((f) X).u();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        return f.f(u10) < f.e(u10);
    }

    public static final boolean b(w1.q qVar) {
        p.h(qVar, "<this>");
        k h10 = qVar.h();
        t tVar = t.f57947a;
        return (l.a(h10, tVar.a()) == null && l.a(qVar.h(), tVar.s()) == null) ? false : true;
    }

    public static final boolean c(w1.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(w1.q qVar, c cVar) {
        p.h(qVar, "node");
        p.h(cVar, "info");
        k h10 = qVar.h();
        t tVar = t.f57947a;
        w1.b bVar = (w1.b) l.a(h10, tVar.a());
        if (bVar != null) {
            cVar.d0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (l.a(qVar.h(), tVar.s()) != null) {
            List<w1.q> o10 = qVar.o();
            int size = o10.size();
            for (int i10 = 0; i10 < size; i10++) {
                w1.q qVar2 = o10.get(i10);
                if (qVar2.h().g(t.f57947a.t())) {
                    arrayList.add(qVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean a10 = a(arrayList);
            cVar.d0(c.b.a(a10 ? 1 : arrayList.size(), a10 ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void e(w1.q qVar, c cVar) {
        p.h(qVar, "node");
        p.h(cVar, "info");
        k h10 = qVar.h();
        t tVar = t.f57947a;
        w1.c cVar2 = (w1.c) l.a(h10, tVar.b());
        if (cVar2 != null) {
            cVar.e0(g(cVar2, qVar));
        }
        w1.q m10 = qVar.m();
        if (m10 == null || l.a(m10.h(), tVar.s()) == null) {
            return;
        }
        w1.b bVar = (w1.b) l.a(m10.h(), tVar.a());
        if ((bVar == null || !c(bVar)) && qVar.h().g(tVar.t())) {
            ArrayList arrayList = new ArrayList();
            List<w1.q> o10 = m10.o();
            int size = o10.size();
            for (int i10 = 0; i10 < size; i10++) {
                w1.q qVar2 = o10.get(i10);
                if (qVar2.h().g(t.f57947a.t())) {
                    arrayList.add(qVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                boolean a10 = a(arrayList);
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    w1.q qVar3 = (w1.q) arrayList.get(i11);
                    if (qVar3.i() == qVar.i()) {
                        c.C0699c a11 = c.C0699c.a(a10 ? 0 : i11, 1, a10 ? i11 : 0, 1, false, ((Boolean) qVar3.h().m(t.f57947a.t(), C0819a.f53019w)).booleanValue());
                        if (a11 != null) {
                            cVar.e0(a11);
                        }
                    }
                }
            }
        }
    }

    public static final c.b f(w1.b bVar) {
        return c.b.a(bVar.b(), bVar.a(), false, 0);
    }

    public static final c.C0699c g(w1.c cVar, w1.q qVar) {
        return c.C0699c.a(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) qVar.h().m(t.f57947a.t(), b.f53020w)).booleanValue());
    }
}
