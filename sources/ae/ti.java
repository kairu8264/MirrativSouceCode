package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class ti extends si {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.stroke_color_image_view, 2);
        sparseIntArray.put(nd.z0.main_color_image_view, 3);
    }

    public ti(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.si
    public void T(ud.z3 z3Var) {
        this.E = z3Var;
        synchronized (this) {
            this.G |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        boolean z10 = false;
        ud.z3 z3Var = this.E;
        int i10 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        if (i10 != 0 && z3Var != null) {
            z10 = z3Var.d();
        }
        if (i10 != 0) {
            td.c.e(this.C, Boolean.valueOf(z10));
        }
        if ((j10 & 2) != 0) {
            td.c.c(this.C, 100, 3, Integer.valueOf(ViewDataBinding.t(this.C, nd.w0.f42242u0)), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 2L;
        }
        H();
    }

    public ti(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (View) objArr[1], (AppCompatImageView) objArr[2]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        N(view);
        y();
    }
}
