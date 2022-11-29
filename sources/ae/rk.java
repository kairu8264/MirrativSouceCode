package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class rk extends qk {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.lottie_animation_container, 1);
        sparseIntArray.put(nd.z0.f42302jd, 2);
        sparseIntArray.put(nd.z0.f42290gf, 3);
        sparseIntArray.put(nd.z0.f42327p0, 4);
        sparseIntArray.put(nd.z0.start_anchor_space, 5);
        sparseIntArray.put(nd.z0.end_anchor_space, 6);
        sparseIntArray.put(nd.z0.clap_image_view, 7);
    }

    public rk(androidx.databinding.e eVar, View view) {
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

    public rk(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Space) objArr[4], (AppCompatImageView) objArr[7], (ConstraintLayout) objArr[0], (Space) objArr[6], (FrameLayout) objArr[1], (View) objArr[2], (Space) objArr[5], (Space) objArr[3]);
        this.J = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
