package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class l4 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final LottieAnimationView D;
    public final AppCompatImageView E;
    public final LottieAnimationView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final LottieAnimationView I;
    public final LottieAnimationView J;
    public final ConstraintLayout K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final AppCompatImageView N;
    public final AppCompatImageView O;
    public final LinearLayoutCompat P;
    public final ConstraintLayout Q;
    public final AppCompatImageView R;
    public final AppCompatTextView S;
    public final AppCompatTextView T;
    public final LottieAnimationView U;

    public l4(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView3, LottieAnimationView lottieAnimationView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView4, LottieAnimationView lottieAnimationView3, LottieAnimationView lottieAnimationView4, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView7, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, LottieAnimationView lottieAnimationView5) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = lottieAnimationView;
        this.E = appCompatImageView3;
        this.F = lottieAnimationView2;
        this.G = appCompatTextView;
        this.H = appCompatImageView4;
        this.I = lottieAnimationView3;
        this.J = lottieAnimationView4;
        this.K = constraintLayout;
        this.L = appCompatTextView2;
        this.M = appCompatTextView3;
        this.N = appCompatImageView5;
        this.O = appCompatImageView6;
        this.P = linearLayoutCompat;
        this.Q = constraintLayout2;
        this.R = appCompatImageView7;
        this.S = appCompatTextView4;
        this.T = appCompatTextView5;
        this.U = lottieAnimationView5;
    }

    public static l4 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static l4 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (l4) ViewDataBinding.x(layoutInflater, xb.p.view_broadcast_result_picture, viewGroup, z10, obj);
    }
}
