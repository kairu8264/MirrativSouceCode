package ai;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class oy2 implements Iterator {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator f8167w;

    /* renamed from: x  reason: collision with root package name */
    public final Collection f8168x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ py2 f8169y;

    public oy2(py2 py2Var) {
        Iterator it;
        this.f8169y = py2Var;
        Collection collection = py2Var.f8737x;
        this.f8168x = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8167w = it;
    }

    public oy2(py2 py2Var, Iterator it) {
        this.f8169y = py2Var;
        this.f8168x = py2Var.f8737x;
        this.f8167w = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f8169y.d();
        if (this.f8169y.f8737x != this.f8168x) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f8167w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f8167w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        this.f8167w.remove();
        sy2 sy2Var = this.f8169y.A;
        i10 = sy2Var.A;
        sy2Var.A = i10 - 1;
        this.f8169y.zzb();
    }
}
