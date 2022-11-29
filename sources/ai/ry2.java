package ai;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class ry2 extends py2 implements List {
    public final /* synthetic */ sy2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry2(sy2 sy2Var, Object obj, List list, py2 py2Var) {
        super(sy2Var, obj, list, py2Var);
        this.B = sy2Var;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        d();
        boolean isEmpty = this.f8737x.isEmpty();
        ((List) this.f8737x).add(i10, obj);
        sy2 sy2Var = this.B;
        i11 = sy2Var.A;
        sy2Var.A = i11 + 1;
        if (isEmpty) {
            f();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f8737x).addAll(i10, collection);
        if (addAll) {
            int size2 = this.f8737x.size();
            sy2 sy2Var = this.B;
            i11 = sy2Var.A;
            sy2Var.A = i11 + (size2 - size);
            if (size == 0) {
                f();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        d();
        return ((List) this.f8737x).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        return ((List) this.f8737x).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        return ((List) this.f8737x).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        d();
        return new qy2(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        d();
        Object remove = ((List) this.f8737x).remove(i10);
        sy2 sy2Var = this.B;
        i11 = sy2Var.A;
        sy2Var.A = i11 - 1;
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        d();
        return ((List) this.f8737x).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        d();
        sy2 sy2Var = this.B;
        Object obj = this.f8736w;
        List subList = ((List) this.f8737x).subList(i10, i11);
        py2 py2Var = this.f8738y;
        if (py2Var == null) {
            py2Var = this;
        }
        return sy2Var.q(obj, subList, py2Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        d();
        return new qy2(this, i10);
    }
}
