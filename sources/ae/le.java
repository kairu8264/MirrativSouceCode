package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftGachaDuplicatedPointGaugeView;

/* loaded from: classes2.dex */
public class le extends ke {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final ConstraintLayout D;
    public long E;

    public le(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 2, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.ke
    public void T(ud.h0 h0Var) {
        this.C = h0Var;
        synchronized (this) {
            this.E |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.E;
            this.E = 0L;
        }
        ud.h0 h0Var = this.C;
        boolean z10 = false;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        if (i10 != 0 && h0Var != null) {
            z10 = h0Var.e();
        }
        if (i10 != 0) {
            td.c.e(this.B, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.E = 2L;
        }
        H();
    }

    public le(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (GiftGachaDuplicatedPointGaugeView) objArr[1]);
        this.E = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
