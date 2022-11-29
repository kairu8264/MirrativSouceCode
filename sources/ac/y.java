package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class y extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final View D;
    public final View E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final ConstraintLayout J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final ConstraintLayout N;
    public final AppCompatTextView O;
    public final AppCompatImageView P;
    public final AppCompatTextView Q;
    public final AppCompatTextView R;

    public y(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, View view3, View view4, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView5, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = view3;
        this.E = view4;
        this.F = constraintLayout;
        this.G = appCompatImageView2;
        this.H = appCompatTextView;
        this.I = appCompatImageView3;
        this.J = constraintLayout2;
        this.K = appCompatTextView2;
        this.L = appCompatTextView3;
        this.M = appCompatTextView4;
        this.N = constraintLayout3;
        this.O = appCompatTextView5;
        this.P = appCompatImageView4;
        this.Q = appCompatTextView6;
        this.R = appCompatTextView7;
    }

    public static y T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static y U(View view, Object obj) {
        return (y) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_confirm_notification_guard);
    }
}
