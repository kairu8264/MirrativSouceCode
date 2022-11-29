package w;

/* loaded from: classes.dex */
public interface l {
    static /* synthetic */ Object b(l lVar, v.d0 d0Var, io.p pVar, ao.d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                d0Var = v.d0.Default;
            }
            return lVar.a(d0Var, pVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    Object a(v.d0 d0Var, io.p<? super j, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar);
}
