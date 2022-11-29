package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class rb extends qb {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.f42274d8, 3);
        sparseIntArray.put(nd.z0.logo_anchor_space, 4);
        sparseIntArray.put(nd.z0.Y7, 5);
    }

    public rb(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.qb
    public void T(String str) {
        this.G = str;
        synchronized (this) {
            this.I |= 1;
        }
        c(nd.b.f41916l);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        String str = this.G;
        int i10 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        if ((j10 & 2) != 0) {
            td.c.c(this.E, 27, 2, Integer.valueOf(ViewDataBinding.t(this.E, nd.w0.f42229d)), Integer.valueOf(ViewDataBinding.t(this.E, nd.w0.U0)));
        }
        if (i10 != 0) {
            td.a.f(this.F, str);
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
            this.I = 2L;
        }
        H();
    }

    public rb(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Space) objArr[4], (AppCompatImageView) objArr[5], (LottieAnimationView) objArr[3], (View) objArr[1], (AppCompatImageView) objArr[2]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
