package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class fi extends ei {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.request_matching_title_text_view, 7);
        sparseIntArray.put(nd.z0.matching_button_anchor_space, 8);
        sparseIntArray.put(nd.z0.request_matching_description_text_view, 9);
        sparseIntArray.put(nd.z0.accept_matching_description_text_view, 10);
    }

    public fi(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.ei
    public void T(ud.k3 k3Var) {
        this.L = k3Var;
        synchronized (this) {
            this.N |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        String str = null;
        ud.k3 k3Var = this.L;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z13 = false;
        if (i10 == 0 || k3Var == null) {
            z10 = false;
            z11 = false;
            z12 = false;
        } else {
            z13 = k3Var.c();
            str = k3Var.a();
            z10 = k3Var.d();
            z11 = k3Var.e();
            z12 = k3Var.f();
        }
        if (i10 != 0) {
            this.B.setEnabled(z13);
            x3.e.c(this.D, str);
            td.c.e(this.E, Boolean.valueOf(z10));
            td.c.e(this.F, Boolean.valueOf(z11));
            td.c.e(this.G, Boolean.valueOf(z11));
            td.c.e(this.I, Boolean.valueOf(z12));
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

    public fi(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RoundedButtonView) objArr[4], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[5], (MultipleUserView) objArr[6], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1], (Space) objArr[8], (RoundedButtonView) objArr[3], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[7]);
        this.N = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.I.setTag(null);
        N(view);
        y();
    }
}
