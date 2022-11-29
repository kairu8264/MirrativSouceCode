package s9;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public class n extends m {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(q9.g.J, 11);
        sparseIntArray.put(q9.g.T3, 12);
        sparseIntArray.put(q9.g.C2, 13);
        sparseIntArray.put(q9.g.reward_profile_result_rank_image_view, 14);
        sparseIntArray.put(q9.g.B2, 15);
        sparseIntArray.put(q9.g.reward_profile_info_container, 16);
        sparseIntArray.put(q9.g.Q2, 17);
        sparseIntArray.put(q9.g.crown_image_view, 18);
        sparseIntArray.put(q9.g.M3, 19);
    }

    public n(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 20, X, Y));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return W((androidx.lifecycle.e0) obj, i11);
            case 3:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 7:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return X((androidx.lifecycle.e0) obj, i11);
            case 9:
                return Z((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // s9.m
    public void V(ud.c0 c0Var) {
        this.V = c0Var;
        synchronized (this) {
            this.W |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        c(q9.a.f48787b);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.W |= 128;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.n.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.W != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.W = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        H();
    }

    public n(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 10, (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[18], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[15], (ConstraintLayout) objArr[13], (RecyclerView) objArr[17], (ConstraintLayout) objArr[2], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[16], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[14], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[0], (StatusView) objArr[19], (AppCompatTextView) objArr[12]);
        this.W = -1L;
        this.D.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        N(view);
        y();
    }
}
