package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class xi extends wi {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I = null;
    public final ConstraintLayout F;
    public long G;

    public xi(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.wi
    public void T(ud.a4 a4Var) {
        this.E = a4Var;
        synchronized (this) {
            this.G |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        int i10;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        ud.a4 a4Var = this.E;
        int i11 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        boolean z10 = false;
        if (i11 == 0 || a4Var == null) {
            i10 = 0;
        } else {
            int a10 = a4Var.a();
            z10 = a4Var.c();
            i10 = a10;
        }
        if ((j10 & 2) != 0) {
            td.c.b(this.B, 4, Integer.valueOf(ViewDataBinding.t(this.B, nd.w0.V0)));
            td.c.c(this.C, 8, 3, Integer.valueOf(ViewDataBinding.t(this.C, nd.w0.f42242u0)), null);
        }
        if (i11 != 0) {
            td.c.e(this.C, Boolean.valueOf(z10));
            td.a.F(this.D, Integer.valueOf(i10));
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

    public xi(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[2], (View) objArr[1], (AppCompatImageView) objArr[3]);
        this.G = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
