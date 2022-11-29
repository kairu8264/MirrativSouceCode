package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class w0 extends ViewDataBinding {
    public final Space B;
    public final Space C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final ConstraintLayout H;
    public final RoundedButtonView I;
    public final RoundedButtonView J;
    public final View K;
    public final ConstraintLayout L;
    public final SwitchCompat M;
    public final AppCompatTextView N;
    public final StatusView O;
    public final RoundedButtonView P;
    public final Space Q;
    public final AppCompatImageView R;

    public w0(Object obj, View view, int i10, Space space, Space space2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, RoundedButtonView roundedButtonView, RoundedButtonView roundedButtonView2, View view2, ConstraintLayout constraintLayout3, SwitchCompat switchCompat, AppCompatTextView appCompatTextView2, StatusView statusView, RoundedButtonView roundedButtonView3, Space space3, AppCompatImageView appCompatImageView3) {
        super(obj, view, i10);
        this.B = space;
        this.C = space2;
        this.D = appCompatImageView;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = appCompatImageView2;
        this.H = constraintLayout2;
        this.I = roundedButtonView;
        this.J = roundedButtonView2;
        this.K = view2;
        this.L = constraintLayout3;
        this.M = switchCompat;
        this.N = appCompatTextView2;
        this.O = statusView;
        this.P = roundedButtonView3;
        this.Q = space3;
        this.R = appCompatImageView3;
    }

    public static w0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static w0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w0) ViewDataBinding.x(layoutInflater, xb.p.dialog_fragment_group_shot_result, viewGroup, z10, obj);
    }
}
