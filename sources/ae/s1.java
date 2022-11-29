package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class s1 extends r1 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.L6, 1);
        sparseIntArray.put(nd.z0.Ue, 2);
        sparseIntArray.put(nd.z0.restart_button_view, 3);
        sparseIntArray.put(nd.z0.f42331q7, 4);
    }

    public s1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.F, 12, Integer.valueOf(ViewDataBinding.t(this.F, nd.w0.U0)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public s1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[4], (RoundedButtonView) objArr[3], (AppCompatTextView) objArr[2]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
