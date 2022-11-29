package ai;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class qy2 extends oy2 implements ListIterator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ry2 f9238z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy2(ry2 ry2Var) {
        super(ry2Var);
        this.f9238z = ry2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        boolean isEmpty = this.f9238z.isEmpty();
        a();
        ((ListIterator) this.f8167w).add(obj);
        sy2 sy2Var = this.f9238z.B;
        i10 = sy2Var.A;
        sy2Var.A = i10 + 1;
        if (isEmpty) {
            this.f9238z.f();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f8167w).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f8167w).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f8167w).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f8167w).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f8167w).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy2(ry2 ry2Var, int i10) {
        super(ry2Var, ((List) ry2Var.f8737x).listIterator(i10));
        this.f9238z = ry2Var;
    }
}
