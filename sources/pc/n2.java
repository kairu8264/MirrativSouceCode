package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class n2 extends m2 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nc.e.bank_name_title, 5);
        sparseIntArray.put(nc.e.account_type_title, 6);
        sparseIntArray.put(nc.e.account_type, 7);
        sparseIntArray.put(nc.e.branch_code_title, 8);
        sparseIntArray.put(nc.e.bank_account_number_title, 9);
        sparseIntArray.put(nc.e.bank_account_name_title, 10);
    }

    public n2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // pc.m2
    public void T(ad.r0 r0Var) {
        this.L = r0Var;
        synchronized (this) {
            this.N |= 1;
        }
        c(nc.a.f41788b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        ad.r0 r0Var = this.L;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        if (i10 == 0 || r0Var == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            str4 = r0Var.c();
            str = r0Var.d();
            str2 = r0Var.g();
            str3 = r0Var.e();
        }
        if (i10 != 0) {
            x3.e.c(this.D, str4);
            x3.e.c(this.F, str);
            x3.e.c(this.H, str2);
            x3.e.c(this.J, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 2L;
        }
        H();
    }

    public n2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[8]);
        this.N = -1L;
        this.D.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
