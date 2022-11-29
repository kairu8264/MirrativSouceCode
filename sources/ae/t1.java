package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class t1 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final LottieAnimationView D;
    public final LottieAnimationView E;

    public t1(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = lottieAnimationView;
        this.E = lottieAnimationView2;
    }

    public static t1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static t1 U(View view, Object obj) {
        return (t1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_collab_matching_waiting_dialog);
    }
}
