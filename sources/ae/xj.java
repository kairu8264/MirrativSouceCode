package ae;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class xj extends wj {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.ranking_header_container, 7);
        sparseIntArray.put(nd.z0.f42306kb, 8);
    }

    public xj(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return W((androidx.lifecycle.e0) obj, i11);
            case 2:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return X((androidx.lifecycle.e0) obj, i11);
            case 4:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 5:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return U((androidx.lifecycle.e0) obj, i11);
            case 7:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 8:
                return V((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.wj
    public void T(ud.p1 p1Var) {
        this.I = p1Var;
        synchronized (this) {
            this.L |= 512;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.L |= 32;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.xj.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        H();
    }

    public xj(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 9, (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[7], (RecyclerView) objArr[8]);
        this.L = -1L;
        this.B.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[1];
        this.J = appCompatTextView;
        appCompatTextView.setTag(null);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[6];
        this.K = appCompatTextView2;
        appCompatTextView2.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
