package ae;

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
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class q4 extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final View E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final Space H;
    public final AppCompatImageView I;
    public final ConstraintLayout J;
    public final FollowView K;
    public final Space L;
    public final FollowTextView M;
    public final FollowTextView N;
    public final Guideline O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;
    public final MutualFolloweeView R;
    public final RoundedButtonView S;
    public final ConstraintLayout T;
    public final View U;
    public final AppCompatImageView V;
    public final AppCompatTextView W;
    public final AppCompatImageView X;
    public final RecyclerView Y;
    public final AppCompatImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final FollowsYouView f1465a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AppCompatTextView f1466b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AppCompatTextView f1467c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Guideline f1468d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Guideline f1469e0;

    /* renamed from: f0  reason: collision with root package name */
    public ud.q3 f1470f0;

    public q4(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, Space space, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout, FollowView followView, Space space2, FollowTextView followTextView, FollowTextView followTextView2, Guideline guideline, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, MutualFolloweeView mutualFolloweeView, RoundedButtonView roundedButtonView, ConstraintLayout constraintLayout2, View view3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView5, AppCompatImageView appCompatImageView5, RecyclerView recyclerView2, AppCompatImageView appCompatImageView6, FollowsYouView followsYouView, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, Guideline guideline2, Guideline guideline3) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = view2;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = space;
        this.I = appCompatImageView3;
        this.J = constraintLayout;
        this.K = followView;
        this.L = space2;
        this.M = followTextView;
        this.N = followTextView2;
        this.O = guideline;
        this.P = appCompatTextView3;
        this.Q = appCompatTextView4;
        this.R = mutualFolloweeView;
        this.S = roundedButtonView;
        this.T = constraintLayout2;
        this.U = view3;
        this.V = appCompatImageView4;
        this.W = appCompatTextView5;
        this.X = appCompatImageView5;
        this.Y = recyclerView2;
        this.Z = appCompatImageView6;
        this.f1465a0 = followsYouView;
        this.f1466b0 = appCompatTextView6;
        this.f1467c0 = appCompatTextView7;
        this.f1468d0 = guideline2;
        this.f1469e0 = guideline3;
    }

    public static q4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static q4 U(View view, Object obj) {
        return (q4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_matched_user_profile);
    }

    public abstract void V(ud.q3 q3Var);
}
