package ai;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e03 extends b23 {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<? extends uz2> f3489w;

    /* renamed from: x  reason: collision with root package name */
    public Iterator f3490x = l03.f6438z;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ h03 f3491y;

    public e03(h03 h03Var) {
        this.f3491y = h03Var;
        this.f3489w = ((zz2) h03Var.f4675z.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3490x.hasNext() || this.f3489w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3490x.hasNext()) {
            this.f3490x = this.f3489w.next().iterator();
        }
        return this.f3490x.next();
    }
}
