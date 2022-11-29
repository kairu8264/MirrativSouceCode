package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class a3 extends z2 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.C3, 1);
        sparseIntArray.put(nd.z0.amount_text_view, 2);
        sparseIntArray.put(nd.z0.price_unit1_text_view, 3);
        sparseIntArray.put(nd.z0.price_unit2_text_view, 4);
        sparseIntArray.put(nd.z0.f42361w3, 5);
        sparseIntArray.put(nd.z0.Y0, 6);
        sparseIntArray.put(nd.z0.select_button, 7);
        sparseIntArray.put(nd.z0.P5, 8);
        sparseIntArray.put(nd.z0.bottom_text_view, 9);
    }

    public a3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public a3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[9], (AppCompatButton) objArr[6], (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[0], (AppCompatButton) objArr[7]);
        this.L = -1L;
        this.J.setTag(null);
        N(view);
        y();
    }
}
