package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class g6 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatButton E;
    public final ConstraintLayout F;
    public final CardView G;
    public final AppCompatTextView H;
    public final CardView I;
    public final RecyclerView J;
    public final AppCompatTextView K;
    public final AppCompatButton L;
    public final AppCompatButton M;
    public final AppCompatTextView N;
    public final AppCompatButton O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;

    public g6(Object obj, View view, int i10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, ConstraintLayout constraintLayout3, CardView cardView, AppCompatTextView appCompatTextView2, CardView cardView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView3, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatTextView appCompatTextView4, AppCompatButton appCompatButton4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = appCompatTextView;
        this.E = appCompatButton;
        this.F = constraintLayout3;
        this.G = cardView;
        this.H = appCompatTextView2;
        this.I = cardView2;
        this.J = recyclerView;
        this.K = appCompatTextView3;
        this.L = appCompatButton2;
        this.M = appCompatButton3;
        this.N = appCompatTextView4;
        this.O = appCompatButton4;
        this.P = appCompatTextView5;
        this.Q = appCompatTextView6;
    }

    public static g6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g6) ViewDataBinding.x(layoutInflater, nd.b1.fragment_choose_my_profile, viewGroup, z10, obj);
    }
}
