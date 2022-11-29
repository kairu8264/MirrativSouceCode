package jk;

import dk.w;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class f {
    public static <ResultT> ResultT a(d<ResultT> dVar) throws ExecutionException, InterruptedException {
        w.a(dVar, "Task must not be null");
        if (dVar.h()) {
            return (ResultT) d(dVar);
        }
        t tVar = new t(null);
        e(dVar, tVar);
        tVar.b();
        return (ResultT) d(dVar);
    }

    public static <ResultT> d<ResultT> b(Exception exc) {
        r rVar = new r();
        rVar.j(exc);
        return rVar;
    }

    public static <ResultT> d<ResultT> c(ResultT resultt) {
        r rVar = new r();
        rVar.k(resultt);
        return rVar;
    }

    public static <ResultT> ResultT d(d<ResultT> dVar) throws ExecutionException {
        if (dVar.i()) {
            return dVar.g();
        }
        throw new ExecutionException(dVar.f());
    }

    public static void e(d<?> dVar, u uVar) {
        Executor executor = e.f38069b;
        dVar.d(executor, uVar);
        dVar.b(executor, uVar);
    }
}
