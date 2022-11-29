package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.GaugeView;

/* loaded from: classes2.dex */
public abstract class ma extends ViewDataBinding {
    public final GaugeView B;
    public final AppCompatImageView C;
    public final BorderedTextView D;
    public final LottieAnimationView E;
    public final View F;

    public ma(Object obj, View view, int i10, GaugeView gaugeView, AppCompatImageView appCompatImageView, BorderedTextView borderedTextView, LottieAnimationView lottieAnimationView, View view2) {
        super(obj, view, i10);
        this.B = gaugeView;
        this.C = appCompatImageView;
        this.D = borderedTextView;
        this.E = lottieAnimationView;
        this.F = view2;
    }
}
