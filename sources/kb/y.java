package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;
import hb.w1;

/* loaded from: classes2.dex */
public class y extends w {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(w1.giftItem1, 1);
        sparseIntArray.put(w1.giftItem2, 2);
        sparseIntArray.put(w1.giftItem3, 3);
        sparseIntArray.put(w1.giftItem4, 4);
        sparseIntArray.put(w1.giftItem5, 5);
        sparseIntArray.put(w1.giftItem6, 6);
        sparseIntArray.put(w1.giftItem7, 7);
        sparseIntArray.put(w1.giftItem8, 8);
    }

    public y(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public y(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (PlayerGiftPagerCell) objArr[1], (PlayerGiftPagerCell) objArr[2], (PlayerGiftPagerCell) objArr[3], (PlayerGiftPagerCell) objArr[4], (PlayerGiftPagerCell) objArr[5], (PlayerGiftPagerCell) objArr[6], (PlayerGiftPagerCell) objArr[7], (PlayerGiftPagerCell) objArr[8]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
