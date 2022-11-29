package ai;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class il3 extends AbstractList<String> implements RandomAccess, gj3 {

    /* renamed from: w  reason: collision with root package name */
    public final gj3 f5283w;

    public il3(gj3 gj3Var) {
        this.f5283w = gj3Var;
    }

    @Override // ai.gj3
    public final Object Y(int i10) {
        return this.f5283w.Y(i10);
    }

    @Override // ai.gj3
    public final List<?> e() {
        return this.f5283w.e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((fj3) this.f5283w).get(i10);
    }

    @Override // ai.gj3
    public final gj3 h() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new hl3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new gl3(this, i10);
    }

    @Override // ai.gj3
    public final void q(oh3 oh3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5283w.size();
    }
}
