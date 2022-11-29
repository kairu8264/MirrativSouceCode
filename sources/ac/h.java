package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.streaming.emomo.GiftNameplateView;
import com.dena.mirrorman.customview.GiftGachaView;
import com.dena.mirrorman.customview.GiftPointView;
import com.dena.mirrorman.customview.GiftRankingAchievedRewardView;
import com.dena.mirrorman.customview.SpotlightWithBalloonView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.feature.comment.GiftEffectView;
import com.dena.mirrorman.feature.emomo.EmomoMotionView;

/* loaded from: classes2.dex */
public class h extends g {
    public static final ViewDataBinding.i C0 = null;
    public static final SparseIntArray D0;
    public long B0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(xb.o.M, 1);
        sparseIntArray.put(xb.o.A0, 2);
        sparseIntArray.put(xb.o.close_area, 3);
        sparseIntArray.put(xb.o.N2, 4);
        sparseIntArray.put(xb.o.P1, 5);
        sparseIntArray.put(xb.o.group_shot_fragment_container, 6);
        sparseIntArray.put(xb.o.operation_container, 7);
        sparseIntArray.put(xb.o.f59975b9, 8);
        sparseIntArray.put(xb.o.H1, 9);
        sparseIntArray.put(xb.o.invite_collab_image_view, 10);
        sparseIntArray.put(xb.o.collab_matching_container, 11);
        sparseIntArray.put(xb.o.collab_matching_image_view, 12);
        sparseIntArray.put(xb.o.matching_waiting_lottie_animation_view, 13);
        sparseIntArray.put(xb.o.matching_result_lottie_animation_view, 14);
        sparseIntArray.put(xb.o.matched_starter_image_view, 15);
        sparseIntArray.put(xb.o.matched_host_image_view, 16);
        sparseIntArray.put(xb.o.f59982g2, 17);
        sparseIntArray.put(xb.o.gift_ranking_achieved_reward_view, 18);
        sparseIntArray.put(xb.o.gift_gacha_view, 19);
        sparseIntArray.put(xb.o.G6, 20);
        sparseIntArray.put(xb.o.group_shot_enabled_indication_mirrabit_lottie_animation_view, 21);
        sparseIntArray.put(xb.o.f60027q7, 22);
        sparseIntArray.put(xb.o.ranking_top_user, 23);
        sparseIntArray.put(xb.o.ranking_frame_image, 24);
        sparseIntArray.put(xb.o.comment_btn, 25);
        sparseIntArray.put(xb.o.C2, 26);
        sparseIntArray.put(xb.o.avatar_dress_up_btn, 27);
        sparseIntArray.put(xb.o.O, 28);
        sparseIntArray.put(xb.o.shooter_button_container, 29);
        sparseIntArray.put(xb.o.f60034s8, 30);
        sparseIntArray.put(xb.o.shooter_matching_fukidashi_image_view, 31);
        sparseIntArray.put(xb.o.emomo_run_button, 32);
        sparseIntArray.put(xb.o.livegame_list_container, 33);
        sparseIntArray.put(xb.o.livegame_list_image_view, 34);
        sparseIntArray.put(xb.o.livegame_list_badge_view, 35);
        sparseIntArray.put(xb.o.karaoke_button, 36);
        sparseIntArray.put(xb.o.M1, 37);
        sparseIntArray.put(xb.o.comment_box, 38);
        sparseIntArray.put(xb.o.E, 39);
        sparseIntArray.put(xb.o.app_user_id_tutorial_image_view, 40);
        sparseIntArray.put(xb.o.comment_send_text_view, 41);
        sparseIntArray.put(xb.o.event_rank_container, 42);
        sparseIntArray.put(xb.o.event_rank_text_view, 43);
        sparseIntArray.put(xb.o.event_webview_container, 44);
        sparseIntArray.put(xb.o.event_webview, 45);
        sparseIntArray.put(xb.o.event_webview_close_image_view, 46);
        sparseIntArray.put(xb.o.gift_nameplate_view, 47);
        sparseIntArray.put(xb.o.gift_point_anchor_view, 48);
        sparseIntArray.put(xb.o.gift_point_view, 49);
        sparseIntArray.put(xb.o.gift_effect_view, 50);
        sparseIntArray.put(xb.o.spotlight_with_balloon_view, 51);
    }

    public h(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 52, C0, D0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.B0 = 0L;
        }
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
            this.B0 = 1L;
        }
        H();
    }

    public h(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[39], (AppCompatImageView) objArr[40], (FrameLayout) objArr[1], (AppCompatImageView) objArr[27], (View) objArr[28], (View) objArr[2], (View) objArr[3], (ConstraintLayout) objArr[11], (AppCompatImageView) objArr[12], (RecyclerView) objArr[9], (EditText) objArr[38], (AppCompatButton) objArr[25], (ConstraintLayout) objArr[37], (FrameLayout) objArr[5], (AppCompatTextView) objArr[41], (ConstraintLayout) objArr[0], (RecyclerView) objArr[17], (ConstraintLayout) objArr[26], (EmomoMotionView) objArr[4], (AppCompatButton) objArr[32], (ConstraintLayout) objArr[42], (AppCompatTextView) objArr[43], (WebView) objArr[45], (AppCompatImageView) objArr[46], (ConstraintLayout) objArr[44], (GiftEffectView) objArr[50], (GiftGachaView) objArr[19], (GiftNameplateView) objArr[47], (Space) objArr[48], (GiftPointView) objArr[49], (GiftRankingAchievedRewardView) objArr[18], (LottieAnimationView) objArr[21], (FrameLayout) objArr[6], (AppCompatImageView) objArr[10], (AppCompatButton) objArr[36], (View) objArr[35], (ConstraintLayout) objArr[33], (AppCompatImageView) objArr[34], (AppCompatImageView) objArr[16], (AppCompatImageView) objArr[15], (LottieAnimationView) objArr[14], (LottieAnimationView) objArr[13], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[20], (ConstraintLayout) objArr[22], (AppCompatImageView) objArr[24], (AppCompatImageView) objArr[23], (AppCompatButton) objArr[30], (ConstraintLayout) objArr[29], (AppCompatImageView) objArr[31], (SpotlightWithBalloonView) objArr[51], (SwitchableEventBannerIconView) objArr[8]);
        this.B0 = -1L;
        this.Q.setTag(null);
        N(view);
        y();
    }
}
