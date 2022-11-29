package uo;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public final class h<T> extends a<T> {

    /* renamed from: y  reason: collision with root package name */
    public final Thread f56026y;

    /* renamed from: z  reason: collision with root package name */
    public final m1 f56027z;

    public h(ao.g gVar, Thread thread, m1 m1Var) {
        super(gVar, true, true);
        this.f56026y = thread;
        this.f56027z = m1Var;
    }

    @Override // uo.k2
    public void H(Object obj) {
        if (jo.p.c(Thread.currentThread(), this.f56026y)) {
            return;
        }
        Thread thread = this.f56026y;
        c.a();
        LockSupport.unpark(thread);
    }

    public final T Z0() {
        c.a();
        try {
            m1 m1Var = this.f56027z;
            if (m1Var != null) {
                m1.r0(m1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                m1 m1Var2 = this.f56027z;
                long A0 = m1Var2 == null ? Long.MAX_VALUE : m1Var2.A0();
                if (w()) {
                    m1 m1Var3 = this.f56027z;
                    if (m1Var3 != null) {
                        m1.i0(m1Var3, false, 1, null);
                    }
                    c.a();
                    T t10 = (T) l2.h(n0());
                    d0 d0Var = t10 instanceof d0 ? (d0) t10 : null;
                    if (d0Var == null) {
                        return t10;
                    }
                    throw d0Var.f55999a;
                }
                c.a();
                LockSupport.parkNanos(this, A0);
            }
            InterruptedException interruptedException = new InterruptedException();
            S(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            c.a();
            throw th2;
        }
    }

    @Override // uo.k2
    public boolean r0() {
        return true;
    }
}
