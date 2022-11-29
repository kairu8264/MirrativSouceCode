package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class j5 extends i5 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(nd.z0.L, 1);
        sparseIntArray.put(nd.z0.content_scroll_view, 2);
        sparseIntArray.put(nd.z0.background_effect_image_view, 3);
        sparseIntArray.put(nd.z0.content_background_view, 4);
        sparseIntArray.put(nd.z0.content_background_view_anchor_top_space, 5);
        sparseIntArray.put(nd.z0.user_level_up_kirakira_lottie_animation_view, 6);
        sparseIntArray.put(nd.z0.unlock_item_image_view, 7);
        sparseIntArray.put(nd.z0.current_unlock_level_text_view, 8);
        sparseIntArray.put(nd.z0.current_unlock_item_text_view, 9);
        sparseIntArray.put(nd.z0.next_unlock_level_text_view, 10);
        sparseIntArray.put(nd.z0.next_unlock_item_name_text_view, 11);
        sparseIntArray.put(nd.z0.unlock_text_view, 12);
        sparseIntArray.put(nd.z0.show_detail_button_view, 13);
        sparseIntArray.put(nd.z0.f42349u0, 14);
        sparseIntArray.put(nd.z0.A1, 15);
    }

    public j5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 1L;
        }
        H();
    }

    public j5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (View) objArr[1], (Space) objArr[14], (AppCompatImageView) objArr[15], (View) objArr[4], (Space) objArr[5], (ScrollView) objArr[2], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (RoundedButtonView) objArr[13], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[12], (LottieAnimationView) objArr[6]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
