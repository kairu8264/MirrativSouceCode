package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class y2 extends x2 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.center_guide_line, 1);
        sparseIntArray.put(nd.z0.f42368y1, 2);
        sparseIntArray.put(nd.z0.gift_card_image_view, 3);
        sparseIntArray.put(nd.z0.mirrabit, 4);
        sparseIntArray.put(nd.z0.top_star, 5);
        sparseIntArray.put(nd.z0.description_text, 6);
        sparseIntArray.put(nd.z0.warning_description, 7);
        sparseIntArray.put(nd.z0.bottom_text_view, 8);
    }

    public y2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public y2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[8], (Guideline) objArr[1], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[7]);
        this.K = -1L;
        this.H.setTag(null);
        N(view);
        y();
    }
}
