package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.player.gifting.GiftComboView;
import hb.w1;

/* loaded from: classes2.dex */
public class a0 extends z {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(w1.f35007i1, 1);
        sparseIntArray.put(w1.bonus_image_view, 2);
        sparseIntArray.put(w1.event_icon_container, 3);
        sparseIntArray.put(w1.event_icon_image_view, 4);
        sparseIntArray.put(w1.event_icon_target_image_view, 5);
        sparseIntArray.put(w1.progress_lottie_animation_view, 6);
        sparseIntArray.put(w1.coin_constraint_layout, 7);
        sparseIntArray.put(w1.T, 8);
        sparseIntArray.put(w1.coin_num_text_view, 9);
        sparseIntArray.put(w1.space_half_horizontal, 10);
        sparseIntArray.put(w1.space_half_vertical, 11);
        sparseIntArray.put(w1.gift_combo_view, 12);
        sparseIntArray.put(w1.locked_overlay_view, 13);
        sparseIntArray.put(w1.locked_image_view, 14);
    }

    public a0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 1L;
        }
        H();
    }

    public a0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[7], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[9], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[5], (GiftComboView) objArr[12], (ImageView) objArr[1], (AppCompatImageView) objArr[14], (View) objArr[13], (LottieAnimationView) objArr[6], (Space) objArr[10], (Space) objArr[11]);
        this.Q = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
