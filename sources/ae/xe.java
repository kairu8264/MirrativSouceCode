package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class xe extends we {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K = null;
    public final ConstraintLayout H;
    public long I;

    public xe(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.we
    public void T(ud.k0 k0Var) {
        this.G = k0Var;
        synchronized (this) {
            this.I |= 1;
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
        String str2;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        ud.k0 k0Var = this.G;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i11 == 0 || k0Var == null) {
            str = null;
            z10 = false;
            z11 = false;
            i10 = 0;
            str2 = null;
        } else {
            boolean e10 = k0Var.e();
            String d10 = k0Var.d();
            String a10 = k0Var.a();
            str = k0Var.c();
            i10 = k0Var.b();
            z11 = k0Var.f();
            str2 = d10;
            str3 = a10;
            z10 = e10;
        }
        if (i11 != 0) {
            td.c.e(this.B, Boolean.valueOf(z10));
            td.a.f(this.C, str3);
            td.c.a(this.D, Integer.valueOf(i10));
            td.c.e(this.D, Boolean.valueOf(z11));
            td.a.i(this.E, str);
            td.c.e(this.E, Boolean.valueOf(z11));
            x3.e.c(this.F, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 2L;
        }
        H();
    }

    public xe(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[1], (View) objArr[2], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4]);
        this.I = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
