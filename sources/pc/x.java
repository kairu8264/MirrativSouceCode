package pc;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrorman.customview.AnniversaryStreamBalloonView;
import com.dena.mirrorman.customview.BirthdayBalloonView;
import com.dena.mirrorman.customview.ContinuousStreamBalloonView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.LiveRequestClapView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.UserProfileAnniversaryFollowBalloonView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public class x extends w {
    public static final ViewDataBinding.i C0 = null;
    public static final SparseIntArray D0;
    public long B0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(nc.e.f41835o1, 29);
        sparseIntArray.put(nc.e.f41838r, 30);
        sparseIntArray.put(nc.e.X0, 31);
        sparseIntArray.put(nc.e.vertical_guideline_begin_top, 32);
        sparseIntArray.put(nc.e.f41854z, 33);
        sparseIntArray.put(nc.e.shadow_effect_view, 34);
        sparseIntArray.put(nc.e.F0, 35);
        sparseIntArray.put(nc.e.f41827i2, 36);
        sparseIntArray.put(nc.e.season_rating_view, 37);
        sparseIntArray.put(nc.e.f41826i1, 38);
        sparseIntArray.put(nc.e.vertical_guideline_begin_body, 39);
        sparseIntArray.put(nc.e.W6, 40);
        sparseIntArray.put(nc.e.f41832k5, 41);
        sparseIntArray.put(nc.e.A6, 42);
        sparseIntArray.put(nc.e.block_in_toolbar_container, 43);
        sparseIntArray.put(nc.e.f41830j6, 44);
        sparseIntArray.put(nc.e.X6, 45);
        sparseIntArray.put(nc.e.live_request_container, 46);
        sparseIntArray.put(nc.e.f41850w3, 47);
        sparseIntArray.put(nc.e.f41847v3, 48);
        sparseIntArray.put(nc.e.f41843t3, 49);
        sparseIntArray.put(nc.e.full_screen_container, 50);
    }

    public x(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 51, C0, D0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return U((androidx.lifecycle.e0) obj, i11);
            case 4:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 7:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return p0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return W((androidx.lifecycle.e0) obj, i11);
            case 12:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return o0((androidx.lifecycle.e0) obj, i11);
            case 15:
                return X((androidx.lifecycle.e0) obj, i11);
            case 16:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 17:
                return v0((androidx.lifecycle.e0) obj, i11);
            case 18:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 19:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 20:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 21:
                return V((androidx.lifecycle.e0) obj, i11);
            case 22:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 23:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 24:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 25:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 26:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 27:
                return b0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // pc.w
    public void T(md.i0 i0Var) {
        this.A0 = i0Var;
        synchronized (this) {
            this.B0 |= 268435456;
        }
        c(nc.a.f41788b);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 134217728;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 1767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.x.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<Bitmap> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<Long> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= 67108864;
            }
            return true;
        }
        return false;
    }

    public final boolean v0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.B0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.B0 = 536870912L;
        }
        H();
    }

    public x(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 28, (AnniversaryStreamBalloonView) objArr[21], (AppBarLayout) objArr[30], (RecyclerView) objArr[24], (FrameLayout) objArr[33], (AppCompatTextView) objArr[11], (Space) objArr[12], (BirthdayBalloonView) objArr[22], (AppCompatTextView) objArr[16], (ConstraintLayout) objArr[19], (ConstraintLayout) objArr[43], (ComposeView) objArr[35], (CollapsingToolbarLayout) objArr[31], (FrameLayout) objArr[0], (ConstraintLayout) objArr[38], (AppCompatImageView) objArr[9], (ContinuousStreamBalloonView) objArr[20], (CoordinatorLayout) objArr[29], (FollowView) objArr[28], (FollowView) objArr[18], (Space) objArr[36], (FollowTextView) objArr[2], (FollowTextView) objArr[1], (FrameLayout) objArr[50], (ConstraintLayout) objArr[13], (AppCompatTextView) objArr[14], (LiveRequestClapView) objArr[49], (ConstraintLayout) objArr[46], (Space) objArr[48], (LiveRequestCountView) objArr[47], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[41], (AppCompatTextView) objArr[17], (AppCompatImageView) objArr[5], (RecyclerView) objArr[23], (MirraClassSeasonRatingCardView) objArr[37], (View) objArr[34], (TabLayout) objArr[44], (Toolbar) objArr[42], (AppCompatTextView) objArr[15], (AppCompatImageView) objArr[7], (FollowsYouView) objArr[27], (FollowsYouView) objArr[4], (AppCompatTextView) objArr[26], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[25], (AppCompatTextView) objArr[6], (UserProfileAnniversaryFollowBalloonView) objArr[10], (Guideline) objArr[39], (Guideline) objArr[32], (Guideline) objArr[40], (ViewPager) objArr[45]);
        this.B0 = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.N.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.f46519e0.setTag(null);
        this.f46521g0.setTag(null);
        this.f46522h0.setTag(null);
        this.f46523i0.setTag(null);
        this.f46528n0.setTag(null);
        this.f46529o0.setTag(null);
        this.f46530p0.setTag(null);
        this.f46531q0.setTag(null);
        this.f46532r0.setTag(null);
        this.f46533s0.setTag(null);
        this.f46534t0.setTag(null);
        this.f46535u0.setTag(null);
        this.f46536v0.setTag(null);
        N(view);
        y();
    }
}
