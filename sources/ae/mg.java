package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes2.dex */
public abstract class mg extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final View F;
    public final MultipleUserView G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final Barrier M;
    public final LiveTimeView N;
    public final AppCompatTextView O;
    public final AppCompatImageView P;
    public final AppCompatImageView Q;
    public final AppCompatImageView R;
    public final AppCompatImageView S;
    public final AppCompatImageView T;
    public final Space U;
    public final AppCompatImageView V;
    public final AppCompatTextView W;
    public final AppCompatTextView X;
    public ud.a2 Y;

    public mg(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, View view2, MultipleUserView multipleUserView, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Barrier barrier, LiveTimeView liveTimeView, AppCompatTextView appCompatTextView5, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, AppCompatImageView appCompatImageView9, Space space, AppCompatImageView appCompatImageView10, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
        this.F = view2;
        this.G = multipleUserView;
        this.H = appCompatImageView3;
        this.I = appCompatTextView2;
        this.J = appCompatImageView4;
        this.K = appCompatTextView3;
        this.L = appCompatTextView4;
        this.M = barrier;
        this.N = liveTimeView;
        this.O = appCompatTextView5;
        this.P = appCompatImageView5;
        this.Q = appCompatImageView6;
        this.R = appCompatImageView7;
        this.S = appCompatImageView8;
        this.T = appCompatImageView9;
        this.U = space;
        this.V = appCompatImageView10;
        this.W = appCompatTextView6;
        this.X = appCompatTextView7;
    }

    public abstract void T(ud.a2 a2Var);
}
