package kb;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.LiveRequestClapView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class r extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final View E;
    public final View F;
    public final FollowView G;
    public final Space H;
    public final FollowTextView I;
    public final FollowTextView J;
    public final LiveRequestClapView K;
    public final Space L;
    public final LiveRequestCountView M;
    public final ProfileImageView N;
    public final ConstraintLayout O;
    public final AppCompatImageView P;
    public final AppCompatImageView Q;
    public final RecyclerView R;
    public final AppCompatTextView S;
    public final AppCompatImageView T;
    public final FollowsYouView U;
    public final AppCompatTextView V;
    public final AppCompatTextView W;

    public r(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, View view3, FollowView followView, Space space, FollowTextView followTextView, FollowTextView followTextView2, LiveRequestClapView liveRequestClapView, Space space2, LiveRequestCountView liveRequestCountView, ProfileImageView profileImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, RecyclerView recyclerView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView5, FollowsYouView followsYouView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = view2;
        this.F = view3;
        this.G = followView;
        this.H = space;
        this.I = followTextView;
        this.J = followTextView2;
        this.K = liveRequestClapView;
        this.L = space2;
        this.M = liveRequestCountView;
        this.N = profileImageView;
        this.O = constraintLayout;
        this.P = appCompatImageView3;
        this.Q = appCompatImageView4;
        this.R = recyclerView2;
        this.S = appCompatTextView;
        this.T = appCompatImageView5;
        this.U = followsYouView;
        this.V = appCompatTextView2;
        this.W = appCompatTextView3;
    }
}
