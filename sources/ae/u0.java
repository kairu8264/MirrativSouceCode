package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class u0 extends t0 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 1);
        sparseIntArray.put(nd.z0.warning_text_view, 2);
        sparseIntArray.put(nd.z0.f42326o2, 3);
        sparseIntArray.put(nd.z0.Y0, 4);
    }

    public u0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
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

    public u0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[4], (AppCompatButton) objArr[3], (LinearLayout) objArr[0], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2]);
        this.G = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
