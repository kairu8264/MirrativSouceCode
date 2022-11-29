package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class v0 extends u0 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nc.e.G, 1);
        sparseIntArray.put(nc.e.f41818a7, 2);
        sparseIntArray.put(nc.e.holiday_image_view, 3);
        sparseIntArray.put(nc.e.f41855z6, 4);
        sparseIntArray.put(nc.e.f41837p1, 5);
        sparseIntArray.put(nc.e.U3, 6);
    }

    public v0(androidx.databinding.e eVar, View view) {
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

    public v0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatButton) objArr[6], (AppCompatTextView) objArr[4], (View) objArr[2]);
        this.I = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
