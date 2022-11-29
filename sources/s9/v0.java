package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class v0 extends u0 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final AppCompatImageView H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(q9.g.reward_background_view, 5);
    }

    public v0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        return W((androidx.lifecycle.e0) obj, i11);
                    }
                    return U((androidx.lifecycle.e0) obj, i11);
                }
                return Y((androidx.lifecycle.e0) obj, i11);
            }
            return V((androidx.lifecycle.e0) obj, i11);
        }
        return X((androidx.lifecycle.e0) obj, i11);
    }

    @Override // s9.u0
    public void T(z9.u uVar) {
        this.G = uVar;
        synchronized (this) {
            this.I |= 32;
        }
        c(q9.a.f48787b);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.I |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.I |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.I |= 4;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.v0.l():void");
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
            this.I = 64L;
        }
        H();
    }

    public v0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 5, (AppCompatImageView) objArr[3], (View) objArr[5], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[1]);
        this.I = -1L;
        this.B.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[2];
        this.H = appCompatImageView;
        appCompatImageView.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
