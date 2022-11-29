package ac;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public class n extends m {
    public static final ViewDataBinding.i C0 = null;
    public static final SparseIntArray D0;
    public long B0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(xb.o.setting_content_scroll_view, 14);
        sparseIntArray.put(xb.o.setting_content_container, 15);
        sparseIntArray.put(xb.o.head_space_view, 16);
        sparseIntArray.put(xb.o.A9, 17);
        sparseIntArray.put(xb.o.f60057z, 18);
        sparseIntArray.put(xb.o.campaign_anchor_space, 19);
        sparseIntArray.put(xb.o.separator_view, 20);
        sparseIntArray.put(xb.o.place_holder_image_view, 21);
        sparseIntArray.put(xb.o.place_holder_text_view, 22);
        sparseIntArray.put(xb.o.thumbnail_frame_recycler_view, 23);
        sparseIntArray.put(xb.o.focus_event_container, 24);
        sparseIntArray.put(xb.o.focus_event_text_view, 25);
        sparseIntArray.put(xb.o.focus_event_help_image_view, 26);
        sparseIntArray.put(xb.o.focus_events_recycler_view, 27);
        sparseIntArray.put(xb.o.focus_event_title_text_view, 28);
        sparseIntArray.put(xb.o.focus_event_period_text_view, 29);
        sparseIntArray.put(xb.o.G0, 30);
        sparseIntArray.put(xb.o.app_campaign_container, 31);
        sparseIntArray.put(xb.o.app_campaign_card_view, 32);
        sparseIntArray.put(xb.o.app_campaign_image_view, 33);
        sparseIntArray.put(xb.o.app_campaign_check_text_view, 34);
        sparseIntArray.put(xb.o.app_campaign_check_image_view, 35);
        sparseIntArray.put(xb.o.app_campaign_close_image_view, 36);
        sparseIntArray.put(xb.o.recommend_app_setting_card_view, 37);
        sparseIntArray.put(xb.o.header_bg_image_view, 38);
        sparseIntArray.put(xb.o.bottom_middle_bg_image_view, 39);
        sparseIntArray.put(xb.o.bottom_bg_image_view, 40);
        sparseIntArray.put(xb.o.option_image_view, 41);
        sparseIntArray.put(xb.o.detail_setting_image_view, 42);
        sparseIntArray.put(xb.o.f60024q1, 43);
        sparseIntArray.put(xb.o.recommend_notification_guard_container, 44);
        sparseIntArray.put(xb.o.notification_guard_card_view, 45);
        sparseIntArray.put(xb.o.notification_guard_text, 46);
        sparseIntArray.put(xb.o.live_start_lottie_animation_view, 47);
        sparseIntArray.put(xb.o.omotenashi_live_start_lottie_animation_view, 48);
        sparseIntArray.put(xb.o.auto_tweet_container, 49);
        sparseIntArray.put(xb.o.auto_tweet_clickable_view, 50);
    }

    public n(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 51, C0, D0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return Y((androidx.lifecycle.e0) obj, i11);
            case 1:
                return f0((LiveData) obj, i11);
            case 2:
                return c0((androidx.lifecycle.e0) obj, i11);
            case 3:
                return e0((androidx.lifecycle.e0) obj, i11);
            case 4:
                return a0((androidx.lifecycle.e0) obj, i11);
            case 5:
                return d0((androidx.lifecycle.e0) obj, i11);
            case 6:
                return X((LiveData) obj, i11);
            case 7:
                return g0((LiveData) obj, i11);
            case 8:
                return h0((LiveData) obj, i11);
            case 9:
                return W((androidx.lifecycle.e0) obj, i11);
            case 10:
                return b0((androidx.lifecycle.e0) obj, i11);
            case 11:
                return Z((LiveData) obj, i11);
            default:
                return false;
        }
    }

    @Override // ac.m
    public void V(lc.n nVar) {
        this.A0 = nVar;
        synchronized (this) {
            this.B0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        c(xb.b.f59841d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 512;
            }
            return true;
        }
        return false;
    }

    public final boolean X(LiveData<Boolean> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 64;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(LiveData<Boolean> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean b0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            return true;
        }
        return false;
    }

    public final boolean c0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean d0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean e0(androidx.lifecycle.e0<String> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean f0(LiveData<String> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean g0(LiveData<Integer> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 128;
            }
            return true;
        }
        return false;
    }

    public final boolean h0(LiveData<Integer> liveData, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.B0 |= 256;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v1, types: [java.lang.String] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.n.l():void");
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
            this.B0 = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        H();
    }

    public n(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 12, (MaterialCardView) objArr[32], (AppCompatImageView) objArr[35], (AppCompatTextView) objArr[34], (AppCompatImageView) objArr[36], (FrameLayout) objArr[31], (AppCompatImageView) objArr[33], (AppCompatImageView) objArr[18], (View) objArr[50], (ConstraintLayout) objArr[49], (SwitchCompat) objArr[13], (AppCompatImageView) objArr[6], (View) objArr[40], (View) objArr[39], (Space) objArr[30], (Space) objArr[19], (AppCompatImageView) objArr[43], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[42], (ConstraintLayout) objArr[24], (AppCompatImageView) objArr[26], (AppCompatTextView) objArr[29], (AppCompatTextView) objArr[25], (AppCompatTextView) objArr[28], (RecyclerView) objArr[27], (Space) objArr[16], (View) objArr[38], (AppCompatImageView) objArr[7], (LottieAnimationView) objArr[47], (MaterialCardView) objArr[45], (AppCompatTextView) objArr[46], (LottieAnimationView) objArr[48], (AppCompatImageView) objArr[41], (AppCompatImageView) objArr[21], (AppCompatTextView) objArr[22], (MaterialCardView) objArr[37], (FrameLayout) objArr[10], (FrameLayout) objArr[44], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[8], (View) objArr[20], (ConstraintLayout) objArr[15], (NestedScrollView) objArr[14], (ConstraintLayout) objArr[4], (RecyclerView) objArr[23], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[17], (EditTextWithOnKeyPreImeListener) objArr[2], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[12]);
        this.B0 = -1L;
        this.K.setTag(null);
        this.L.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.f914c0.setTag(null);
        this.f923l0.setTag(null);
        this.f925n0.setTag(null);
        this.f926o0.setTag(null);
        this.f930s0.setTag(null);
        this.f932u0.setTag(null);
        this.f934w0.setTag(null);
        this.f935x0.setTag(null);
        this.f936y0.setTag(null);
        this.f937z0.setTag(null);
        N(view);
        y();
    }
}
