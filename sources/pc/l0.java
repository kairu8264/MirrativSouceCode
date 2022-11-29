package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class l0 extends k0 {
    public static final ViewDataBinding.i J;
    public static final SparseIntArray K;
    public final ConstraintLayout G;
    public final LinearLayout H;
    public long I;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        J = iVar;
        iVar.a(1, new String[]{"view_confirm_edit_identification", "view_confirm_edit_bank_account"}, new int[]{2, 3}, new int[]{nc.f.view_confirm_edit_identification, nc.f.view_confirm_edit_bank_account});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nc.e.f41848v6, 4);
        sparseIntArray.put(nc.e.U3, 5);
        sparseIntArray.put(nc.e.M3, 6);
    }

    public l0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return V((m2) obj, i11);
        }
        return W((o2) obj, i11);
    }

    public final boolean V(m2 m2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(o2 o2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I = 0L;
        }
        ViewDataBinding.n(this.C);
        ViewDataBinding.n(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return this.C.w() || this.B.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 4L;
        }
        this.C.y();
        this.B.y();
        H();
    }

    public l0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (m2) objArr[3], (o2) objArr[2], (AppCompatButton) objArr[6], (AppCompatButton) objArr[5], (AppCompatTextView) objArr[4]);
        this.I = -1L;
        L(this.B);
        L(this.C);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.H = linearLayout;
        linearLayout.setTag(null);
        N(view);
        y();
    }
}
