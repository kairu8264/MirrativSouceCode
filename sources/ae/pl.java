package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class pl extends ol {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final RelativeLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(nd.z0.O2, 1);
        sparseIntArray.put(nd.z0.G9, 2);
        sparseIntArray.put(nd.z0.J9, 3);
        sparseIntArray.put(nd.z0.I9, 4);
        sparseIntArray.put(nd.z0.F9, 5);
        sparseIntArray.put(nd.z0.H9, 6);
        sparseIntArray.put(nd.z0.F3, 7);
        sparseIntArray.put(nd.z0.K9, 8);
        sparseIntArray.put(nd.z0.N9, 9);
        sparseIntArray.put(nd.z0.M9, 10);
        sparseIntArray.put(nd.z0.L9, 11);
        sparseIntArray.put(nd.z0.G3, 12);
        sparseIntArray.put(nd.z0.f42346t9, 13);
        sparseIntArray.put(nd.z0.f42355v9, 14);
        sparseIntArray.put(nd.z0.f42353u9, 15);
        sparseIntArray.put(nd.z0.Bf, 16);
    }

    public pl(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.S = 1L;
        }
        H();
    }

    public pl(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[1], (View) objArr[7], (View) objArr[12], (ConstraintLayout) objArr[13], (AppCompatImageView) objArr[15], (AppCompatTextView) objArr[14], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[2], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[8], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[9], (AppCompatImageView) objArr[16]);
        this.S = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.R = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
