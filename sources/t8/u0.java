package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrorman.customview.FollowingLabelView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.customview.LiveCatalogTagView;
import com.dena.mirrorman.customview.LiveCatalogUserAppStatusView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public abstract class u0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final CardView D;
    public final ConstraintLayout E;
    public final LottieAnimationView F;
    public final MultipleUserView G;
    public final ConstraintLayout H;
    public final FollowingLabelView I;
    public final ConstraintLayout J;
    public final AppCompatImageView K;
    public final LiveBadgeView L;
    public final LiveCatalogStreamerView M;
    public final LiveCatalogTagView N;
    public final LiveCatalogTagView O;
    public final LivePreview P;
    public final Barrier Q;
    public final LiveTimeView R;
    public final AppCompatTextView S;
    public final ConstraintLayout T;
    public final AppCompatImageView U;
    public final ConstraintLayout V;
    public final AppCompatImageView W;
    public final AppCompatTextView X;
    public final AppCompatImageView Y;
    public final AppCompatImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AppCompatImageView f53266a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AppCompatTextView f53267b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LiveCatalogUserAppStatusView f53268c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LiveCatalogUserAppStatusView f53269d0;

    /* renamed from: e0  reason: collision with root package name */
    public final MultipleUserView f53270e0;

    public u0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, CardView cardView, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MultipleUserView multipleUserView, ConstraintLayout constraintLayout2, FollowingLabelView followingLabelView, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView3, LiveBadgeView liveBadgeView, LiveCatalogStreamerView liveCatalogStreamerView, LiveCatalogTagView liveCatalogTagView, LiveCatalogTagView liveCatalogTagView2, LivePreview livePreview, Barrier barrier, LiveTimeView liveTimeView, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout4, AppCompatImageView appCompatImageView4, ConstraintLayout constraintLayout5, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, AppCompatTextView appCompatTextView3, LiveCatalogUserAppStatusView liveCatalogUserAppStatusView, LiveCatalogUserAppStatusView liveCatalogUserAppStatusView2, MultipleUserView multipleUserView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = cardView;
        this.E = constraintLayout;
        this.F = lottieAnimationView;
        this.G = multipleUserView;
        this.H = constraintLayout2;
        this.I = followingLabelView;
        this.J = constraintLayout3;
        this.K = appCompatImageView3;
        this.L = liveBadgeView;
        this.M = liveCatalogStreamerView;
        this.N = liveCatalogTagView;
        this.O = liveCatalogTagView2;
        this.P = livePreview;
        this.Q = barrier;
        this.R = liveTimeView;
        this.S = appCompatTextView;
        this.T = constraintLayout4;
        this.U = appCompatImageView4;
        this.V = constraintLayout5;
        this.W = appCompatImageView5;
        this.X = appCompatTextView2;
        this.Y = appCompatImageView6;
        this.Z = appCompatImageView7;
        this.f53266a0 = appCompatImageView8;
        this.f53267b0 = appCompatTextView3;
        this.f53268c0 = liveCatalogUserAppStatusView;
        this.f53269d0 = liveCatalogUserAppStatusView2;
        this.f53270e0 = multipleUserView2;
    }

    public static u0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static u0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (u0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_live_large, viewGroup, z10, obj);
    }
}
