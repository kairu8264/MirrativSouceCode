package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public abstract class x2 extends ViewDataBinding {
    public final AppBarLayout B;
    public final View C;
    public final CollapsingToolbarLayout D;
    public final CoordinatorLayout E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final AppCompatImageView I;
    public final Toolbar J;
    public final ProgressBar K;
    public final ConstraintLayout L;
    public final View M;
    public final PagerSlidingTab N;
    public final LoopTickerMessageView O;
    public final SafeViewPager P;

    public x2(Object obj, View view, int i10, AppBarLayout appBarLayout, View view2, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, Toolbar toolbar, ProgressBar progressBar, ConstraintLayout constraintLayout, View view3, PagerSlidingTab pagerSlidingTab, LoopTickerMessageView loopTickerMessageView, SafeViewPager safeViewPager) {
        super(obj, view, i10);
        this.B = appBarLayout;
        this.C = view2;
        this.D = collapsingToolbarLayout;
        this.E = coordinatorLayout;
        this.F = appCompatTextView;
        this.G = appCompatImageView;
        this.H = appCompatImageView2;
        this.I = appCompatImageView3;
        this.J = toolbar;
        this.K = progressBar;
        this.L = constraintLayout;
        this.M = view3;
        this.N = pagerSlidingTab;
        this.O = loopTickerMessageView;
        this.P = safeViewPager;
    }

    public static x2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static x2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (x2) ViewDataBinding.x(layoutInflater, xb.p.fragment_emokara_song_choice, viewGroup, z10, obj);
    }
}
