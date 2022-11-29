package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class k extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final SwitchCompat D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final ConstraintLayout K;
    public final ConstraintLayout L;
    public final ConstraintLayout M;
    public final AppCompatTextView N;
    public final ConstraintLayout O;
    public final AppCompatTextView P;
    public final AppCompatImageView Q;
    public final SwitchCompat R;
    public final AppCompatTextView S;
    public final AppCompatTextView T;
    public final ConstraintLayout U;
    public final AppCompatImageView V;
    public final SwitchCompat W;
    public final AppCompatTextView X;
    public final ConstraintLayout Y;
    public final EditTextWithOnKeyPreImeListener Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AppCompatImageView f881a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AppCompatTextView f882b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AppCompatTextView f883c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AppCompatTextView f884d0;

    /* renamed from: e0  reason: collision with root package name */
    public final MaterialCardView f885e0;

    /* renamed from: f0  reason: collision with root package name */
    public final AppCompatTextView f886f0;

    /* renamed from: g0  reason: collision with root package name */
    public final FrameLayout f887g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AppCompatImageView f888h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AppCompatImageView f889i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ConstraintLayout f890j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AppCompatTextView f891k0;

    /* renamed from: l0  reason: collision with root package name */
    public final View f892l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AppCompatTextView f893m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ConstraintLayout f894n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AppCompatImageView f895o0;

    /* renamed from: p0  reason: collision with root package name */
    public final AppCompatTextView f896p0;

    /* renamed from: q0  reason: collision with root package name */
    public final SeekBar f897q0;

    /* renamed from: r0  reason: collision with root package name */
    public kc.m f898r0;

    public k(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, AppCompatTextView appCompatTextView5, ConstraintLayout constraintLayout6, AppCompatTextView appCompatTextView6, AppCompatImageView appCompatImageView3, SwitchCompat switchCompat2, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, ConstraintLayout constraintLayout7, AppCompatImageView appCompatImageView4, SwitchCompat switchCompat3, AppCompatTextView appCompatTextView9, ConstraintLayout constraintLayout8, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, MaterialCardView materialCardView, AppCompatTextView appCompatTextView13, FrameLayout frameLayout, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, ConstraintLayout constraintLayout9, AppCompatTextView appCompatTextView14, View view2, AppCompatTextView appCompatTextView15, ConstraintLayout constraintLayout10, AppCompatImageView appCompatImageView8, AppCompatTextView appCompatTextView16, SeekBar seekBar) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = switchCompat;
        this.E = appCompatTextView;
        this.F = constraintLayout2;
        this.G = appCompatImageView2;
        this.H = appCompatTextView2;
        this.I = appCompatTextView3;
        this.J = appCompatTextView4;
        this.K = constraintLayout3;
        this.L = constraintLayout4;
        this.M = constraintLayout5;
        this.N = appCompatTextView5;
        this.O = constraintLayout6;
        this.P = appCompatTextView6;
        this.Q = appCompatImageView3;
        this.R = switchCompat2;
        this.S = appCompatTextView7;
        this.T = appCompatTextView8;
        this.U = constraintLayout7;
        this.V = appCompatImageView4;
        this.W = switchCompat3;
        this.X = appCompatTextView9;
        this.Y = constraintLayout8;
        this.Z = editTextWithOnKeyPreImeListener;
        this.f881a0 = appCompatImageView5;
        this.f882b0 = appCompatTextView10;
        this.f883c0 = appCompatTextView11;
        this.f884d0 = appCompatTextView12;
        this.f885e0 = materialCardView;
        this.f886f0 = appCompatTextView13;
        this.f887g0 = frameLayout;
        this.f888h0 = appCompatImageView6;
        this.f889i0 = appCompatImageView7;
        this.f890j0 = constraintLayout9;
        this.f891k0 = appCompatTextView14;
        this.f892l0 = view2;
        this.f893m0 = appCompatTextView15;
        this.f894n0 = constraintLayout10;
        this.f895o0 = appCompatImageView8;
        this.f896p0 = appCompatTextView16;
        this.f897q0 = seekBar;
    }

    public static k T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static k U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k) ViewDataBinding.x(layoutInflater, xb.p.bottom_sheet_dialog_fragment_live_detail_settings, viewGroup, z10, obj);
    }

    public abstract void V(kc.m mVar);
}
