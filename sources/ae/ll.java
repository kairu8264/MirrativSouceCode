package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.live.LiveTutorialSpotlightView;

/* loaded from: classes2.dex */
public class ll extends kl {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.spotlight_view, 1);
        sparseIntArray.put(nd.z0.spotlight_clickable_view, 2);
        sparseIntArray.put(nd.z0.title_view, 3);
        sparseIntArray.put(nd.z0.arrow_image_view, 4);
        sparseIntArray.put(nd.z0.emomo_image_view, 5);
        sparseIntArray.put(nd.z0.emomo_text_view, 6);
        sparseIntArray.put(nd.z0.after_text_view, 7);
    }

    public ll(androidx.databinding.e eVar, View view) {
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

    public ll(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (View) objArr[2], (LiveTutorialSpotlightView) objArr[1], (ConstraintLayout) objArr[3]);
        this.J = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
