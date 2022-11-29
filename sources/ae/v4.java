package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class v4 extends u4 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.C3, 1);
        sparseIntArray.put(nd.z0.Ue, 2);
        sparseIntArray.put(nd.z0.description_1_text_view, 3);
        sparseIntArray.put(nd.z0.description_2_text_view, 4);
        sparseIntArray.put(nd.z0.ok_button_view, 5);
        sparseIntArray.put(nd.z0.logo_anchor_space, 6);
        sparseIntArray.put(nd.z0.Y7, 7);
    }

    public v4(androidx.databinding.e eVar, View view) {
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

    public v4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[1], (Space) objArr[6], (AppCompatImageView) objArr[7], (RoundedButtonView) objArr[5], (AppCompatTextView) objArr[2]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
