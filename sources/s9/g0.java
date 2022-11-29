package s9;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.emomo.closet.ShooterDressUpDetailView;
import com.dena.mirrorman.customview.HorizontalScrollBar;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public abstract class g0 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final View F;
    public final ShooterDressUpDetailView G;
    public final ConstraintLayout H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final AppCompatImageView K;
    public final HorizontalScrollBar L;
    public final AppCompatImageView M;
    public final AppCompatTextView N;
    public final RecyclerView O;
    public final RecyclerView P;
    public final ConstraintLayout Q;
    public final ConstraintLayout R;
    public final RoundedButtonView S;
    public final AppCompatButton T;
    public final RoundedButtonView U;
    public final Space V;
    public final RoundedButtonView W;

    public g0(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view3, ShooterDressUpDetailView shooterDressUpDetailView, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, HorizontalScrollBar horizontalScrollBar, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, RecyclerView recyclerView2, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, RoundedButtonView roundedButtonView, AppCompatButton appCompatButton, RoundedButtonView roundedButtonView2, Space space, RoundedButtonView roundedButtonView3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = constraintLayout;
        this.E = constraintLayout2;
        this.F = view3;
        this.G = shooterDressUpDetailView;
        this.H = constraintLayout3;
        this.I = appCompatImageView2;
        this.J = appCompatTextView;
        this.K = appCompatImageView3;
        this.L = horizontalScrollBar;
        this.M = appCompatImageView4;
        this.N = appCompatTextView2;
        this.O = recyclerView;
        this.P = recyclerView2;
        this.Q = constraintLayout4;
        this.R = constraintLayout5;
        this.S = roundedButtonView;
        this.T = appCompatButton;
        this.U = roundedButtonView2;
        this.V = space;
        this.W = roundedButtonView3;
    }

    public static g0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static g0 U(View view, Object obj) {
        return (g0) ViewDataBinding.j(obj, view, q9.h.dialog_fragment_shooter_dress_up);
    }
}
