package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class b0 extends RecyclerView.m {

    /* renamed from: g  reason: collision with root package name */
    public boolean f16050g = true;

    public abstract boolean A(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13);

    public abstract boolean B(RecyclerView.e0 e0Var);

    public final void C(RecyclerView.e0 e0Var) {
        K(e0Var);
        h(e0Var);
    }

    public final void D(RecyclerView.e0 e0Var) {
        L(e0Var);
    }

    public final void E(RecyclerView.e0 e0Var, boolean z10) {
        M(e0Var, z10);
        h(e0Var);
    }

    public final void F(RecyclerView.e0 e0Var, boolean z10) {
        N(e0Var, z10);
    }

    public final void G(RecyclerView.e0 e0Var) {
        O(e0Var);
        h(e0Var);
    }

    public final void H(RecyclerView.e0 e0Var) {
        P(e0Var);
    }

    public final void I(RecyclerView.e0 e0Var) {
        Q(e0Var);
        h(e0Var);
    }

    public final void J(RecyclerView.e0 e0Var) {
        R(e0Var);
    }

    public void K(RecyclerView.e0 e0Var) {
    }

    public void L(RecyclerView.e0 e0Var) {
    }

    public void M(RecyclerView.e0 e0Var, boolean z10) {
    }

    public void N(RecyclerView.e0 e0Var, boolean z10) {
    }

    public void O(RecyclerView.e0 e0Var) {
    }

    public void P(RecyclerView.e0 e0Var) {
    }

    public void Q(RecyclerView.e0 e0Var) {
    }

    public void R(RecyclerView.e0 e0Var) {
    }

    public void S(boolean z10) {
        this.f16050g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        if (cVar != null && ((i10 = cVar.f15966a) != (i11 = cVar2.f15966a) || cVar.f15967b != cVar2.f15967b)) {
            return A(e0Var, i10, cVar.f15967b, i11, cVar2.f15967b);
        }
        return y(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f15966a;
        int i13 = cVar.f15967b;
        if (e0Var2.shouldIgnore()) {
            int i14 = cVar.f15966a;
            i11 = cVar.f15967b;
            i10 = i14;
        } else {
            i10 = cVar2.f15966a;
            i11 = cVar2.f15967b;
        }
        return z(e0Var, e0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f15966a;
        int i11 = cVar.f15967b;
        View view = e0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f15966a;
        int top = cVar2 == null ? view.getTop() : cVar2.f15967b;
        if (!e0Var.isRemoved() && (i10 != left || i11 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return A(e0Var, i10, i11, left, top);
        }
        return B(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f15966a;
        int i11 = cVar2.f15966a;
        if (i10 == i11 && cVar.f15967b == cVar2.f15967b) {
            G(e0Var);
            return false;
        }
        return A(e0Var, i10, cVar.f15967b, i11, cVar2.f15967b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.e0 e0Var) {
        return !this.f16050g || e0Var.isInvalid();
    }

    public abstract boolean y(RecyclerView.e0 e0Var);

    public abstract boolean z(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13);
}
