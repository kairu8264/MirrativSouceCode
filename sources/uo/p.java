package uo;

/* loaded from: classes4.dex */
public interface p<T> extends ao.d<T> {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ boolean a(p pVar, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return pVar.u(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(p pVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 == null) {
                if ((i10 & 2) != 0) {
                    obj2 = null;
                }
                return pVar.d(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void M(io.l<? super Throwable, wn.v> lVar);

    void R(T t10, io.l<? super Throwable, wn.v> lVar);

    void T(Object obj);

    Object d(T t10, Object obj);

    Object h(T t10, Object obj, io.l<? super Throwable, wn.v> lVar);

    void k(k0 k0Var, T t10);

    Object q(Throwable th2);

    boolean u(Throwable th2);

    boolean w();
}
