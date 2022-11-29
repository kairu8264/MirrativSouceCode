package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class a5 extends z4 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final FrameLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(xb.o.G9, 1);
        sparseIntArray.put(xb.o.J5, 2);
        sparseIntArray.put(xb.o.Y5, 3);
        sparseIntArray.put(xb.o.Da, 4);
    }

    public a5(androidx.databinding.e eVar, View view) {
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

    public a5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[2], (AppCompatButton) objArr[3], (AppCompatTextView) objArr[1], (AppCompatButton) objArr[4]);
        this.G = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.F = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
