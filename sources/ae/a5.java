package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class a5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final Barrier C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;
    public final RoundedButtonView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final RoundedButtonView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final AppCompatImageView N;
    public final AppCompatTextView O;
    public final StatusView P;

    public a5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, Barrier barrier, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, RoundedButtonView roundedButtonView2, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView6, StatusView statusView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = barrier;
        this.D = appCompatImageView2;
        this.E = constraintLayout;
        this.F = roundedButtonView;
        this.G = appCompatTextView;
        this.H = appCompatTextView2;
        this.I = appCompatImageView3;
        this.J = appCompatTextView3;
        this.K = roundedButtonView2;
        this.L = appCompatTextView4;
        this.M = appCompatTextView5;
        this.N = appCompatImageView4;
        this.O = appCompatTextView6;
        this.P = statusView;
    }

    public static a5 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a5 U(View view, Object obj) {
        return (a5) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_unique_emomo_gift_type_select);
    }
}
