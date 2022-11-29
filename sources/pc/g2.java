package pc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrorman.customview.AnniversaryFollowBalloonView;
import com.dena.mirrorman.customview.AnniversaryStreamBalloonView;
import com.dena.mirrorman.customview.BeginnerStreamHolidayBalloonView;
import com.dena.mirrorman.customview.BirthdayBalloonView;
import com.dena.mirrorman.customview.CheckMonthlyRankingBalloonView;
import com.dena.mirrorman.customview.ContinuousStreamBalloonView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.MyPageContinuousLivePromotionView;
import com.dena.mirrorman.customview.RibbonRemainingLabelView;
import com.dena.mirrorman.customview.StreamHolidayBalloonView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public abstract class g2 extends ViewDataBinding {
    public final AppCompatTextView A0;
    public final AnniversaryFollowBalloonView B;
    public final AppCompatImageView B0;
    public final AnniversaryStreamBalloonView C;
    public final AppCompatTextView C0;
    public final AppBarLayout D;
    public final AppCompatTextView D0;
    public final ConstraintLayout E;
    public final AppCompatTextView E0;
    public final RecyclerView F;
    public final AppCompatTextView F0;
    public final FrameLayout G;
    public final Guideline G0;
    public final AppCompatImageView H;
    public final Guideline H0;
    public final View I;
    public final ViewPager I0;
    public final AppCompatTextView J;
    public ud.l2 J0;
    public final Space K;
    public final AppCompatImageView L;
    public final BeginnerStreamHolidayBalloonView M;
    public final AppCompatTextView N;
    public final Space O;
    public final BirthdayBalloonView P;
    public final AppCompatTextView Q;
    public final CheckMonthlyRankingBalloonView R;
    public final ConstraintLayout S;
    public final AppCompatImageView T;
    public final CollapsingToolbarLayout U;
    public final AppCompatImageView V;
    public final ContinuousStreamBalloonView W;
    public final AppCompatTextView X;
    public final LinearLayout Y;
    public final View Z;

    /* renamed from: a0  reason: collision with root package name */
    public final RecyclerView f46417a0;

    /* renamed from: b0  reason: collision with root package name */
    public final FloatingActionButton f46418b0;

    /* renamed from: c0  reason: collision with root package name */
    public final FollowTextView f46419c0;

    /* renamed from: d0  reason: collision with root package name */
    public final FollowTextView f46420d0;

    /* renamed from: e0  reason: collision with root package name */
    public final FrameLayout f46421e0;

    /* renamed from: f0  reason: collision with root package name */
    public final View f46422f0;

    /* renamed from: g0  reason: collision with root package name */
    public final View f46423g0;

    /* renamed from: h0  reason: collision with root package name */
    public final View f46424h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ConstraintLayout f46425i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Space f46426j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AppCompatTextView f46427k0;

    /* renamed from: l0  reason: collision with root package name */
    public final MyPageContinuousLivePromotionView f46428l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ConstraintLayout f46429m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AppCompatImageView f46430n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AppCompatTextView f46431o0;

    /* renamed from: p0  reason: collision with root package name */
    public final AppCompatTextView f46432p0;

    /* renamed from: q0  reason: collision with root package name */
    public final AppCompatImageView f46433q0;

    /* renamed from: r0  reason: collision with root package name */
    public final RecyclerView f46434r0;

    /* renamed from: s0  reason: collision with root package name */
    public final RibbonRemainingLabelView f46435s0;

    /* renamed from: t0  reason: collision with root package name */
    public final FrameLayout f46436t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Space f46437u0;

    /* renamed from: v0  reason: collision with root package name */
    public final MirraClassSeasonRatingCardView f46438v0;

    /* renamed from: w0  reason: collision with root package name */
    public final StreamHolidayBalloonView f46439w0;

    /* renamed from: x0  reason: collision with root package name */
    public final TabLayout f46440x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Toolbar f46441y0;

    /* renamed from: z0  reason: collision with root package name */
    public final AppCompatTextView f46442z0;

    public g2(Object obj, View view, int i10, AnniversaryFollowBalloonView anniversaryFollowBalloonView, AnniversaryStreamBalloonView anniversaryStreamBalloonView, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, FrameLayout frameLayout, AppCompatImageView appCompatImageView, View view2, AppCompatTextView appCompatTextView, Space space, AppCompatImageView appCompatImageView2, BeginnerStreamHolidayBalloonView beginnerStreamHolidayBalloonView, AppCompatTextView appCompatTextView2, Space space2, BirthdayBalloonView birthdayBalloonView, AppCompatTextView appCompatTextView3, CheckMonthlyRankingBalloonView checkMonthlyRankingBalloonView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView3, CollapsingToolbarLayout collapsingToolbarLayout, AppCompatImageView appCompatImageView4, ContinuousStreamBalloonView continuousStreamBalloonView, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, View view3, RecyclerView recyclerView2, FloatingActionButton floatingActionButton, FollowTextView followTextView, FollowTextView followTextView2, FrameLayout frameLayout2, View view4, View view5, View view6, ConstraintLayout constraintLayout3, Space space3, AppCompatTextView appCompatTextView5, MyPageContinuousLivePromotionView myPageContinuousLivePromotionView, ConstraintLayout constraintLayout4, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatImageView appCompatImageView6, RecyclerView recyclerView3, RibbonRemainingLabelView ribbonRemainingLabelView, FrameLayout frameLayout3, Space space4, MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView, StreamHolidayBalloonView streamHolidayBalloonView, TabLayout tabLayout, Toolbar toolbar, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatImageView appCompatImageView7, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, Guideline guideline, Guideline guideline2, ViewPager viewPager) {
        super(obj, view, i10);
        this.B = anniversaryFollowBalloonView;
        this.C = anniversaryStreamBalloonView;
        this.D = appBarLayout;
        this.E = constraintLayout;
        this.F = recyclerView;
        this.G = frameLayout;
        this.H = appCompatImageView;
        this.I = view2;
        this.J = appCompatTextView;
        this.K = space;
        this.L = appCompatImageView2;
        this.M = beginnerStreamHolidayBalloonView;
        this.N = appCompatTextView2;
        this.O = space2;
        this.P = birthdayBalloonView;
        this.Q = appCompatTextView3;
        this.R = checkMonthlyRankingBalloonView;
        this.S = constraintLayout2;
        this.T = appCompatImageView3;
        this.U = collapsingToolbarLayout;
        this.V = appCompatImageView4;
        this.W = continuousStreamBalloonView;
        this.X = appCompatTextView4;
        this.Y = linearLayout;
        this.Z = view3;
        this.f46417a0 = recyclerView2;
        this.f46418b0 = floatingActionButton;
        this.f46419c0 = followTextView;
        this.f46420d0 = followTextView2;
        this.f46421e0 = frameLayout2;
        this.f46422f0 = view4;
        this.f46423g0 = view5;
        this.f46424h0 = view6;
        this.f46425i0 = constraintLayout3;
        this.f46426j0 = space3;
        this.f46427k0 = appCompatTextView5;
        this.f46428l0 = myPageContinuousLivePromotionView;
        this.f46429m0 = constraintLayout4;
        this.f46430n0 = appCompatImageView5;
        this.f46431o0 = appCompatTextView6;
        this.f46432p0 = appCompatTextView7;
        this.f46433q0 = appCompatImageView6;
        this.f46434r0 = recyclerView3;
        this.f46435s0 = ribbonRemainingLabelView;
        this.f46436t0 = frameLayout3;
        this.f46437u0 = space4;
        this.f46438v0 = mirraClassSeasonRatingCardView;
        this.f46439w0 = streamHolidayBalloonView;
        this.f46440x0 = tabLayout;
        this.f46441y0 = toolbar;
        this.f46442z0 = appCompatTextView8;
        this.A0 = appCompatTextView9;
        this.B0 = appCompatImageView7;
        this.C0 = appCompatTextView10;
        this.D0 = appCompatTextView11;
        this.E0 = appCompatTextView12;
        this.F0 = appCompatTextView13;
        this.G0 = guideline;
        this.H0 = guideline2;
        this.I0 = viewPager;
    }

    public static g2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g2) ViewDataBinding.x(layoutInflater, nc.f.fragment_my_page, viewGroup, z10, obj);
    }

    public abstract void V(ud.l2 l2Var);
}
