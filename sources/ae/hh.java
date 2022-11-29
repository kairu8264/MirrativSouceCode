package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class hh extends gh {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I = null;
    public long G;

    public hh(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return U((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.gh
    public void T(ud.m mVar) {
        this.F = mVar;
        synchronized (this) {
            this.G |= 2;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.G |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        Integer num;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        ud.m mVar = this.F;
        int i10 = ((7 & j10) > 0L ? 1 : ((7 & j10) == 0L ? 0 : -1));
        String str2 = null;
        if (i10 != 0) {
            androidx.lifecycle.e0<Integer> c10 = mVar != null ? mVar.c() : null;
            Q(0, c10);
            num = c10 != null ? c10.f() : null;
            if ((j10 & 6) == 0 || mVar == null) {
                str = null;
            } else {
                str2 = mVar.a();
                str = mVar.b();
            }
        } else {
            str = null;
            num = null;
        }
        if ((j10 & 6) != 0) {
            td.a.j(this.B, str2, 0);
            this.C.setText(str);
        }
        if (i10 != 0) {
            td.a.F(this.D, num);
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
            this.G = 4L;
        }
        H();
    }

    public hh(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[0]);
        this.G = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        N(view);
        y();
    }
}
