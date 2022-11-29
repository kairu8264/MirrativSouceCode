package pc;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class c1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final AppCompatTextView G;
    public final Guideline H;
    public final Guideline I;
    public final Space J;
    public final AppCompatImageView K;
    public final Space L;
    public final AppCompatImageView M;
    public final Space N;
    public final AppCompatImageView O;
    public final Space P;
    public final AppCompatImageView Q;
    public final ConstraintLayout R;
    public final AppCompatImageView S;
    public final LottieAnimationView T;
    public final AppCompatImageView U;
    public final ConstraintLayout V;
    public final AppCompatImageView W;
    public final AppCompatTextView X;
    public final AppCompatTextView Y;
    public final Space Z;

    /* renamed from: a0  reason: collision with root package name */
    public final LottieAnimationView f46381a0;

    /* renamed from: b0  reason: collision with root package name */
    public ed.c f46382b0;

    public c1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, Guideline guideline, Guideline guideline2, Space space, AppCompatImageView appCompatImageView4, Space space2, AppCompatImageView appCompatImageView5, Space space3, AppCompatImageView appCompatImageView6, Space space4, AppCompatImageView appCompatImageView7, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView8, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView9, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView10, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, Space space5, LottieAnimationView lottieAnimationView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = appCompatImageView2;
        this.E = appCompatImageView3;
        this.F = constraintLayout;
        this.G = appCompatTextView;
        this.H = guideline;
        this.I = guideline2;
        this.J = space;
        this.K = appCompatImageView4;
        this.L = space2;
        this.M = appCompatImageView5;
        this.N = space3;
        this.O = appCompatImageView6;
        this.P = space4;
        this.Q = appCompatImageView7;
        this.R = constraintLayout2;
        this.S = appCompatImageView8;
        this.T = lottieAnimationView;
        this.U = appCompatImageView9;
        this.V = constraintLayout3;
        this.W = appCompatImageView10;
        this.X = appCompatTextView2;
        this.Y = appCompatTextView3;
        this.Z = space5;
        this.f46381a0 = lottieAnimationView2;
    }

    public static c1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static c1 U(View view, Object obj) {
        return (c1) ViewDataBinding.j(obj, view, nc.f.dialog_fragment_ranking_prize);
    }

    public abstract void V(ed.c cVar);
}
