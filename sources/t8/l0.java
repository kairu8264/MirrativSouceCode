package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class l0 extends k0 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final CardView F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(r8.e1.f49877o, 1);
        sparseIntArray.put(r8.e1.N0, 2);
        sparseIntArray.put(r8.e1.main_text_view, 3);
        sparseIntArray.put(r8.e1.term_text_view, 4);
    }

    public l0(androidx.databinding.e eVar, View view) {
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

    public l0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4]);
        this.G = -1L;
        CardView cardView = (CardView) objArr[0];
        this.F = cardView;
        cardView.setTag(null);
        N(view);
        y();
    }
}
