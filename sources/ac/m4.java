package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class m4 extends l4 {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public final ConstraintLayout V;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(xb.o.f59968a0, 1);
        sparseIntArray.put(xb.o.background_balloon_animation_view, 2);
        sparseIntArray.put(xb.o.background_paper_animation_view, 3);
        sparseIntArray.put(xb.o.P, 4);
        sparseIntArray.put(xb.o.avatar_background_image_view_effect, 5);
        sparseIntArray.put(xb.o.foreground_balloon_animation_view, 6);
        sparseIntArray.put(xb.o.foreground_paper_animation_view, 7);
        sparseIntArray.put(xb.o.title_bound_animation_view, 8);
        sparseIntArray.put(xb.o.highest_record_badge, 9);
        sparseIntArray.put(xb.o.continuous_ribbon_background_image, 10);
        sparseIntArray.put(xb.o.continuous_count_text, 11);
        sparseIntArray.put(xb.o.result_point_container, 12);
        sparseIntArray.put(xb.o.gift_point_container, 13);
        sparseIntArray.put(xb.o.result_gift_point_image, 14);
        sparseIntArray.put(xb.o.gift_point_text_view, 15);
        sparseIntArray.put(xb.o.gift_point_title_text_view, 16);
        sparseIntArray.put(xb.o.result_time_container, 17);
        sparseIntArray.put(xb.o.result_time_image, 18);
        sparseIntArray.put(xb.o.result_time_text_view, 19);
        sparseIntArray.put(xb.o.result_time_title_text_view, 20);
    }

    public m4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 21, X, Y));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.W = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.W != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.W = 1L;
        }
        H();
    }

    public m4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[4], (LottieAnimationView) objArr[2], (AppCompatImageView) objArr[1], (LottieAnimationView) objArr[3], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[10], (LottieAnimationView) objArr[6], (LottieAnimationView) objArr[7], (ConstraintLayout) objArr[13], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[16], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[14], (LinearLayoutCompat) objArr[12], (ConstraintLayout) objArr[17], (AppCompatImageView) objArr[18], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[20], (LottieAnimationView) objArr[8]);
        this.W = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
