package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class pk extends ok {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.f42302jd, 1);
        sparseIntArray.put(nd.z0.P, 2);
        sparseIntArray.put(nd.z0.f42316m0, 3);
        sparseIntArray.put(nd.z0.L, 4);
        sparseIntArray.put(nd.z0.request_num_text_view, 5);
        sparseIntArray.put(nd.z0.arrow_image_view, 6);
        sparseIntArray.put(nd.z0.exceed_text_view, 7);
        sparseIntArray.put(nd.z0.triangle_top_view, 8);
        sparseIntArray.put(nd.z0.triangle_top_inner_view, 9);
        sparseIntArray.put(nd.z0.more_image_view, 10);
        sparseIntArray.put(nd.z0.f42366xb, 11);
    }

    public pk(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 1L;
        }
        H();
    }

    public pk(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[6], (View) objArr[4], (ConstraintLayout) objArr[2], (View) objArr[3], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[10], (RecyclerView) objArr[11], (AppCompatTextView) objArr[5], (View) objArr[1], (TriangleView) objArr[9], (TriangleView) objArr[8]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
