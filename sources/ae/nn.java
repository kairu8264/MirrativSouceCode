package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class nn extends mn {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.f42316m0, 1);
        sparseIntArray.put(nd.z0.L, 2);
        sparseIntArray.put(nd.z0.C8, 3);
        sparseIntArray.put(nd.z0.request_num_text_view, 4);
        sparseIntArray.put(nd.z0.exceed_text_view, 5);
        sparseIntArray.put(nd.z0.triangle_top_view, 6);
        sparseIntArray.put(nd.z0.triangle_top_inner_view, 7);
    }

    public nn(androidx.databinding.e eVar, View view) {
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
            this.J = 2L;
        }
        H();
    }

    public nn(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (View) objArr[1], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4], (TriangleView) objArr[7], (TriangleView) objArr[6]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
