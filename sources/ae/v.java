package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup;
import com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView;
import com.dena.mirrorman.customview.MRBottomNavigationView;

/* loaded from: classes2.dex */
public class v extends u {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.tutorial_dashboard, 1);
        sparseIntArray.put(nd.z0.cover, 2);
        sparseIntArray.put(nd.z0.cover_tutorial_text, 3);
        sparseIntArray.put(nd.z0.cover_tutorial_arrow, 4);
        sparseIntArray.put(nd.z0.cover_tutorial_mascot, 5);
        sparseIntArray.put(nd.z0.request_num_live_prepare_balloon_view, 6);
        sparseIntArray.put(nd.z0.encourage_live_popup_live_prepare_balloon_view, 7);
        sparseIntArray.put(nd.z0.bottom_tab_height_space, 8);
        sparseIntArray.put(nd.z0.bottom_navigation_view, 9);
    }

    public v(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public v(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (MRBottomNavigationView) objArr[9], (Space) objArr[8], (View) objArr[2], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[3], (LivePrepareBalloonEncourageLivePopup) objArr[7], (LivePrepareBalloonLiveRequestNumView) objArr[6], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1]);
        this.L = -1L;
        this.J.setTag(null);
        N(view);
        y();
    }
}
