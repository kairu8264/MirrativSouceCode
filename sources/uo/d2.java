package uo;

import ao.g;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public interface d2 extends g.b {

    /* renamed from: s  reason: collision with root package name */
    public static final b f56001s = b.f56002w;

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(d2 d2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            d2Var.c(cancellationException);
        }

        public static <R> R b(d2 d2Var, R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(d2Var, r10, pVar);
        }

        public static <E extends g.b> E c(d2 d2Var, g.c<E> cVar) {
            return (E) g.b.a.b(d2Var, cVar);
        }

        public static /* synthetic */ i1 d(d2 d2Var, boolean z10, boolean z11, io.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return d2Var.O(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static ao.g e(d2 d2Var, g.c<?> cVar) {
            return g.b.a.c(d2Var, cVar);
        }

        public static ao.g f(d2 d2Var, ao.g gVar) {
            return g.b.a.d(d2Var, gVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements g.c<d2> {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ b f56002w = new b();
    }

    Object E(ao.d<? super wn.v> dVar);

    v K(x xVar);

    i1 O(boolean z10, boolean z11, io.l<? super Throwable, wn.v> lVar);

    void c(CancellationException cancellationException);

    ro.g<d2> i();

    boolean isActive();

    boolean isCancelled();

    CancellationException n();

    i1 p(io.l<? super Throwable, wn.v> lVar);

    boolean start();
}
