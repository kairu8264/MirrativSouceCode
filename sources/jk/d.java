package jk;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class d<ResultT> {
    public abstract d<ResultT> a(a<ResultT> aVar);

    public abstract d<ResultT> b(Executor executor, b bVar);

    public abstract d<ResultT> c(b bVar);

    public abstract d<ResultT> d(Executor executor, c<? super ResultT> cVar);

    public abstract d<ResultT> e(c<? super ResultT> cVar);

    public abstract Exception f();

    public abstract ResultT g();

    public abstract boolean h();

    public abstract boolean i();
}
