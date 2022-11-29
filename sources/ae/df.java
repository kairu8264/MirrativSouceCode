package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class df extends cf {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.type_image_view, 1);
        sparseIntArray.put(nd.z0.gift_count_text_view, 2);
        sparseIntArray.put(nd.z0.profile_background_view, 3);
        sparseIntArray.put(nd.z0.Pa, 4);
        sparseIntArray.put(nd.z0.fever_image_view, 5);
        sparseIntArray.put(nd.z0.count_up_animation_view, 6);
    }

    public df(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 1L;
        }
        H();
    }

    public df(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LottieAnimationView) objArr[6], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[2], (View) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[1]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
