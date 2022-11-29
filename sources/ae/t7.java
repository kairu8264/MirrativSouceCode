package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class t7 extends s7 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.Pa, 1);
        sparseIntArray.put(nd.z0.M, 2);
        sparseIntArray.put(nd.z0.live_mark_image_view, 3);
        sparseIntArray.put(nd.z0.f42291gg, 4);
        sparseIntArray.put(nd.z0.follower_status_text_view, 5);
        sparseIntArray.put(nd.z0.reason, 6);
        sparseIntArray.put(nd.z0.T, 7);
        sparseIntArray.put(nd.z0.f42320n3, 8);
        sparseIntArray.put(nd.z0.O0, 9);
        sparseIntArray.put(nd.z0.f42273d5, 10);
        sparseIntArray.put(nd.z0.block_status, 11);
        sparseIntArray.put(nd.z0.block_status_text, 12);
        sparseIntArray.put(nd.z0.f42316m0, 13);
    }

    public t7(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 1L;
        }
        H();
    }

    public t7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (Barrier) objArr[7], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[12], (View) objArr[13], (ConstraintLayout) objArr[9], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
