package ai;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class hl3 implements Iterator<String> {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<String> f4898w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ il3 f4899x;

    public hl3(il3 il3Var) {
        gj3 gj3Var;
        this.f4899x = il3Var;
        gj3Var = il3Var.f5283w;
        this.f4898w = gj3Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4898w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f4898w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
