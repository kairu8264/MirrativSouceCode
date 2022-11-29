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
public abstract class g1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final CardView C;
    public final Space D;
    public final ConstraintLayout E;
    public final LottieAnimationView F;
    public final MultipleUserView G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final AppCompatImageView J;
    public final LiveBadgeView K;
    public final AppCompatImageView L;
    public final AppCompatTextView M;
    public v8.l N;

    public g1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, CardView cardView, Space space, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MultipleUserView multipleUserView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, LiveBadgeView liveBadgeView, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = cardView;
        this.D = space;
        this.E = constraintLayout;
        this.F = lottieAnimationView;
        this.G = multipleUserView;
        this.H = appCompatImageView2;
        this.I = appCompatTextView;
        this.J = appCompatImageView3;
        this.K = liveBadgeView;
        this.L = appCompatImageView4;
        this.M = appCompatTextView2;
    }

    public abstract void T(v8.l lVar);
}
