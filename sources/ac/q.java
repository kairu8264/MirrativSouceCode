package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class q extends ViewDataBinding {
    public final AppCompatImageView B;
    public final SwitchCompat C;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final RoundedButtonView G;
    public final View H;
    public final AppCompatTextView I;
    public final RoundedButtonView J;
    public final View K;
    public final AppCompatTextView L;
    public final RoundedButtonView M;
    public kc.a N;

    public q(Object obj, View view, int i10, AppCompatImageView appCompatImageView, SwitchCompat switchCompat, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RoundedButtonView roundedButtonView, View view2, AppCompatTextView appCompatTextView3, RoundedButtonView roundedButtonView2, View view3, AppCompatTextView appCompatTextView4, RoundedButtonView roundedButtonView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = switchCompat;
        this.D = constraintLayout;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
        this.G = roundedButtonView;
        this.H = view2;
        this.I = appCompatTextView3;
        this.J = roundedButtonView2;
        this.K = view3;
        this.L = appCompatTextView4;
        this.M = roundedButtonView3;
    }

    public abstract void T(kc.a aVar);
}
