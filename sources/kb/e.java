package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.player.PlayerAdAppView;
import com.dena.mirrativ.player.PlayerLinkedLiveBackView;
import com.dena.mirrativ.player.PlayerLinkedLiveView;
import com.dena.mirrativ.player.gifting.EmomoRunGiftsView;
import com.dena.mirrativ.player.gifting.GiftNotificationListView;
import com.dena.mirrativ.player.gifting.MessageGiftView;
import com.dena.mirrorman.customview.CommentDummyInputFieldView;
import com.dena.mirrorman.customview.OneLineCommentView;
import com.dena.mirrorman.customview.PictureInPictureCommentView;
import com.dena.mirrorman.customview.VideoTextureView;
import com.dena.mirrorman.widget.TopToastMessageView;
import hb.w1;

/* loaded from: classes2.dex */
public class e extends d {
    public static final ViewDataBinding.i G0 = null;
    public static final SparseIntArray H0;
    public long F0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H0 = sparseIntArray;
        sparseIntArray.put(w1.f35029v3, 1);
        sparseIntArray.put(w1.player_item_container, 2);
        sparseIntArray.put(w1.G2, 3);
        sparseIntArray.put(w1.top_and_bottom_gradation_container, 4);
        sparseIntArray.put(w1.top_gradation_image_view, 5);
        sparseIntArray.put(w1.bottom_gradation_image_view, 6);
        sparseIntArray.put(w1.progressBar, 7);
        sparseIntArray.put(w1.C2, 8);
        sparseIntArray.put(w1.comment_background_image_view, 9);
        sparseIntArray.put(w1.f35000f0, 10);
        sparseIntArray.put(w1.player_linked_live_back_view, 11);
        sparseIntArray.put(w1.player_linked_live_view, 12);
        sparseIntArray.put(w1.quiz_congrats_container, 13);
        sparseIntArray.put(w1.player_ad_app_view, 14);
        sparseIntArray.put(w1.f35016n0, 15);
        sparseIntArray.put(w1.current_user_gift_ranking_radio_group, 16);
        sparseIntArray.put(w1.X, 17);
        sparseIntArray.put(w1.emomo_run_gifts_view, 18);
        sparseIntArray.put(w1.gift_notification_list_view, 19);
        sparseIntArray.put(w1.f35003h, 20);
        sparseIntArray.put(w1.live_game_compose_view, 21);
        sparseIntArray.put(w1.user_action_container, 22);
        sparseIntArray.put(w1.comment_dummy_input_field_view, 23);
        sparseIntArray.put(w1.f35001g, 24);
        sparseIntArray.put(w1.giftImageView, 25);
        sparseIntArray.put(w1.f35011k3, 26);
        sparseIntArray.put(w1.collaborate_image_view, 27);
        sparseIntArray.put(w1.setting_image_view, 28);
        sparseIntArray.put(w1.emomo_dress_up_icon_image_view, 29);
        sparseIntArray.put(w1.gift_appeal_container, 30);
        sparseIntArray.put(w1.gift_appeal_body_image_view, 31);
        sparseIntArray.put(w1.gift_appeal_triangle_image_view, 32);
        sparseIntArray.put(w1.gift_appeal_close_image_view, 33);
        sparseIntArray.put(w1.gift_ranking_image_view, 34);
        sparseIntArray.put(w1.U2, 35);
        sparseIntArray.put(w1.enter_pip_image_view, 36);
        sparseIntArray.put(w1.leftup_follow_button, 37);
        sparseIntArray.put(w1.leftup_profile_image, 38);
        sparseIntArray.put(w1.class_icon_image_view, 39);
        sparseIntArray.put(w1.message_gift_view, 40);
        sparseIntArray.put(w1.collaborate_message_view, 41);
        sparseIntArray.put(w1.shooter_invited_container, 42);
        sparseIntArray.put(w1.invited_shooter_first_lottie_animation_view, 43);
        sparseIntArray.put(w1.invited_shooter_loop_lottie_animation_view, 44);
        sparseIntArray.put(w1.quiz_life_button, 45);
        sparseIntArray.put(w1.I, 46);
        sparseIntArray.put(w1.quiz_question_container, 47);
        sparseIntArray.put(w1.f34994b3, 48);
        sparseIntArray.put(w1.one_line_comment_view, 49);
        sparseIntArray.put(w1.invited_collab_container, 50);
        sparseIntArray.put(w1.invited_collab_first_lottie_animation_view, 51);
        sparseIntArray.put(w1.invited_collab_loop_lottie_animation_view, 52);
        sparseIntArray.put(w1.mutual_gift_clear_lottie_animation_view, 53);
        sparseIntArray.put(w1.vertical_half_guideline, 54);
        sparseIntArray.put(w1.picture_in_picture_comment_view, 55);
    }

    public e(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 56, G0, H0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F0 = 1L;
        }
        H();
    }

    public e(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[24], (FrameLayout) objArr[20], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[39], (AppCompatImageView) objArr[46], (RecyclerView) objArr[17], (AppCompatImageView) objArr[27], (TopToastMessageView) objArr[41], (AppCompatImageView) objArr[9], (CommentDummyInputFieldView) objArr[23], (FrameLayout) objArr[10], (RadioGroup) objArr[16], (RecyclerView) objArr[15], (AppCompatImageView) objArr[29], (EmomoRunGiftsView) objArr[18], (AppCompatImageView) objArr[36], (AppCompatImageView) objArr[31], (AppCompatImageView) objArr[33], (ConstraintLayout) objArr[30], (AppCompatImageView) objArr[32], (LottieAnimationView) objArr[25], (GiftNotificationListView) objArr[19], (AppCompatImageView) objArr[34], (ConstraintLayout) objArr[50], (LottieAnimationView) objArr[51], (LottieAnimationView) objArr[52], (LottieAnimationView) objArr[43], (LottieAnimationView) objArr[44], (ConstraintLayout) objArr[37], (AppCompatImageView) objArr[38], (ComposeView) objArr[21], (MessageGiftView) objArr[40], (LottieAnimationView) objArr[53], (OneLineCommentView) objArr[49], (PictureInPictureCommentView) objArr[55], (PlayerAdAppView) objArr[14], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[2], (PlayerLinkedLiveBackView) objArr[11], (PlayerLinkedLiveView) objArr[12], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[3], (ProgressBar) objArr[7], (RelativeLayout) objArr[13], (ImageButton) objArr[45], (RelativeLayout) objArr[47], (RecyclerView) objArr[35], (AppCompatButton) objArr[48], (AppCompatImageView) objArr[28], (AppCompatImageView) objArr[26], (ConstraintLayout) objArr[42], (VideoTextureView) objArr[1], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[22], (Guideline) objArr[54]);
        this.F0 = -1L;
        this.f38523p0.setTag(null);
        N(view);
        y();
    }
}
