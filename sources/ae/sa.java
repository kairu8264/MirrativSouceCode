package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class sa extends ViewDataBinding {
    public final View B;
    public final LottieAnimationView C;

    public sa(Object obj, View view, int i10, View view2, LottieAnimationView lottieAnimationView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = lottieAnimationView;
    }
}
