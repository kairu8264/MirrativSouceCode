package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public class h8 extends g8 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nd.z0.f42316m0, 1);
        sparseIntArray.put(nd.z0.L, 2);
        sparseIntArray.put(nd.z0.C8, 3);
        sparseIntArray.put(nd.z0.Ue, 4);
        sparseIntArray.put(nd.z0.U2, 5);
        sparseIntArray.put(nd.z0.unit_text_view, 6);
        sparseIntArray.put(nd.z0.exceed_text_view, 7);
        sparseIntArray.put(nd.z0.encourage_text_view, 8);
        sparseIntArray.put(nd.z0.triangle_top_view, 9);
        sparseIntArray.put(nd.z0.triangle_top_inner_view, 10);
    }

    public h8(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 2L;
        }
        H();
    }

    public h8(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (View) objArr[1], (OutlineTextView) objArr[5], (AppCompatTextView) objArr[8], (OutlineTextView) objArr[7], (AppCompatImageView) objArr[3], (OutlineTextView) objArr[4], (TriangleView) objArr[10], (TriangleView) objArr[9], (OutlineTextView) objArr[6]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
