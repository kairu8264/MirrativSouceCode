package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class x extends w {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(q9.g.f48835k, 1);
        sparseIntArray.put(q9.g.T3, 2);
        sparseIntArray.put(q9.g.color_gradient_background_view, 3);
        sparseIntArray.put(q9.g.color_gradient_seek_bar, 4);
        sparseIntArray.put(q9.g.touch_intercept_view, 5);
    }

    public x(androidx.databinding.e eVar, View view) {
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

    public x(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[1], (View) objArr[3], (SeekBar) objArr[4], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[2], (View) objArr[5]);
        this.H = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
