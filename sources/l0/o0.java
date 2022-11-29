package l0;

/* loaded from: classes.dex */
public final class o0 {
    public static final n0 a(ao.g gVar) {
        jo.p.h(gVar, "<this>");
        n0 n0Var = (n0) gVar.get(n0.f39207n);
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object b(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar) {
        return a(dVar.getContext()).L(lVar, dVar);
    }
}
