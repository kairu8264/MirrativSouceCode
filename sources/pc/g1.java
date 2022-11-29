package pc;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionView;

/* loaded from: classes2.dex */
public abstract class g1 extends ViewDataBinding {
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
    public final Guideline P;
    public final MutualFolloweeView Q;
    public final AppCompatImageView R;
    public final View S;
    public final AppCompatImageView T;
    public final AppCompatTextView U;
    public final AppCompatImageView V;
    public final RecyclerView W;
    public final AppCompatImageView X;
    public final FollowsYouView Y;
    public final AppCompatTextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AppCompatTextView f46412a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Guideline f46413b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Guideline f46414c0;

    /* renamed from: d0  reason: collision with root package name */
    public final UserProfileYellStatusConditionView f46415d0;

    /* renamed from: e0  reason: collision with root package name */
    public md.d1 f46416e0;

    public g1(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, Space space, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, FollowView followView, Space space2, FollowTextView followTextView, FollowTextView followTextView2, Guideline guideline, MutualFolloweeView mutualFolloweeView, AppCompatImageView appCompatImageView5, View view3, AppCompatImageView appCompatImageView6, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView7, RecyclerView recyclerView2, AppCompatImageView appCompatImageView8, FollowsYouView followsYouView, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, Guideline guideline2, Guideline guideline3, UserProfileYellStatusConditionView userProfileYellStatusConditionView) {
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
        this.P = guideline;
        this.Q = mutualFolloweeView;
        this.R = appCompatImageView5;
        this.S = view3;
        this.T = appCompatImageView6;
        this.U = appCompatTextView3;
        this.V = appCompatImageView7;
        this.W = recyclerView2;
        this.X = appCompatImageView8;
        this.Y = followsYouView;
        this.Z = appCompatTextView4;
        this.f46412a0 = appCompatTextView5;
        this.f46413b0 = guideline2;
        this.f46414c0 = guideline3;
        this.f46415d0 = userProfileYellStatusConditionView;
    }

    public abstract void T(md.d1 d1Var);
}
