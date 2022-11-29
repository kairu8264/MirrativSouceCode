package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.panel.GiftPanelView;
import hb.w1;

/* loaded from: classes2.dex */
public class l1 extends k1 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(w1.gift_panel, 1);
        sparseIntArray.put(w1.f35026t, 2);
        sparseIntArray.put(w1.coin_button_container, 3);
        sparseIntArray.put(w1.Q, 4);
        sparseIntArray.put(w1.coin_free_icon_image, 5);
        sparseIntArray.put(w1.coin_free_text_view, 6);
        sparseIntArray.put(w1.coin_paid_icon_image, 7);
        sparseIntArray.put(w1.coin_paid_text_view, 8);
        sparseIntArray.put(w1.coin_icon_right_image_view, 9);
    }

    public l1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public l1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[8], (GiftPanelView) objArr[1]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
