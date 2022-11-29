package uo;

/* loaded from: classes4.dex */
public final class l3 {
    public static final Object a(ao.d<? super wn.v> dVar) {
        Object c10;
        ao.g context = dVar.getContext();
        g2.j(context);
        ao.d b10 = bo.b.b(dVar);
        zo.k kVar = b10 instanceof zo.k ? (zo.k) b10 : null;
        if (kVar == null) {
            c10 = wn.v.f59242a;
        } else {
            if (kVar.f63297z.c0(context)) {
                kVar.l(context, wn.v.f59242a);
            } else {
                k3 k3Var = new k3();
                ao.g plus = context.plus(k3Var);
                wn.v vVar = wn.v.f59242a;
                kVar.l(plus, vVar);
                if (k3Var.f56049w) {
                    c10 = zo.l.d(kVar) ? bo.c.c() : vVar;
                }
            }
            c10 = bo.c.c();
        }
        if (c10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return c10 == bo.c.c() ? c10 : wn.v.f59242a;
    }
}
