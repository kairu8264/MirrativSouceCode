package hi;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class za implements Iterator<String> {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<String> f36106w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ab f36107x;

    public za(ab abVar) {
        f9 f9Var;
        this.f36107x = abVar;
        f9Var = abVar.f35643w;
        this.f36106w = f9Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36106w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f36106w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
