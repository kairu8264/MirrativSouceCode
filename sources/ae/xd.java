package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public class xd extends wd {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final AppCompatImageView J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.reward_condition_container, 7);
    }

    public xd(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 1:
                return X((androidx.lifecycle.e0) obj, i11);
            case 2:
                return V((androidx.lifecycle.e0) obj, i11);
            case 3:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return U((androidx.lifecycle.e0) obj, i11);
            case 5:
                return W((androidx.lifecycle.e0) obj, i11);
            case 6:
                return Z((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.wd
    public void T(ud.d0 d0Var) {
        this.I = d0Var;
        synchronized (this) {
            this.K |= 128;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 8;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.xd.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 256L;
        }
        H();
    }

    public xd(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 7, (AppCompatImageView) objArr[5], (MultipleStarView) objArr[4], (View) objArr[1], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2]);
        this.K = -1L;
        this.B.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[3];
        this.J = appCompatImageView;
        appCompatImageView.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        N(view);
        y();
    }
}
