package pc;

import android.view.View;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class m3 extends ViewDataBinding {
    public final LottieAnimationView B;
    public final ConstraintLayout C;
    public final ScrollView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final AppCompatButton G;
    public final Space H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final LinearLayoutCompat L;
    public final AppCompatImageView M;

    public m3(Object obj, View view, int i10, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, ScrollView scrollView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatButton appCompatButton, Space space, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView4) {
        super(obj, view, i10);
        this.B = lottieAnimationView;
        this.C = constraintLayout;
        this.D = scrollView;
        this.E = appCompatImageView;
        this.F = appCompatImageView2;
        this.G = appCompatButton;
        this.H = space;
        this.I = appCompatImageView3;
        this.J = appCompatTextView;
        this.K = appCompatTextView2;
        this.L = linearLayoutCompat;
        this.M = appCompatImageView4;
    }
}
