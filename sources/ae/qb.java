package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class qb extends ViewDataBinding {
    public final Space B;
    public final AppCompatImageView C;
    public final LottieAnimationView D;
    public final View E;
    public final AppCompatImageView F;
    public String G;

    public qb(Object obj, View view, int i10, Space space, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, View view2, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = space;
        this.C = appCompatImageView;
        this.D = lottieAnimationView;
        this.E = view2;
        this.F = appCompatImageView2;
    }

    public abstract void T(String str);
}
