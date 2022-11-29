package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class xf extends wf {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final AppCompatTextView G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.f42312lb, 4);
    }

    public xf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    return U((androidx.lifecycle.e0) obj, i11);
                }
                return W((androidx.lifecycle.e0) obj, i11);
            }
            return X((androidx.lifecycle.e0) obj, i11);
        }
        return V((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.wf
    public void T(ud.q1 q1Var) {
        this.F = q1Var;
        synchronized (this) {
            this.H |= 16;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.xf.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 32L;
        }
        H();
    }

    public xf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 4, (View) objArr[3], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (RecyclerView) objArr[4]);
        this.H = -1L;
        this.B.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[2];
        this.G = appCompatTextView;
        appCompatTextView.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
