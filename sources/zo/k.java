package zo;

import ai.r23;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uo.d3;
import uo.e1;
import uo.m1;
import uo.u0;
import uo.v0;

/* loaded from: classes4.dex */
public final class k<T> extends e1<T> implements co.e, ao.d<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_reusableCancellableContinuation");
    public final ao.d<T> A;
    public Object B;
    public final Object C;
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: z  reason: collision with root package name */
    public final uo.k0 f63297z;

    /* JADX WARN: Multi-variable type inference failed */
    public k(uo.k0 k0Var, ao.d<? super T> dVar) {
        super(-1);
        this.f63297z = k0Var;
        this.A = dVar;
        this.B = l.a();
        this.C = o0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // uo.e1
    public void a(Object obj, Throwable th2) {
        if (obj instanceof uo.e0) {
            ((uo.e0) obj).f56010b.invoke(th2);
        }
    }

    @Override // uo.e1
    public ao.d<T> b() {
        return this;
    }

    @Override // uo.e1
    public Object g() {
        Object obj = this.B;
        if (u0.a()) {
            if (!(obj != l.a())) {
                throw new AssertionError();
            }
        }
        this.B = l.a();
        return obj;
    }

    @Override // co.e
    public co.e getCallerFrame() {
        ao.d<T> dVar = this.A;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // ao.d
    public ao.g getContext() {
        return this.A.getContext();
    }

    @Override // co.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == l.f63300b);
    }

    public final uo.q<T> j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = l.f63300b;
                return null;
            } else if (obj instanceof uo.q) {
                if (r23.a(D, this, obj, l.f63300b)) {
                    return (uo.q) obj;
                }
            } else if (obj != l.f63300b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(jo.p.o("Inconsistent state ", obj).toString());
            }
        }
    }

    public final void l(ao.g gVar, T t10) {
        this.B = t10;
        this.f56011y = 1;
        this.f63297z.Y(gVar, this);
    }

    public final uo.q<?> m() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof uo.q) {
            return (uo.q) obj;
        }
        return null;
    }

    public final boolean n() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean o(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            k0 k0Var = l.f63300b;
            if (jo.p.c(obj, k0Var)) {
                if (r23.a(D, this, k0Var, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (r23.a(D, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        i();
        uo.q<?> m10 = m();
        if (m10 == null) {
            return;
        }
        m10.o();
    }

    public final Throwable r(uo.p<?> pVar) {
        k0 k0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            k0Var = l.f63300b;
            if (obj != k0Var) {
                if (obj instanceof Throwable) {
                    if (r23.a(D, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(jo.p.o("Inconsistent state ", obj).toString());
            }
        } while (!r23.a(D, this, k0Var, pVar));
        return null;
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        ao.g context = this.A.getContext();
        Object d10 = uo.g0.d(obj, null, 1, null);
        if (this.f63297z.c0(context)) {
            this.B = d10;
            this.f56011y = 0;
            this.f63297z.X(context, this);
            return;
        }
        u0.a();
        m1 b10 = d3.f56003a.b();
        if (b10.w0()) {
            this.B = d10;
            this.f56011y = 0;
            b10.l0(this);
            return;
        }
        b10.q0(true);
        try {
            ao.g context2 = getContext();
            Object c10 = o0.c(context2, this.C);
            this.A.resumeWith(obj);
            wn.v vVar = wn.v.f59242a;
            o0.a(context2, c10);
            do {
            } while (b10.B0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f63297z + ", " + v0.c(this.A) + ']';
    }
}
