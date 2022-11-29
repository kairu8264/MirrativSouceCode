package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class cf extends ViewDataBinding {
    public final LottieAnimationView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final View E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;

    public cf(Object obj, View view, int i10, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3) {
        super(obj, view, i10);
        this.B = lottieAnimationView;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = view2;
        this.F = appCompatImageView2;
        this.G = appCompatImageView3;
    }
}
