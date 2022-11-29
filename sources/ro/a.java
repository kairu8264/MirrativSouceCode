package ro;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import jo.p;

/* loaded from: classes4.dex */
public final class a<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<g<T>> f51606a;

    public a(g<? extends T> gVar) {
        p.h(gVar, "sequence");
        this.f51606a = new AtomicReference<>(gVar);
    }

    @Override // ro.g
    public Iterator<T> iterator() {
        g<T> andSet = this.f51606a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
