package wo;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.UndeliveredElementException;
import uo.u0;
import zo.k0;

/* loaded from: classes4.dex */
public class r<E> extends a<E> {
    public Object A;

    /* renamed from: z  reason: collision with root package name */
    public final ReentrantLock f59291z;

    public r(io.l<? super E, wn.v> lVar) {
        super(lVar);
        this.f59291z = new ReentrantLock();
        this.A = b.f59258a;
    }

    @Override // wo.a
    public boolean L(w<? super E> wVar) {
        ReentrantLock reentrantLock = this.f59291z;
        reentrantLock.lock();
        try {
            return super.L(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // wo.a
    public final boolean N() {
        return false;
    }

    @Override // wo.a
    public final boolean O() {
        return this.A == b.f59258a;
    }

    @Override // wo.a
    public void R(boolean z10) {
        ReentrantLock reentrantLock = this.f59291z;
        reentrantLock.lock();
        try {
            UndeliveredElementException b02 = b0(b.f59258a);
            wn.v vVar = wn.v.f59242a;
            reentrantLock.unlock();
            super.R(z10);
            if (b02 != null) {
                throw b02;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // wo.a
    public Object V() {
        ReentrantLock reentrantLock = this.f59291z;
        reentrantLock.lock();
        try {
            Object obj = this.A;
            k0 k0Var = b.f59258a;
            if (obj != k0Var) {
                this.A = k0Var;
                wn.v vVar = wn.v.f59242a;
                return obj;
            }
            Object k10 = k();
            if (k10 == null) {
                k10 = b.f59261d;
            }
            return k10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // wo.a
    public Object W(cp.d<?> dVar) {
        ReentrantLock reentrantLock = this.f59291z;
        reentrantLock.lock();
        try {
            Object obj = this.A;
            k0 k0Var = b.f59258a;
            if (obj == k0Var) {
                Object k10 = k();
                if (k10 == null) {
                    k10 = b.f59261d;
                }
                return k10;
            } else if (!dVar.m()) {
                return cp.e.d();
            } else {
                Object obj2 = this.A;
                this.A = k0Var;
                wn.v vVar = wn.v.f59242a;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final UndeliveredElementException b0(Object obj) {
        io.l<E, wn.v> lVar;
        Object obj2 = this.A;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != b.f59258a && (lVar = this.f59265w) != null) {
            undeliveredElementException = zo.c0.d(lVar, obj2, null, 2, null);
        }
        this.A = obj;
        return undeliveredElementException;
    }

    @Override // wo.c
    public String i() {
        return "(value=" + this.A + ')';
    }

    @Override // wo.c
    public final boolean v() {
        return false;
    }

    @Override // wo.c
    public final boolean w() {
        return false;
    }

    @Override // wo.c
    public Object z(E e10) {
        y<E> D;
        k0 l10;
        ReentrantLock reentrantLock = this.f59291z;
        reentrantLock.lock();
        try {
            p<?> k10 = k();
            if (k10 == null) {
                if (this.A == b.f59258a) {
                    do {
                        D = D();
                        if (D != null) {
                            if (D instanceof p) {
                                return D;
                            }
                            l10 = D.l(e10, null);
                        }
                    } while (l10 == null);
                    if (u0.a()) {
                        if (!(l10 == uo.r.f56081a)) {
                            throw new AssertionError();
                        }
                    }
                    wn.v vVar = wn.v.f59242a;
                    reentrantLock.unlock();
                    D.i(e10);
                    return D.a();
                }
                UndeliveredElementException b02 = b0(e10);
                if (b02 == null) {
                    return b.f59259b;
                }
                throw b02;
            }
            return k10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
