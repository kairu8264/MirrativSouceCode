package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class yf extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final ConstraintLayout K;
    public ud.r1 L;

    public yf(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout4) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = appCompatImageView3;
        this.F = constraintLayout2;
        this.G = constraintLayout3;
        this.H = appCompatImageView4;
        this.I = appCompatTextView;
        this.J = appCompatTextView2;
        this.K = constraintLayout4;
    }

    public abstract void T(ud.r1 r1Var);
}
