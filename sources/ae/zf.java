package ae;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class zf extends yf {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final AppCompatTextView M;
    public final View N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(nd.z0.f42294hb, 9);
        sparseIntArray.put(nd.z0.f42286fb, 10);
        sparseIntArray.put(nd.z0.f42281eb, 11);
    }

    public zf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return U((androidx.lifecycle.e0) obj, i11);
            case 4:
                return V((androidx.lifecycle.e0) obj, i11);
            case 5:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return W((androidx.lifecycle.e0) obj, i11);
            case 8:
                return X((androidx.lifecycle.e0) obj, i11);
            case 9:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 10:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return Z((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.yf
    public void T(ud.r1 r1Var) {
        this.L = r1Var;
        synchronized (this) {
            this.O |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.O |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.zf.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        H();
    }

    public zf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 12, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[9]);
        this.O = -1L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[1];
        this.M = appCompatTextView;
        appCompatTextView.setTag(null);
        View view2 = (View) objArr[8];
        this.N = view2;
        view2.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
