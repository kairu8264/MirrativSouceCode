package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p0 extends o0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.Ye, 1);
        sparseIntArray.put(nd.z0.f42361w3, 2);
        sparseIntArray.put(nd.z0.shutter_again_textview, 3);
        sparseIntArray.put(nd.z0.finish_shutter_button, 4);
        sparseIntArray.put(nd.z0.f42314lg, 5);
        sparseIntArray.put(nd.z0.Pa, 6);
        sparseIntArray.put(nd.z0.progress_after_shutter_emomo_container, 7);
        sparseIntArray.put(nd.z0.progress_after_shutter_emomo, 8);
    }

    public p0(androidx.databinding.e eVar, View view) {
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

    public p0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[2], (AppCompatButton) objArr[4], (AppCompatImageView) objArr[6], (ProgressBar) objArr[8], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[1], (View) objArr[5]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
