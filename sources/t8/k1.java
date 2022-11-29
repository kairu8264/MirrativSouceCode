package t8;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public abstract class k1 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final CardView D;
    public final Space E;
    public final ConstraintLayout F;
    public final LottieAnimationView G;
    public final MultipleUserView H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final AppCompatImageView K;
    public final LiveBadgeView L;
    public final AppCompatImageView M;
    public final AppCompatTextView N;
    public v8.l O;

    public k1(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, CardView cardView, Space space, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MultipleUserView multipleUserView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, LiveBadgeView liveBadgeView, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = cardView;
        this.E = space;
        this.F = constraintLayout;
        this.G = lottieAnimationView;
        this.H = multipleUserView;
        this.I = appCompatImageView2;
        this.J = appCompatTextView;
        this.K = appCompatImageView3;
        this.L = liveBadgeView;
        this.M = appCompatImageView4;
        this.N = appCompatTextView2;
    }

    public abstract void T(v8.l lVar);
}
