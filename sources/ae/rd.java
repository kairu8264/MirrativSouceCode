package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class rd extends qd {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.La, 1);
        sparseIntArray.put(nd.z0.M, 2);
        sparseIntArray.put(nd.z0.f42270bg, 3);
        sparseIntArray.put(nd.z0.message_container, 4);
        sparseIntArray.put(nd.z0.f42363w8, 5);
        sparseIntArray.put(nd.z0.notes_image, 6);
    }

    public rd(androidx.databinding.e eVar, View view) {
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

    public rd(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[5], (FrameLayout) objArr[4], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3]);
        this.I = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
