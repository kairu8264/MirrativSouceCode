package vi;

import android.app.Activity;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class i0<TResult> extends g<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f57365a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final e0<TResult> f57366b = new e0<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f57367c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f57368d;

    /* renamed from: e  reason: collision with root package name */
    public TResult f57369e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f57370f;

    public final void A() {
        rh.p.m(this.f57367c, "Task is not yet complete");
    }

    public final void B() {
        if (this.f57368d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void C() {
        if (this.f57367c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    public final void D() {
        synchronized (this.f57365a) {
            if (this.f57367c) {
                this.f57366b.b(this);
            }
        }
    }

    @Override // vi.g
    public final g<TResult> a(Executor executor, b bVar) {
        this.f57366b.a(new u(executor, bVar));
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> b(Executor executor, c<TResult> cVar) {
        this.f57366b.a(new w(executor, cVar));
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> c(c<TResult> cVar) {
        this.f57366b.a(new w(i.f57363a, cVar));
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> d(Activity activity, d dVar) {
        y yVar = new y(i.f57363a, dVar);
        this.f57366b.a(yVar);
        h0.l(activity).m(yVar);
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> e(Executor executor, d dVar) {
        this.f57366b.a(new y(executor, dVar));
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> f(d dVar) {
        e(i.f57363a, dVar);
        return this;
    }

    @Override // vi.g
    public final g<TResult> g(Activity activity, e<? super TResult> eVar) {
        a0 a0Var = new a0(i.f57363a, eVar);
        this.f57366b.a(a0Var);
        h0.l(activity).m(a0Var);
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> h(Executor executor, e<? super TResult> eVar) {
        this.f57366b.a(new a0(executor, eVar));
        D();
        return this;
    }

    @Override // vi.g
    public final g<TResult> i(e<? super TResult> eVar) {
        h(i.f57363a, eVar);
        return this;
    }

    @Override // vi.g
    public final <TContinuationResult> g<TContinuationResult> j(Executor executor, a<TResult, TContinuationResult> aVar) {
        i0 i0Var = new i0();
        this.f57366b.a(new q(executor, aVar, i0Var));
        D();
        return i0Var;
    }

    @Override // vi.g
    public final <TContinuationResult> g<TContinuationResult> k(a<TResult, TContinuationResult> aVar) {
        return j(i.f57363a, aVar);
    }

    @Override // vi.g
    public final <TContinuationResult> g<TContinuationResult> l(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        i0 i0Var = new i0();
        this.f57366b.a(new s(executor, aVar, i0Var));
        D();
        return i0Var;
    }

    @Override // vi.g
    public final <TContinuationResult> g<TContinuationResult> m(a<TResult, g<TContinuationResult>> aVar) {
        return l(i.f57363a, aVar);
    }

    @Override // vi.g
    public final Exception n() {
        Exception exc;
        synchronized (this.f57365a) {
            exc = this.f57370f;
        }
        return exc;
    }

    @Override // vi.g
    public final TResult o() {
        TResult tresult;
        synchronized (this.f57365a) {
            A();
            B();
            Exception exc = this.f57370f;
            if (exc == null) {
                tresult = this.f57369e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    @Override // vi.g
    public final <X extends Throwable> TResult p(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f57365a) {
            A();
            B();
            if (!cls.isInstance(this.f57370f)) {
                Exception exc = this.f57370f;
                if (exc == null) {
                    tresult = this.f57369e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.f57370f);
            }
        }
        return tresult;
    }

    @Override // vi.g
    public final boolean q() {
        return this.f57368d;
    }

    @Override // vi.g
    public final boolean r() {
        boolean z10;
        synchronized (this.f57365a) {
            z10 = this.f57367c;
        }
        return z10;
    }

    @Override // vi.g
    public final boolean s() {
        boolean z10;
        synchronized (this.f57365a) {
            z10 = false;
            if (this.f57367c && !this.f57368d && this.f57370f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // vi.g
    public final <TContinuationResult> g<TContinuationResult> t(Executor executor, f<TResult, TContinuationResult> fVar) {
        i0 i0Var = new i0();
        this.f57366b.a(new c0(executor, fVar, i0Var));
        D();
        return i0Var;
    }

    @Override // vi.g
    public final <TContinuationResult> g<TContinuationResult> u(f<TResult, TContinuationResult> fVar) {
        Executor executor = i.f57363a;
        i0 i0Var = new i0();
        this.f57366b.a(new c0(executor, fVar, i0Var));
        D();
        return i0Var;
    }

    public final void v(Exception exc) {
        rh.p.j(exc, "Exception must not be null");
        synchronized (this.f57365a) {
            C();
            this.f57367c = true;
            this.f57370f = exc;
        }
        this.f57366b.b(this);
    }

    public final void w(TResult tresult) {
        synchronized (this.f57365a) {
            C();
            this.f57367c = true;
            this.f57369e = tresult;
        }
        this.f57366b.b(this);
    }

    public final boolean x() {
        synchronized (this.f57365a) {
            if (this.f57367c) {
                return false;
            }
            this.f57367c = true;
            this.f57368d = true;
            this.f57366b.b(this);
            return true;
        }
    }

    public final boolean y(Exception exc) {
        rh.p.j(exc, "Exception must not be null");
        synchronized (this.f57365a) {
            if (this.f57367c) {
                return false;
            }
            this.f57367c = true;
            this.f57370f = exc;
            this.f57366b.b(this);
            return true;
        }
    }

    public final boolean z(TResult tresult) {
        synchronized (this.f57365a) {
            if (this.f57367c) {
                return false;
            }
            this.f57367c = true;
            this.f57369e = tresult;
            this.f57366b.b(this);
            return true;
        }
    }
}
