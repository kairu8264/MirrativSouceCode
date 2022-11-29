package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrorman.customview.TriangleView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public abstract class a extends ViewDataBinding {
    public final AppBarLayout B;
    public final View C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final MirraClassSeasonRatingCardView G;
    public final Space H;
    public final MaterialCardView I;
    public final TriangleView J;
    public final AppCompatTextView K;
    public final Group L;
    public final TabLayout M;
    public final AppCompatTextView N;
    public final Toolbar O;
    public final ViewPager P;

    public a(Object obj, View view, int i10, AppBarLayout appBarLayout, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView, Space space, MaterialCardView materialCardView, TriangleView triangleView, AppCompatTextView appCompatTextView, Group group, TabLayout tabLayout, AppCompatTextView appCompatTextView2, Toolbar toolbar, ViewPager viewPager) {
        super(obj, view, i10);
        this.B = appBarLayout;
        this.C = view2;
        this.D = constraintLayout;
        this.E = appCompatImageView;
        this.F = appCompatImageView2;
        this.G = mirraClassSeasonRatingCardView;
        this.H = space;
        this.I = materialCardView;
        this.J = triangleView;
        this.K = appCompatTextView;
        this.L = group;
        this.M = tabLayout;
        this.N = appCompatTextView2;
        this.O = toolbar;
        this.P = viewPager;
    }

    public static a T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static a U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a) ViewDataBinding.x(layoutInflater, qa.p.fragment_notice, viewGroup, z10, obj);
    }
}
