package kb;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.LiveRequestClapView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class p extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final View D;
    public final FollowTextView E;
    public final FollowTextView F;
    public final Guideline G;
    public final Space H;
    public final LiveRequestClapView I;
    public final Space J;
    public final LiveRequestCountView K;
    public final ProfileImageView L;
    public final AppCompatImageView M;
    public final AppCompatImageView N;
    public final AppCompatTextView O;
    public final AppCompatImageView P;
    public final FollowsYouView Q;
    public final AppCompatTextView R;
    public final AppCompatTextView S;
    public final Guideline T;
    public final Guideline U;

    public p(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, FollowTextView followTextView, FollowTextView followTextView2, Guideline guideline, Space space, LiveRequestClapView liveRequestClapView, Space space2, LiveRequestCountView liveRequestCountView, ProfileImageView profileImageView, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView5, FollowsYouView followsYouView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, Guideline guideline2, Guideline guideline3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = view2;
        this.E = followTextView;
        this.F = followTextView2;
        this.G = guideline;
        this.H = space;
        this.I = liveRequestClapView;
        this.J = space2;
        this.K = liveRequestCountView;
        this.L = profileImageView;
        this.M = appCompatImageView3;
        this.N = appCompatImageView4;
        this.O = appCompatTextView;
        this.P = appCompatImageView5;
        this.Q = followsYouView;
        this.R = appCompatTextView2;
        this.S = appCompatTextView3;
        this.T = guideline2;
        this.U = guideline3;
    }
}
