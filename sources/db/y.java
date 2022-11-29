package db;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class y extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final RoundedButtonView D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final RoundedButtonView L;
    public ya.v M;

    public y(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RoundedButtonView roundedButtonView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, RoundedButtonView roundedButtonView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = roundedButtonView;
        this.E = constraintLayout;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = appCompatTextView3;
        this.I = appCompatTextView4;
        this.J = appCompatTextView5;
        this.K = appCompatTextView6;
        this.L = roundedButtonView2;
    }

    public abstract void T(ya.v vVar);
}
