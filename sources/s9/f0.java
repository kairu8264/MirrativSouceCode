package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftGachaOpenResultView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public class f0 extends e0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(q9.g.f48837x1, 1);
        sparseIntArray.put(q9.g.A, 2);
        sparseIntArray.put(q9.g.next_button_view, 3);
        sparseIntArray.put(q9.g.I, 4);
        sparseIntArray.put(q9.g.A2, 5);
    }

    public f0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 1L;
        }
        H();
    }

    public f0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[2], (RoundedButtonView) objArr[4], (GiftGachaOpenResultView) objArr[1], (RoundedButtonView) objArr[3], (View) objArr[5]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
