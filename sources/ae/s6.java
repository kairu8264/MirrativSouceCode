package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class s6 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final ConstraintLayout G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final View L;
    public final AppCompatImageView M;
    public final AppCompatTextView N;
    public final ConstraintLayout O;
    public final AppCompatImageView P;
    public final AppCompatImageView Q;
    public final AppCompatImageView R;
    public final ConstraintLayout S;
    public final RecyclerView T;
    public final AppCompatTextView U;
    public final AppCompatTextView V;
    public final AppCompatImageView W;

    public s6(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, View view2, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView5, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, ConstraintLayout constraintLayout4, RecyclerView recyclerView, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatImageView appCompatImageView9) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = appCompatImageView3;
        this.F = appCompatImageView4;
        this.G = constraintLayout2;
        this.H = appCompatTextView;
        this.I = appCompatTextView2;
        this.J = appCompatTextView3;
        this.K = appCompatTextView4;
        this.L = view2;
        this.M = appCompatImageView5;
        this.N = appCompatTextView5;
        this.O = constraintLayout3;
        this.P = appCompatImageView6;
        this.Q = appCompatImageView7;
        this.R = appCompatImageView8;
        this.S = constraintLayout4;
        this.T = recyclerView;
        this.U = appCompatTextView6;
        this.V = appCompatTextView7;
        this.W = appCompatImageView9;
    }

    public static s6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static s6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s6) ViewDataBinding.x(layoutInflater, nd.b1.fragment_giftbox_gacha_result, viewGroup, z10, obj);
    }
}
