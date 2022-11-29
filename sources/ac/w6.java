package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class w6 extends v6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public long F;

    public w6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.v6
    public void T(hc.c1 c1Var) {
        this.C = c1Var;
        synchronized (this) {
            this.F |= 1;
        }
        c(xb.b.f59841d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        hc.c1 c1Var = this.C;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i10 == 0 || c1Var == null) {
            str = null;
        } else {
            str = c1Var.c();
            str2 = c1Var.b();
        }
        if (i10 != 0) {
            td.a.i(this.B, str2);
            x3.e.c(this.E, str);
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

    public w6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1]);
        this.F = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[2];
        this.E = appCompatTextView;
        appCompatTextView.setTag(null);
        N(view);
        y();
    }
}
