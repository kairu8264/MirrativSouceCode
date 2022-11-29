package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class hc extends gc {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.bottom_space_view, 7);
    }

    public hc(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return false;
                            }
                            return X((androidx.lifecycle.c0) obj, i11);
                        }
                        return Z((androidx.lifecycle.e0) obj, i11);
                    }
                    return U((androidx.lifecycle.e0) obj, i11);
                }
                return Y((androidx.lifecycle.c0) obj, i11);
            }
            return W((androidx.lifecycle.e0) obj, i11);
        }
        return V((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.gc
    public void T(ud.f fVar) {
        this.J = fVar;
        synchronized (this) {
            this.K |= 64;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.c0<Boolean> c0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.c0<Boolean> c0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.K |= 16;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.hc.l():void");
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
            this.K = 128L;
        }
        H();
    }

    public hc(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 6, (Space) objArr[7], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[3], (TextView) objArr[4], (RoundedButtonView) objArr[6], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[2]);
        this.K = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        N(view);
        y();
    }
}
