package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class ki extends ViewDataBinding {
    public final LottieAnimationView B;
    public final View C;
    public final View D;
    public final ConstraintLayout E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;
    public final AppCompatImageView K;
    public final Space L;
    public ud.p3 M;

    public ki(Object obj, View view, int i10, LottieAnimationView lottieAnimationView, View view2, View view3, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView4, Space space) {
        super(obj, view, i10);
        this.B = lottieAnimationView;
        this.C = view2;
        this.D = view3;
        this.E = constraintLayout;
        this.F = appCompatImageView;
        this.G = appCompatImageView2;
        this.H = appCompatImageView3;
        this.I = constraintLayout2;
        this.J = appCompatTextView;
        this.K = appCompatImageView4;
        this.L = space;
    }

    public abstract void T(ud.p3 p3Var);
}
