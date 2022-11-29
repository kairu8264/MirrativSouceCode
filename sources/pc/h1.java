package pc;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionView;

/* loaded from: classes2.dex */
public class h1 extends g1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final ViewDataBinding.i f46443i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public static final SparseIntArray f46444j0;

    /* renamed from: f0  reason: collision with root package name */
    public final ConstraintLayout f46445f0;

    /* renamed from: g0  reason: collision with root package name */
    public final AppCompatImageView f46446g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f46447h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46444j0 = sparseIntArray;
        sparseIntArray.put(nc.e.T6, 24);
        sparseIntArray.put(nc.e.W6, 25);
        sparseIntArray.put(nc.e.U2, 26);
        sparseIntArray.put(nc.e.H, 27);
        sparseIntArray.put(nc.e.U0, 28);
        sparseIntArray.put(nc.e.yell_condition_container, 29);
        sparseIntArray.put(nc.e.f41824h0, 30);
    }

    public h1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 31, f46443i0, f46444j0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return X((androidx.lifecycle.e0) obj, i11);
            case 3:
                return v0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return p0((androidx.lifecycle.e0) obj, i11);
            case 12:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 15:
                return W((androidx.lifecycle.e0) obj, i11);
            case 16:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 17:
                return V((androidx.lifecycle.e0) obj, i11);
            case 18:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 19:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 20:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 21:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 22:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 23:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 24:
                return U((androidx.lifecycle.e0) obj, i11);
            case 25:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 26:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 27:
                return o0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // pc.g1
    public void T(md.d1 d1Var) {
        this.f46416e0 = d1Var;
        synchronized (this) {
            this.f46447h0 |= 268435456;
        }
        c(nc.a.f41788b);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 67108864;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 128;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.h1.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 134217728;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<Long> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean v0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.f46447h0 |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f46447h0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46447h0 = 536870912L;
        }
        H();
    }

    public h1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 28, (RecyclerView) objArr[23], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (View) objArr[27], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[20], (ConstraintLayout) objArr[17], (Space) objArr[30], (AppCompatImageView) objArr[28], (AppCompatImageView) objArr[12], (FollowView) objArr[16], (Space) objArr[15], (FollowTextView) objArr[4], (FollowTextView) objArr[3], (Guideline) objArr[26], (MutualFolloweeView) objArr[18], (AppCompatImageView) objArr[14], (View) objArr[10], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[21], (AppCompatImageView) objArr[13], (RecyclerView) objArr[22], (AppCompatImageView) objArr[8], (FollowsYouView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7], (Guideline) objArr[24], (Guideline) objArr[25], (UserProfileYellStatusConditionView) objArr[29]);
        this.f46447h0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f46445f0 = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[11];
        this.f46446g0 = appCompatImageView;
        appCompatImageView.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.f46412a0.setTag(null);
        N(view);
        y();
    }
}
