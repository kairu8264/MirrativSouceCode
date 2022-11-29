package e9;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;
import d9.e;

/* loaded from: classes.dex */
public abstract class a extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final LottieAnimationView D;
    public final LottieAnimationView E;
    public final Barrier F;
    public final RoundedButtonView G;
    public final AppCompatTextView H;

    public a(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, Barrier barrier, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = lottieAnimationView;
        this.E = lottieAnimationView2;
        this.F = barrier;
        this.G = roundedButtonView;
        this.H = appCompatTextView2;
    }

    public static a T(View view) {
        return U(view, f.d());
    }

    @Deprecated
    public static a U(View view, Object obj) {
        return (a) ViewDataBinding.j(obj, view, e.dialog_fragment_collab_matched_dialog);
    }
}
