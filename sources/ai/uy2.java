package ai;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class uy2 extends AbstractCollection {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ vy2 f10881w;

    public uy2(vy2 vy2Var) {
        this.f10881w = vy2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f10881w.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10881w.g(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f10881w.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f10881w.f();
    }
}
