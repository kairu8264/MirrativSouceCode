package sa;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p extends o {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(qa.o.f48876d, 1);
        sparseIntArray.put(qa.o.campaign_image_view, 2);
        sparseIntArray.put(qa.o.A, 3);
        sparseIntArray.put(qa.o.M, 4);
        sparseIntArray.put(qa.o.f48880p, 5);
        sparseIntArray.put(qa.o.f48881q, 6);
        sparseIntArray.put(qa.o.event_period_text_view, 7);
    }

    public p(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 1L;
        }
        H();
    }

    public p(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[1], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[3], (View) objArr[4]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
