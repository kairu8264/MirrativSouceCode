package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class f4 extends e4 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.f42283f8, 1);
        sparseIntArray.put(nd.z0.Ue, 2);
        sparseIntArray.put(nd.z0.f42361w3, 3);
        sparseIntArray.put(nd.z0.annotation_text_view_1, 4);
        sparseIntArray.put(nd.z0.annotation_text_view_2, 5);
        sparseIntArray.put(nd.z0.settings_button, 6);
        sparseIntArray.put(nd.z0.Y0, 7);
        sparseIntArray.put(nd.z0.Hd, 8);
        sparseIntArray.put(nd.z0.S, 9);
    }

    public f4(androidx.databinding.e eVar, View view) {
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

    public f4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[9], (AppCompatButton) objArr[7], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[1], (AppCompatButton) objArr[6], (Space) objArr[8], (AppCompatTextView) objArr[2]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
