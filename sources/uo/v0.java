package uo;

import wn.l;

/* loaded from: classes4.dex */
public final class v0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(ao.d<?> dVar) {
        String a10;
        if (dVar instanceof zo.k) {
            return dVar.toString();
        }
        try {
            l.a aVar = wn.l.f59224w;
            a10 = wn.l.a(dVar + '@' + b(dVar));
        } catch (Throwable th2) {
            l.a aVar2 = wn.l.f59224w;
            a10 = wn.l.a(wn.m.a(th2));
        }
        if (wn.l.b(a10) != null) {
            a10 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) a10;
    }
}
