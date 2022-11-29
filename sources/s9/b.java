package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class b extends a {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(q9.g.f48834j, 1);
        sparseIntArray.put(q9.g.f48832h, 2);
        sparseIntArray.put(q9.g.top_gradient_view, 3);
        sparseIntArray.put(q9.g.U, 4);
        sparseIntArray.put(q9.g.V, 5);
        sparseIntArray.put(q9.g.J, 6);
    }

    public b(androidx.databinding.e eVar, View view) {
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

    public b(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (FrameLayout) objArr[2], (ImageView) objArr[1], (AppCompatImageView) objArr[6], (Space) objArr[4], (FrameLayout) objArr[5], (View) objArr[3]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
