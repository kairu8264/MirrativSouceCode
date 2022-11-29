package wo;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import uo.k2;

/* loaded from: classes4.dex */
public class j<E> extends uo.a<wn.v> implements i<E> {

    /* renamed from: y  reason: collision with root package name */
    public final i<E> f59278y;

    public j(ao.g gVar, i<E> iVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f59278y = iVar;
    }

    @Override // uo.k2
    public void W(Throwable th2) {
        CancellationException O0 = k2.O0(this, th2, null, 1, null);
        this.f59278y.c(O0);
        S(O0);
    }

    public final i<E> Z0() {
        return this.f59278y;
    }

    @Override // wo.x
    public Object b(ao.d<? super E> dVar) {
        return this.f59278y.b(dVar);
    }

    @Override // uo.k2, uo.d2
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Z(), null, this);
        }
        W(cancellationException);
    }

    @Override // wo.x
    public Object f(ao.d<? super m<? extends E>> dVar) {
        Object f10 = this.f59278y.f(dVar);
        bo.c.c();
        return f10;
    }

    @Override // wo.x
    public k<E> iterator() {
        return this.f59278y.iterator();
    }

    @Override // wo.b0
    public Object l(E e10) {
        return this.f59278y.l(e10);
    }

    @Override // wo.b0
    public Object r(E e10, ao.d<? super wn.v> dVar) {
        return this.f59278y.r(e10, dVar);
    }

    @Override // wo.x
    public cp.c<m<E>> s() {
        return this.f59278y.s();
    }

    @Override // wo.x
    public Object t() {
        return this.f59278y.t();
    }

    @Override // wo.b0
    public boolean x(Throwable th2) {
        return this.f59278y.x(th2);
    }
}
