package ac;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftRankingRankUpTargetUserView;

/* loaded from: classes2.dex */
public abstract class o0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final Space G;
    public final LottieAnimationView H;
    public final GiftRankingRankUpTargetUserView I;
    public final ConstraintLayout J;
    public final Space K;
    public final ConstraintLayout L;
    public final RecyclerView M;
    public final Space N;
    public final LottieAnimationView O;
    public ud.f1 P;

    public o0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Space space, LottieAnimationView lottieAnimationView, GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView, ConstraintLayout constraintLayout, Space space2, ConstraintLayout constraintLayout2, RecyclerView recyclerView, Space space3, LottieAnimationView lottieAnimationView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = appCompatTextView3;
        this.F = appCompatTextView4;
        this.G = space;
        this.H = lottieAnimationView;
        this.I = giftRankingRankUpTargetUserView;
        this.J = constraintLayout;
        this.K = space2;
        this.L = constraintLayout2;
        this.M = recyclerView;
        this.N = space3;
        this.O = lottieAnimationView2;
    }

    public static o0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static o0 U(View view, Object obj) {
        return (o0) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_gift_ranking_rank_up_streamer);
    }

    public abstract void V(ud.f1 f1Var);
}
