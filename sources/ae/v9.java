package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class v9 extends u9 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.label_a, 1);
        sparseIntArray.put(nd.z0.label_ka, 2);
        sparseIntArray.put(nd.z0.label_sa, 3);
        sparseIntArray.put(nd.z0.label_ta, 4);
        sparseIntArray.put(nd.z0.label_na, 5);
        sparseIntArray.put(nd.z0.label_ha, 6);
        sparseIntArray.put(nd.z0.label_ma, 7);
        sparseIntArray.put(nd.z0.label_ya, 8);
        sparseIntArray.put(nd.z0.label_ra, 9);
        sparseIntArray.put(nd.z0.label_wa, 10);
    }

    public v9(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 1L;
        }
        H();
    }

    public v9(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[8]);
        this.M = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
