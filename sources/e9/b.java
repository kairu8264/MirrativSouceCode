package e9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public class b extends a {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(d9.d.f29319b, 1);
        sparseIntArray.put(d9.d.f29325m, 2);
        sparseIntArray.put(d9.d.f29324g, 3);
        sparseIntArray.put(d9.d.f29323f, 4);
        sparseIntArray.put(d9.d.lottie_barrier, 5);
        sparseIntArray.put(d9.d.start_button_view, 6);
        sparseIntArray.put(d9.d.f29318a, 7);
    }

    public b(e eVar, View view) {
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
            td.c.b(this.I, 12, Integer.valueOf(ViewDataBinding.t(this.I, d9.b.f29316a)));
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

    public b(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[1], (LottieAnimationView) objArr[4], (LottieAnimationView) objArr[3], (Barrier) objArr[5], (RoundedButtonView) objArr[6], (AppCompatTextView) objArr[2]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
