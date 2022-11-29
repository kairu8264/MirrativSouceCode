package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class h0 extends g0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 1);
        sparseIntArray.put(nd.z0.E3, 2);
        sparseIntArray.put(nd.z0.copy_text_view, 3);
        sparseIntArray.put(nd.z0.Mb, 4);
        sparseIntArray.put(nd.z0.f42334r0, 5);
    }

    public h0(androidx.databinding.e eVar, View view) {
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

    public h0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[5], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[3], (View) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[1]);
        this.H = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
