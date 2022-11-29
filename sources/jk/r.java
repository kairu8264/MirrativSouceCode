package jk;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import dk.w;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class r<ResultT> extends d<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38090a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final n<ResultT> f38091b = new n<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f38092c;

    /* renamed from: d  reason: collision with root package name */
    public ResultT f38093d;

    /* renamed from: e  reason: collision with root package name */
    public Exception f38094e;

    @Override // jk.d
    public final d<ResultT> a(a<ResultT> aVar) {
        this.f38091b.a(new h(e.f38068a, aVar));
        p();
        return this;
    }

    @Override // jk.d
    public final d<ResultT> b(Executor executor, b bVar) {
        this.f38091b.a(new j(executor, bVar));
        p();
        return this;
    }

    @Override // jk.d
    public final d<ResultT> c(b bVar) {
        b(e.f38068a, bVar);
        return this;
    }

    @Override // jk.d
    public final d<ResultT> d(Executor executor, c<? super ResultT> cVar) {
        this.f38091b.a(new l(executor, cVar));
        p();
        return this;
    }

    @Override // jk.d
    public final d<ResultT> e(c<? super ResultT> cVar) {
        d(e.f38068a, cVar);
        return this;
    }

    @Override // jk.d
    public final Exception f() {
        Exception exc;
        synchronized (this.f38090a) {
            exc = this.f38094e;
        }
        return exc;
    }

    @Override // jk.d
    public final ResultT g() {
        ResultT resultt;
        synchronized (this.f38090a) {
            n();
            Exception exc = this.f38094e;
            if (exc == null) {
                resultt = this.f38093d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    @Override // jk.d
    public final boolean h() {
        boolean z10;
        synchronized (this.f38090a) {
            z10 = this.f38092c;
        }
        return z10;
    }

    @Override // jk.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f38090a) {
            z10 = false;
            if (this.f38092c && this.f38094e == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void j(Exception exc) {
        synchronized (this.f38090a) {
            o();
            this.f38092c = true;
            this.f38094e = exc;
        }
        this.f38091b.b(this);
    }

    public final void k(ResultT resultt) {
        synchronized (this.f38090a) {
            o();
            this.f38092c = true;
            this.f38093d = resultt;
        }
        this.f38091b.b(this);
    }

    public final boolean l(Exception exc) {
        synchronized (this.f38090a) {
            if (this.f38092c) {
                return false;
            }
            this.f38092c = true;
            this.f38094e = exc;
            this.f38091b.b(this);
            return true;
        }
    }

    public final boolean m(ResultT resultt) {
        synchronized (this.f38090a) {
            if (this.f38092c) {
                return false;
            }
            this.f38092c = true;
            this.f38093d = resultt;
            this.f38091b.b(this);
            return true;
        }
    }

    public final void n() {
        w.b(this.f38092c, "Task is not yet complete");
    }

    public final void o() {
        w.b(!this.f38092c, "Task is already complete");
    }

    public final void p() {
        synchronized (this.f38090a) {
            if (this.f38092c) {
                this.f38091b.b(this);
            }
        }
    }
}
