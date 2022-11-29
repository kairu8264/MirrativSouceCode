package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class k1 extends j1 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.Ke, 1);
        sparseIntArray.put(nd.z0.f42275e, 2);
        sparseIntArray.put(nd.z0.X0, 3);
        sparseIntArray.put(nd.z0.ok, 4);
        sparseIntArray.put(nd.z0.f42363w8, 5);
    }

    public k1(androidx.databinding.e eVar, View view) {
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

    public k1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LinearLayout) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (RelativeLayout) objArr[0], (AppCompatTextView) objArr[1]);
        this.H = -1L;
        this.F.setTag(null);
        N(view);
        y();
    }
}
