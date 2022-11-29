package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class y1 extends x1 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 1);
        sparseIntArray.put(nd.z0.collab_live_image_view, 2);
        sparseIntArray.put(nd.z0.collab_live_text_view, 3);
        sparseIntArray.put(nd.z0.F1, 4);
        sparseIntArray.put(nd.z0.collab_call_text_view, 5);
        sparseIntArray.put(nd.z0.f42370y6, 6);
        sparseIntArray.put(nd.z0.A1, 7);
    }

    public y1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 1L;
        }
        H();
    }

    public y1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[7], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[1]);
        this.J = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
