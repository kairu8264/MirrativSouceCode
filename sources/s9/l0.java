package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class l0 extends k0 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(q9.g.window_background, 1);
        sparseIntArray.put(q9.g.add_image, 2);
        sparseIntArray.put(q9.g.f48834j, 3);
        sparseIntArray.put(q9.g.body_image_view, 4);
        sparseIntArray.put(q9.g.active_thumb_view, 5);
        sparseIntArray.put(q9.g.touch_intercept_view, 6);
        sparseIntArray.put(q9.g.T3, 7);
        sparseIntArray.put(q9.g.edit_button, 8);
        sparseIntArray.put(q9.g.update_text_view, 9);
    }

    public l0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public l0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[5], (View) objArr[2], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (View) objArr[8], (AppCompatTextView) objArr[7], (View) objArr[6], (AppCompatTextView) objArr[9], (View) objArr[1]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
