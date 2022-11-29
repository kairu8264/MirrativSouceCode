package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class ni extends mi {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final ConstraintLayout D;
    public long E;

    public ni(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 2, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.mi
    public void T(ud.w3 w3Var) {
        this.C = w3Var;
        synchronized (this) {
            this.E |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.E;
            this.E = 0L;
        }
        int i10 = 0;
        ud.w3 w3Var = this.C;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        if (i11 == 0 || w3Var == null) {
            str = null;
        } else {
            str = w3Var.a();
            i10 = w3Var.b();
        }
        if (i11 != 0) {
            x3.e.c(this.B, str);
            this.B.setTextColor(i10);
            td.c.c(this.B, 24, 1, Integer.valueOf(i10), null);
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

    public ni(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[1]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        N(view);
        y();
    }
}
