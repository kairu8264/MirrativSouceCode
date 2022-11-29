package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class ei extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final MultipleUserView E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final Space H;
    public final RoundedButtonView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public ud.k3 L;

    public ei(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MultipleUserView multipleUserView, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView, Space space, RoundedButtonView roundedButtonView2, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = multipleUserView;
        this.F = appCompatTextView3;
        this.G = appCompatImageView;
        this.H = space;
        this.I = roundedButtonView2;
        this.J = appCompatTextView4;
        this.K = appCompatTextView5;
    }

    public abstract void T(ud.k3 k3Var);
}
