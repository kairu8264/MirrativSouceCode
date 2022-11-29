package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class xl extends wl {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.first_edit_text, 1);
        sparseIntArray.put(nd.z0.second_edit_text, 2);
        sparseIntArray.put(nd.z0.third_edit_text, 3);
        sparseIntArray.put(nd.z0.fourth_edit_text, 4);
        sparseIntArray.put(nd.z0.pin_clickable_container, 5);
    }

    public xl(androidx.databinding.e eVar, View view) {
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

    public xl(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (EditText) objArr[1], (EditText) objArr[4], (View) objArr[5], (EditText) objArr[2], (EditText) objArr[3]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
