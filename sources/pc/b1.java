package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class b1 extends a1 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nc.e.dialog_card_container, 1);
        sparseIntArray.put(nc.e.H1, 2);
        sparseIntArray.put(nc.e.Y2, 3);
        sparseIntArray.put(nc.e.f41817a1, 4);
        sparseIntArray.put(nc.e.streamer_terms_confirm_button, 5);
        sparseIntArray.put(nc.e.agree_button, 6);
    }

    public b1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 1L;
        }
        H();
    }

    public b1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[6], (AppCompatButton) objArr[4], (ConstraintLayout) objArr[0], (CardView) objArr[1], (LinearLayout) objArr[2], (AppCompatImageView) objArr[3], (AppCompatButton) objArr[5]);
        this.I = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
