package ae;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class zj extends yj {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J = null;
    public long H;

    public zj(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
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
                            return U((androidx.lifecycle.e0) obj, i11);
                        }
                        return W((androidx.lifecycle.e0) obj, i11);
                    }
                    return Y((androidx.lifecycle.e0) obj, i11);
                }
                return X((androidx.lifecycle.e0) obj, i11);
            }
            return V((androidx.lifecycle.e0) obj, i11);
        }
        return Z((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.yj
    public void T(ud.t1 t1Var) {
        this.G = t1Var;
        synchronized (this) {
            this.H |= 64;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.zj.l():void");
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
            this.H = 128L;
        }
        H();
    }

    public zj(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 6, (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1]);
        this.H = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
