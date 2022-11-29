package l0;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<s0.d> f38959a = new AtomicReference<>(s0.e.a());

    /* renamed from: b  reason: collision with root package name */
    public final Object f38960b = new Object();

    public final T a() {
        return (T) this.f38959a.get().b(Thread.currentThread().getId());
    }

    public final void b(T t10) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.f38960b) {
            s0.d dVar = this.f38959a.get();
            if (dVar.d(id2, t10)) {
                return;
            }
            this.f38959a.set(dVar.c(id2, t10));
            wn.v vVar = wn.v.f59242a;
        }
    }
}
