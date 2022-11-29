package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import hb.w1;

/* loaded from: classes2.dex */
public class n1 extends m1 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(w1.caster_image_view, 1);
        sparseIntArray.put(w1.caster_badge_image_view, 2);
        sparseIntArray.put(w1.text_container, 3);
        sparseIntArray.put(w1.live_title_view, 4);
        sparseIntArray.put(w1.link_transition_text_view, 5);
        sparseIntArray.put(w1.K, 6);
    }

    public n1(androidx.databinding.e eVar, View view) {
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

    public n1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[3]);
        this.I = -1L;
        this.G.setTag(null);
        N(view);
        y();
    }
}
