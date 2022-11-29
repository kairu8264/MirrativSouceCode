package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.BalloonTextView;
import com.dena.mirrorman.customview.SpotlightView;

/* loaded from: classes2.dex */
public class tm extends sm {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.spotlight_view, 1);
        sparseIntArray.put(nd.z0.balloon_text_view, 2);
        sparseIntArray.put(nd.z0.f42315m, 3);
    }

    public tm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 1L;
        }
        H();
    }

    public tm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[3], (BalloonTextView) objArr[2], (ConstraintLayout) objArr[0], (SpotlightView) objArr[1]);
        this.F = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
