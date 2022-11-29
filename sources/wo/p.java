package wo;

import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import uo.u0;
import uo.v0;
import zo.k0;
import zo.u;

/* loaded from: classes4.dex */
public final class p<E> extends a0 implements y<E> {

    /* renamed from: z  reason: collision with root package name */
    public final Throwable f59283z;

    public p(Throwable th2) {
        this.f59283z = th2;
    }

    @Override // wo.a0
    public void Q() {
    }

    @Override // wo.a0
    public void U(p<?> pVar) {
        if (u0.a()) {
            throw new AssertionError();
        }
    }

    @Override // wo.a0
    public k0 V(u.c cVar) {
        k0 k0Var = uo.r.f56081a;
        if (cVar != null) {
            cVar.d();
        }
        return k0Var;
    }

    @Override // wo.y
    /* renamed from: X */
    public p<E> a() {
        return this;
    }

    @Override // wo.a0
    /* renamed from: Y */
    public p<E> S() {
        return this;
    }

    public final Throwable Z() {
        Throwable th2 = this.f59283z;
        return th2 == null ? new ClosedReceiveChannelException("Channel was closed") : th2;
    }

    public final Throwable a0() {
        Throwable th2 = this.f59283z;
        return th2 == null ? new ClosedSendChannelException("Channel was closed") : th2;
    }

    @Override // wo.y
    public void i(E e10) {
    }

    @Override // wo.y
    public k0 l(E e10, u.c cVar) {
        k0 k0Var = uo.r.f56081a;
        if (cVar != null) {
            cVar.d();
        }
        return k0Var;
    }

    @Override // zo.u
    public String toString() {
        return "Closed@" + v0.b(this) + '[' + this.f59283z + ']';
    }
}
