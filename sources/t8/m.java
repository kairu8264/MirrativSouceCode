package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MissionTopIconView;
import com.dena.mirrorman.customview.UrgeUsersView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class m extends ViewDataBinding {
    public final AppBarLayout B;
    public final FrameLayout C;
    public final MissionTopIconView D;
    public final View E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final Toolbar K;
    public final UrgeUsersView L;

    public m(Object obj, View view, int i10, AppBarLayout appBarLayout, FrameLayout frameLayout, MissionTopIconView missionTopIconView, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, Toolbar toolbar, UrgeUsersView urgeUsersView) {
        super(obj, view, i10);
        this.B = appBarLayout;
        this.C = frameLayout;
        this.D = missionTopIconView;
        this.E = view2;
        this.F = constraintLayout;
        this.G = appCompatImageView;
        this.H = appCompatImageView2;
        this.I = appCompatImageView3;
        this.J = appCompatTextView;
        this.K = toolbar;
        this.L = urgeUsersView;
    }

    public static m T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static m U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m) ViewDataBinding.x(layoutInflater, r8.f1.fragment_follow_catalog, viewGroup, z10, obj);
    }
}
