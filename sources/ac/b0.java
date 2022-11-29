package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class b0 extends a0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.gray_view, 1);
        sparseIntArray.put(xb.o.G9, 2);
        sparseIntArray.put(xb.o.title_description, 3);
        sparseIntArray.put(xb.o.border, 4);
        sparseIntArray.put(xb.o.edittext_custom_thanks_message, 5);
        sparseIntArray.put(xb.o.custom_thanks_message_counter, 6);
        sparseIntArray.put(xb.o.dialog_no_button, 7);
        sparseIntArray.put(xb.o.dialog_yes_button, 8);
    }

    public b0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public b0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (View) objArr[4], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[8], (EditText) objArr[5], (View) objArr[1], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2]);
        this.K = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
