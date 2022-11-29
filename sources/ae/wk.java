package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class wk extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final LottieAnimationView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;

    public wk(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = lottieAnimationView;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
    }
}
