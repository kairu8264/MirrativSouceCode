package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class l2 extends k2 {

    /* renamed from: d0  reason: collision with root package name */
    public static final ViewDataBinding.i f46476d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    public static final SparseIntArray f46477e0;

    /* renamed from: c0  reason: collision with root package name */
    public long f46478c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46477e0 = sparseIntArray;
        sparseIntArray.put(nc.e.U0, 1);
        sparseIntArray.put(nc.e.rank_up_child_container, 2);
        sparseIntArray.put(nc.e.light_flash_1_image_view, 3);
        sparseIntArray.put(nc.e.light_flash_2_image_view, 4);
        sparseIntArray.put(nc.e.K, 5);
        sparseIntArray.put(nc.e.badge_lottie_animation, 6);
        sparseIntArray.put(nc.e.current_rank_text, 7);
        sparseIntArray.put(nc.e.information_container, 8);
        sparseIntArray.put(nc.e.live_result_current_reward_point_message_image_view, 9);
        sparseIntArray.put(nc.e.current_reward_point_message_first_text_view, 10);
        sparseIntArray.put(nc.e.current_reward_point_image_view, 11);
        sparseIntArray.put(nc.e.number_of_current_reward_point_text_view, 12);
        sparseIntArray.put(nc.e.current_reward_point_message_second_text_view, 13);
        sparseIntArray.put(nc.e.rank_reward_title_text_view, 14);
        sparseIntArray.put(nc.e.rank_reward_background_image, 15);
        sparseIntArray.put(nc.e.rank_reward_image, 16);
        sparseIntArray.put(nc.e.rank_reward_text, 17);
        sparseIntArray.put(nc.e.rank_reward_reset_message_text_view, 18);
        sparseIntArray.put(nc.e.top_rank_reward_message_background_header_view, 19);
        sparseIntArray.put(nc.e.top_rank_reward_message_background_view, 20);
        sparseIntArray.put(nc.e.top_rank_reward_message_background_bottom_view, 21);
        sparseIntArray.put(nc.e.top_rank_reward_point_image_view, 22);
        sparseIntArray.put(nc.e.top_rank_reward_message_text_view, 23);
        sparseIntArray.put(nc.e.reward_message_group, 24);
        sparseIntArray.put(nc.e.current_reward_group, 25);
        sparseIntArray.put(nc.e.top_rank_reward_message_group, 26);
    }

    public l2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 27, f46476d0, f46477e0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f46478c0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f46478c0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46478c0 = 1L;
        }
        H();
    }

    public l2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (LottieAnimationView) objArr[6], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[7], (Group) objArr[25], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[8], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[12], (AppCompatImageView) objArr[15], (AppCompatImageView) objArr[16], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[14], (ConstraintLayout) objArr[2], (Group) objArr[24], (View) objArr[21], (View) objArr[19], (View) objArr[20], (Group) objArr[26], (AppCompatTextView) objArr[23], (AppCompatImageView) objArr[22]);
        this.f46478c0 = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
