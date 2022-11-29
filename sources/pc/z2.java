package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z2 extends y2 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final FrameLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(nc.e.step_container, 1);
        sparseIntArray.put(nc.e.triangle_step_1, 2);
        sparseIntArray.put(nc.e.step_1_not_select_circle, 3);
        sparseIntArray.put(nc.e.step_1_select_circle, 4);
        sparseIntArray.put(nc.e.step_1_check_box_background, 5);
        sparseIntArray.put(nc.e.step_1_check_box, 6);
        sparseIntArray.put(nc.e.step_1_text, 7);
        sparseIntArray.put(nc.e.step_1_terms_text, 8);
        sparseIntArray.put(nc.e.M1, 9);
        sparseIntArray.put(nc.e.triangle_step_2, 10);
        sparseIntArray.put(nc.e.step_2_not_select_circle, 11);
        sparseIntArray.put(nc.e.step_2_select_circle, 12);
        sparseIntArray.put(nc.e.step_2_check_box_background, 13);
        sparseIntArray.put(nc.e.step_2_check_box, 14);
        sparseIntArray.put(nc.e.step_2_text, 15);
        sparseIntArray.put(nc.e.step_2_terms_text, 16);
    }

    public z2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.S = 1L;
        }
        H();
    }

    public z2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[9], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[14], (AppCompatImageView) objArr[13], (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[15], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[10]);
        this.S = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.R = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
