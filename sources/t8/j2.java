package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class j2 extends i2 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(r8.e1.mission_item_view, 1);
        sparseIntArray.put(r8.e1.f49864g2, 2);
        sparseIntArray.put(r8.e1.zoom_image_view, 3);
        sparseIntArray.put(r8.e1.reward_count_text_view, 4);
        sparseIntArray.put(r8.e1.get_button, 5);
        sparseIntArray.put(r8.e1.P2, 6);
        sparseIntArray.put(r8.e1.T1, 7);
        sparseIntArray.put(r8.e1.U1, 8);
        sparseIntArray.put(r8.e1.W, 9);
        sparseIntArray.put(r8.e1.black_view, 10);
        sparseIntArray.put(r8.e1.cleared_image_view, 11);
    }

    public j2(androidx.databinding.e eVar, View view) {
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

    public j2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[10], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[9], (AppCompatButton) objArr[5], (ConstraintLayout) objArr[1], (ProgressBar) objArr[7], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[3]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
