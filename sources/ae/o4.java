package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class o4 extends ViewDataBinding {
    public final LottieAnimationView B;

    public o4(Object obj, View view, int i10, LottieAnimationView lottieAnimationView) {
        super(obj, view, i10);
        this.B = lottieAnimationView;
    }

    public static o4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static o4 U(View view, Object obj) {
        return (o4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_loading);
    }
}
