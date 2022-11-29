package pc;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class s0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final View D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatImageView K;
    public final LinearLayout L;
    public final AppCompatImageView M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final View P;
    public fd.a Q;

    public s0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, View view3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = view2;
        this.E = constraintLayout;
        this.F = appCompatTextView2;
        this.G = appCompatTextView3;
        this.H = appCompatTextView4;
        this.I = appCompatTextView5;
        this.J = appCompatTextView6;
        this.K = appCompatImageView2;
        this.L = linearLayout;
        this.M = appCompatImageView3;
        this.N = appCompatTextView7;
        this.O = appCompatTextView8;
        this.P = view3;
    }

    public static s0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static s0 U(View view, Object obj) {
        return (s0) ViewDataBinding.j(obj, view, nc.f.dialog_fragment_holiday_purchase);
    }

    public abstract void V(fd.a aVar);
}
