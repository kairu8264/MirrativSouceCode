package jk;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h<ResultT> implements m<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f38072a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38073b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final a<ResultT> f38074c;

    public h(Executor executor, a<ResultT> aVar) {
        this.f38072a = executor;
        this.f38074c = aVar;
    }

    @Override // jk.m
    public final void a(d<ResultT> dVar) {
        synchronized (this.f38073b) {
            if (this.f38074c == null) {
                return;
            }
            this.f38072a.execute(new g(this, dVar));
        }
    }
}
