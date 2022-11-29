package jk;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l<ResultT> implements m<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f38082a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38083b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final c<? super ResultT> f38084c;

    public l(Executor executor, c<? super ResultT> cVar) {
        this.f38082a = executor;
        this.f38084c = cVar;
    }

    @Override // jk.m
    public final void a(d<ResultT> dVar) {
        if (dVar.i()) {
            synchronized (this.f38083b) {
                if (this.f38084c == null) {
                    return;
                }
                this.f38082a.execute(new k(this, dVar));
            }
        }
    }
}
