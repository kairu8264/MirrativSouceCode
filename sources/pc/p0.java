package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p0 extends o0 {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(10);
        M = iVar;
        iVar.a(1, new String[]{"view_confirm_edit_identification", "view_confirm_edit_bank_account"}, new int[]{2, 3}, new int[]{nc.f.view_confirm_edit_identification, nc.f.view_confirm_edit_bank_account});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nc.e.identification_title, 4);
        sparseIntArray.put(nc.e.change_identification_button, 5);
        sparseIntArray.put(nc.e.edit_identification_caption_text, 6);
        sparseIntArray.put(nc.e.bank_account_title, 7);
        sparseIntArray.put(nc.e.change_bank_account_button, 8);
        sparseIntArray.put(nc.e.R0, 9);
    }

    public p0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return T((m2) obj, i11);
        }
        return U((o2) obj, i11);
    }

    public final boolean T(m2 m2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean U(o2 o2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.L |= 1;
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
        ViewDataBinding.n(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return this.I.w() || this.B.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 4L;
        }
        this.I.y();
        this.B.y();
        H();
    }

    public p0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (m2) objArr[3], (AppCompatTextView) objArr[7], (AppCompatButton) objArr[8], (AppCompatButton) objArr[5], (AppCompatImageView) objArr[9], (LinearLayout) objArr[1], (AppCompatTextView) objArr[6], (o2) objArr[2], (AppCompatTextView) objArr[4]);
        this.L = -1L;
        L(this.B);
        this.G.setTag(null);
        L(this.I);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
