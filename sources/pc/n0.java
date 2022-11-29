package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class n0 extends m0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nc.e.thanks_image, 1);
        sparseIntArray.put(nc.e.close_button_background, 2);
        sparseIntArray.put(nc.e.R0, 3);
        sparseIntArray.put(nc.e.f41839r5, 4);
        sparseIntArray.put(nc.e.get_reward_date_text, 5);
        sparseIntArray.put(nc.e.get_reward_text, 6);
        sparseIntArray.put(nc.e.received_reward_text, 7);
        sparseIntArray.put(nc.e.U3, 8);
    }

    public n0(androidx.databinding.e eVar, View view) {
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

    public n0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatButton) objArr[8], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[1]);
        this.K = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
