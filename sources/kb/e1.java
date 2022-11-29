package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class e1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final Guideline E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final LottieAnimationView H;
    public final ConstraintLayout I;
    public final View J;
    public final ConstraintLayout K;
    public ob.c L;

    public e1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, Guideline guideline, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, View view2, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatTextView;
        this.E = guideline;
        this.F = appCompatTextView2;
        this.G = appCompatTextView3;
        this.H = lottieAnimationView;
        this.I = constraintLayout;
        this.J = view2;
        this.K = constraintLayout2;
    }

    public abstract void T(ob.c cVar);
}
