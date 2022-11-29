package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class t1 extends s1 {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public final ConstraintLayout H;
    public final LinearLayoutCompat I;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        K = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{2}, new int[]{nd.b1.toolbar});
        iVar.a(1, new String[]{"view_contract_edit_caption", "view_contract_edit_bank_account"}, new int[]{3, 4}, new int[]{nc.f.view_contract_edit_caption, nc.f.view_contract_edit_bank_account});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nc.e.scroll_container, 5);
        sparseIntArray.put(nc.e.f41833l0, 6);
        sparseIntArray.put(nc.e.f41817a1, 7);
    }

    public t1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                return X((e8) obj, i11);
            }
            return W((q2) obj, i11);
        }
        return V((s2) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void M(androidx.lifecycle.u uVar) {
        super.M(uVar);
        this.G.M(uVar);
        this.C.M(uVar);
        this.E.M(uVar);
    }

    public final boolean V(s2 s2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(q2 q2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean X(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.J |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.n(this.G);
        ViewDataBinding.n(this.C);
        ViewDataBinding.n(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return this.G.w() || this.C.w() || this.E.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 8L;
        }
        this.G.y();
        this.C.y();
        this.E.y();
        H();
    }

    public t1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 3, (LinearLayoutCompat) objArr[6], (s2) objArr[3], (AppCompatButton) objArr[7], (q2) objArr[4], (NestedScrollView) objArr[5], (e8) objArr[2]);
        this.J = -1L;
        L(this.C);
        L(this.E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[1];
        this.I = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        L(this.G);
        N(view);
        y();
    }
}
