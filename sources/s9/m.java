package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class m extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final ConstraintLayout F;
    public final RecyclerView G;
    public final ConstraintLayout H;
    public final AppCompatImageView I;
    public final AppCompatImageView J;
    public final AppCompatImageView K;
    public final ConstraintLayout L;
    public final AppCompatTextView M;
    public final AppCompatTextView N;
    public final ConstraintLayout O;
    public final ConstraintLayout P;
    public final AppCompatImageView Q;
    public final AppCompatTextView R;
    public final ConstraintLayout S;
    public final StatusView T;
    public final AppCompatTextView U;
    public ud.c0 V;

    public m(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RecyclerView recyclerView, ConstraintLayout constraintLayout4, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, ConstraintLayout constraintLayout5, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, AppCompatImageView appCompatImageView6, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout8, StatusView statusView, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = constraintLayout2;
        this.F = constraintLayout3;
        this.G = recyclerView;
        this.H = constraintLayout4;
        this.I = appCompatImageView3;
        this.J = appCompatImageView4;
        this.K = appCompatImageView5;
        this.L = constraintLayout5;
        this.M = appCompatTextView;
        this.N = appCompatTextView2;
        this.O = constraintLayout6;
        this.P = constraintLayout7;
        this.Q = appCompatImageView6;
        this.R = appCompatTextView3;
        this.S = constraintLayout8;
        this.T = statusView;
        this.U = appCompatTextView4;
    }

    public static m T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static m U(View view, Object obj) {
        return (m) ViewDataBinding.j(obj, view, q9.h.dialog_emomo_run_ranking);
    }

    public abstract void V(ud.c0 c0Var);
}
