package t8;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class c extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final LottieAnimationView D;
    public final MultipleUserView E;
    public final AppCompatImageView F;
    public final MaterialCardView G;
    public final FrameLayout H;
    public final AppCompatTextView I;
    public final AppCompatImageView J;
    public final Guideline K;
    public final Guideline L;
    public final LiveBadgeView M;
    public final AppCompatImageView N;
    public final AppCompatTextView O;
    public final RoundedButtonView P;
    public v8.g Q;

    public c(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MultipleUserView multipleUserView, AppCompatImageView appCompatImageView2, MaterialCardView materialCardView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, Guideline guideline, Guideline guideline2, LiveBadgeView liveBadgeView, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2, RoundedButtonView roundedButtonView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = lottieAnimationView;
        this.E = multipleUserView;
        this.F = appCompatImageView2;
        this.G = materialCardView;
        this.H = frameLayout;
        this.I = appCompatTextView;
        this.J = appCompatImageView3;
        this.K = guideline;
        this.L = guideline2;
        this.M = liveBadgeView;
        this.N = appCompatImageView4;
        this.O = appCompatTextView2;
        this.P = roundedButtonView;
    }

    public abstract void T(v8.g gVar);
}
