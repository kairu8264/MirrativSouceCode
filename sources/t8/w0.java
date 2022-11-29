package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.catalog.LiveCatalogSmallStreamerView;
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogTagView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public abstract class w0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final LottieAnimationView E;
    public final MultipleUserView F;
    public final ConstraintLayout G;
    public final AppCompatImageView H;
    public final LiveBadgeView I;
    public final LiveCatalogSmallStreamerView J;
    public final LiveCatalogTagView K;
    public final LiveCatalogTagView L;
    public final AppCompatTextView M;
    public final AppCompatTextView N;
    public final LivePreview O;
    public final Barrier P;
    public final LiveTimeView Q;
    public final AppCompatTextView R;
    public final View S;
    public final AppCompatImageView T;
    public final AppCompatImageView U;
    public final AppCompatImageView V;
    public final AppCompatImageView W;
    public final AppCompatTextView X;
    public final View Y;
    public final AppCompatTextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final MultipleUserView f53274a0;

    public w0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, MultipleUserView multipleUserView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView3, LiveBadgeView liveBadgeView, LiveCatalogSmallStreamerView liveCatalogSmallStreamerView, LiveCatalogTagView liveCatalogTagView, LiveCatalogTagView liveCatalogTagView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LivePreview livePreview, Barrier barrier, LiveTimeView liveTimeView, AppCompatTextView appCompatTextView3, View view2, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatTextView appCompatTextView4, View view3, AppCompatTextView appCompatTextView5, MultipleUserView multipleUserView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = lottieAnimationView;
        this.F = multipleUserView;
        this.G = constraintLayout2;
        this.H = appCompatImageView3;
        this.I = liveBadgeView;
        this.J = liveCatalogSmallStreamerView;
        this.K = liveCatalogTagView;
        this.L = liveCatalogTagView2;
        this.M = appCompatTextView;
        this.N = appCompatTextView2;
        this.O = livePreview;
        this.P = barrier;
        this.Q = liveTimeView;
        this.R = appCompatTextView3;
        this.S = view2;
        this.T = appCompatImageView4;
        this.U = appCompatImageView5;
        this.V = appCompatImageView6;
        this.W = appCompatImageView7;
        this.X = appCompatTextView4;
        this.Y = view3;
        this.Z = appCompatTextView5;
        this.f53274a0 = multipleUserView2;
    }

    public static w0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static w0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_live_small, viewGroup, z10, obj);
    }
}
