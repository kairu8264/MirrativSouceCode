package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public class b0 extends a0 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(q9.g.linear_layout_emomo_dress_up_complete, 1);
        sparseIntArray.put(q9.g.title_textview_emomo_dress_up_complete, 2);
        sparseIntArray.put(q9.g.description_textview_emomo_dress_up_complete, 3);
        sparseIntArray.put(q9.g.move_pose_select_button, 4);
    }

    public b0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public b0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[3], (LinearLayout) objArr[1], (RoundedButtonView) objArr[4], (AppCompatTextView) objArr[2]);
        this.G = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
