package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public class n0 extends m0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.La, 1);
        sparseIntArray.put(nd.z0.M, 2);
        sparseIntArray.put(nd.z0.moderator_badge_image_view, 3);
        sparseIntArray.put(nd.z0.f42270bg, 4);
        sparseIntArray.put(nd.z0.f42363w8, 5);
    }

    public n0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 1L;
        }
        H();
    }

    public n0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[0], (AutoLinkTextView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[4]);
        this.H = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
