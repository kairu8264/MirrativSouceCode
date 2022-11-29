package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class v1 extends u1 {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout J;
    public final LinearLayoutCompat K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(10);
        M = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{2}, new int[]{nd.b1.toolbar});
        iVar.a(1, new String[]{"view_contract_step", "view_contract_edit_caption", "view_contract_edit_identification"}, new int[]{3, 4, 5}, new int[]{nc.f.view_contract_step, nc.f.view_contract_edit_caption, nc.f.view_contract_edit_identification});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nc.e.scroll_container, 6);
        sparseIntArray.put(nc.e.step_divider_view, 7);
        sparseIntArray.put(nc.e.f41833l0, 8);
        sparseIntArray.put(nc.e.f41817a1, 9);
    }

    public v1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    return W((u2) obj, i11);
                }
                return Y((e8) obj, i11);
            }
            return V((s2) obj, i11);
        }
        return X((y2) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M(androidx.lifecycle.u uVar) {
        super.M(uVar);
        this.I.M(uVar);
        this.H.M(uVar);
        this.C.M(uVar);
        this.E.M(uVar);
    }

    public final boolean V(s2 s2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(u2 u2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean X(y2 y2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.n(this.I);
        ViewDataBinding.n(this.H);
        ViewDataBinding.n(this.C);
        ViewDataBinding.n(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return this.I.w() || this.H.w() || this.C.w() || this.E.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 16L;
        }
        this.I.y();
        this.H.y();
        this.C.y();
        this.E.y();
        H();
    }

    public v1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 4, (LinearLayout) objArr[8], (s2) objArr[4], (AppCompatButton) objArr[9], (u2) objArr[5], (NestedScrollView) objArr[6], (View) objArr[7], (y2) objArr[3], (e8) objArr[2]);
        this.L = -1L;
        L(this.C);
        L(this.E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[1];
        this.K = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        L(this.H);
        L(this.I);
        N(view);
        y();
    }
}
