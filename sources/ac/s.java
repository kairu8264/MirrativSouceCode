package ac;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class s extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final Space D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final LottieAnimationView G;
    public final AppCompatImageView H;
    public final View I;
    public final AppCompatImageView J;
    public final LinearLayout K;
    public final ConstraintLayout L;
    public final LinearLayout M;
    public final LottieAnimationView N;
    public yb.a O;

    public s(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, Space space, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView2, View view2, AppCompatImageView appCompatImageView3, LinearLayout linearLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, LottieAnimationView lottieAnimationView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = space;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = lottieAnimationView;
        this.H = appCompatImageView2;
        this.I = view2;
        this.J = appCompatImageView3;
        this.K = linearLayout;
        this.L = constraintLayout2;
        this.M = linearLayout2;
        this.N = lottieAnimationView2;
    }

    public static s T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static s U(View view, Object obj) {
        return (s) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_became_cheerleader);
    }

    public abstract void V(yb.a aVar);
}
