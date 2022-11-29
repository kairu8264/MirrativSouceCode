package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class g3 extends f3 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(xb.o.X0, 1);
        sparseIntArray.put(xb.o.back_text_view, 2);
        sparseIntArray.put(xb.o.viewers_container, 3);
        sparseIntArray.put(xb.o.viewer_names_text_view, 4);
        sparseIntArray.put(xb.o.viewer_description_text_view, 5);
        sparseIntArray.put(xb.o.f60056ya, 6);
        sparseIntArray.put(xb.o.show_viewers_button_view, 7);
        sparseIntArray.put(xb.o.viewers_close_image_view, 8);
        sparseIntArray.put(xb.o.count_down_image_view, 9);
        sparseIntArray.put(xb.o.count_down_lottie_animation_view, 10);
    }

    public g3(androidx.databinding.e eVar, View view) {
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

    public g3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[2], (AppCompatButton) objArr[1], (AppCompatImageView) objArr[9], (LottieAnimationView) objArr[10], (RoundedButtonView) objArr[7], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[8], (ConstraintLayout) objArr[3], (RecyclerView) objArr[6]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
