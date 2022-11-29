package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.PagerSlidingTab;
import com.dena.mirrorman.widget.SafeViewPager;

/* loaded from: classes.dex */
public class z extends y {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(r8.e1.search_toolbar, 1);
        sparseIntArray.put(r8.e1.f49873l2, 2);
        sparseIntArray.put(r8.e1.f49871k2, 3);
        sparseIntArray.put(r8.e1.f49875m2, 4);
        sparseIntArray.put(r8.e1.f49893z, 5);
        sparseIntArray.put(r8.e1.tabs, 6);
        sparseIntArray.put(r8.e1.pager, 7);
    }

    public z(androidx.databinding.e eVar, View view) {
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

    public z(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageButton) objArr[5], (SafeViewPager) objArr[7], (ImageButton) objArr[3], (RelativeLayout) objArr[2], (EditText) objArr[4], (Toolbar) objArr[1], (PagerSlidingTab) objArr[6]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
