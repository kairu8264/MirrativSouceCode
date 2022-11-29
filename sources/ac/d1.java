package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class d1 extends c1 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(xb.o.f60013n5, 1);
        sparseIntArray.put(xb.o.light_effect1_image_view, 2);
        sparseIntArray.put(xb.o.light_effect2_image_view, 3);
        sparseIntArray.put(xb.o.lottie_appear_animation_view, 4);
        sparseIntArray.put(xb.o.user_container, 5);
        sparseIntArray.put(xb.o.streamer_background_image_view, 6);
        sparseIntArray.put(xb.o.streamer_image_view, 7);
        sparseIntArray.put(xb.o.viewer_background_image_view, 8);
        sparseIntArray.put(xb.o.viewer_image_view, 9);
        sparseIntArray.put(xb.o.bonus_item_background_image_view, 10);
        sparseIntArray.put(xb.o.bonus_item_image_view, 11);
        sparseIntArray.put(xb.o.from_viewer_text_view, 12);
        sparseIntArray.put(xb.o.reward_name_text_view, 13);
        sparseIntArray.put(xb.o.get_text_view, 14);
        sparseIntArray.put(xb.o.f59998k6, 15);
        sparseIntArray.put(xb.o.lottie_wait_animation_view, 16);
    }

    public d1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.S = 1L;
        }
        H();
    }

    public d1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[14], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[3], (Space) objArr[1], (LottieAnimationView) objArr[4], (LottieAnimationView) objArr[16], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[7], (ConstraintLayout) objArr[5], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[9]);
        this.S = -1L;
        this.M.setTag(null);
        N(view);
        y();
    }
}
