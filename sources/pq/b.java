package pq;

import io.l;
import jo.p;
import org.koin.core.error.KoinAppAlreadyStartedException;
import wn.v;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f48484a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static nq.a f48485b;

    /* renamed from: c  reason: collision with root package name */
    public static nq.b f48486c;

    @Override // pq.c
    public nq.b a(l<? super nq.b, v> lVar) {
        nq.b a10;
        p.h(lVar, "appDeclaration");
        synchronized (this) {
            a10 = nq.b.f43767c.a();
            f48484a.b(a10);
            lVar.invoke(a10);
            a10.b();
        }
        return a10;
    }

    public final void b(nq.b bVar) {
        if (f48485b == null) {
            f48486c = bVar;
            f48485b = bVar.c();
            return;
        }
        throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
    }

    @Override // pq.c
    public nq.a get() {
        nq.a aVar = f48485b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }
}
