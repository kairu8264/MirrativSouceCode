package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.FeverTitleAnimationView;
import com.dena.mirrorman.customview.GaugeView;

/* loaded from: classes2.dex */
public abstract class ka extends ViewDataBinding {
    public final Space B;
    public final AppCompatTextView C;
    public final LottieAnimationView D;
    public final LottieAnimationView E;
    public final View F;
    public final GaugeView G;
    public final FeverTitleAnimationView H;
    public final LottieAnimationView I;
    public final Space J;
    public final BorderedTextView K;
    public final RecyclerView L;

    public ka(Object obj, View view, int i10, Space space, AppCompatTextView appCompatTextView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, View view2, GaugeView gaugeView, FeverTitleAnimationView feverTitleAnimationView, LottieAnimationView lottieAnimationView3, Space space2, BorderedTextView borderedTextView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = space;
        this.C = appCompatTextView;
        this.D = lottieAnimationView;
        this.E = lottieAnimationView2;
        this.F = view2;
        this.G = gaugeView;
        this.H = feverTitleAnimationView;
        this.I = lottieAnimationView3;
        this.J = space2;
        this.K = borderedTextView;
        this.L = recyclerView;
    }
}
