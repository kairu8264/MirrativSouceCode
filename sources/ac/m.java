package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class m extends ViewDataBinding {
    public lc.n A0;
    public final MaterialCardView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final FrameLayout F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final View I;
    public final ConstraintLayout J;
    public final SwitchCompat K;
    public final AppCompatImageView L;
    public final View M;
    public final View N;
    public final Space O;
    public final Space P;
    public final AppCompatImageView Q;
    public final ConstraintLayout R;
    public final ConstraintLayout S;
    public final AppCompatImageView T;
    public final ConstraintLayout U;
    public final AppCompatImageView V;
    public final AppCompatTextView W;
    public final AppCompatTextView X;
    public final AppCompatTextView Y;
    public final RecyclerView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Space f912a0;

    /* renamed from: b0  reason: collision with root package name */
    public final View f913b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AppCompatImageView f914c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LottieAnimationView f915d0;

    /* renamed from: e0  reason: collision with root package name */
    public final MaterialCardView f916e0;

    /* renamed from: f0  reason: collision with root package name */
    public final AppCompatTextView f917f0;

    /* renamed from: g0  reason: collision with root package name */
    public final LottieAnimationView f918g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AppCompatImageView f919h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AppCompatImageView f920i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AppCompatTextView f921j0;

    /* renamed from: k0  reason: collision with root package name */
    public final MaterialCardView f922k0;

    /* renamed from: l0  reason: collision with root package name */
    public final FrameLayout f923l0;

    /* renamed from: m0  reason: collision with root package name */
    public final FrameLayout f924m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AppCompatImageView f925n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AppCompatImageView f926o0;

    /* renamed from: p0  reason: collision with root package name */
    public final View f927p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ConstraintLayout f928q0;

    /* renamed from: r0  reason: collision with root package name */
    public final NestedScrollView f929r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ConstraintLayout f930s0;

    /* renamed from: t0  reason: collision with root package name */
    public final RecyclerView f931t0;

    /* renamed from: u0  reason: collision with root package name */
    public final AppCompatImageView f932u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ConstraintLayout f933v0;

    /* renamed from: w0  reason: collision with root package name */
    public final EditTextWithOnKeyPreImeListener f934w0;

    /* renamed from: x0  reason: collision with root package name */
    public final AppCompatTextView f935x0;

    /* renamed from: y0  reason: collision with root package name */
    public final AppCompatImageView f936y0;

    /* renamed from: z0  reason: collision with root package name */
    public final AppCompatTextView f937z0;

    public m(Object obj, View view, int i10, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, View view2, ConstraintLayout constraintLayout, SwitchCompat switchCompat, AppCompatImageView appCompatImageView5, View view3, View view4, Space space, Space space2, AppCompatImageView appCompatImageView6, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView7, ConstraintLayout constraintLayout4, AppCompatImageView appCompatImageView8, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, RecyclerView recyclerView, Space space3, View view5, AppCompatImageView appCompatImageView9, LottieAnimationView lottieAnimationView, MaterialCardView materialCardView2, AppCompatTextView appCompatTextView5, LottieAnimationView lottieAnimationView2, AppCompatImageView appCompatImageView10, AppCompatImageView appCompatImageView11, AppCompatTextView appCompatTextView6, MaterialCardView materialCardView3, FrameLayout frameLayout2, FrameLayout frameLayout3, AppCompatImageView appCompatImageView12, AppCompatImageView appCompatImageView13, View view6, ConstraintLayout constraintLayout5, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout6, RecyclerView recyclerView2, AppCompatImageView appCompatImageView14, ConstraintLayout constraintLayout7, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, AppCompatTextView appCompatTextView7, AppCompatImageView appCompatImageView15, AppCompatTextView appCompatTextView8) {
        super(obj, view, i10);
        this.B = materialCardView;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = appCompatImageView2;
        this.F = frameLayout;
        this.G = appCompatImageView3;
        this.H = appCompatImageView4;
        this.I = view2;
        this.J = constraintLayout;
        this.K = switchCompat;
        this.L = appCompatImageView5;
        this.M = view3;
        this.N = view4;
        this.O = space;
        this.P = space2;
        this.Q = appCompatImageView6;
        this.R = constraintLayout2;
        this.S = constraintLayout3;
        this.T = appCompatImageView7;
        this.U = constraintLayout4;
        this.V = appCompatImageView8;
        this.W = appCompatTextView2;
        this.X = appCompatTextView3;
        this.Y = appCompatTextView4;
        this.Z = recyclerView;
        this.f912a0 = space3;
        this.f913b0 = view5;
        this.f914c0 = appCompatImageView9;
        this.f915d0 = lottieAnimationView;
        this.f916e0 = materialCardView2;
        this.f917f0 = appCompatTextView5;
        this.f918g0 = lottieAnimationView2;
        this.f919h0 = appCompatImageView10;
        this.f920i0 = appCompatImageView11;
        this.f921j0 = appCompatTextView6;
        this.f922k0 = materialCardView3;
        this.f923l0 = frameLayout2;
        this.f924m0 = frameLayout3;
        this.f925n0 = appCompatImageView12;
        this.f926o0 = appCompatImageView13;
        this.f927p0 = view6;
        this.f928q0 = constraintLayout5;
        this.f929r0 = nestedScrollView;
        this.f930s0 = constraintLayout6;
        this.f931t0 = recyclerView2;
        this.f932u0 = appCompatImageView14;
        this.f933v0 = constraintLayout7;
        this.f934w0 = editTextWithOnKeyPreImeListener;
        this.f935x0 = appCompatTextView7;
        this.f936y0 = appCompatImageView15;
        this.f937z0 = appCompatTextView8;
    }

    public static m T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static m U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m) ViewDataBinding.x(layoutInflater, xb.p.bottom_sheet_dialog_fragment_live_main_settings, viewGroup, z10, obj);
    }

    public abstract void V(lc.n nVar);
}
