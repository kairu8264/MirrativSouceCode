package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class q6 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final LottieAnimationView F;
    public final AppCompatImageView G;
    public final ConstraintLayout H;
    public final LottieAnimationView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;

    public q6(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView4, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView2, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = appCompatImageView3;
        this.F = lottieAnimationView;
        this.G = appCompatImageView4;
        this.H = constraintLayout2;
        this.I = lottieAnimationView2;
        this.J = appCompatImageView5;
        this.K = appCompatTextView;
    }

    public static q6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static q6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q6) ViewDataBinding.x(layoutInflater, nd.b1.fragment_giftbox_gacha_preview, viewGroup, z10, obj);
    }
}
