package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class l1 extends k1 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(xb.o.f60050x9, 1);
        sparseIntArray.put(xb.o.never_ask, 2);
        sparseIntArray.put(xb.o.Z0, 3);
        sparseIntArray.put(xb.o.reject, 4);
    }

    public l1(androidx.databinding.e eVar, View view) {
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

    public l1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[3], (RelativeLayout) objArr[0], (CheckBox) objArr[2], (AppCompatButton) objArr[4], (AppCompatTextView) objArr[1]);
        this.G = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
