package ae;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class i extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final ConstraintLayout E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final ConstraintLayout H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final ProgressBar L;
    public final AppCompatTextView M;
    public final AppCompatButton N;
    public final AppCompatButton O;
    public final StatusView P;
    public final AppCompatTextView Q;
    public final Toolbar R;

    public i(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, ProgressBar progressBar, AppCompatTextView appCompatTextView7, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, StatusView statusView, AppCompatTextView appCompatTextView8, Toolbar toolbar) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatTextView3;
        this.E = constraintLayout;
        this.F = appCompatImageView;
        this.G = appCompatTextView4;
        this.H = constraintLayout2;
        this.I = constraintLayout3;
        this.J = appCompatTextView5;
        this.K = appCompatTextView6;
        this.L = progressBar;
        this.M = appCompatTextView7;
        this.N = appCompatButton;
        this.O = appCompatButton2;
        this.P = statusView;
        this.Q = appCompatTextView8;
        this.R = toolbar;
    }
}
