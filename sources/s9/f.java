package s9;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.feature.event.LandingPageDescriptionListView;
import com.dena.mirrorman.feature.event.LandingPageRankingView;
import com.dena.mirrorman.feature.event.LandingPageTitleView;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: q0  reason: collision with root package name */
    public static final ViewDataBinding.i f52447q0 = null;

    /* renamed from: r0  reason: collision with root package name */
    public static final SparseIntArray f52448r0;

    /* renamed from: k0  reason: collision with root package name */
    public final ConstraintLayout f52449k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ScrollView f52450l0;

    /* renamed from: m0  reason: collision with root package name */
    public final View f52451m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ConstraintLayout f52452n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AppCompatTextView f52453o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f52454p0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f52448r0 = sparseIntArray;
        sparseIntArray.put(q9.g.event_title_container, 17);
        sparseIntArray.put(q9.g.X2, 18);
        sparseIntArray.put(q9.g.reward_profile_result_container, 19);
        sparseIntArray.put(q9.g.reward_profile_result_rank_image_view, 20);
        sparseIntArray.put(q9.g.reward_profile_container, 21);
        sparseIntArray.put(q9.g.reward_profile_info_container, 22);
        sparseIntArray.put(q9.g.score_reward_header_container, 23);
        sparseIntArray.put(q9.g.score_reward_header_image_view, 24);
        sparseIntArray.put(q9.g.score_reward_header_text_view, 25);
        sparseIntArray.put(q9.g.score_reward_list_container, 26);
        sparseIntArray.put(q9.g.score_reward_list_recycler_view, 27);
        sparseIntArray.put(q9.g.reward_list_separator_view, 28);
        sparseIntArray.put(q9.g.rank_reward_header_container, 29);
        sparseIntArray.put(q9.g.rank_reward_header_image_view, 30);
        sparseIntArray.put(q9.g.rank_reward_header_text_view, 31);
        sparseIntArray.put(q9.g.rank_reward_list_container, 32);
        sparseIntArray.put(q9.g.rank_reward_list_recycler_view, 33);
        sparseIntArray.put(q9.g.event_ranking_container, 34);
        sparseIntArray.put(q9.g.event_description_container, 35);
        sparseIntArray.put(q9.g.event_footer_anchor_view, 36);
        sparseIntArray.put(q9.g.event_footer_play_view, 37);
        sparseIntArray.put(q9.g.close_button_container, 38);
    }

    public f(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 39, f52447q0, f52448r0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 1:
                return g0((androidx.lifecycle.e0) obj, i11);
            case 2:
                return U((androidx.lifecycle.e0) obj, i11);
            case 3:
                return X((androidx.lifecycle.e0) obj, i11);
            case 4:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return h0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return f0((androidx.lifecycle.e0) obj, i11);
            case 7:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 8:
                return Z((androidx.lifecycle.e0) obj, i11);
            case 9:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 10:
                return i0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return V((androidx.lifecycle.e0) obj, i11);
            case 12:
                return j0((androidx.lifecycle.e0) obj, i11);
            case 13:
                return W((androidx.lifecycle.e0) obj, i11);
            case 14:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 15:
                return b0((androidx.lifecycle.e0) obj, i11);
            default:
                return false;
        }
    }

    @Override // s9.e
    public void T(ud.b0 b0Var) {
        this.f52446j0 = b0Var;
        synchronized (this) {
            this.f52454p0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        c(q9.a.f48787b);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean V(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean W(androidx.lifecycle.e0<Drawable> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            return true;
        }
        return false;
    }

    public final boolean X(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= PlaybackStateCompat.ACTION_PREPARE;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 256;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean i0(androidx.lifecycle.e0<SpannableString> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean j0(androidx.lifecycle.e0<Integer> e0Var, int i10) {
        if (i10 == q9.a.f48786a) {
            synchronized (this) {
                this.f52454p0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.f.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f52454p0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f52454p0 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        H();
    }

    public f(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 16, (ConstraintLayout) objArr[38], (LandingPageDescriptionListView) objArr[35], (View) objArr[36], (AppCompatImageView) objArr[16], (View) objArr[37], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[3], (LandingPageRankingView) objArr[34], (LandingPageTitleView) objArr[17], (ConstraintLayout) objArr[29], (AppCompatImageView) objArr[30], (AppCompatTextView) objArr[31], (ConstraintLayout) objArr[32], (RecyclerView) objArr[33], (ConstraintLayout) objArr[18], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[28], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (ConstraintLayout) objArr[21], (AppCompatImageView) objArr[9], (ConstraintLayout) objArr[22], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[19], (ConstraintLayout) objArr[6], (AppCompatImageView) objArr[20], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[23], (AppCompatImageView) objArr[24], (AppCompatTextView) objArr[25], (ConstraintLayout) objArr[26], (RecyclerView) objArr[27]);
        this.f52454p0 = -1L;
        this.E.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f52449k0 = constraintLayout;
        constraintLayout.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[1];
        this.f52450l0 = scrollView;
        scrollView.setTag(null);
        View view2 = (View) objArr[14];
        this.f52451m0 = view2;
        view2.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[15];
        this.f52452n0 = constraintLayout2;
        constraintLayout2.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[8];
        this.f52453o0 = appCompatTextView;
        appCompatTextView.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.T.setTag(null);
        this.U.setTag(null);
        this.W.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.f52438b0.setTag(null);
        this.f52440d0.setTag(null);
        N(view);
        y();
    }
}
