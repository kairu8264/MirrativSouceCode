package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class ja extends ia {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 1);
        sparseIntArray.put(nd.z0.f42293h6, 2);
        sparseIntArray.put(nd.z0.f42305k6, 3);
        sparseIntArray.put(nd.z0.f42311l6, 4);
        sparseIntArray.put(nd.z0.constraintLayoutFace, 5);
    }

    public ja(androidx.databinding.e eVar, View view) {
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

    public ja(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[5], (Guideline) objArr[2], (Guideline) objArr[1], (Guideline) objArr[3], (Guideline) objArr[4], (ConstraintLayout) objArr[0]);
        this.H = -1L;
        this.G.setTag(null);
        N(view);
        y();
    }
}
