package ai;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gz2 extends AbstractCollection {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hz2 f4664w;

    public gz2(hz2 hz2Var) {
        this.f4664w = hz2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4664w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        hz2 hz2Var = this.f4664w;
        Map o10 = hz2Var.o();
        if (o10 != null) {
            return o10.values().iterator();
        }
        return new az2(hz2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4664w.size();
    }
}
