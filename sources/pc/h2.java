package pc;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrorman.customview.AnniversaryFollowBalloonView;
import com.dena.mirrorman.customview.AnniversaryStreamBalloonView;
import com.dena.mirrorman.customview.BeginnerStreamHolidayBalloonView;
import com.dena.mirrorman.customview.BirthdayBalloonView;
import com.dena.mirrorman.customview.CheckMonthlyRankingBalloonView;
import com.dena.mirrorman.customview.ContinuousStreamBalloonView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.MyPageContinuousLivePromotionView;
import com.dena.mirrorman.customview.RibbonRemainingLabelView;
import com.dena.mirrorman.customview.StreamHolidayBalloonView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public class h2 extends g2 {
    public static final ViewDataBinding.i N0 = null;
    public static final SparseIntArray O0;
    public final ConstraintLayout K0;
    public final AppCompatTextView L0;
    public long M0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O0 = sparseIntArray;
        sparseIntArray.put(nc.e.f41838r, 39);
        sparseIntArray.put(nc.e.X0, 40);
        sparseIntArray.put(nc.e.C4, 41);
        sparseIntArray.put(nc.e.f41854z, 42);
        sparseIntArray.put(nc.e.season_rating_rank_container_margin, 43);
        sparseIntArray.put(nc.e.season_rating_view, 44);
        sparseIntArray.put(nc.e.app_bar_layout_inner_container, 45);
        sparseIntArray.put(nc.e.T6, 46);
        sparseIntArray.put(nc.e.W6, 47);
        sparseIntArray.put(nc.e.f41832k5, 48);
        sparseIntArray.put(nc.e.ribbon_remaining_label_view_container, 49);
        sparseIntArray.put(nc.e.ribbon_remaining_label_view, 50);
        sparseIntArray.put(nc.e.f41845u, 51);
        sparseIntArray.put(nc.e.horizontal_border_view1, 52);
        sparseIntArray.put(nc.e.W0, 53);
        sparseIntArray.put(nc.e.event_background_view, 54);
        sparseIntArray.put(nc.e.A6, 55);
        sparseIntArray.put(nc.e.f41830j6, 56);
        sparseIntArray.put(nc.e.X6, 57);
        sparseIntArray.put(nc.e.floating_action_button, 58);
        sparseIntArray.put(nc.e.check_monthly_ranking_balloon_view, 59);
        sparseIntArray.put(nc.e.f41831k2, 60);
        sparseIntArray.put(nc.e.tutorial_description, 61);
    }

    public h2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 62, N0, O0));
    }

    public final boolean A0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean B0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean C0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 4294967296L;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return t0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return X((androidx.lifecycle.e0) obj, i11);
            case 3:
                return A0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return r0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return o0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return B0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return w0((androidx.lifecycle.e0) obj, i11);
            case 9:
                return x0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return l0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 12:
                return m0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return v0((androidx.lifecycle.e0) obj, i11);
            case 14:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 15:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 16:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 17:
                return k0((androidx.lifecycle.e0) obj, i11);
            case 18:
                return u0((androidx.lifecycle.e0) obj, i11);
            case 19:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 20:
                return z0((androidx.lifecycle.e0) obj, i11);
            case 21:
                return D0((androidx.lifecycle.e0) obj, i11);
            case 22:
                return y0((androidx.lifecycle.e0) obj, i11);
            case 23:
                return p0((androidx.lifecycle.e0) obj, i11);
            case 24:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 25:
                return s0((androidx.lifecycle.e0) obj, i11);
            case 26:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 27:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 28:
                return q0((androidx.lifecycle.e0) obj, i11);
            case 29:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 30:
                return n0((androidx.lifecycle.e0) obj, i11);
            case 31:
                return W((androidx.lifecycle.e0) obj, i11);
            case 32:
                return C0((androidx.lifecycle.e0) obj, i11);
            case 33:
                return c0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    public final boolean D0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            return true;
        }
        return false;
    }

    @Override // pc.g2
    public void V(ud.l2 l2Var) {
        this.J0 = l2Var;
        synchronized (this) {
            this.M0 |= 17179869184L;
        }
        c(nc.a.f41788b);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<Bitmap> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 2147483648L;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 8589934592L;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 536870912;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 67108864;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 134217728;
            }
            return true;
        }
        return false;
    }

    public final boolean k0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0191  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 2334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.h2.l():void");
    }

    public final boolean l0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean m0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    public final boolean n0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 1073741824;
            }
            return true;
        }
        return false;
    }

    public final boolean o0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean p0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    public final boolean q0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 268435456;
            }
            return true;
        }
        return false;
    }

    public final boolean r0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean s0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    public final boolean t0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean u0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            return true;
        }
        return false;
    }

    public final boolean v0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M0 != 0;
        }
    }

    public final boolean w0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean x0(androidx.lifecycle.e0<Long> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 512;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M0 = 34359738368L;
        }
        H();
    }

    public final boolean y0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    public final boolean z0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return true;
        }
        return false;
    }

    public h2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 34, (AnniversaryFollowBalloonView) objArr[15], (AnniversaryStreamBalloonView) objArr[25], (AppBarLayout) objArr[39], (ConstraintLayout) objArr[45], (RecyclerView) objArr[51], (FrameLayout) objArr[42], (AppCompatImageView) objArr[2], (View) objArr[5], (AppCompatTextView) objArr[4], (Space) objArr[3], (AppCompatImageView) objArr[1], (BeginnerStreamHolidayBalloonView) objArr[35], (AppCompatTextView) objArr[16], (Space) objArr[17], (BirthdayBalloonView) objArr[26], (AppCompatTextView) objArr[22], (CheckMonthlyRankingBalloonView) objArr[59], (ConstraintLayout) objArr[30], (AppCompatImageView) objArr[53], (CollapsingToolbarLayout) objArr[40], (AppCompatImageView) objArr[9], (ContinuousStreamBalloonView) objArr[24], (AppCompatTextView) objArr[14], (LinearLayout) objArr[38], (View) objArr[54], (RecyclerView) objArr[33], (FloatingActionButton) objArr[58], (FollowTextView) objArr[7], (FollowTextView) objArr[6], (FrameLayout) objArr[60], (View) objArr[52], (View) objArr[32], (View) objArr[34], (ConstraintLayout) objArr[18], (Space) objArr[21], (AppCompatTextView) objArr[19], (MyPageContinuousLivePromotionView) objArr[29], (ConstraintLayout) objArr[41], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[48], (AppCompatTextView) objArr[23], (AppCompatImageView) objArr[10], (RecyclerView) objArr[28], (RibbonRemainingLabelView) objArr[50], (FrameLayout) objArr[49], (Space) objArr[43], (MirraClassSeasonRatingCardView) objArr[44], (StreamHolidayBalloonView) objArr[27], (TabLayout) objArr[56], (Toolbar) objArr[55], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[61], (AppCompatImageView) objArr[13], (AppCompatTextView) objArr[37], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[36], (AppCompatTextView) objArr[11], (Guideline) objArr[46], (Guideline) objArr[47], (ViewPager) objArr[57]);
        this.M0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.S.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.f46417a0.setTag(null);
        this.f46419c0.setTag(null);
        this.f46420d0.setTag(null);
        this.f46423g0.setTag(null);
        this.f46424h0.setTag(null);
        this.f46425i0.setTag(null);
        this.f46426j0.setTag(null);
        this.f46427k0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K0 = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[31];
        this.L0 = appCompatTextView;
        appCompatTextView.setTag(null);
        this.f46428l0.setTag(null);
        this.f46430n0.setTag(null);
        this.f46432p0.setTag(null);
        this.f46433q0.setTag(null);
        this.f46434r0.setTag(null);
        this.f46439w0.setTag(null);
        this.f46442z0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        N(view);
        y();
    }
}
