package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class i4 extends h4 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(xb.o.imageView, 1);
        sparseIntArray.put(xb.o.badgeImageView, 2);
        sparseIntArray.put(xb.o.nameView, 3);
        sparseIntArray.put(xb.o.linkButtonView, 4);
        sparseIntArray.put(xb.o.linkButtonImageView, 5);
    }

    public i4(androidx.databinding.e eVar, View view) {
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

    public i4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[5], (FrameLayout) objArr[4], (AppCompatTextView) objArr[3]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        N(view);
        y();
    }
}
