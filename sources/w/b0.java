package w;

/* loaded from: classes.dex */
public interface b0 {
    static /* synthetic */ Object b(b0 b0Var, v.d0 d0Var, io.p pVar, ao.d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                d0Var = v.d0.Default;
            }
            return b0Var.a(d0Var, pVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    Object a(v.d0 d0Var, io.p<? super y, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar);

    boolean c();

    float d(float f10);
}
