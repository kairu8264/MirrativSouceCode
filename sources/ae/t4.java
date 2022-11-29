package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class t4 extends s4 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.f42290gf, 2);
        sparseIntArray.put(nd.z0.f42265b8, 3);
        sparseIntArray.put(nd.z0.first_lottie_animation_view, 4);
        sparseIntArray.put(nd.z0.f42261a8, 5);
        sparseIntArray.put(nd.z0.A8, 6);
        sparseIntArray.put(nd.z0.f42327p0, 7);
    }

    public t4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.B, 12, Integer.valueOf(ViewDataBinding.t(this.B, nd.w0.f42233h)));
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

    public t4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[1], (Space) objArr[7], (LottieAnimationView) objArr[4], (LottieAnimationView) objArr[5], (Space) objArr[3], (AppCompatTextView) objArr[6], (Space) objArr[2]);
        this.J = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
