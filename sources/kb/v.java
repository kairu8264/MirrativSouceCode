package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.FocusedGiftView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import hb.w1;

/* loaded from: classes2.dex */
public class v extends t {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(w1.root_view, 1);
        sparseIntArray.put(w1.commentBG, 2);
        sparseIntArray.put(w1.f35000f0, 3);
        sparseIntArray.put(w1.gift_background, 4);
        sparseIntArray.put(w1.gift_item_1, 5);
        sparseIntArray.put(w1.gift_item_2, 6);
        sparseIntArray.put(w1.gift_item_3, 7);
        sparseIntArray.put(w1.gift_item_4, 8);
        sparseIntArray.put(w1.gift_cover, 9);
        sparseIntArray.put(w1.f34997d0, 10);
        sparseIntArray.put(w1.f35002g0, 11);
        sparseIntArray.put(w1.B1, 12);
        sparseIntArray.put(w1.f34995c0, 13);
        sparseIntArray.put(w1.f35005h3, 14);
        sparseIntArray.put(w1.f35008i3, 15);
        sparseIntArray.put(w1.focused_gift_1, 16);
        sparseIntArray.put(w1.focused_gift_2, 17);
        sparseIntArray.put(w1.focused_gift_3, 18);
        sparseIntArray.put(w1.focused_gift_4, 19);
    }

    public v(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 20, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.V = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 1L;
        }
        H();
    }

    public v(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (EditTextWithOnKeyPreImeListener) objArr[13], (ConstraintLayout) objArr[10], (FrameLayout) objArr[3], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[0], (FocusedGiftView) objArr[16], (FocusedGiftView) objArr[17], (FocusedGiftView) objArr[18], (FocusedGiftView) objArr[19], (View) objArr[4], (View) objArr[9], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[12], (View) objArr[1], (ConstraintLayout) objArr[14], (AppCompatImageView) objArr[15]);
        this.V = -1L;
        this.G.setTag(null);
        N(view);
        y();
    }
}
