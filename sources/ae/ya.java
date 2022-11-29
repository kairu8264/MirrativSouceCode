package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class ya extends ViewDataBinding {
    public final View B;
    public final View C;
    public final LottieAnimationView D;

    public ya(Object obj, View view, int i10, View view2, View view3, LottieAnimationView lottieAnimationView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = lottieAnimationView;
    }
}
