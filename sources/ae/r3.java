package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public abstract class r3 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final LinearLayoutCompat C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final Space I;
    public final LottieAnimationView J;
    public final ConstraintLayout K;
    public final Space L;
    public final LottieAnimationView M;
    public ud.f1 N;

    public r3(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView2, Space space, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, Space space2, LottieAnimationView lottieAnimationView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = linearLayoutCompat;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = appCompatTextView3;
        this.G = appCompatTextView4;
        this.H = appCompatImageView2;
        this.I = space;
        this.J = lottieAnimationView;
        this.K = constraintLayout;
        this.L = space2;
        this.M = lottieAnimationView2;
    }

    public static r3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static r3 U(View view, Object obj) {
        return (r3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_live_game_rank_up);
    }

    public abstract void V(ud.f1 f1Var);
}
