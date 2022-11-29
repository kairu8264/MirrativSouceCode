package ac;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class r extends q {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout O;
    public final View P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.T1, 6);
        sparseIntArray.put(xb.o.G9, 7);
        sparseIntArray.put(xb.o.f60024q1, 8);
        sparseIntArray.put(xb.o.title_divider, 9);
        sparseIntArray.put(xb.o.switch_label_text_view, 10);
        sparseIntArray.put(xb.o.switch_divider, 11);
        sparseIntArray.put(xb.o.max_participants_label_text_view, 12);
        sparseIntArray.put(xb.o.W4, 13);
    }

    public r(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return V((androidx.lifecycle.e0) obj, i11);
            case 2:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return W((androidx.lifecycle.e0) obj, i11);
            case 5:
                return X((androidx.lifecycle.e0) obj, i11);
            case 6:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return U((androidx.lifecycle.e0) obj, i11);
            case 9:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 12:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 13:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 15:
                return j0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ac.q
    public void T(kc.a aVar) {
        this.N = aVar;
        synchronized (this) {
            this.Q |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        c(xb.b.f59841d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.Q |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.r.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        H();
    }

    public r(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 16, (AppCompatImageView) objArr[8], (SwitchCompat) objArr[1], (ConstraintLayout) objArr[6], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[12], (RoundedButtonView) objArr[2], (View) objArr[11], (AppCompatTextView) objArr[10], (RoundedButtonView) objArr[4], (View) objArr[9], (AppCompatTextView) objArr[7], (RoundedButtonView) objArr[3]);
        this.Q = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[5];
        this.P = view2;
        view2.setTag(null);
        this.G.setTag(null);
        this.J.setTag(null);
        this.M.setTag(null);
        N(view);
        y();
    }
}
