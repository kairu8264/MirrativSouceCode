package wo;

/* loaded from: classes4.dex */
public interface b0<E> {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ boolean a(b0 b0Var, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return b0Var.x(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    Object l(E e10);

    Object r(E e10, ao.d<? super wn.v> dVar);

    boolean x(Throwable th2);
}
