package d2;

import d2.h;
import d2.s;
import java.util.List;
import wn.l;

/* loaded from: classes.dex */
public final class r {
    public static final wn.k<List<k>, Object> b(List<? extends k> list, m0 m0Var, h hVar, b0 b0Var, io.l<? super m0, ? extends Object> lVar) {
        g2.l lVar2;
        c2.b bVar;
        Object b10;
        c2.c cVar;
        g2.l lVar3;
        c2.b bVar2;
        Object a10;
        c2.c cVar2;
        int size = list.size();
        List list2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = list.get(i10);
            int a11 = kVar.a();
            s.a aVar = s.f29135a;
            if (s.e(a11, aVar.b())) {
                lVar2 = hVar.f29087d;
                synchronized (lVar2) {
                    h.b bVar3 = new h.b(kVar, b0Var.a());
                    bVar = hVar.f29085b;
                    h.a aVar2 = (h.a) bVar.d(bVar3);
                    if (aVar2 == null) {
                        cVar = hVar.f29086c;
                        aVar2 = (h.a) cVar.b(bVar3);
                    }
                    if (aVar2 != null) {
                        b10 = aVar2.g();
                    } else {
                        wn.v vVar = wn.v.f59242a;
                        try {
                            b10 = b0Var.b(kVar);
                            h.f(hVar, kVar, b0Var, b10, false, 8, null);
                        } catch (Exception e10) {
                            throw new IllegalStateException("Unable to load font " + kVar, e10);
                        }
                    }
                }
                if (b10 != null) {
                    return wn.q.a(list2, w.a(m0Var.e(), b10, kVar, m0Var.f(), m0Var.d()));
                }
                throw new IllegalStateException("Unable to load font " + kVar);
            }
            if (s.e(a11, aVar.c())) {
                lVar3 = hVar.f29087d;
                synchronized (lVar3) {
                    h.b bVar4 = new h.b(kVar, b0Var.a());
                    bVar2 = hVar.f29085b;
                    h.a aVar3 = (h.a) bVar2.d(bVar4);
                    if (aVar3 == null) {
                        cVar2 = hVar.f29086c;
                        aVar3 = (h.a) cVar2.b(bVar4);
                    }
                    if (aVar3 != null) {
                        a10 = aVar3.g();
                    } else {
                        wn.v vVar2 = wn.v.f59242a;
                        try {
                            l.a aVar4 = wn.l.f59224w;
                            a10 = wn.l.a(b0Var.b(kVar));
                        } catch (Throwable th2) {
                            l.a aVar5 = wn.l.f59224w;
                            a10 = wn.l.a(wn.m.a(th2));
                        }
                        if (wn.l.c(a10)) {
                            a10 = null;
                        }
                        h.f(hVar, kVar, b0Var, a10, false, 8, null);
                    }
                }
                if (a10 != null) {
                    return wn.q.a(list2, w.a(m0Var.e(), a10, kVar, m0Var.f(), m0Var.d()));
                }
            } else if (s.e(a11, aVar.a())) {
                h.a d10 = hVar.d(kVar, b0Var);
                if (d10 == null) {
                    if (list2 == null) {
                        list2 = xn.s.p(kVar);
                    } else {
                        list2.add(kVar);
                    }
                } else if (!h.a.e(d10.g()) && d10.g() != null) {
                    return wn.q.a(list2, w.a(m0Var.e(), d10.g(), kVar, m0Var.f(), m0Var.d()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + kVar);
            }
        }
        return wn.q.a(list2, lVar.invoke(m0Var));
    }
}
