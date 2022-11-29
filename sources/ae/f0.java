package ae;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class f0 extends e0 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.f42304jg, 6);
        sparseIntArray.put(nd.z0.edit_text_view, 7);
        sparseIntArray.put(nd.z0.delete_text_view, 8);
        sparseIntArray.put(nd.z0.f42365x1, 9);
    }

    public f0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 1:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 4:
                return W((androidx.lifecycle.e0) obj, i11);
            case 5:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return X((androidx.lifecycle.e0) obj, i11);
            case 9:
                return c0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.e0
    public void V(ud.i iVar) {
        this.L = iVar;
        synchronized (this) {
            this.M |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Float> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.M |= 2;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.f0.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        H();
    }

    public f0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 10, (AppCompatTextView) objArr[9], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[3], (Switch) objArr[2], (AppCompatTextView) objArr[1], (Switch) objArr[5], (AppCompatTextView) objArr[4], (Guideline) objArr[6]);
        this.M = -1L;
        this.C.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
