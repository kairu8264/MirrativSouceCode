package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class rm extends qm {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public long F;

    public rm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.qm
    public void T(ud.y3 y3Var) {
        this.E = y3Var;
        synchronized (this) {
            this.F |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        Drawable drawable;
        String str;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        ud.y3 y3Var = this.E;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        Drawable drawable2 = null;
        if (i10 == 0 || y3Var == null) {
            drawable = null;
            str = null;
        } else {
            drawable2 = y3Var.a();
            drawable = y3Var.c();
            str = y3Var.b();
        }
        if (i10 != 0) {
            x3.f.a(this.B, drawable2);
            x3.e.c(this.C, str);
            if (ViewDataBinding.s() >= 16) {
                this.D.setBackground(drawable);
            }
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

    public rm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1]);
        this.F = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
