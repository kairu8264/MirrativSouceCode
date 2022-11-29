package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public abstract class o0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final Space C;
    public final ConstraintLayout D;
    public final LottieAnimationView E;
    public final MultipleUserView F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final LiveBadgeView J;
    public final AppCompatImageView K;
    public final AppCompatTextView L;
    public v8.a M;

    public o0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, Space space, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MultipleUserView multipleUserView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, LiveBadgeView liveBadgeView, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = space;
        this.D = constraintLayout;
        this.E = lottieAnimationView;
        this.F = multipleUserView;
        this.G = appCompatImageView2;
        this.H = appCompatTextView;
        this.I = appCompatImageView3;
        this.J = liveBadgeView;
        this.K = appCompatImageView4;
        this.L = appCompatTextView2;
    }

    public static o0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static o0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (o0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_group_shot, viewGroup, z10, obj);
    }

    public abstract void V(v8.a aVar);
}
