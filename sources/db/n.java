package db;

import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class n extends m {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(wa.e.movie_emomo_texture_view, 1);
        sparseIntArray.put(wa.e.f58530d0, 2);
        sparseIntArray.put(wa.e.f58541u, 3);
        sparseIntArray.put(wa.e.f58534i0, 4);
        sparseIntArray.put(wa.e.f58526a0, 5);
        sparseIntArray.put(wa.e.to_next_button, 6);
    }

    public n(androidx.databinding.e eVar, View view) {
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

    public n(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[3], (TextureView) objArr[1], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[2], (AppCompatButton) objArr[6], (ConstraintLayout) objArr[4]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
