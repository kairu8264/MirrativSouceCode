package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public class rn extends qn {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.condition_icon_image_view, 1);
        sparseIntArray.put(nd.z0.condition_title_text_view, 2);
        sparseIntArray.put(nd.z0.condition_progress_bar, 3);
        sparseIntArray.put(nd.z0.condition_current_text_view, 4);
        sparseIntArray.put(nd.z0.condition_current_max_text_view, 5);
        sparseIntArray.put(nd.z0.condition_text_view, 6);
    }

    public rn(androidx.databinding.e eVar, View view) {
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

    public rn(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (OutlineTextView) objArr[5], (OutlineTextView) objArr[4], (AppCompatImageView) objArr[1], (ProgressBar) objArr[3], (OutlineTextView) objArr[6], (AppCompatTextView) objArr[2]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
