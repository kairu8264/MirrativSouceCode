package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.FeverTitleAnimationView;
import com.dena.mirrorman.customview.GaugeView;

/* loaded from: classes2.dex */
public class la extends ka {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.fever_top_animation_view, 1);
        sparseIntArray.put(nd.z0.K1, 2);
        sparseIntArray.put(nd.z0.gift_ranking_info_space, 3);
        sparseIntArray.put(nd.z0.stock_recycler_view, 4);
        sparseIntArray.put(nd.z0.fever_gauge_back_animation_view, 5);
        sparseIntArray.put(nd.z0.fever_gauge_back_particle_animation_view, 6);
        sparseIntArray.put(nd.z0.fever_gauge_view, 7);
        sparseIntArray.put(nd.z0.fever_gauge_top_white_gradient_view, 8);
        sparseIntArray.put(nd.z0.progress_text_view, 9);
        sparseIntArray.put(nd.z0.count_down_text_view, 10);
        sparseIntArray.put(nd.z0.fever_title_animation_view, 11);
    }

    public la(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 1L;
        }
        H();
    }

    public la(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Space) objArr[2], (AppCompatTextView) objArr[10], (LottieAnimationView) objArr[5], (LottieAnimationView) objArr[6], (View) objArr[8], (GaugeView) objArr[7], (FeverTitleAnimationView) objArr[11], (LottieAnimationView) objArr[1], (Space) objArr[3], (BorderedTextView) objArr[9], (RecyclerView) objArr[4]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
