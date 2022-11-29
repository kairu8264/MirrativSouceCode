package kb;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;

/* loaded from: classes2.dex */
public abstract class f extends ViewDataBinding {
    public final AppCompatTextView B;
    public final View C;
    public final Space D;
    public final ComposeView E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final FollowView H;
    public final FollowTextView I;
    public final FollowTextView J;
    public final Guideline K;
    public final Guideline L;
    public final AppCompatImageView M;
    public final AppCompatImageView N;
    public final AppCompatButton O;
    public final RecyclerView P;
    public final ConstraintLayout Q;
    public final ConstraintLayout R;
    public final AppCompatImageView S;
    public final AppCompatTextView T;
    public final AppCompatImageView U;
    public final FollowsYouView V;
    public final AppCompatTextView W;
    public final AppCompatTextView X;
    public final Guideline Y;
    public final Guideline Z;

    /* renamed from: a0  reason: collision with root package name */
    public qb.r f38534a0;

    public f(Object obj, View view, int i10, AppCompatTextView appCompatTextView, View view2, Space space, ComposeView composeView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FollowView followView, FollowTextView followTextView, FollowTextView followTextView2, Guideline guideline, Guideline guideline2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatButton appCompatButton, RecyclerView recyclerView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView5, FollowsYouView followsYouView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Guideline guideline3, Guideline guideline4) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = view2;
        this.D = space;
        this.E = composeView;
        this.F = constraintLayout;
        this.G = appCompatImageView;
        this.H = followView;
        this.I = followTextView;
        this.J = followTextView2;
        this.K = guideline;
        this.L = guideline2;
        this.M = appCompatImageView2;
        this.N = appCompatImageView3;
        this.O = appCompatButton;
        this.P = recyclerView;
        this.Q = constraintLayout2;
        this.R = constraintLayout3;
        this.S = appCompatImageView4;
        this.T = appCompatTextView2;
        this.U = appCompatImageView5;
        this.V = followsYouView;
        this.W = appCompatTextView3;
        this.X = appCompatTextView4;
        this.Y = guideline3;
        this.Z = guideline4;
    }

    public abstract void T(qb.r rVar);
}
