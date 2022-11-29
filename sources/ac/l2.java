package ac;

import android.view.View;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionView;

/* loaded from: classes2.dex */
public abstract class l2 extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final View E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final ConstraintLayout H;
    public final Space I;
    public final AppCompatImageView J;
    public final AppCompatImageView K;
    public final FollowView L;
    public final Space M;
    public final FollowTextView N;
    public final FollowTextView O;
    public final LottieAnimationView P;
    public final AppCompatImageView Q;
    public final ConstraintLayout R;
    public final AppCompatImageView S;
    public final MutualFolloweeView T;
    public final AppCompatImageView U;
    public final View V;
    public final AppCompatImageView W;
    public final AppCompatTextView X;
    public final AppCompatTextView Y;
    public final AppCompatImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final RecyclerView f902a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ScrollView f903b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AppCompatImageView f904c0;

    /* renamed from: d0  reason: collision with root package name */
    public final FollowsYouView f905d0;

    /* renamed from: e0  reason: collision with root package name */
    public final AppCompatTextView f906e0;

    /* renamed from: f0  reason: collision with root package name */
    public final AppCompatTextView f907f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Guideline f908g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Guideline f909h0;

    /* renamed from: i0  reason: collision with root package name */
    public final UserProfileYellStatusConditionView f910i0;

    /* renamed from: j0  reason: collision with root package name */
    public ud.x4 f911j0;

    public l2(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, Space space, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, FollowView followView, Space space2, FollowTextView followTextView, FollowTextView followTextView2, LottieAnimationView lottieAnimationView, AppCompatImageView appCompatImageView5, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView6, MutualFolloweeView mutualFolloweeView, AppCompatImageView appCompatImageView7, View view3, AppCompatImageView appCompatImageView8, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView9, RecyclerView recyclerView2, ScrollView scrollView, AppCompatImageView appCompatImageView10, FollowsYouView followsYouView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, Guideline guideline, Guideline guideline2, UserProfileYellStatusConditionView userProfileYellStatusConditionView) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = view2;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = constraintLayout;
        this.I = space;
        this.J = appCompatImageView3;
        this.K = appCompatImageView4;
        this.L = followView;
        this.M = space2;
        this.N = followTextView;
        this.O = followTextView2;
        this.P = lottieAnimationView;
        this.Q = appCompatImageView5;
        this.R = constraintLayout2;
        this.S = appCompatImageView6;
        this.T = mutualFolloweeView;
        this.U = appCompatImageView7;
        this.V = view3;
        this.W = appCompatImageView8;
        this.X = appCompatTextView3;
        this.Y = appCompatTextView4;
        this.Z = appCompatImageView9;
        this.f902a0 = recyclerView2;
        this.f903b0 = scrollView;
        this.f904c0 = appCompatImageView10;
        this.f905d0 = followsYouView;
        this.f906e0 = appCompatTextView5;
        this.f907f0 = appCompatTextView6;
        this.f908g0 = guideline;
        this.f909h0 = guideline2;
        this.f910i0 = userProfileYellStatusConditionView;
    }

    public abstract void T(ud.x4 x4Var);
}
