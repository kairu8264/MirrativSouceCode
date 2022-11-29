package ac;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftRankingRankUpTargetUserView;

/* loaded from: classes2.dex */
public abstract class k0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final LinearLayoutCompat C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final Space I;
    public final LottieAnimationView J;
    public final GiftRankingRankUpTargetUserView K;
    public final ConstraintLayout L;
    public final Space M;
    public final ConstraintLayout N;
    public final RecyclerView O;
    public final Space P;
    public final LottieAnimationView Q;
    public ud.f1 R;

    public k0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView2, Space space, LottieAnimationView lottieAnimationView, GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView, ConstraintLayout constraintLayout, Space space2, ConstraintLayout constraintLayout2, RecyclerView recyclerView, Space space3, LottieAnimationView lottieAnimationView2) {
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
        this.K = giftRankingRankUpTargetUserView;
        this.L = constraintLayout;
        this.M = space2;
        this.N = constraintLayout2;
        this.O = recyclerView;
        this.P = space3;
        this.Q = lottieAnimationView2;
    }

    public static k0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k0 U(View view, Object obj) {
        return (k0) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_gift_app_event_ranking_rank_up);
    }

    public abstract void V(ud.f1 f1Var);
}
