package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class j0 extends i0 {
    public static final ViewDataBinding.i J0;
    public static final SparseIntArray K0;
    public final ConstraintLayout H0;
    public long I0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(59);
        J0 = iVar;
        iVar.a(0, new String[]{"view_broadcast_result_exp_rank_up"}, new int[]{7}, new int[]{nc.f.view_broadcast_result_exp_rank_up});
        int i10 = nc.f.view_result_exp_info;
        iVar.a(1, new String[]{"view_result_exp_info", "view_result_exp_info", "view_result_exp_info", "view_result_exp_info", "view_result_exp_info"}, new int[]{2, 3, 4, 5, 6}, new int[]{i10, i10, i10, i10, i10});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K0 = sparseIntArray;
        sparseIntArray.put(nc.e.broad_cast_result_title_image, 8);
        sparseIntArray.put(nc.e.U0, 9);
        sparseIntArray.put(nc.e.badge_background_view, 10);
        sparseIntArray.put(nc.e.K, 11);
        sparseIntArray.put(nc.e.badge_lottie_animation, 12);
        sparseIntArray.put(nc.e.get_live_result_exp_container, 13);
        sparseIntArray.put(nc.e.get_live_result_plus_text, 14);
        sparseIntArray.put(nc.e.get_live_result_exp_text, 15);
        sparseIntArray.put(nc.e.get_live_result_exp_unit_text, 16);
        sparseIntArray.put(nc.e.progressbar, 17);
        sparseIntArray.put(nc.e.foreground_progressbar, 18);
        sparseIntArray.put(nc.e.total_exp_container, 19);
        sparseIntArray.put(nc.e.total_exp_text, 20);
        sparseIntArray.put(nc.e.divider_text, 21);
        sparseIntArray.put(nc.e.limit_exp_text, 22);
        sparseIntArray.put(nc.e.current_exp_text_view, 23);
        sparseIntArray.put(nc.e.confirm_cash_bonus_image_view, 24);
        sparseIntArray.put(nc.e.horizontal_all_rank_view_background_view, 25);
        sparseIntArray.put(nc.e.horizontal_all_rank_scroll_view, 26);
        sparseIntArray.put(nc.e.all_rank_image_container, 27);
        sparseIntArray.put(nc.e.all_rank_image_view, 28);
        sparseIntArray.put(nc.e.point_s_background_light_flash_image_view, 29);
        sparseIntArray.put(nc.e.all_rank_point_s_image_view, 30);
        sparseIntArray.put(nc.e.point_a2_background_light_flash_image_view, 31);
        sparseIntArray.put(nc.e.all_rank_point_a2_image_view, 32);
        sparseIntArray.put(nc.e.point_a1_background_light_flash_image_view, 33);
        sparseIntArray.put(nc.e.all_rank_point_a1_image_view, 34);
        sparseIntArray.put(nc.e.point_b4_background_light_flash_image_view, 35);
        sparseIntArray.put(nc.e.all_rank_point_b4_image_view, 36);
        sparseIntArray.put(nc.e.point_b3_background_light_flash_image_view, 37);
        sparseIntArray.put(nc.e.all_rank_point_b3_image_view, 38);
        sparseIntArray.put(nc.e.point_b2_background_light_flash_image_view, 39);
        sparseIntArray.put(nc.e.all_rank_point_b2_image_view, 40);
        sparseIntArray.put(nc.e.point_b1_background_light_flash_image_view, 41);
        sparseIntArray.put(nc.e.all_rank_point_b1_image_view, 42);
        sparseIntArray.put(nc.e.point_c2_background_light_flash_image_view, 43);
        sparseIntArray.put(nc.e.all_rank_point_c2_image_view, 44);
        sparseIntArray.put(nc.e.current_rank_title_image_view, 45);
        sparseIntArray.put(nc.e.reward_help_message_text_view, 46);
        sparseIntArray.put(nc.e.reward_help_icon_image_view, 47);
        sparseIntArray.put(nc.e.horizontal_all_rank_view_foreground_start, 48);
        sparseIntArray.put(nc.e.horizontal_all_rank_view_foreground_end, 49);
        sparseIntArray.put(nc.e.season_reset_message_container, 50);
        sparseIntArray.put(nc.e.time_image, 51);
        sparseIntArray.put(nc.e.exp_message_2_text_view, 52);
        sparseIntArray.put(nc.e.exp_list_title_text, 53);
        sparseIntArray.put(nc.e.cheer_bonus_container, 54);
        sparseIntArray.put(nc.e.cheer_bonus_container_divider_view, 55);
        sparseIntArray.put(nc.e.other_container, 56);
        sparseIntArray.put(nc.e.bottom_message_container, 57);
        sparseIntArray.put(nc.e.Q5, 58);
    }

    public j0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 59, J0, K0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return false;
                            }
                            return X((k3) obj, i11);
                        }
                        return Y((k3) obj, i11);
                    }
                    return a0((k3) obj, i11);
                }
                return W((k3) obj, i11);
            }
            return V((k3) obj, i11);
        }
        return Z((k2) obj, i11);
    }

    public final boolean V(k3 k3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I0 |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean W(k3 k3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I0 |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean X(k3 k3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I0 |= 32;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(k3 k3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I0 |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(k2 k2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I0 |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean a0(k3 k3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.I0 |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I0 = 0L;
        }
        ViewDataBinding.n(this.f46461n0);
        ViewDataBinding.n(this.G0);
        ViewDataBinding.n(this.f46449b0);
        ViewDataBinding.n(this.T);
        ViewDataBinding.n(this.f46455h0);
        ViewDataBinding.n(this.f46472y0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.I0 != 0) {
                return true;
            }
            return this.f46461n0.w() || this.G0.w() || this.f46449b0.w() || this.T.w() || this.f46455h0.w() || this.f46472y0.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I0 = 64L;
        }
        this.f46461n0.y();
        this.G0.y();
        this.f46449b0.y();
        this.T.y();
        this.f46455h0.y();
        this.f46472y0.y();
        H();
    }

    public j0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 6, (ConstraintLayout) objArr[27], (AppCompatImageView) objArr[28], (AppCompatImageView) objArr[34], (AppCompatImageView) objArr[32], (AppCompatImageView) objArr[42], (AppCompatImageView) objArr[40], (AppCompatImageView) objArr[38], (AppCompatImageView) objArr[36], (AppCompatImageView) objArr[44], (AppCompatImageView) objArr[30], (View) objArr[10], (AppCompatImageView) objArr[11], (LottieAnimationView) objArr[12], (LinearLayoutCompat) objArr[57], (AppCompatImageView) objArr[8], (ComposeView) objArr[54], (View) objArr[55], (AppCompatImageView) objArr[9], (k3) objArr[5], (ImageView) objArr[24], (AppCompatTextView) objArr[23], (AppCompatImageView) objArr[45], (AppCompatTextView) objArr[21], (LinearLayoutCompat) objArr[1], (AppCompatTextView) objArr[53], (AppCompatTextView) objArr[52], (k3) objArr[4], (ProgressBar) objArr[18], (ConstraintLayout) objArr[13], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[14], (k3) objArr[6], (HorizontalScrollView) objArr[26], (View) objArr[25], (View) objArr[49], (View) objArr[48], (AppCompatTextView) objArr[22], (k3) objArr[2], (ComposeView) objArr[56], (AppCompatImageView) objArr[33], (AppCompatImageView) objArr[31], (AppCompatImageView) objArr[41], (AppCompatImageView) objArr[39], (AppCompatImageView) objArr[37], (AppCompatImageView) objArr[35], (AppCompatImageView) objArr[43], (AppCompatImageView) objArr[29], (ProgressBar) objArr[17], (k2) objArr[7], (AppCompatImageView) objArr[47], (AppCompatTextView) objArr[46], (LinearLayoutCompat) objArr[50], (StatusView) objArr[58], (AppCompatImageView) objArr[51], (LinearLayoutCompat) objArr[19], (AppCompatTextView) objArr[20], (k3) objArr[3]);
        this.I0 = -1L;
        L(this.T);
        this.Y.setTag(null);
        L(this.f46449b0);
        L(this.f46455h0);
        L(this.f46461n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H0 = constraintLayout;
        constraintLayout.setTag(null);
        L(this.f46472y0);
        L(this.G0);
        N(view);
        y();
    }
}
