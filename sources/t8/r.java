package t8;

import ae.w7;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.catalog.home.app.AppsView;
import com.dena.mirrorman.customview.MissionTopIconView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class r extends q {
    public static final ViewDataBinding.i U;
    public static final SparseIntArray V;
    public final CoordinatorLayout S;
    public long T;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(18);
        U = iVar;
        iVar.a(0, new String[]{"listview_empty_view"}, new int[]{1}, new int[]{nd.b1.listview_empty_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(r8.e1.f49863f, 2);
        sparseIntArray.put(r8.e1.floatingAppsView, 3);
        sparseIntArray.put(r8.e1.R2, 4);
        sparseIntArray.put(r8.e1.P2, 5);
        sparseIntArray.put(r8.e1.mission_top_icon_view, 6);
        sparseIntArray.put(r8.e1.offer_wall_image_view, 7);
        sparseIntArray.put(r8.e1.search_image_view, 8);
        sparseIntArray.put(r8.e1.f49881q1, 9);
        sparseIntArray.put(r8.e1.f49882r1, 10);
        sparseIntArray.put(r8.e1.f49880p1, 11);
        sparseIntArray.put(r8.e1.f49879p0, 12);
        sparseIntArray.put(r8.e1.footerBannerView, 13);
        sparseIntArray.put(r8.e1.footerBannerImageView, 14);
        sparseIntArray.put(r8.e1.footerBannerTitleTextView, 15);
        sparseIntArray.put(r8.e1.footerBannerDescriptionTextView, 16);
        sparseIntArray.put(r8.e1.footerBannerButton, 17);
    }

    public r(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, U, V));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return V((w7) obj, i11);
    }

    public final boolean V(w7 w7Var, int i10) {
        if (i10 == r8.a.f49826a) {
            synchronized (this) {
                this.T |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.T = 0L;
        }
        ViewDataBinding.n(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.T != 0) {
                return true;
            }
            return this.C.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.T = 2L;
        }
        this.C.y();
        H();
    }

    public r(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppBarLayout) objArr[2], (w7) objArr[1], (AppsView) objArr[3], (AppCompatImageView) objArr[17], (AppCompatTextView) objArr[16], (AppCompatImageView) objArr[14], (AppCompatTextView) objArr[15], (LinearLayout) objArr[13], (FrameLayout) objArr[12], (MissionTopIconView) objArr[6], (View) objArr[11], (ConstraintLayout) objArr[9], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[5], (Toolbar) objArr[4]);
        this.T = -1L;
        L(this.C);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.S = coordinatorLayout;
        coordinatorLayout.setTag(null);
        N(view);
        y();
    }
}
