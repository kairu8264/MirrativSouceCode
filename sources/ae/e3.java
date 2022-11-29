package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView;

/* loaded from: classes2.dex */
public class e3 extends d3 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.f42274d8, 1);
        sparseIntArray.put(nd.z0.f42362w5, 2);
        sparseIntArray.put(nd.z0.open_animation_view, 3);
    }

    public e3(androidx.databinding.e eVar, View view) {
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

    public e3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (FrameLayout) objArr[2], (LottieAnimationView) objArr[1], (GiftGachaRare4OpenAnimationView) objArr[3], (FrameLayout) objArr[0]);
        this.F = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
