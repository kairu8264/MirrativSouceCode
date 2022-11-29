package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class va extends ua {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.divider_left, 5);
        sparseIntArray.put(nd.z0.divider_right, 6);
        sparseIntArray.put(nd.z0.f42305k6, 7);
        sparseIntArray.put(nd.z0.f42311l6, 8);
        sparseIntArray.put(nd.z0.f42293h6, 9);
    }

    public va(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.ua
    public void T(ud.x0 x0Var) {
        this.K = x0Var;
        synchronized (this) {
            this.M |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        String str2;
        synchronized (this) {
            j10 = this.M;
            this.M = 0L;
        }
        ud.x0 x0Var = this.K;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i11 == 0 || x0Var == null) {
            str = null;
            z10 = false;
            z11 = false;
            i10 = 0;
            z12 = false;
            str2 = null;
        } else {
            String e10 = x0Var.e();
            String f10 = x0Var.f();
            String b10 = x0Var.b();
            z11 = x0Var.i();
            i10 = x0Var.c();
            z12 = x0Var.j();
            z10 = x0Var.k();
            str2 = e10;
            str3 = b10;
            str = f10;
        }
        if (i11 != 0) {
            x3.e.c(this.B, str3);
            this.B.setTextColor(i10);
            td.c.e(this.B, Boolean.valueOf(z12));
            td.a.f(this.H, str2);
            td.c.e(this.I, Boolean.valueOf(z11));
            x3.e.c(this.J, str);
            td.c.e(this.J, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 2L;
        }
        H();
    }

    public va(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[6], (Guideline) objArr[9], (Guideline) objArr[7], (Guideline) objArr[8], (AppCompatImageView) objArr[1], (RecyclerView) objArr[2], (AppCompatTextView) objArr[3]);
        this.M = -1L;
        this.B.setTag(null);
        this.H.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
