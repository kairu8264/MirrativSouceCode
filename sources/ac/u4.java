package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class u4 extends t4 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(xb.o.dialog_body, 1);
        sparseIntArray.put(xb.o.dialog_title, 2);
        sparseIntArray.put(xb.o.dialog_button_yes, 3);
        sparseIntArray.put(xb.o.dialog_button_no, 4);
    }

    public u4(androidx.databinding.e eVar, View view) {
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

    public u4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LinearLayout) objArr[1], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (RelativeLayout) objArr[0], (AppCompatTextView) objArr[2]);
        this.G = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
