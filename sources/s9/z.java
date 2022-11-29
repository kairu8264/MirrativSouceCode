package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.emomo.closet.ClosetAboutThisItemView;
import com.dena.mirrativ.emomo.closet.PartsLargeCategoryTabView;
import com.dena.mirrorman.customview.EditPartTextView;
import com.dena.mirrorman.customview.EmomoDressUpBuyButtonView;
import com.dena.mirrorman.customview.HorizontalScrollBar;
import com.dena.mirrorman.customview.PartTextTutorialView;
import com.dena.mirrorman.customview.RemainingKandumeView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.widget.ClosetGestureView;

/* loaded from: classes.dex */
public class z extends y {

    /* renamed from: w1  reason: collision with root package name */
    public static final ViewDataBinding.i f52599w1 = null;

    /* renamed from: x1  reason: collision with root package name */
    public static final SparseIntArray f52600x1;

    /* renamed from: v1  reason: collision with root package name */
    public long f52601v1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f52600x1 = sparseIntArray;
        sparseIntArray.put(q9.g.dress_up_container_background_view, 2);
        sparseIntArray.put(q9.g.N, 3);
        sparseIntArray.put(q9.g.part_text_tutorial_close_background_view, 4);
        sparseIntArray.put(q9.g.remaining_kandume_view, 5);
        sparseIntArray.put(q9.g.closet_about_this_item_view, 6);
        sparseIntArray.put(q9.g.part_text_tutorial_view, 7);
        sparseIntArray.put(q9.g.edit_part_text_view, 8);
        sparseIntArray.put(q9.g.f48826d0, 9);
        sparseIntArray.put(q9.g.dress_up_top_bar_container, 10);
        sparseIntArray.put(q9.g.parts_large_category_tab_view, 11);
        sparseIntArray.put(q9.g.parts_view, 12);
        sparseIntArray.put(q9.g.parts_category_recycler_view, 13);
        sparseIntArray.put(q9.g.pet_help_container, 14);
        sparseIntArray.put(q9.g.C1, 15);
        sparseIntArray.put(q9.g.border_parts_category_bottom_view, 16);
        sparseIntArray.put(q9.g.parts_recycler_view_container, 17);
        sparseIntArray.put(q9.g.parts_recycler_view, 18);
        sparseIntArray.put(q9.g.horizontal_scroll_bar_view, 19);
        sparseIntArray.put(q9.g.color_palette_gradient_setting_container, 20);
        sparseIntArray.put(q9.g.color_picker_recycler_view, 21);
        sparseIntArray.put(q9.g.A3, 22);
        sparseIntArray.put(q9.g.shooter_button_badge, 23);
        sparseIntArray.put(q9.g.save_button_anchor_space, 24);
        sparseIntArray.put(q9.g.f48836s3, 25);
        sparseIntArray.put(q9.g.reset_button, 26);
        sparseIntArray.put(q9.g.buy_button, 27);
        sparseIntArray.put(q9.g.trial_button, 28);
        sparseIntArray.put(q9.g.dress_up_motion_view, 29);
        sparseIntArray.put(q9.g.dress_up_motion_anchor1_view, 30);
        sparseIntArray.put(q9.g.dress_up_motion_anchor2_view, 31);
        sparseIntArray.put(q9.g.dress_up_motion_persona_container, 32);
        sparseIntArray.put(q9.g.dress_up_motion_persona_image_view, 33);
        sparseIntArray.put(q9.g.dress_up_motion_persona_text_view, 34);
        sparseIntArray.put(q9.g.dress_up_motion_up_motion_container, 35);
        sparseIntArray.put(q9.g.dress_up_motion_up_motion_image_view, 36);
        sparseIntArray.put(q9.g.dress_up_motion_up_motion_coin_container, 37);
        sparseIntArray.put(q9.g.dress_up_motion_up_motion_coin_image_view, 38);
        sparseIntArray.put(q9.g.dress_up_motion_up_motion_required_coin_text_view, 39);
        sparseIntArray.put(q9.g.dress_up_motion_up_motion_text_view, 40);
        sparseIntArray.put(q9.g.dress_up_motion_left_motion_container, 41);
        sparseIntArray.put(q9.g.dress_up_motion_left_motion_image_view, 42);
        sparseIntArray.put(q9.g.dress_up_motion_left_motion_coin_container, 43);
        sparseIntArray.put(q9.g.dress_up_motion_left_motion_coin_image_view, 44);
        sparseIntArray.put(q9.g.dress_up_motion_left_motion_required_coin_text_view, 45);
        sparseIntArray.put(q9.g.dress_up_motion_left_motion_text_view, 46);
        sparseIntArray.put(q9.g.dress_up_motion_right_motion_container, 47);
        sparseIntArray.put(q9.g.dress_up_motion_right_motion_image_view, 48);
        sparseIntArray.put(q9.g.dress_up_motion_right_motion_coin_container, 49);
        sparseIntArray.put(q9.g.dress_up_motion_right_motion_coin_image_view, 50);
        sparseIntArray.put(q9.g.dress_up_motion_right_motion_required_coin_text_view, 51);
        sparseIntArray.put(q9.g.dress_up_motion_right_motion_text_view, 52);
        sparseIntArray.put(q9.g.dress_up_motion_down_motion_container, 53);
        sparseIntArray.put(q9.g.dress_up_motion_down_motion_image_view, 54);
        sparseIntArray.put(q9.g.dress_up_motion_down_motion_coin_container, 55);
        sparseIntArray.put(q9.g.dress_up_motion_down_motion_coin_image_view, 56);
        sparseIntArray.put(q9.g.dress_up_motion_down_motion_required_coin_text_view, 57);
        sparseIntArray.put(q9.g.dress_up_motion_down_motion_text_view, 58);
        sparseIntArray.put(q9.g.dress_up_motion_help_image_view, 59);
        sparseIntArray.put(q9.g.dress_up_motion_base_motion_text_view, 60);
        sparseIntArray.put(q9.g.dress_up_motion_flick_motion_text_view, 61);
        sparseIntArray.put(q9.g.dress_up_weapon_view, 62);
        sparseIntArray.put(q9.g.dress_up_weapon_anchor1_view, 63);
        sparseIntArray.put(q9.g.dress_up_weapon_right_container, 64);
        sparseIntArray.put(q9.g.dress_up_weapon_right_image_view, 65);
        sparseIntArray.put(q9.g.dress_up_weapon_right_new_badge, 66);
        sparseIntArray.put(q9.g.dress_up_weapon_right_text_view, 67);
        sparseIntArray.put(q9.g.dress_up_weapon_both_container, 68);
        sparseIntArray.put(q9.g.dress_up_weapon_both_image_view, 69);
        sparseIntArray.put(q9.g.dress_up_weapon_both_new_badge, 70);
        sparseIntArray.put(q9.g.dress_up_weapon_both_text_view, 71);
        sparseIntArray.put(q9.g.dress_up_weapon_left_container, 72);
        sparseIntArray.put(q9.g.dress_up_weapon_left_image_view, 73);
        sparseIntArray.put(q9.g.dress_up_weapon_left_new_badge, 74);
        sparseIntArray.put(q9.g.dress_up_weapon_left_text_view, 75);
        sparseIntArray.put(q9.g.closet_dress_up_drag_view, 76);
        sparseIntArray.put(q9.g.G, 77);
        sparseIntArray.put(q9.g.slot_background, 78);
        sparseIntArray.put(q9.g.slot_icon_image_view, 79);
        sparseIntArray.put(q9.g.slot_name_text_view, 80);
        sparseIntArray.put(q9.g.slot_setting_view, 81);
        sparseIntArray.put(q9.g.R3, 82);
        sparseIntArray.put(q9.g.event_banner_image_container, 83);
        sparseIntArray.put(q9.g.event_banner_image_view, 84);
        sparseIntArray.put(q9.g.event_banner_title_text_view, 85);
        sparseIntArray.put(q9.g.emomo_run_game_effect_description_header_text_view, 86);
        sparseIntArray.put(q9.g.emomo_run_game_effect_description_text_view, 87);
        sparseIntArray.put(q9.g.closet_dress_up_overlay_parts_select_background_view, 88);
        sparseIntArray.put(q9.g.dress_up_overlay_parts_select_container, 89);
        sparseIntArray.put(q9.g.overlay_parts_select_header_view, 90);
        sparseIntArray.put(q9.g.overlay_parts_select_header_text_view, 91);
        sparseIntArray.put(q9.g.overlay_parts_select_header_close_button, 92);
        sparseIntArray.put(q9.g.overlay_parts_view, 93);
        sparseIntArray.put(q9.g.overlay_parts_recycler_view, 94);
        sparseIntArray.put(q9.g.overlay_parts_horizontal_scroll_bar_view, 95);
        sparseIntArray.put(q9.g.D2, 96);
        sparseIntArray.put(q9.g.V2, 97);
    }

    public z(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 98, f52599w1, f52600x1));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.f52601v1;
            this.f52601v1 = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.L0, 10, Integer.valueOf(ViewDataBinding.t(this.L0, q9.d.I)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f52601v1 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f52601v1 = 1L;
        }
        H();
    }

    public z(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[16], (EmomoDressUpBuyButtonView) objArr[27], (View) objArr[77], (ClosetAboutThisItemView) objArr[6], (View) objArr[76], (View) objArr[88], (ClosetGestureView) objArr[3], (ConstraintLayout) objArr[20], (RecyclerView) objArr[21], (ConstraintLayout) objArr[0], (LinearLayout) objArr[9], (View) objArr[2], (View) objArr[30], (View) objArr[31], (AppCompatTextView) objArr[60], (ConstraintLayout) objArr[55], (AppCompatImageView) objArr[56], (ConstraintLayout) objArr[53], (AppCompatImageView) objArr[54], (AppCompatTextView) objArr[57], (AppCompatTextView) objArr[58], (AppCompatTextView) objArr[61], (AppCompatImageView) objArr[59], (ConstraintLayout) objArr[43], (AppCompatImageView) objArr[44], (ConstraintLayout) objArr[41], (AppCompatImageView) objArr[42], (AppCompatTextView) objArr[45], (AppCompatTextView) objArr[46], (ConstraintLayout) objArr[32], (AppCompatImageView) objArr[33], (AppCompatTextView) objArr[34], (ConstraintLayout) objArr[49], (AppCompatImageView) objArr[50], (ConstraintLayout) objArr[47], (AppCompatImageView) objArr[48], (AppCompatTextView) objArr[51], (AppCompatTextView) objArr[52], (ConstraintLayout) objArr[37], (AppCompatImageView) objArr[38], (ConstraintLayout) objArr[35], (AppCompatImageView) objArr[36], (AppCompatTextView) objArr[39], (AppCompatTextView) objArr[40], (ConstraintLayout) objArr[29], (LinearLayout) objArr[89], (ConstraintLayout) objArr[10], (View) objArr[63], (ConstraintLayout) objArr[68], (AppCompatImageView) objArr[69], (View) objArr[70], (AppCompatTextView) objArr[71], (ConstraintLayout) objArr[72], (AppCompatImageView) objArr[73], (View) objArr[74], (AppCompatTextView) objArr[75], (ConstraintLayout) objArr[64], (AppCompatImageView) objArr[65], (View) objArr[66], (AppCompatTextView) objArr[67], (ConstraintLayout) objArr[62], (EditPartTextView) objArr[8], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[86], (AppCompatTextView) objArr[87], (ConstraintLayout) objArr[83], (AppCompatImageView) objArr[84], (AppCompatTextView) objArr[85], (AppCompatImageView) objArr[15], (HorizontalScrollBar) objArr[19], (HorizontalScrollBar) objArr[95], (RecyclerView) objArr[94], (AppCompatImageView) objArr[92], (AppCompatTextView) objArr[91], (ConstraintLayout) objArr[90], (ConstraintLayout) objArr[93], (View) objArr[4], (PartTextTutorialView) objArr[7], (RecyclerView) objArr[13], (PartsLargeCategoryTabView) objArr[11], (RecyclerView) objArr[18], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[12], (ConstraintLayout) objArr[14], (ConstraintLayout) objArr[96], (RemainingKandumeView) objArr[5], (AppCompatButton) objArr[26], (AppCompatButton) objArr[97], (AppCompatButton) objArr[25], (Space) objArr[24], (RoundedButtonView) objArr[22], (View) objArr[23], (View) objArr[78], (AppCompatImageView) objArr[79], (AppCompatTextView) objArr[80], (View) objArr[81], (SwitchableEventBannerIconView) objArr[82], (RoundedButtonView) objArr[28]);
        this.f52601v1 = -1L;
        this.K.setTag(null);
        this.L0.setTag(null);
        N(view);
        y();
    }
}
