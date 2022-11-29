package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class s4 extends ViewDataBinding {
    public final View B;
    public final Space C;
    public final LottieAnimationView D;
    public final LottieAnimationView E;
    public final Space F;
    public final AppCompatTextView G;
    public final Space H;

    public s4(Object obj, View view, int i10, View view2, Space space, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, Space space2, AppCompatTextView appCompatTextView, Space space3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = space;
        this.D = lottieAnimationView;
        this.E = lottieAnimationView2;
        this.F = space2;
        this.G = appCompatTextView;
        this.H = space3;
    }

    public static s4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static s4 U(View view, Object obj) {
        return (s4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_matching);
    }
}
