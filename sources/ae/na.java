package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.GaugeView;

/* loaded from: classes2.dex */
public class na extends ma {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.gauge_view, 1);
        sparseIntArray.put(nd.z0.progress_bordered_text_view, 2);
        sparseIntArray.put(nd.z0.white_overlay_view, 3);
        sparseIntArray.put(nd.z0.present_image_view, 4);
        sparseIntArray.put(nd.z0.rare_gacha_get_lottie_animation_view, 5);
    }

    public na(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 1L;
        }
        H();
    }

    public na(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (GaugeView) objArr[1], (AppCompatImageView) objArr[4], (BorderedTextView) objArr[2], (LottieAnimationView) objArr[5], (View) objArr[3]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
