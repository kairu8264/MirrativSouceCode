package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class r6 extends q6 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.preview_lottie_animation_view, 1);
        sparseIntArray.put(nd.z0.execute_lottie_animation_view, 2);
        sparseIntArray.put(nd.z0.f42374z2, 3);
        sparseIntArray.put(nd.z0.title_image_view, 4);
        sparseIntArray.put(nd.z0.app_background_image_view, 5);
        sparseIntArray.put(nd.z0.f42345t, 6);
        sparseIntArray.put(nd.z0.Ue, 7);
        sparseIntArray.put(nd.z0.execute_image_view, 8);
        sparseIntArray.put(nd.z0.mirrabit_loading_view, 9);
        sparseIntArray.put(nd.z0.Q7, 10);
    }

    public r6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 1L;
        }
        H();
    }

    public r6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[8], (LottieAnimationView) objArr[2], (AppCompatImageView) objArr[10], (ConstraintLayout) objArr[9], (LottieAnimationView) objArr[1], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[7]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
