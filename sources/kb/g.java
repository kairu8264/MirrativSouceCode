package kb;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import hb.w1;

/* loaded from: classes2.dex */
public class g extends f {

    /* renamed from: c0  reason: collision with root package name */
    public static final ViewDataBinding.i f38535c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    public static final SparseIntArray f38536d0;

    /* renamed from: b0  reason: collision with root package name */
    public long f38537b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38536d0 = sparseIntArray;
        sparseIntArray.put(w1.J3, 13);
        sparseIntArray.put(w1.K3, 14);
        sparseIntArray.put(w1.f35031z1, 15);
        sparseIntArray.put(w1.A1, 16);
        sparseIntArray.put(w1.scroll_content_container, 17);
        sparseIntArray.put(w1.G, 18);
        sparseIntArray.put(w1.V2, 19);
        sparseIntArray.put(w1.border_view_top_space, 20);
        sparseIntArray.put(w1.f35021r, 21);
        sparseIntArray.put(w1.W2, 22);
        sparseIntArray.put(w1.f35013l3, 23);
        sparseIntArray.put(w1.f35015m3, 24);
    }

    public g(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f38535c0, f38536d0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 1:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 4:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return U((androidx.lifecycle.e0) obj, i11);
            case 7:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return V((androidx.lifecycle.e0) obj, i11);
            case 9:
                return X((androidx.lifecycle.e0) obj, i11);
            case 10:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return W((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // kb.f
    public void T(qb.r rVar) {
        this.f38534a0 = rVar;
        synchronized (this) {
            this.f38537b0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        c(hb.a.f34700b);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.f38537b0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.g.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f38537b0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f38537b0 = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        H();
    }

    public g(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 12, (AppCompatTextView) objArr[11], (View) objArr[21], (Space) objArr[20], (ComposeView) objArr[18], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (FollowView) objArr[3], (FollowTextView) objArr[10], (FollowTextView) objArr[9], (Guideline) objArr[15], (Guideline) objArr[16], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[1], (AppCompatButton) objArr[19], (RecyclerView) objArr[22], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[12], (AppCompatImageView) objArr[23], (AppCompatTextView) objArr[24], (AppCompatImageView) objArr[6], (FollowsYouView) objArr[8], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[5], (Guideline) objArr[13], (Guideline) objArr[14]);
        this.f38537b0 = -1L;
        this.B.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.R.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        N(view);
        y();
    }
}
