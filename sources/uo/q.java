package uo;

import ai.r23;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;
import uo.d2;

/* loaded from: classes4.dex */
public class q<T> extends e1<T> implements p<T>, co.e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(q.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    public final ao.g A;
    public i1 B;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: z  reason: collision with root package name */
    public final ao.d<T> f56077z;

    /* JADX WARN: Multi-variable type inference failed */
    public q(ao.d<? super T> dVar, int i10) {
        super(i10);
        this.f56077z = dVar;
        if (u0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        this.A = dVar.getContext();
        this._decision = 0;
        this._state = d.f55997w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I(q qVar, Object obj, int i10, io.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        qVar.H(obj, i10, lVar);
    }

    public final boolean A() {
        return f1.c(this.f56011y) && ((zo.k) this.f56077z).n();
    }

    public final n B(io.l<? super Throwable, wn.v> lVar) {
        return lVar instanceof n ? (n) lVar : new a2(lVar);
    }

    public final void C(io.l<? super Throwable, wn.v> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th2) {
        if (n(th2)) {
            return;
        }
        u(th2);
        p();
    }

    public final void F() {
        ao.d<T> dVar = this.f56077z;
        zo.k kVar = dVar instanceof zo.k ? (zo.k) dVar : null;
        Throwable r10 = kVar != null ? kVar.r(this) : null;
        if (r10 == null) {
            return;
        }
        o();
        u(r10);
    }

    public final boolean G() {
        if (u0.a()) {
            if (!(this.f56011y == 2)) {
                throw new AssertionError();
            }
        }
        if (u0.a()) {
            if (!(this.B != r2.f56082w)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!u0.a() || (!(obj instanceof s2))) {
            if ((obj instanceof c0) && ((c0) obj).f55994d != null) {
                o();
                return false;
            }
            this._decision = 0;
            this._state = d.f55997w;
            return true;
        }
        throw new AssertionError();
    }

    public final void H(Object obj, int i10, io.l<? super Throwable, wn.v> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof s2) {
            } else {
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.c()) {
                        if (lVar == null) {
                            return;
                        }
                        m(lVar, tVar.f55999a);
                        return;
                    }
                }
                i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!r23.a(D, this, obj2, J((s2) obj2, obj, i10, lVar, null)));
        p();
        r(i10);
    }

    public final Object J(s2 s2Var, Object obj, int i10, io.l<? super Throwable, wn.v> lVar, Object obj2) {
        if (obj instanceof d0) {
            if (u0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (u0.a()) {
                if (lVar == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (f1.b(i10) || obj2 != null) {
            if (lVar != null || (((s2Var instanceof n) && !(s2Var instanceof g)) || obj2 != null)) {
                return new c0(obj, s2Var instanceof n ? (n) s2Var : null, lVar, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    public final boolean K() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!C.compareAndSet(this, 0, 2));
        return true;
    }

    public final zo.k0 L(Object obj, Object obj2, io.l<? super Throwable, wn.v> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof s2) {
            } else if (!(obj3 instanceof c0) || obj2 == null) {
                return null;
            } else {
                c0 c0Var = (c0) obj3;
                if (c0Var.f55994d == obj2) {
                    if (!u0.a() || jo.p.c(c0Var.f55991a, obj)) {
                        return r.f56081a;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!r23.a(D, this, obj3, J((s2) obj3, obj, this.f56011y, lVar, obj2)));
        p();
        return r.f56081a;
    }

    @Override // uo.p
    public void M(io.l<? super Throwable, wn.v> lVar) {
        n B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (r23.a(D, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof n) {
                C(lVar, obj);
            } else {
                boolean z10 = obj instanceof d0;
                if (z10) {
                    d0 d0Var = (d0) obj;
                    if (!d0Var.b()) {
                        C(lVar, obj);
                    }
                    if (obj instanceof t) {
                        if (!z10) {
                            d0Var = null;
                        }
                        j(lVar, d0Var != null ? d0Var.f55999a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof c0) {
                    c0 c0Var = (c0) obj;
                    if (c0Var.f55992b != null) {
                        C(lVar, obj);
                    }
                    if (B instanceof g) {
                        return;
                    }
                    if (c0Var.c()) {
                        j(lVar, c0Var.f55995e);
                        return;
                    } else {
                        if (r23.a(D, this, obj, c0.b(c0Var, null, B, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (B instanceof g) {
                    return;
                } else {
                    if (r23.a(D, this, obj, new c0(obj, B, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean N() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!C.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // uo.p
    public void R(T t10, io.l<? super Throwable, wn.v> lVar) {
        H(t10, this.f56011y, lVar);
    }

    @Override // uo.p
    public void T(Object obj) {
        if (u0.a()) {
            if (!(obj == r.f56081a)) {
                throw new AssertionError();
            }
        }
        r(this.f56011y);
    }

    @Override // uo.e1
    public void a(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof s2)) {
                if (obj2 instanceof d0) {
                    return;
                }
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (!c0Var.c()) {
                        if (r23.a(D, this, obj2, c0.b(c0Var, null, null, null, null, th2, 15, null))) {
                            c0Var.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (r23.a(D, this, obj2, new c0(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // uo.e1
    public final ao.d<T> b() {
        return this.f56077z;
    }

    @Override // uo.e1
    public Throwable c(Object obj) {
        Throwable c10 = super.c(obj);
        if (c10 == null) {
            return null;
        }
        ao.d<T> b10 = b();
        return (u0.d() && (b10 instanceof co.e)) ? zo.j0.a(c10, (co.e) b10) : c10;
    }

    @Override // uo.p
    public Object d(T t10, Object obj) {
        return L(t10, obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uo.e1
    public <T> T e(Object obj) {
        return obj instanceof c0 ? (T) ((c0) obj).f55991a : obj;
    }

    @Override // uo.e1
    public Object g() {
        return v();
    }

    @Override // co.e
    public co.e getCallerFrame() {
        ao.d<T> dVar = this.f56077z;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // ao.d
    public ao.g getContext() {
        return this.A;
    }

    @Override // co.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // uo.p
    public Object h(T t10, Object obj, io.l<? super Throwable, wn.v> lVar) {
        return L(t10, obj, lVar);
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(jo.p.o("Already resumed, but proposed with update ", obj).toString());
    }

    public final void j(io.l<? super Throwable, wn.v> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            n0.a(getContext(), new CompletionHandlerException(jo.p.o("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    @Override // uo.p
    public void k(k0 k0Var, T t10) {
        ao.d<T> dVar = this.f56077z;
        zo.k kVar = dVar instanceof zo.k ? (zo.k) dVar : null;
        I(this, t10, (kVar != null ? kVar.f63297z : null) == k0Var ? 4 : this.f56011y, null, 4, null);
    }

    public final void l(n nVar, Throwable th2) {
        try {
            nVar.a(th2);
        } catch (Throwable th3) {
            n0.a(getContext(), new CompletionHandlerException(jo.p.o("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    public final void m(io.l<? super Throwable, wn.v> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            n0.a(getContext(), new CompletionHandlerException(jo.p.o("Exception in resume onCancellation handler for ", this), th3));
        }
    }

    public final boolean n(Throwable th2) {
        if (A()) {
            return ((zo.k) this.f56077z).o(th2);
        }
        return false;
    }

    public final void o() {
        i1 i1Var = this.B;
        if (i1Var == null) {
            return;
        }
        i1Var.dispose();
        this.B = r2.f56082w;
    }

    public final void p() {
        if (A()) {
            return;
        }
        o();
    }

    @Override // uo.p
    public Object q(Throwable th2) {
        return L(new d0(th2, false, 2, null), null, null);
    }

    public final void r(int i10) {
        if (K()) {
            return;
        }
        f1.a(this, i10);
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        I(this, g0.c(obj, this), this.f56011y, null, 4, null);
    }

    public Throwable s(d2 d2Var) {
        return d2Var.n();
    }

    public final Object t() {
        d2 d2Var;
        boolean A = A();
        if (N()) {
            if (this.B == null) {
                z();
            }
            if (A) {
                F();
            }
            return bo.c.c();
        }
        if (A) {
            F();
        }
        Object v10 = v();
        if (v10 instanceof d0) {
            Throwable th2 = ((d0) v10).f55999a;
            if (u0.d()) {
                throw zo.j0.a(th2, this);
            }
            throw th2;
        } else if (f1.b(this.f56011y) && (d2Var = (d2) getContext().get(d2.f56001s)) != null && !d2Var.isActive()) {
            CancellationException n10 = d2Var.n();
            a(v10, n10);
            if (u0.d()) {
                throw zo.j0.a(n10, this);
            }
            throw n10;
        } else {
            return e(v10);
        }
    }

    public String toString() {
        return D() + '(' + v0.c(this.f56077z) + "){" + x() + "}@" + v0.b(this);
    }

    @Override // uo.p
    public boolean u(Throwable th2) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof s2)) {
                return false;
            }
            z10 = obj instanceof n;
        } while (!r23.a(D, this, obj, new t(this, th2, z10)));
        n nVar = z10 ? (n) obj : null;
        if (nVar != null) {
            l(nVar, th2);
        }
        p();
        r(this.f56011y);
        return true;
    }

    public final Object v() {
        return this._state;
    }

    @Override // uo.p
    public boolean w() {
        return !(v() instanceof s2);
    }

    public final String x() {
        Object v10 = v();
        return v10 instanceof s2 ? "Active" : v10 instanceof t ? "Cancelled" : "Completed";
    }

    public void y() {
        i1 z10 = z();
        if (z10 != null && w()) {
            z10.dispose();
            this.B = r2.f56082w;
        }
    }

    public final i1 z() {
        d2 d2Var = (d2) getContext().get(d2.f56001s);
        if (d2Var == null) {
            return null;
        }
        i1 d10 = d2.a.d(d2Var, true, false, new u(this), 2, null);
        this.B = d10;
        return d10;
    }
}
