package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class vd extends ud {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final AppCompatTextView G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.E1, 4);
    }

    public vd(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                return U((androidx.lifecycle.e0) obj, i11);
            }
            return W((androidx.lifecycle.e0) obj, i11);
        }
        return V((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.ud
    public void T(ud.a0 a0Var) {
        this.F = a0Var;
        synchronized (this) {
            this.H |= 8;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.vd.l():void");
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
            this.H = 16L;
        }
        H();
    }

    public vd(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 3, (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[0], (ImageView) objArr[1]);
        this.H = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[3];
        this.G = appCompatTextView;
        appCompatTextView.setTag(null);
        N(view);
        y();
    }
}
