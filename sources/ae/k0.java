package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class k0 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final View E;
    public final ConstraintLayout F;
    public final RecyclerView G;
    public final View H;
    public final RoundedButtonView I;
    public final AppCompatTextView J;
    public final MultipleUserView K;
    public final AppCompatTextView L;
    public final ConstraintLayout M;
    public final StatusView N;
    public final AppCompatImageView O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;
    public final RecyclerView R;
    public final View S;
    public ud.o3 T;

    public k0(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, View view3, ConstraintLayout constraintLayout2, RecyclerView recyclerView, View view4, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, MultipleUserView multipleUserView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout3, StatusView statusView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, RecyclerView recyclerView2, View view5) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = constraintLayout;
        this.E = view3;
        this.F = constraintLayout2;
        this.G = recyclerView;
        this.H = view4;
        this.I = roundedButtonView;
        this.J = appCompatTextView;
        this.K = multipleUserView;
        this.L = appCompatTextView2;
        this.M = constraintLayout3;
        this.N = statusView;
        this.O = appCompatImageView2;
        this.P = appCompatTextView3;
        this.Q = appCompatTextView4;
        this.R = recyclerView2;
        this.S = view5;
    }

    public static k0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static k0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k0) ViewDataBinding.x(layoutInflater, nd.b1.bottom_sheet_dialog_fragment_shooter_invite, viewGroup, z10, obj);
    }

    public abstract void V(ud.o3 o3Var);
}
