package wo;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public interface x<E> {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(x xVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            xVar.c(cancellationException);
        }
    }

    Object b(ao.d<? super E> dVar);

    void c(CancellationException cancellationException);

    Object f(ao.d<? super m<? extends E>> dVar);

    k<E> iterator();

    cp.c<m<E>> s();

    Object t();
}
