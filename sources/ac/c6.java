package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class c6 extends b6 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final FrameLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(xb.o.root_container, 1);
        sparseIntArray.put(xb.o.f59980f7, 2);
        sparseIntArray.put(xb.o.f59989i0, 3);
        sparseIntArray.put(xb.o.f59988ha, 4);
        sparseIntArray.put(xb.o.H5, 5);
    }

    public c6(androidx.databinding.e eVar, View view) {
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

    public c6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[4]);
        this.H = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.G = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
