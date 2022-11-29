package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class p8 extends o8 {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(nd.z0.f42302jd, 1);
        sparseIntArray.put(nd.z0.f42316m0, 2);
        sparseIntArray.put(nd.z0.L, 3);
        sparseIntArray.put(nd.z0.f42358ve, 4);
        sparseIntArray.put(nd.z0.triangle_left_view, 5);
        sparseIntArray.put(nd.z0.f42332qf, 6);
        sparseIntArray.put(nd.z0.triangle_top_view, 7);
        sparseIntArray.put(nd.z0.triangle_top_inner_view, 8);
        sparseIntArray.put(nd.z0.triangle_right_view, 9);
        sparseIntArray.put(nd.z0.triangle_right_inner_view, 10);
        sparseIntArray.put(nd.z0.triangle_bottom_view, 11);
        sparseIntArray.put(nd.z0.triangle_bottom_inner_view, 12);
        sparseIntArray.put(nd.z0.triangle_right_top_view, 13);
        sparseIntArray.put(nd.z0.triangle_right_top_inner_view, 14);
        sparseIntArray.put(nd.z0.triangle_left_top_view, 15);
        sparseIntArray.put(nd.z0.triangle_left_top_inner_view, 16);
        sparseIntArray.put(nd.z0.balloon_image_view, 17);
    }

    public p8(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, U, V));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.T != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.T = 1L;
        }
        H();
    }

    public p8(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[3], (AppCompatImageView) objArr[17], (View) objArr[2], (View) objArr[1], (AppCompatTextView) objArr[4], (TriangleView) objArr[12], (TriangleView) objArr[11], (TriangleView) objArr[6], (TriangleView) objArr[16], (TriangleView) objArr[15], (TriangleView) objArr[5], (TriangleView) objArr[10], (TriangleView) objArr[14], (TriangleView) objArr[13], (TriangleView) objArr[9], (TriangleView) objArr[8], (TriangleView) objArr[7]);
        this.T = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
