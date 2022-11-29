package t8;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class e extends ViewDataBinding {
    public final AppBarLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final FrameLayout E;
    public final CoordinatorLayout F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final ConstraintLayout J;
    public final AppCompatTextView K;
    public final AppCompatImageView L;
    public final ConstraintLayout M;
    public final AppCompatButton N;
    public final AppCompatButton O;
    public final StatusView P;
    public final AppCompatImageView Q;
    public final AppCompatTextView R;

    public e(Object obj, View view, int i10, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView4, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView5, ConstraintLayout constraintLayout2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, StatusView statusView, AppCompatImageView appCompatImageView6, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appBarLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = frameLayout;
        this.F = coordinatorLayout;
        this.G = appCompatImageView3;
        this.H = appCompatTextView;
        this.I = appCompatImageView4;
        this.J = constraintLayout;
        this.K = appCompatTextView2;
        this.L = appCompatImageView5;
        this.M = constraintLayout2;
        this.N = appCompatButton;
        this.O = appCompatButton2;
        this.P = statusView;
        this.Q = appCompatImageView6;
        this.R = appCompatTextView3;
    }
}
