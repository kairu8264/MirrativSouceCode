package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.LoopTickerMessageView;
import com.dena.mirrorman.widget.PagerSlidingTab;
import com.dena.mirrorman.widget.SafeViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public class y2 extends x2 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(xb.o.Z1, 1);
        sparseIntArray.put(xb.o.f60001l, 2);
        sparseIntArray.put(xb.o.I1, 3);
        sparseIntArray.put(xb.o.f59979f4, 4);
        sparseIntArray.put(xb.o.header_title_image_view, 5);
        sparseIntArray.put(xb.o.header_provider_image_view, 6);
        sparseIntArray.put(xb.o.karaoke_list_toolber, 7);
        sparseIntArray.put(xb.o.emokara_list_title, 8);
        sparseIntArray.put(xb.o.sliding_tab, 9);
        sparseIntArray.put(xb.o.stage_gift_loop_ticker_message_view, 10);
        sparseIntArray.put(xb.o.f60015na, 11);
        sparseIntArray.put(xb.o.S7, 12);
        sparseIntArray.put(xb.o.f60006m1, 13);
        sparseIntArray.put(xb.o.f59999k7, 14);
        sparseIntArray.put(xb.o.f59995j7, 15);
    }

    public y2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 1L;
        }
        H();
    }

    public y2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[2], (View) objArr[13], (CollapsingToolbarLayout) objArr[3], (CoordinatorLayout) objArr[1], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (Toolbar) objArr[7], (ProgressBar) objArr[15], (ConstraintLayout) objArr[14], (View) objArr[12], (PagerSlidingTab) objArr[9], (LoopTickerMessageView) objArr[10], (SafeViewPager) objArr[11]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
