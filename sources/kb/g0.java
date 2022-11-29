package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.GiftComboView;
import hb.w1;

/* loaded from: classes2.dex */
public class g0 extends f0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(w1.f35009k, 1);
        sparseIntArray.put(w1.profile_background_image, 2);
        sparseIntArray.put(w1.I2, 3);
        sparseIntArray.put(w1.H3, 4);
        sparseIntArray.put(w1.f35024s1, 5);
        sparseIntArray.put(w1.f35004h1, 6);
        sparseIntArray.put(w1.gift_combo, 7);
    }

    public g0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 1L;
        }
        H();
    }

    public g0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[1], (GiftComboView) objArr[7], (ImageView) objArr[6], (AppCompatTextView) objArr[5], (View) objArr[2], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
