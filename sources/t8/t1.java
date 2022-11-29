package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes.dex */
public class t1 extends s1 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(r8.e1.anchor_space, 2);
        sparseIntArray.put(r8.e1.app_icon_container, 3);
        sparseIntArray.put(r8.e1.holding_campaign_border_lottie_animation_view, 4);
        sparseIntArray.put(r8.e1.f49866h, 5);
        sparseIntArray.put(r8.e1.holding_campaign_title_lottie_animation_view, 6);
    }

    public t1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.G, 10, Integer.valueOf(ViewDataBinding.t(this.G, r8.b1.f49834d)));
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

    public t1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Space) objArr[2], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[5], (LottieAnimationView) objArr[4], (LottieAnimationView) objArr[6], (AppCompatImageView) objArr[1]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        N(view);
        y();
    }
}
