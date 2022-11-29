package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import hb.w1;

/* loaded from: classes2.dex */
public class p0 extends n0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(w1.C1, 4);
    }

    public p0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // kb.n0
    public void T(ud.y0 y0Var) {
        this.F = y0Var;
        synchronized (this) {
            this.H |= 1;
        }
        c(hb.a.f34700b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        ud.y0 y0Var = this.F;
        String str = null;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z11 = false;
        if (i10 == 0 || y0Var == null) {
            z10 = false;
        } else {
            boolean i11 = y0Var.i();
            boolean j11 = y0Var.j();
            str = y0Var.b();
            z10 = i11;
            z11 = j11;
        }
        if (i10 != 0) {
            x3.e.c(this.B, str);
            td.c.e(this.C, Boolean.valueOf(z11));
            td.c.e(this.D, Boolean.valueOf(z11));
            this.G.setClickable(z10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 2L;
        }
        H();
    }

    public p0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[4]);
        this.H = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
