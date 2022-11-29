package ae;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class r4 extends q4 {

    /* renamed from: j0  reason: collision with root package name */
    public static final ViewDataBinding.i f1482j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public static final SparseIntArray f1483k0;

    /* renamed from: g0  reason: collision with root package name */
    public final ConstraintLayout f1484g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AppCompatImageView f1485h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f1486i0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1483k0 = sparseIntArray;
        sparseIntArray.put(nd.z0.C3, 23);
        sparseIntArray.put(nd.z0.Ka, 24);
        sparseIntArray.put(nd.z0.f42304jg, 25);
        sparseIntArray.put(nd.z0.f42309kg, 26);
        sparseIntArray.put(nd.z0.D6, 27);
        sparseIntArray.put(nd.z0.L, 28);
        sparseIntArray.put(nd.z0.f42349u0, 29);
        sparseIntArray.put(nd.z0.matching_description_text_view, 30);
        sparseIntArray.put(nd.z0.ok_button_view, 31);
    }

    public r4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 32, f1482j0, f1483k0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 3:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 12:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 13:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return X((androidx.lifecycle.e0) obj, i11);
            case 15:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 16:
                return o0((LiveData) obj, i11);
            case 17:
                return v0((androidx.lifecycle.e0) obj, i11);
            case 18:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 19:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 20:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 21:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 22:
                return W((androidx.lifecycle.e0) obj, i11);
            case 23:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 24:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 25:
                return p0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // ae.q4
    public void V(ud.q3 q3Var) {
        this.f1470f0 = q3Var;
        synchronized (this) {
            this.f1486i0 |= 67108864;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 16;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ce  */
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
            Method dump skipped, instructions count: 1512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.r4.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(LiveData<String> liveData, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<Long> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    public final boolean v0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.f1486i0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1486i0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1486i0 = 134217728L;
        }
        H();
    }

    public r4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 26, (RecyclerView) objArr[21], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (View) objArr[28], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[18], (Space) objArr[29], (AppCompatImageView) objArr[12], (ConstraintLayout) objArr[23], (FollowView) objArr[15], (Space) objArr[14], (FollowTextView) objArr[4], (FollowTextView) objArr[3], (Guideline) objArr[27], (AppCompatTextView) objArr[30], (AppCompatTextView) objArr[22], (MutualFolloweeView) objArr[16], (RoundedButtonView) objArr[31], (ConstraintLayout) objArr[24], (View) objArr[10], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[19], (AppCompatImageView) objArr[13], (RecyclerView) objArr[20], (AppCompatImageView) objArr[8], (FollowsYouView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7], (Guideline) objArr[25], (Guideline) objArr[26]);
        this.f1486i0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.Q.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f1484g0 = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[11];
        this.f1485h0 = appCompatImageView;
        appCompatImageView.setTag(null);
        this.R.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.f1465a0.setTag(null);
        this.f1466b0.setTag(null);
        this.f1467c0.setTag(null);
        N(view);
        y();
    }
}
