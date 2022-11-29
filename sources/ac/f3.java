package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class f3 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatButton C;
    public final AppCompatImageView D;
    public final LottieAnimationView E;
    public final RoundedButtonView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final ConstraintLayout J;
    public final RecyclerView K;

    public f3(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatButton;
        this.D = appCompatImageView;
        this.E = lottieAnimationView;
        this.F = roundedButtonView;
        this.G = appCompatTextView2;
        this.H = appCompatTextView3;
        this.I = appCompatImageView2;
        this.J = constraintLayout;
        this.K = recyclerView;
    }
}
