package ac;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class c1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final Space H;
    public final LottieAnimationView I;
    public final LottieAnimationView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final ConstraintLayout M;
    public final AppCompatImageView N;
    public final AppCompatImageView O;
    public final ConstraintLayout P;
    public final AppCompatImageView Q;
    public final AppCompatImageView R;

    public c1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, Space space, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = appCompatImageView3;
        this.G = appCompatImageView4;
        this.H = space;
        this.I = lottieAnimationView;
        this.J = lottieAnimationView2;
        this.K = appCompatTextView3;
        this.L = appCompatTextView4;
        this.M = constraintLayout;
        this.N = appCompatImageView5;
        this.O = appCompatImageView6;
        this.P = constraintLayout2;
        this.Q = appCompatImageView7;
        this.R = appCompatImageView8;
    }

    public static c1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static c1 U(View view, Object obj) {
        return (c1) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_mutual_gift_box_result);
    }
}
