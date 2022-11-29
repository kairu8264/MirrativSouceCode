package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;

/* loaded from: classes2.dex */
public class re extends qe {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.rare_item_background_image_view, 1);
        sparseIntArray.put(nd.z0.item_anchor_space, 2);
        sparseIntArray.put(nd.z0.rare_border_background_image_view, 3);
        sparseIntArray.put(nd.z0.item_image_view, 4);
        sparseIntArray.put(nd.z0.detail_image_view_container, 5);
        sparseIntArray.put(nd.z0.detail_image_view, 6);
        sparseIntArray.put(nd.z0.rare4_lottie_animation_view, 7);
        sparseIntArray.put(nd.z0.gacha_image_view, 8);
        sparseIntArray.put(nd.z0.event_bonus_image_view, 9);
        sparseIntArray.put(nd.z0.item_info_view, 10);
    }

    public re(androidx.databinding.e eVar, View view) {
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

    public re(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[5], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[8], (Space) objArr[2], (AppCompatImageView) objArr[4], (GiftGachaItemInfoView) objArr[10], (LottieAnimationView) objArr[7], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1]);
        this.M = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
