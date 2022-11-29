package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MyAppView;
import ud.c2;

/* loaded from: classes2.dex */
public class z0 extends y0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J = null;
    public final ConstraintLayout G;
    public long H;

    public z0(androidx.databinding.e eVar, View view) {
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
                    return V((androidx.lifecycle.e0) obj, i11);
                }
                return U((androidx.lifecycle.e0) obj, i11);
            }
            return W((androidx.lifecycle.e0) obj, i11);
        }
        return X((androidx.lifecycle.e0) obj, i11);
    }

    @Override // kb.y0
    public void T(c2 c2Var) {
        this.F = c2Var;
        synchronized (this) {
            this.H |= 16;
        }
        c(hb.a.f34702d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.H |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.H |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.H |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.z0.l():void");
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

    public z0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 4, (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (MyAppView) objArr[2]);
        this.H = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        N(view);
        y();
    }
}
