package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class lf extends kf {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 6);
        sparseIntArray.put(nd.z0.f42305k6, 7);
        sparseIntArray.put(nd.z0.f42311l6, 8);
        sparseIntArray.put(nd.z0.f42293h6, 9);
        sparseIntArray.put(nd.z0.event_bonus_image_view, 10);
    }

    public lf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.kf
    public void T(ud.t0 t0Var) {
        this.L = t0Var;
        synchronized (this) {
            this.N |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        int i10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        ud.t0 t0Var = this.L;
        int i11 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        boolean z10 = false;
        String str3 = null;
        if (i11 == 0 || t0Var == null) {
            i10 = 0;
            str = null;
            str2 = null;
        } else {
            str3 = t0Var.c();
            z10 = t0Var.e();
            str2 = t0Var.d();
            i10 = t0Var.a();
            str = t0Var.b();
        }
        if (i11 != 0) {
            td.c.e(this.B, Boolean.valueOf(z10));
            x3.e.c(this.D, str3);
            td.a.E(this.I, Integer.valueOf(i10));
            x3.e.c(this.J, str);
            x3.e.c(this.K, str2);
        }
        if ((j10 & 2) != 0) {
            td.c.b(this.B, 9, Integer.valueOf(ViewDataBinding.t(this.B, nd.w0.S)));
            td.c.b(this.M, 10, Integer.valueOf(ViewDataBinding.t(this.M, nd.w0.f42224a)));
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

    public lf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[5], (Guideline) objArr[9], (Guideline) objArr[6], (Guideline) objArr[7], (Guideline) objArr[8], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3]);
        this.N = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
