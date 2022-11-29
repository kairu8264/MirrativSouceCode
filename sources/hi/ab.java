package hi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ab extends AbstractList<String> implements RandomAccess, f9 {

    /* renamed from: w  reason: collision with root package name */
    public final f9 f35643w;

    public ab(f9 f9Var) {
        this.f35643w = f9Var;
    }

    @Override // hi.f9
    public final Object E(int i10) {
        return this.f35643w.E(i10);
    }

    @Override // hi.f9
    public final f9 c() {
        return this;
    }

    @Override // hi.f9
    public final List<?> e() {
        return this.f35643w.e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((e9) this.f35643w).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new za(this);
    }

    @Override // hi.f9
    public final void k1(u7 u7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new ya(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35643w.size();
    }
}
