package uo;

import wn.l;

/* loaded from: classes4.dex */
public final class g0 {
    public static final <T> Object a(Object obj, ao.d<? super T> dVar) {
        if (obj instanceof d0) {
            l.a aVar = wn.l.f59224w;
            Throwable th2 = ((d0) obj).f55999a;
            if (u0.d() && (dVar instanceof co.e)) {
                th2 = zo.j0.j(th2, (co.e) dVar);
            }
            return wn.l.a(wn.m.a(th2));
        }
        l.a aVar2 = wn.l.f59224w;
        return wn.l.a(obj);
    }

    public static final <T> Object b(Object obj, io.l<? super Throwable, wn.v> lVar) {
        Throwable b10 = wn.l.b(obj);
        if (b10 == null) {
            return lVar != null ? new e0(obj, lVar) : obj;
        }
        return new d0(b10, false, 2, null);
    }

    public static final <T> Object c(Object obj, p<?> pVar) {
        Throwable b10 = wn.l.b(obj);
        if (b10 != null) {
            if (u0.d() && (pVar instanceof co.e)) {
                b10 = zo.j0.j(b10, (co.e) pVar);
            }
            obj = new d0(b10, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, io.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
