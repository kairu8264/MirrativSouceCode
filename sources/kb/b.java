package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.VideoTextureView;
import hb.w1;

/* loaded from: classes2.dex */
public class b extends a {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(w1.f35029v3, 1);
        sparseIntArray.put(w1.retry, 2);
        sparseIntArray.put(w1.controller_container, 3);
        sparseIntArray.put(w1.owner_container, 4);
        sparseIntArray.put(w1.owner_icon_image_view, 5);
        sparseIntArray.put(w1.owner_name_text_view, 6);
        sparseIntArray.put(w1.backward_10_on_controller_lottie_animation_view, 7);
        sparseIntArray.put(w1.forward_10_on_controller_lottie_animation_view, 8);
        sparseIntArray.put(w1.pause_image_button, 9);
        sparseIntArray.put(w1.f35017o, 10);
        sparseIntArray.put(w1.seekbar, 11);
        sparseIntArray.put(w1.current_progress_on_controller_text_view, 12);
        sparseIntArray.put(w1.full_duration_on_controller_text_view, 13);
        sparseIntArray.put(w1.playback_speed_controller_container, 14);
        sparseIntArray.put(w1.speed_meter_image_button, 15);
        sparseIntArray.put(w1.current_playback_speed_text_view, 16);
        sparseIntArray.put(w1.K, 17);
        sparseIntArray.put(w1.L2, 18);
    }

    public b(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 19, V, W));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.U != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.U = 1L;
        }
        H();
    }

    public b(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (LottieAnimationView) objArr[7], (FrameLayout) objArr[10], (AppCompatImageView) objArr[17], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[12], (LottieAnimationView) objArr[8], (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (ImageButton) objArr[9], (ConstraintLayout) objArr[14], (ProgressBar) objArr[18], (AppCompatButton) objArr[2], (SeekBar) objArr[11], (AppCompatImageView) objArr[15], (VideoTextureView) objArr[1]);
        this.U = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
