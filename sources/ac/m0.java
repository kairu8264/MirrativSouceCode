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
public abstract class m0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final Space C;
    public final LottieAnimationView D;
    public final GiftRankingRankUpTargetUserView E;
    public final ConstraintLayout F;
    public final Space G;
    public final ConstraintLayout H;
    public final RecyclerView I;
    public final AppCompatImageView J;
    public final AppCompatImageView K;
    public final AppCompatTextView L;
    public final Space M;
    public final LottieAnimationView N;
    public cc.n O;

    public m0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, Space space, LottieAnimationView lottieAnimationView, GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView, ConstraintLayout constraintLayout, Space space2, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, Space space3, LottieAnimationView lottieAnimationView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = space;
        this.D = lottieAnimationView;
        this.E = giftRankingRankUpTargetUserView;
        this.F = constraintLayout;
        this.G = space2;
        this.H = constraintLayout2;
        this.I = recyclerView;
        this.J = appCompatImageView2;
        this.K = appCompatImageView3;
        this.L = appCompatTextView;
        this.M = space3;
        this.N = lottieAnimationView2;
    }

    public static m0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static m0 U(View view, Object obj) {
        return (m0) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_gift_ranking_rank_up_sender);
    }

    public abstract void V(cc.n nVar);
}
