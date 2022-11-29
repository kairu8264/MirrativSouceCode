package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class h1 extends g1 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(xb.o.named_text_view, 1);
        sparseIntArray.put(xb.o.moderator_image_frame, 2);
        sparseIntArray.put(xb.o.R5, 3);
        sparseIntArray.put(xb.o.moderator_name_text_view, 4);
        sparseIntArray.put(xb.o.f60049x6, 5);
    }

    public h1(androidx.databinding.e eVar, View view) {
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

    public h1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[1], (AppCompatButton) objArr[5], (ConstraintLayout) objArr[0]);
        this.H = -1L;
        this.G.setTag(null);
        N(view);
        y();
    }
}
