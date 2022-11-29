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
public class v3 extends u3 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.f42337rd, 1);
        sparseIntArray.put(nd.z0.f42283f8, 2);
        sparseIntArray.put(nd.z0.Ue, 3);
        sparseIntArray.put(nd.z0.received_text_view, 4);
        sparseIntArray.put(nd.z0.position_image_view, 5);
        sparseIntArray.put(nd.z0.R9, 6);
        sparseIntArray.put(nd.z0.f42365x1, 7);
        sparseIntArray.put(nd.z0.Hd, 8);
        sparseIntArray.put(nd.z0.L6, 9);
    }

    public v3(androidx.databinding.e eVar, View view) {
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

    public v3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[9], (ConstraintLayout) objArr[2], (AppCompatButton) objArr[6], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[1], (Space) objArr[8], (AppCompatTextView) objArr[3]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
