package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class tk extends sk {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.f42302jd, 1);
        sparseIntArray.put(nd.z0.f42316m0, 2);
        sparseIntArray.put(nd.z0.L, 3);
        sparseIntArray.put(nd.z0.Ue, 4);
        sparseIntArray.put(nd.z0.U2, 5);
        sparseIntArray.put(nd.z0.count_suffix_text_view, 6);
        sparseIntArray.put(nd.z0.triangle_bottom_view, 7);
        sparseIntArray.put(nd.z0.triangle_bottom_inner_view, 8);
    }

    public tk(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public tk(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[3], (View) objArr[2], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5], (View) objArr[1], (AppCompatTextView) objArr[4], (TriangleView) objArr[8], (TriangleView) objArr[7]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
