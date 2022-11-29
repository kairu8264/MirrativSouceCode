package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class jf extends Cif {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 3);
        sparseIntArray.put(nd.z0.f42305k6, 4);
        sparseIntArray.put(nd.z0.f42311l6, 5);
        sparseIntArray.put(nd.z0.f42293h6, 6);
    }

    public jf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.Cif
    public void T(ud.s0 s0Var) {
        this.H = s0Var;
        synchronized (this) {
            this.J |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        int i10 = 0;
        float f10 = 0.0f;
        ud.s0 s0Var = this.H;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i11 == 0 || s0Var == null) {
            str = null;
        } else {
            str2 = s0Var.d();
            i10 = s0Var.e();
            f10 = s0Var.a();
            str = s0Var.b();
        }
        if (i11 != 0) {
            if (ViewDataBinding.s() >= 11) {
                this.F.setAlpha(f10);
                this.G.setAlpha(f10);
            }
            x3.e.c(this.F, str);
            x3.e.c(this.G, str2);
            this.G.setTextColor(i10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 2L;
        }
        H();
    }

    public jf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Guideline) objArr[6], (Guideline) objArr[3], (Guideline) objArr[4], (Guideline) objArr[5], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2]);
        this.J = -1L;
        this.F.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        N(view);
        y();
    }
}
