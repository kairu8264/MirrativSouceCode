package db;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p extends o {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout E;
    public long F;

    public p(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.o
    public void T(ya.g0 g0Var) {
        this.D = g0Var;
        synchronized (this) {
            this.F |= 1;
        }
        c(wa.a.f58500a);
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
        ya.g0 g0Var = this.D;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i10 == 0 || g0Var == null) {
            str = null;
        } else {
            str2 = g0Var.a();
            str = g0Var.b();
        }
        if (i10 != 0) {
            x3.e.c(this.B, str2);
            td.a.f(this.C, str);
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

    public p(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1]);
        this.F = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
