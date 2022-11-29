package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class ad extends ViewDataBinding {
    public final AppCompatImageView B;
    public final LottieAnimationView C;
    public final View D;
    public final AppCompatImageView E;

    public ad(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, View view2, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = lottieAnimationView;
        this.D = view2;
        this.E = appCompatImageView2;
    }
}
