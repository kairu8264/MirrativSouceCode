package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class w1 extends v1 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 1);
        sparseIntArray.put(nd.z0.my_profile_image_view, 2);
        sparseIntArray.put(nd.z0.loading_image_view, 3);
        sparseIntArray.put(nd.z0.live_user_profile_image_view, 4);
        sparseIntArray.put(nd.z0.cancel_button_view, 5);
        sparseIntArray.put(nd.z0.live_start_button_view, 6);
    }

    public w1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I = 0L;
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

    public w1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RoundedButtonView) objArr[5], (ConstraintLayout) objArr[0], (RoundedButtonView) objArr[6], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[1]);
        this.I = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
