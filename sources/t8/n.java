package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MissionTopIconView;
import com.dena.mirrorman.customview.UrgeUsersView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class n extends m {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final CoordinatorLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(r8.e1.f49863f, 1);
        sparseIntArray.put(r8.e1.R2, 2);
        sparseIntArray.put(r8.e1.P2, 3);
        sparseIntArray.put(r8.e1.mission_top_icon_view, 4);
        sparseIntArray.put(r8.e1.offer_wall_image_view, 5);
        sparseIntArray.put(r8.e1.search_image_view, 6);
        sparseIntArray.put(r8.e1.f49881q1, 7);
        sparseIntArray.put(r8.e1.f49882r1, 8);
        sparseIntArray.put(r8.e1.f49880p1, 9);
        sparseIntArray.put(r8.e1.f49879p0, 10);
        sparseIntArray.put(r8.e1.urge_users_view, 11);
    }

    public n(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 1L;
        }
        H();
    }

    public n(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[1], (FrameLayout) objArr[10], (MissionTopIconView) objArr[4], (View) objArr[9], (ConstraintLayout) objArr[7], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[3], (Toolbar) objArr[2], (UrgeUsersView) objArr[11]);
        this.N = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.M = coordinatorLayout;
        coordinatorLayout.setTag(null);
        N(view);
        y();
    }
}
