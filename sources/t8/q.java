package t8;

import ae.w7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.catalog.home.app.AppsView;
import com.dena.mirrorman.customview.MissionTopIconView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class q extends ViewDataBinding {
    public final AppBarLayout B;
    public final w7 C;
    public final AppsView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final LinearLayout I;
    public final FrameLayout J;
    public final MissionTopIconView K;
    public final View L;
    public final ConstraintLayout M;
    public final AppCompatImageView N;
    public final AppCompatImageView O;
    public final AppCompatImageView P;
    public final AppCompatTextView Q;
    public final Toolbar R;

    public q(Object obj, View view, int i10, AppBarLayout appBarLayout, w7 w7Var, AppsView appsView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, LinearLayout linearLayout, FrameLayout frameLayout, MissionTopIconView missionTopIconView, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView3, Toolbar toolbar) {
        super(obj, view, i10);
        this.B = appBarLayout;
        this.C = w7Var;
        this.D = appsView;
        this.E = appCompatImageView;
        this.F = appCompatTextView;
        this.G = appCompatImageView2;
        this.H = appCompatTextView2;
        this.I = linearLayout;
        this.J = frameLayout;
        this.K = missionTopIconView;
        this.L = view2;
        this.M = constraintLayout;
        this.N = appCompatImageView3;
        this.O = appCompatImageView4;
        this.P = appCompatImageView5;
        this.Q = appCompatTextView3;
        this.R = toolbar;
    }

    public static q T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static q U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q) ViewDataBinding.x(layoutInflater, r8.f1.fragment_home_catalog, viewGroup, z10, obj);
    }
}
