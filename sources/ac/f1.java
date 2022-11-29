package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class f1 extends e1 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.T1, 1);
        sparseIntArray.put(xb.o.f60006m1, 2);
        sparseIntArray.put(xb.o.G9, 3);
        sparseIntArray.put(xb.o.stop_screen_share_image_view, 4);
        sparseIntArray.put(xb.o.f60017o2, 5);
        sparseIntArray.put(xb.o.f59998k6, 6);
        sparseIntArray.put(xb.o.accept_button, 7);
        sparseIntArray.put(xb.o.deny_button, 8);
    }

    public f1(androidx.databinding.e eVar, View view) {
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

    public f1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[7], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[1], (AppCompatButton) objArr[8], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[3]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
