package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class n0 extends m0 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout E;
    public long F;

    public n0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.m0
    public void T(ud.o oVar) {
        this.D = oVar;
        synchronized (this) {
            this.F |= 1;
        }
        c(q9.a.f48788c);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        ud.o oVar = this.D;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        int i11 = 0;
        if (i10 == 0 || oVar == null) {
            z10 = false;
        } else {
            i11 = oVar.b();
            z10 = oVar.c();
        }
        if (i10 != 0) {
            td.a.z(this.B, Integer.valueOf(i11));
            td.c.e(this.C, Boolean.valueOf(z10));
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

    public n0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[2]);
        this.F = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        N(view);
        y();
    }
}
