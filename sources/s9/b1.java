package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class b1 extends a1 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout E;
    public long F;

    public b1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.a1
    public void T(jf.l0 l0Var) {
        this.D = l0Var;
        synchronized (this) {
            this.F |= 1;
        }
        c(q9.a.f48788c);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        int i10;
        boolean z10;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        jf.l0 l0Var = this.D;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z11 = false;
        if (i11 == 0 || l0Var == null) {
            i10 = 0;
            z10 = false;
        } else {
            int b10 = l0Var.b();
            boolean a10 = l0Var.a();
            z10 = l0Var.d();
            i10 = b10;
            z11 = a10;
        }
        if (i11 != 0) {
            td.c.e(this.B, Boolean.valueOf(z11));
            this.C.setSelected(z10);
            td.a.F(this.C, Integer.valueOf(i10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 2L;
        }
        H();
    }

    public b1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (AppCompatImageView) objArr[1]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        N(view);
        y();
    }
}
