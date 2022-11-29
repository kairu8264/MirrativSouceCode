package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class v0 extends u0 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(xb.o.G9, 1);
        sparseIntArray.put(xb.o.first_viewer_image_view, 2);
        sparseIntArray.put(xb.o.first_image_delete_image_view, 3);
        sparseIntArray.put(xb.o.second_viewer_image_view, 4);
        sparseIntArray.put(xb.o.second_image_delete_image_view, 5);
        sparseIntArray.put(xb.o.third_viewer_image_view, 6);
        sparseIntArray.put(xb.o.third_image_delete_image_view, 7);
        sparseIntArray.put(xb.o.top_border_view, 8);
        sparseIntArray.put(xb.o.f60045v7, 9);
        sparseIntArray.put(xb.o.mask_view, 10);
        sparseIntArray.put(xb.o.Q8, 11);
        sparseIntArray.put(xb.o.bottom_border_view, 12);
        sparseIntArray.put(xb.o.f60006m1, 13);
    }

    public v0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 1L;
        }
        H();
    }

    public v0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[12], (AppCompatButton) objArr[13], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[2], (View) objArr[10], (RecyclerView) objArr[9], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[4], (StatusView) objArr[11], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[1], (View) objArr[8]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
