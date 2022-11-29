package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class d6 extends c6 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.f42264b1, 7);
        sparseIntArray.put(nd.z0.Ff, 8);
        sparseIntArray.put(nd.z0.E3, 9);
        sparseIntArray.put(nd.z0.f42288g1, 10);
    }

    public d6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return X((androidx.lifecycle.e0) obj, i11);
            case 2:
                return W((androidx.lifecycle.e0) obj, i11);
            case 3:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 6:
                return Y((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.c6
    public void V(ud.v4 v4Var) {
        this.L = v4Var;
        synchronized (this) {
            this.N |= 128;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.N |= 1;
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
        throw new UnsupportedOperationException("Method not decompiled: ae.d6.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 256L;
        }
        H();
    }

    public d6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 7, (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[10], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[4], (View) objArr[9], (EditText) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[5]);
        this.N = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
