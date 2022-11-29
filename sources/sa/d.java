package sa;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class d extends c {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final CoordinatorLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(qa.o.recommend_button, 1);
        sparseIntArray.put(qa.o.recommend_button_badge, 2);
        sparseIntArray.put(qa.o.emomo_button, 3);
        sparseIntArray.put(qa.o.emomo_button_badge, 4);
        sparseIntArray.put(qa.o.app_button, 5);
        sparseIntArray.put(qa.o.app_button_badge, 6);
        sparseIntArray.put(qa.o.f48877f, 7);
    }

    public d(androidx.databinding.e eVar, View view) {
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

    public d(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RoundedButtonView) objArr[5], (View) objArr[6], (FrameLayout) objArr[7], (RoundedButtonView) objArr[3], (View) objArr[4], (RoundedButtonView) objArr[1], (View) objArr[2]);
        this.J = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.I = coordinatorLayout;
        coordinatorLayout.setTag(null);
        N(view);
        y();
    }
}
