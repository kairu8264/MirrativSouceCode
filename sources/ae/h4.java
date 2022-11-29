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
public class h4 extends g4 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.f42337rd, 1);
        sparseIntArray.put(nd.z0.f42283f8, 2);
        sparseIntArray.put(nd.z0.reward_title_text_view, 3);
        sparseIntArray.put(nd.z0.reward_received_text_view, 4);
        sparseIntArray.put(nd.z0.reward_description_text_view, 5);
        sparseIntArray.put(nd.z0.R9, 6);
        sparseIntArray.put(nd.z0.Hd, 7);
        sparseIntArray.put(nd.z0.f42262ac, 8);
    }

    public h4(androidx.databinding.e eVar, View view) {
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

    public h4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[2], (AppCompatButton) objArr[6], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[1], (Space) objArr[7]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
