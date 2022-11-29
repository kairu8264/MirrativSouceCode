package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class x1 extends w1 {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout J;
    public final ConstraintLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(10);
        M = iVar;
        iVar.a(1, new String[]{"toolbar", "view_contract_step", "view_contract_edit_caption", "view_contract_edit_identification", "view_contract_edit_bank_account"}, new int[]{2, 3, 4, 5, 6}, new int[]{nd.b1.toolbar, nc.f.view_contract_step, nc.f.view_contract_edit_caption, nc.f.view_contract_edit_identification, nc.f.view_contract_edit_bank_account});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nc.e.scroll_container, 7);
        sparseIntArray.put(nc.e.confirm_button_background_view, 8);
        sparseIntArray.put(nc.e.f41817a1, 9);
    }

    public x1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        return W((u2) obj, i11);
                    }
                    return V((y2) obj, i11);
                }
                return X((e8) obj, i11);
            }
            return U((s2) obj, i11);
        }
        return T((q2) obj, i11);
    }

    public final boolean T(q2 q2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean U(s2 s2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean V(y2 y2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean W(u2 u2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean X(e8 e8Var, int i10) {
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
        ViewDataBinding.n(this.F);
        ViewDataBinding.n(this.E);
        ViewDataBinding.n(this.G);
        ViewDataBinding.n(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return this.I.w() || this.F.w() || this.E.w() || this.G.w() || this.B.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 32L;
        }
        this.I.y();
        this.F.y();
        this.E.y();
        this.G.y();
        this.B.y();
        H();
    }

    public x1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 5, (q2) objArr[6], (AppCompatButton) objArr[9], (View) objArr[8], (s2) objArr[4], (y2) objArr[3], (u2) objArr[5], (NestedScrollView) objArr[7], (e8) objArr[2]);
        this.L = -1L;
        L(this.B);
        L(this.E);
        L(this.F);
        L(this.G);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.K = constraintLayout2;
        constraintLayout2.setTag(null);
        L(this.I);
        N(view);
        y();
    }
}
